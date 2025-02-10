package com.santi.pmdm.virgen.dogapicleanarchitecture.ui.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputMethodManager
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.pmdm.virgen.dogapi.ui.adapter.DogAdapter
import com.santi.pmdm.virgen.dogapicleanarchitecture.databinding.ActivityMainBinding
import com.santi.pmdm.virgen.dogapicleanarchitecture.ui.modelview.DogViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: DogAdapter
    private val dogViewModel: DogViewModel by viewModels() // ViewModel inyectado con Hilt.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mySearch.setOnQueryTextListener(this) // Listener de búsqueda
        registerLiveData()  // Observamos cambios.
        loadData() // Se cargan todos los datos.
        initRecyclerView()  // Inicializamos el RecyclerView.
    }

    private fun initRecyclerView() {
        binding.myRecyclerPpal.layoutManager = LinearLayoutManager(this)
        adapter = DogAdapter { dog ->
            dogViewModel.delete(dog) // Llama a tu ViewModel para eliminar el perro.
        }
        binding.myRecyclerPpal.adapter = adapter
    }

    private fun registerLiveData() {
        dogViewModel.dogListLiveData.observe(this) { myList ->
            adapter.dogRepository = myList?.toMutableList() ?: mutableListOf() // Convertimos a lista mutable
            adapter.notifyDataSetChanged()
        }
    }

    private fun loadData() {
        dogViewModel.list()  // Simulamos un evento para iniciar la carga de datos.
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        query?.let { dogViewModel.searchByBreed(it) }
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        if (newText.isNullOrEmpty()) {
            dogViewModel.list()
            hideKeyBoard()
        }
        return true
    }

    private fun hideKeyBoard() {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(binding.myLayoutPpal.windowToken, 0)
    }
}