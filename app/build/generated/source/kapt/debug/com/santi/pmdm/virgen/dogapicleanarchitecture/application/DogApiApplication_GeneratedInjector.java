package com.santi.pmdm.virgen.dogapicleanarchitecture.application;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = DogApiApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface DogApiApplication_GeneratedInjector {
  void injectDogApiApplication(DogApiApplication dogApiApplication);
}
