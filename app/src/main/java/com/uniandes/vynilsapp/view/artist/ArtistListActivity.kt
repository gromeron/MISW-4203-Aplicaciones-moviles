package com.uniandes.vynilsapp.view.artist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.uniandes.vynilsapp.data.model.Album
import com.uniandes.vynilsapp.data.model.Performer
import com.uniandes.vynilsapp.databinding.ActivityArtistListBinding
import com.uniandes.vynilsapp.view.album.AlbumDetailActivity
import com.uniandes.vynilsapp.view.album.AlbumListActivity
import com.uniandes.vynilsapp.viewmodel.ArtistViewModel

class ArtistListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArtistListBinding

    private lateinit var artistAdapter: ArtistAdapter
    private lateinit var artistViewModel: ArtistViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityArtistListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Album bt_albums intent activity
        val buttonAlbum = binding.btAlbums
        buttonAlbum.setOnClickListener {
            val lanzar = Intent(this, AlbumListActivity::class.java)
            startActivity(lanzar)
        }

        artistAdapter = ArtistAdapter { artist ->
            onItemSelected(
                artist
            ) }

        // Observer
        artistViewModel = ViewModelProvider(this).get(ArtistViewModel::class.java)
        artistViewModel.artistList.observe(this, Observer<List<Performer>> {
            it.apply {
                artistAdapter.artistList = this
            }
        })

        initRecyclerView()
    }

    private fun initRecyclerView() {

        binding.recyclerArtist.layoutManager = LinearLayoutManager(this)
        binding.recyclerArtist.adapter = artistAdapter

    }

    private fun onItemSelected(artist: Performer) {

        val intent = Intent(this, ArtistDetailActivity::class.java)
        intent.putExtra(ArtistDetailActivity.EXTRA_ARTIST, artist)

        startActivity(intent)
    }
}