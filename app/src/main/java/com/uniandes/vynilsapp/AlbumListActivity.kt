package com.uniandes.vynilsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import VolleyBroker
import org.json.JSONArray
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uniandes.vynilsapp.databinding.ActivityAlbumListBinding
import com.uniandes.vynilsapp.model.Album

class AlbumListActivity : AppCompatActivity(), ListAdapter.OnItemClickListener {

    lateinit var volleyBroker: VolleyBroker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()

        //setContentView(R.layout.activity_album_list)
        val binding = ActivityAlbumListBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //val recyclerview = findViewById<RecyclerView>(R.id.albumsView)
        val recyclerview = binding.albumsView
        var albums = mutableListOf<Album>()

        volleyBroker = VolleyBroker(this.applicationContext)

        volleyBroker.instance.add(VolleyBroker.getRequest("albums",
            { response ->
                val albumJsonResponse = JSONArray(response)

                for (i in 0 until albumJsonResponse.length()) {
                    val album = albumJsonResponse.getJSONObject(i)
                    albums.add(Album(album.get("name").toString(), album.get("releaseDate").toString(), R.drawable.ic_launcher_foreground))
                }

                val adapter = ListAdapter(this, albums)

                recyclerview.layoutManager = LinearLayoutManager(this)
                recyclerview.adapter = adapter
            },{}
        ))
    }

    override fun onItemClick(position: Int) {
        val intent = Intent(this@AlbumListActivity, AlbumDetailActivity::class.java)
        startActivity(intent)
    }
}