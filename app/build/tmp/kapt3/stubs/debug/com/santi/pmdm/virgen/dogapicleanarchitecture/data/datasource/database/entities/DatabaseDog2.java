package com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao;

@androidx.room.Database(entities = {com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DogEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/entities/DatabaseDog2;", "Landroidx/room/RoomDatabase;", "()V", "dogDao", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/dao/DogDao;", "Companion", "app_debug"})
public abstract class DatabaseDog2 extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DatabaseDog2.Companion Companion = null;
    private static com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DatabaseDog2 INSTANCE;
    
    public DatabaseDog2() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao dogDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/entities/DatabaseDog2$Companion;", "", "()V", "INSTANCE", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/entities/DatabaseDog2;", "getDatabase", "initialize", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void initialize(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.entities.DatabaseDog2 getDatabase() {
            return null;
        }
    }
}