package com.uniandes.vynilsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.android.volley.Response
import VolleyBroker
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import org.json.JSONArray

class AlbumListActivity : AppCompatActivity() {

    lateinit var volleyBroker: VolleyBroker
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_list)

        volleyBroker = VolleyBroker(this.applicationContext)

        volleyBroker.instance.add(VolleyBroker.getRequest("albums",
            { response ->
                val albumJsonResponse = JSONArray(response)
                val albums = arrayOfNulls<String>(albumJsonResponse.length())
                Log.d("ALBUMS", albumJsonResponse.toString())
                for (i in 0 until albumJsonResponse.length()) {
                    val album = albumJsonResponse.getJSONObject(i)
                    albums[i] = album.get("name").toString() + " | " +album.get("releaseDate").toString();
                }
                // access the listView from xml file
                val arrayAdapter: ArrayAdapter<*>
                var mListView = findViewById<ListView>(R.id.albumlist)
                arrayAdapter = ArrayAdapter(this,
                    android.R.layout.simple_list_item_1, albums)
                mListView.adapter = arrayAdapter

            },
            {
                Log.d("errorMessage", it.toString())
            }
        ))

    }
}