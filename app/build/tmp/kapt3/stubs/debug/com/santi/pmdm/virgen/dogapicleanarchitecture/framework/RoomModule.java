package com.santi.pmdm.virgen.dogapicleanarchitecture.framework;

import android.content.Context;
import androidx.room.Room;
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.DatabaseDogs;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/santi/pmdm/virgen/dogapicleanarchitecture/framework/RoomModule;", "", "()V", "NAME_DATABASE", "", "provideDao", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/dao/DogDao;", "database", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/database/DatabaseDogs;", "provideRoom", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module
public final class RoomModule {
    @org.jetbrains.annotations.NotNull
    public static final com.santi.pmdm.virgen.dogapicleanarchitecture.framework.RoomModule INSTANCE = null;
    private static final java.lang.String NAME_DATABASE = "database_dogs";
    
    private RoomModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.DatabaseDogs provideRoom(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao provideDao(@org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.DatabaseDogs database) {
        return null;
    }
}