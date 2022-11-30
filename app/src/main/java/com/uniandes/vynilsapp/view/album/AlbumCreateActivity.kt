package com.uniandes.vynilsapp.view.album

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Album
import com.uniandes.vynilsapp.databinding.ActivityAlbumCreateBinding
import com.uniandes.vynilsapp.viewmodel.AlbumViewModel
import java.text.SimpleDateFormat
import android.widget.Toast;
import androidx.activity.viewModels
import java.util.*


class AlbumCreateActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAlbumCreateBinding
    private val albumViewModel: AlbumViewModel by viewModels()
    private val c = Calendar.getInstance()
    private lateinit var datePicker: DatePickerDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlbumCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        albumViewModel.albumCreated.observe(this, { alb ->
            if (alb != null && alb.id != 0) {
                Toast.makeText(getApplicationContext(),"Album called " + binding.nameAlbum.text + " was created successfully",Toast.LENGTH_SHORT).show();
                finish()
            } else {
                Toast.makeText(getApplicationContext(),"Error creating album " + binding.nameAlbum.text,Toast.LENGTH_SHORT).show();
            }
        })

        binding.releaseDateAlbum.setOnClickListener {
            val day = c.get(Calendar.DAY_OF_MONTH)
            val month = c.get(Calendar.MONTH)
            val year = c.get(Calendar.YEAR)

            datePicker = DatePickerDialog(this, { _, mYear, mMonth, dayOfMonth ->
                binding.releaseDateAlbum.setText(getString(R.string.activity_album_create_date_pick, dayOfMonth, mMonth + 1, mYear))
            }, year, month, day)
            datePicker.show()
        }


        binding.btnCreate.setOnClickListener {
            if (binding.nameAlbum.text.toString() == "" || binding.coverAlbum.text.toString() == "" ||
                binding.descriptionAlbum.text.toString() == "" || binding.releaseDateAlbum.text.toString() == "" ||
                binding.genreAlbum.selectedItemId == 0L || binding.labelAlbum.selectedItemId == 0L) {
                Toast.makeText(getApplicationContext(),"There are empty fields. Please fill all fields",Toast.LENGTH_SHORT).show();
            } else {
                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ROOT)
                val releaseDate: Date = try {
                    sdf.parse(binding.releaseDateAlbum.text.toString())!!
                } catch (e: Exception) {
                    Date()
                }
                val album = Album(null, binding.nameAlbum.text.toString(), binding.coverAlbum.text.toString(), releaseDate,
                    binding.descriptionAlbum.text.toString(), binding.genreAlbum.selectedItem.toString(), binding.labelAlbum.selectedItem.toString(), null, null, null)
                albumViewModel.createAlbum(album)
            }
        }


        binding.btnCancel.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }

}