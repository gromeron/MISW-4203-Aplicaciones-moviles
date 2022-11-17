package com.uniandes.vynilsapp.view.artist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.uniandes.vynilsapp.data.model.Performer
import com.uniandes.vynilsapp.databinding.ActivityArtistListBinding
import com.uniandes.vynilsapp.viewmodel.ArtistViewModel

class ArtistListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityArtistListBinding

    private lateinit var artistAdapter: ArtistAdapter
    private lateinit var artistViewModel: ArtistViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityArtistListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        artistAdapter = ArtistAdapter()

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
}