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

        val getButton: Button = findViewById(R.id.fetch_button)
        getButton.setOnClickListener {
            volleyBroker.instance.add(VolleyBroker.getRequest("albums",
                Response.Listener<String> { response ->

                    // Display the first 500 characters of the response string.
                    //getResultTextView.text = "Response is: ${response}"

                    val albumJSONArray = JSONArray(response)
                    val albums = arrayOfNulls<String>(albumJSONArray.length())
                    val albumsPhotos = arrayOfNulls<String>(albumJSONArray.length())
                    Log.d("ALBUMS", albumJSONArray.toString())
                    Log.d("ALBUMS | LENGTH: ", albumJSONArray.length().toString())
                    for (i in 0 until albumJSONArray.length()) {
                        val album = albumJSONArray.getJSONObject(i)
                        albums[i] = album.get("name").toString() + " | " +album.get("releaseDate").toString();
                    }
                    Log.d("FINAL ALBUMS", albums.toString())

                    // access the listView from xml file
                    val arrayAdapter: ArrayAdapter<*>
                    var mListView = findViewById<ListView>(R.id.albumlist)
                    arrayAdapter = ArrayAdapter(this,
                        android.R.layout.simple_list_item_1, albums)
                    mListView.adapter = arrayAdapter

                },
                Response.ErrorListener {
                    Log.d("TAG", it.toString())
//                    getResultTextView.text = "That didn't work!"
                }
            ))
        }

        /*   val postButton: Button = findViewById(R.id.post_button)
           val postResultTextView : TextView = findViewById(R.id.post_result_text)
           postButton.setOnClickListener {
               val mailTxt : TextInputEditText = findViewById(R.id.txt_post_mail)
               val nameTxt : TextInputEditText = findViewById(R.id.txt_post_name)
               val phoneTxt : TextInputEditText = findViewById(R.id.txt_post_phone)
               val postParams = mapOf<String, Any>(
                   "name" to nameTxt.text.toString(),
                   "telephone" to phoneTxt.text.toString(),
                   "email" to mailTxt.text.toString()
               )
               volleyBroker.instance.add(VolleyBroker.postRequest("collectors", JSONObject(postParams),
                   Response.Listener<JSONObject> { response ->
                       // Display the first 500 characters of the response string.
                       postResultTextView.text = "Response is: ${response.toString()}"
                   },
                   Response.ErrorListener {
                       Log.d("TAG", it.toString())
                       postResultTextView.text = "That didn't work!"
                   }
               ))
           }*/
    }
}