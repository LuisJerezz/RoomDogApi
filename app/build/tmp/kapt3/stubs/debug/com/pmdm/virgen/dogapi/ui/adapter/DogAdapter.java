package com.pmdm.virgen.dogapi.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.santi.pmdm.virgen.dogapicleanarchitecture.R;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0005R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/pmdm/virgen/dogapi/ui/adapter/DogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/pmdm/virgen/dogapi/ui/adapter/ViewHDog;", "onDeleteClick", "Lkotlin/Function1;", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/models/Dog;", "", "(Lkotlin/jvm/functions/Function1;)V", "dogRepository", "", "getDogRepository", "()Ljava/util/List;", "setDogRepository", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeDog", "dog", "app_debug"})
public final class DogAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.pmdm.virgen.dogapi.ui.adapter.ViewHDog> {
    private final kotlin.jvm.functions.Function1<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog, kotlin.Unit> onDeleteClick = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog> dogRepository;
    
    public DogAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog, kotlin.Unit> onDeleteClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog> getDogRepository() {
        return null;
    }
    
    public final void setDogRepository(@org.jetbrains.annotations.NotNull
    java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.pmdm.virgen.dogapi.ui.adapter.ViewHDog onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.pmdm.virgen.dogapi.ui.adapter.ViewHDog holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void removeDog(@org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog dog) {
    }
}