package com.pmdm.virgen.dogapi.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.santi.pmdm.virgen.dogapicleanarchitecture.databinding.ItemDogBinding
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog

class ViewHDog(view: View, private val onDeleteClick: (Dog) -> Unit) : RecyclerView.ViewHolder(view) {

    private val binding = ItemDogBinding.bind(view)

    fun rendereize(dog: Dog, position: Int) {
        Glide.with(itemView.context)
            .load(dog.image)
            .centerCrop()
            .into(binding.ivImagen)

        binding.btnDelete.setOnClickListener {
            onDeleteClick(dog) // Llama a la función de eliminar en el ViewModel
        }
    }
}