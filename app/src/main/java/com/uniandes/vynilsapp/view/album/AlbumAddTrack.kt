package com.uniandes.vynilsapp.view.album

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment
import com.uniandes.vynilsapp.databinding.DialogInputBinding
class AlbumAddTrack ( private val onSubmitClickListener: () -> Unit) : DialogFragment() {
    private lateinit var binding = DialogInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding = DialogInputBinding.inflate(LayoutInflater.from(context))

    }

}