package com.uniandes.vynilsapp.view.artist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.uniandes.vynilsapp.data.model.Performer
import com.uniandes.vynilsapp.databinding.ActivityArtistDetailBinding

class ArtistDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ARTIST = "ArtistDetailActivity:artist"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityArtistDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val artist = intent.getParcelableExtra<Performer>(EXTRA_ARTIST)

        if (artist != null) {
            Glide.with(this).load(artist.image).into(binding.ivArtistImage)
            binding.tvArtistName.text = artist.name
            binding.tvArtistDescription.text = artist.description
            binding.tvArtistBirthdate.text = artist.birthDate
        }

    }
}