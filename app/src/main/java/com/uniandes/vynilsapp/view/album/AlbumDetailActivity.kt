package com.uniandes.vynilsapp.view.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bumptech.glide.Glide
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Album
import com.uniandes.vynilsapp.databinding.ActivityAlbumDetailBinding
import com.uniandes.vynilsapp.view.track.TrackCreateActivity

class AlbumDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ALBUM = "AlbumDetailActivity:album"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityAlbumDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val album = intent.getParcelableExtra<Album>(EXTRA_ALBUM)
        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, TrackCreateActivity::class.java)
            startActivity(intent)
        };

        if (album != null) {
            binding.tvAlbumName.text = album.name
            Glide.with(this).load(album.cover).into(binding.ivAlbumCover)
            binding.tvAlbumRelease.text = album.releaseDate.toString()
            binding.tvAlbumDescription.text = album.description
            binding.tvAlbumGenre.text = album.genre
            binding.tvAlbumRecordlabel.text = album.recordLabel
        }
    }
}