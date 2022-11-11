package com.uniandes.vynilsapp.view.album

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.db.AlbumMock
import com.uniandes.vynilsapp.databinding.ActivityAlbumListBinding

class AlbumListActivity : AppCompatActivity() {

    private lateinit var albumAdapter: AlbumAdapter
    private lateinit var binding: ActivityAlbumListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_album_list)
        binding = ActivityAlbumListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //albumAdapter = AlbumAdapter()

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_album)

        //recyclerView.layoutManager = LinearLayoutManager(this)
        //recyclerView.adapter = AlbumAdapter(AlbumMock.albumList)
        binding.recyclerAlbum.layoutManager = LinearLayoutManager(this)
        binding.recyclerAlbum.adapter = AlbumAdapter(AlbumMock.albumList)
    }
}