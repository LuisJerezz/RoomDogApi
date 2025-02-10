package com.santi.pmdm.virgen.dogapicleanarchitecture.data.repository;

import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao;
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity;
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.mem.service.DogService;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Repository;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.repository.DogRepositoryInterface;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/repository/DogRepository;", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/repository/DogRepositoryInterface;", "service", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/mem/service/DogService;", "dogDao", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/dao/DogDao;", "(Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/mem/service/DogService;Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/dao/DogDao;)V", "deleteDatabase", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBreedDogs", "", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/models/Dog;", "breed", "", "getBreedDogsEntity", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDogs", "getDogsEntity", "insertBreedEntitytoDatabase", "listEntity", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/entities/DogEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DogRepository implements com.santi.pmdm.virgen.dogapicleanarchitecture.domain.repository.DogRepositoryInterface {
    private final com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.mem.service.DogService service = null;
    private final com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao dogDao = null;
    
    @javax.inject.Inject
    public DogRepository(@org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.mem.service.DogService service, @org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao dogDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog> getDogs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog> getBreedDogs(@org.jetbrains.annotations.NotNull
    java.lang.String breed) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getDogsEntity(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getBreedDogsEntity(@org.jetbrains.annotations.NotNull
    java.lang.String breed, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertBreedEntitytoDatabase(@org.jetbrains.annotations.NotNull
    java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity> listEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteDatabase(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}