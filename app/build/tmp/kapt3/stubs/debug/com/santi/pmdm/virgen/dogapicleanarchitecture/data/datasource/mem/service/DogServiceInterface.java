package com.santi.pmdm.virgen.dogapicleanarchitecture.data.datasource.mem.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/santi/pmdm/virgen/dogapicleanarchitecture/data/datasource/mem/service/DogServiceInterface;", "", "getBreedDogs", "", "Lkotlin/Pair;", "", "breed", "getDogs", "app_debug"})
public abstract interface DogServiceInterface {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getDogs();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> getBreedDogs(@org.jetbrains.annotations.NotNull
    java.lang.String breed);
}