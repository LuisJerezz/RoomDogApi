package com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase;

import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity;
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.repository.DogRepository;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Repository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/usercase/GetDogsUseCase;", "", "dogRepositoryDao", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/repository/DogRepository;", "(Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/repository/DogRepository;)V", "invoke", "", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/models/Dog;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetDogsUseCase {
    private final com.santi.pmdm.virgen.dogapicleanarchitecture.data.repository.DogRepository dogRepositoryDao = null;
    
    @javax.inject.Inject
    public GetDogsUseCase(@org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.data.repository.DogRepository dogRepositoryDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog>> continuation) {
        return null;
    }
}