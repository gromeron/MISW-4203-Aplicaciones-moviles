package com.uniandes.vynilsapp.view.track

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Track
import com.uniandes.vynilsapp.databinding.ActivityTrackCreateBinding
import com.uniandes.vynilsapp.viewmodel.TrackViewModel

class TrackCreateActivity : AppCompatActivity() {

    private var albumId = 0
    private lateinit var binding: ActivityTrackCreateBinding
    private val trackViewModel: TrackViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrackCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setTitle(R.string.activity_album_track_add)

        this.albumId = intent.getStringExtra("albumId").toString().toInt()
        binding.btnCreate.setOnClickListener {
            val trackName = binding.trackName.text.toString()
            val trackDuration = binding.trackDuration.text.toString()
            if (trackName == "" || trackDuration == "") {
                Toast.makeText(applicationContext,"There are empty fields, please fill them.", Toast.LENGTH_SHORT).show()
            } else {
                val track = Track(null, trackName, trackDuration)
                trackViewModel.createTrack(track)
            }
        }

        trackViewModel.trackCreated.observe(this) { savedTrack ->
            if (savedTrack != null && savedTrack.id != 0) {
                Toast.makeText(
                    applicationContext,
                    "Track was created successfully.",
                    Toast.LENGTH_SHORT
                ).show()
                finish()
            } else {
                Toast.makeText(
                    applicationContext,
                    "Occurred error creating track.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        binding.btnCancel.setOnClickListener {
            onBackPressed()
        }
    }
}