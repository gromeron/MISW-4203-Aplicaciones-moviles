package com.uniandes.vynilsapp.view.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.model.Album
import com.uniandes.vynilsapp.databinding.ActivityAlbumListBinding
import com.uniandes.vynilsapp.viewmodel.AlbumViewModel

class AlbumListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAlbumListBinding

    private lateinit var albumAdapter: AlbumAdapter
    private lateinit var albumViewModel: AlbumViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_album_list)
        binding = ActivityAlbumListBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
        //val recyclerView = findViewById<RecyclerView>(R.id.recycler_album)

        //recyclerView.layoutManager = LinearLayoutManager(this)
        //recyclerView.adapter = AlbumAdapter(AlbumMock.albumList)
        binding.recyclerAlbum.layoutManager = LinearLayoutManager(this)
        //binding.recyclerAlbum.adapter = AlbumAdapter(AlbumMock.albumList)
        binding.recyclerAlbum.adapter = albumAdapter
    }

    private fun onItemSelected(album: Album) {
        //Toast.makeText(this, album.description, Toast.LENGTH_SHORT).show()
        val intent = Intent(this, AlbumDetailActivity::class.java)
        intent.putExtra(AlbumDetailActivity.EXTRA_NAME, album.name)
        startActivity(intent)
    }
}