package com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase

import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.repository.DogRepository
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.mapper.toDogEntity
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Repository
import javax.inject.Inject

/*
Con @Inyect constructor(), estamos diciendo que esa clase ya se puede inyectar.
También inyectaremos el repositorio
 */

/*
Modificaremos nuestro caso de uso, para que haga lo siguiente:
1.- Si los datos de la BBDD están vacíos, lo que haremos es cargarlos directamente
a partir de nuestra otra fuentes de datos.
2.- Si existen datos en la BBDD, lo que haremos es cargarlos directamente y utilizarlos.
 */
class GetDogsUseCase @Inject constructor(
    private val dogRepositoryDao: DogRepository
) {
    // Implementar el operador invoke
    suspend operator fun invoke(): List<Dog>? {
        return dogRepositoryDao.getDogsEntity() // Obtener todos los perros desde el repositorio
    }
}