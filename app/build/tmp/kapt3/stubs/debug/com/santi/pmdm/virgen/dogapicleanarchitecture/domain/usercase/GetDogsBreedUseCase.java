package com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase;

import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity;
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.repository.DogRepository;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Repository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/usercase/GetDogsBreedUseCase;", "", "dogRepositoryDao", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/repository/DogRepository;", "(Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/repository/DogRepository;)V", "breed", "", "invoke", "", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/models/Dog;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setBreed", "", "app_debug"})
public final class GetDogsBreedUseCase {
    private final com.santi.pmdm.virgen.dogapicleanarchitecture.data.repository.DogRepository dogRepositoryDao = null;
    private java.lang.String breed = "";
    
    @javax.inject.Inject
    public GetDogsBreedUseCase(@org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.data.repository.DogRepository dogRepositoryDao) {
        super();
    }
    
    public final void setBreed(@org.jetbrains.annotations.NotNull
    java.lang.String breed) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog>> continuation) {
        return null;
    }
}