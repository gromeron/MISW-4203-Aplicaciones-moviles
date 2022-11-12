package com.uniandes.vynilsapp.view.album

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.databinding.ActivityAlbumDetailBinding

class AlbumDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "AlbumDetailActivity:name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityAlbumDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val bundle = intent.extras
        //val data = bundle?.getString("name")
        //Toast.makeText(this, data, Toast.LENGTH_SHORT).show()
        val albumName = intent.getStringExtra(EXTRA_NAME)
        binding.tvAlbumName.text = albumName
    }
}