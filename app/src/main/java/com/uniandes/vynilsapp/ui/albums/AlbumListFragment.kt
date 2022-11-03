package com.uniandes.vynilsapp.ui.albums

import VolleyBroker
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uniandes.vynilsapp.R
import com.uniandes.vynilsapp.model.Album
import org.json.JSONArray

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AlbumFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AlbumFragment : Fragment(), ListAdapter.OnItemClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var volleyBroker: VolleyBroker

    private lateinit var adapter: ListAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var albums: ArrayList<Album>

    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var namesAlbums: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_album, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AlbumFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AlbumFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.albumsView)

/*
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = ListAdapter(this, albums)
        recyclerView.adapter = adapter
*/

        var albumsTest = mutableListOf<Album>()

        volleyBroker = VolleyBroker(requireContext().applicationContext)

        volleyBroker.instance.add(VolleyBroker.getRequest("albums",
            { response ->
                val albumJsonResponse = JSONArray(response)

                for (i in 0 until albumJsonResponse.length()) {
                    val album = albumJsonResponse.getJSONObject(i)
                    albumsTest.add(Album(album.get("name").toString(), album.get("releaseDate").toString(),
                        R.drawable.ic_launcher_foreground
                    ))
                }

                //val adapter = ListAdapter(this, albums)
                recyclerView.layoutManager = layoutManager
                recyclerView.setHasFixedSize(true)
                adapter = ListAdapter(this, albumsTest)


                //recyclerview.layoutManager = LinearLayoutManager(this)
                recyclerView.adapter = adapter
            },{}
        ))

    }

    private fun dataInitialize(){
        albums = arrayListOf<Album>()
        imageId = arrayOf(R.drawable.ic_menu_camera, R.drawable.ic_menu_camera, R.drawable.ic_menu_camera)
        heading = arrayOf("Test1","Test1","Test1")
        namesAlbums = arrayOf("Test1","Test1","Test1")

        for ( i in imageId.indices ){
            albums.add(Album(heading[i], namesAlbums[i], imageId[i]))
        }
      //  return albums

        /*
        albums = arrayListOf<Album>()

        volleyBroker = VolleyBroker(requireContext().applicationContext)

        volleyBroker.instance.add(VolleyBroker.getRequest("albums",
            { response ->
                val albumJsonResponse = JSONArray(response)

                for (i in 0 until albumJsonResponse.length()) {
                    val album = albumJsonResponse.getJSONObject(i)
                    albums.add(Album(album.get("name").toString(), album.get("releaseDate").toString(),
                        R.drawable.ic_launcher_foreground
                    ))
                }
                println(albums)

            },{}))

         */
    }

    override fun onItemClick(position: Int) {
        //val intent = Intent(this@AlbumListActivity, AlbumDetailActivity::class.java)
        //startActivity(intent)
    }
}