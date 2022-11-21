package com.uniandes.vynilsapp.view.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.uniandes.vynilsapp.data.model.Album
import com.uniandes.vynilsapp.databinding.ActivityAlbumListBinding
import com.uniandes.vynilsapp.view.artist.ArtistListActivity
import com.uniandes.vynilsapp.view.collector.CollectorListActivity
import com.uniandes.vynilsapp.viewmodel.AlbumViewModel

class AlbumListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAlbumListBinding

    private lateinit var albumAdapter: AlbumAdapter
    private lateinit var albumViewModel: AlbumViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAlbumListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Intend to artist Activity
        val buttonArtist = binding.btArtists
        buttonArtist.setOnClickListener {
            val lanzar = Intent(this, ArtistListActivity::class.java)
            startActivity(lanzar)
        }

        // Intend to collector Activity
        val buttonCollector = binding.btCollectors
        buttonCollector.setOnClickListener {
            val lanzar2 = Intent(this, CollectorListActivity::class.java)
            startActivity(lanzar2)
        }

        albumAdapter = AlbumAdapter { album ->
            onItemSelected(
                album
            ) }

        // Observer
        albumViewModel = ViewModelProvider(this).get(AlbumViewModel::class.java)
        albumViewModel.albumList.observe(this, Observer<List<Album>> {
            it.apply {
                albumAdapter.albumList = this
            }
        })

        initRecyclerView()
    }

    private fun initRecyclerView() {

        binding.recyclerAlbum.layoutManager = LinearLayoutManager(this)
        binding.recyclerAlbum.adapter = albumAdapter
    }

    private fun onItemSelected(album: Album) {
        //Toast.makeText(this, album.description, Toast.LENGTH_SHORT).show()
        val intent = Intent(this, AlbumDetailActivity::class.java)
        //intent.putExtra(AlbumDetailActivity.EXTRA_NAME, album.name)
        intent.putExtra(AlbumDetailActivity.EXTRA_ALBUM, album)

        startActivity(intent)
    }
}