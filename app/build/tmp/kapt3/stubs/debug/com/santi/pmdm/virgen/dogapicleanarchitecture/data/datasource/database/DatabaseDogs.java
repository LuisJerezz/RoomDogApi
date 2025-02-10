package com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao;
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity;

@androidx.room.Database(entities = {com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/DatabaseDogs;", "Landroidx/room/RoomDatabase;", "()V", "dogDao", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/dao/DogDao;", "app_debug"})
public abstract class DatabaseDogs extends androidx.room.RoomDatabase {
    
    public DatabaseDogs() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao dogDao();
}