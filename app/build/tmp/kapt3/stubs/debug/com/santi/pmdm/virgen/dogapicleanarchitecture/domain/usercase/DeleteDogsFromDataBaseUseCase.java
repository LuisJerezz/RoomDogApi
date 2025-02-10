package com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase;

import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/usercase/DeleteDogsFromDataBaseUseCase;", "", "dogRepositoryDao", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/dao/DogDao;", "(Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/dao/DogDao;)V", "deleteDog", "", "dog", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/models/Dog;", "(Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/models/Dog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DeleteDogsFromDataBaseUseCase {
    private final com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao dogRepositoryDao = null;
    
    @javax.inject.Inject
    public DeleteDogsFromDataBaseUseCase(@org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao dogRepositoryDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteDog(@org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog dog, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}