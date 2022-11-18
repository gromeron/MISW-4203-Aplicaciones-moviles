package com.uniandes.vynilsapp.view.collector

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.uniandes.vynilsapp.data.model.Collector
import com.uniandes.vynilsapp.databinding.ActivityCollectorListBinding
import com.uniandes.vynilsapp.view.album.AlbumListActivity
import com.uniandes.vynilsapp.viewmodel.CollectorViewModel

class CollectorListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCollectorListBinding

    private lateinit var collectorAdapter: CollectorAdapter
    private lateinit var collectorViewModel: CollectorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCollectorListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Album bt_albums intent activity
        val buttonAlbum = binding.btAlbums
        buttonAlbum.setOnClickListener {
            val lanzar = Intent(this, AlbumListActivity::class.java)
            startActivity(lanzar)
        }

        collectorAdapter = CollectorAdapter()

        // Observer
        collectorViewModel = ViewModelProvider(this).get(CollectorViewModel::class.java)
        collectorViewModel.collectorList.observe(this, Observer<List<Collector>> {
            it.apply {
                collectorAdapter.collectorList = this
            }
        })

        initRecyclerView()
    }

    private fun initRecyclerView() {

        binding.recyclerCollector.layoutManager = LinearLayoutManager(this)
        binding.recyclerCollector.adapter = collectorAdapter

    }
}