package com.uniandes.vynilsapp.view.collector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uniandes.vynilsapp.databinding.ActivityCollectorDetailBinding

class CollectorDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityCollectorDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}