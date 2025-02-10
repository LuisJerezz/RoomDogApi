package com.santi.pmdm.virgen.dogapicleanarchitecture.domain.repository;

import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH&J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/repository/DogRepositoryInterface;", "", "deleteDatabase", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBreedDogs", "", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/models/Dog;", "breed", "", "getBreedDogsEntity", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDogs", "getDogsEntity", "insertBreedEntitytoDatabase", "listEntity", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/entities/DogEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DogRepositoryInterface {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog> getDogs();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog> getBreedDogs(@org.jetbrains.annotations.NotNull
    java.lang.String breed);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDogsEntity(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getBreedDogsEntity(@org.jetbrains.annotations.NotNull
    java.lang.String breed, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertBreedEntitytoDatabase(@org.jetbrains.annotations.NotNull
    java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity> listEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteDatabase(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}