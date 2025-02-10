package com.pmdm.virgen.dogapi.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.santi.pmdm.virgen.dogapicleanarchitecture.R
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog


class DogAdapter(private val onDeleteClick: (Dog) -> Unit) : RecyclerView.Adapter<ViewHDog>() {

    var dogRepository: MutableList<Dog> = mutableListOf() // Usamos una lista mutable

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHDog {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_dog, parent, false)
        return ViewHDog(view, onDeleteClick)
    }

    override fun onBindViewHolder(holder: ViewHDog, position: Int) {
        holder.rendereize(dogRepository[position], position)
    }

    override fun getItemCount() = dogRepository.size

    // Método para eliminar un perro de la lista y actualizar el RecyclerView
    fun removeDog(dog: Dog) {
        val index = dogRepository.indexOf(dog)
        if (index != -1) {
            dogRepository.removeAt(index)
            notifyItemRemoved(index) // Notificar que un elemento ha sido eliminado
        }
    }
}