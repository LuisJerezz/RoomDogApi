package com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J%\u0010\u0012\u001a\u00020\u00032\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0013\"\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/dao/DogDao;", "", "delete", "", "dog", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/entities/DogEntity;", "(Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/entities/DogEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "getDogsByBreed", "breed", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAllDog", "dogs", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDog", "", "([Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/entities/DogEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DogDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM dogentity")
    public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM dogentity WHERE breed = :breed")
    public abstract java.lang.Object getDogsByBreed(@org.jetbrains.annotations.NotNull
    java.lang.String breed, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertDog(@org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity[] dogs, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertAllDog(@org.jetbrains.annotations.NotNull
    java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity> dogs, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM dogentity")
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity dog, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}