package com.uniandes.vynilsapp.view.artist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.data.db.ArtistMock

class ArtistListActivity : AppCompatActivity() {

    private lateinit var artistAdapter: ArtistAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artist_list)

        artistAdapter = ArtistAdapter(ArtistMock.artistList)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_artist)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = artistAdapter
    }
}