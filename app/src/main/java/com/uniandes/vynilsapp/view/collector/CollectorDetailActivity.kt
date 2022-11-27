package com.uniandes.vynilsapp.view.collector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uniandes.vynilsapp.data.model.Collector
import com.uniandes.vynilsapp.databinding.ActivityCollectorDetailBinding

class CollectorDetailActivity : AppCompatActivity() {

    companion object {
        const val  EXTRA_COLLECTOR = "CollectorDetailActivity:collector"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityCollectorDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val collector = intent.getParcelableExtra<Collector>(EXTRA_COLLECTOR)

        if (collector != null) {
            binding.tvCollectorName.text = collector.name
            binding.tvCollectorTelephone.text = collector.telephone
            binding.tvCollectorEmail.text = collector.email
            //binding.tvCollectorComments.text = collector.comments.toString()
            //binding.tvCollectorFavoriteperformers.text = collector.favoritePerformers.toString()
            //binding.tvCollectorAlbums.text = collector.collectorAlbums.toString()
        }

    }
}