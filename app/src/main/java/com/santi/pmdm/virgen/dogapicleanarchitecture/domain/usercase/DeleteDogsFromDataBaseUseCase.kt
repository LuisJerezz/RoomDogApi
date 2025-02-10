package com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase

import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.mapper.toDogEntity
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog
import javax.inject.Inject

class DeleteDogsFromDataBaseUseCase @Inject constructor(
    private val dogRepositoryDao: DogDao
) {

    // Eliminar un perro específico de la base de datos
    suspend fun deleteDog(dog: Dog) {
        val dogEntity = dog.toDogEntity()  // Convierte Dog a DogEntity
        dogRepositoryDao.delete(dogEntity)  // Llamar al método delete() del DAO para borrar un perro
    }
}