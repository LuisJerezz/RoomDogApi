// Generated by Dagger (https://dagger.dev).
package com.santi.pmdm.virgen.dogapicleanarchitecture.framework;

import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.DatabaseDogs;
import com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.database.dao.DogDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomModule_ProvideDaoFactory implements Factory<DogDao> {
  private final Provider<DatabaseDogs> databaseProvider;

  public RoomModule_ProvideDaoFactory(Provider<DatabaseDogs> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public DogDao get() {
    return provideDao(databaseProvider.get());
  }

  public static RoomModule_ProvideDaoFactory create(Provider<DatabaseDogs> databaseProvider) {
    return new RoomModule_ProvideDaoFactory(databaseProvider);
  }

  public static DogDao provideDao(DatabaseDogs database) {
    return Preconditions.checkNotNullFromProvides(RoomModule.INSTANCE.provideDao(database));
  }
}
