package com.santi.pmdm.virgen.dogapicleanarchitecture.ui.modelview;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase.DeleteDogsFromDataBaseUseCase;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase.GetDogsBreedUseCase;
import com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase.GetDogsUseCase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;
import javax.inject.Provider;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\u000bJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\u000bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/santi/pmdm/virgen/dogapicleanarchitecture/ui/modelview/DogViewModel;", "Landroidx/lifecycle/ViewModel;", "useCaseList", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/usercase/GetDogsUseCase;", "getDogsBreedUseCase", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/usercase/GetDogsBreedUseCase;", "userCaseDeleteDatabase", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/usercase/DeleteDogsFromDataBaseUseCase;", "(Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/usercase/GetDogsUseCase;Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/usercase/GetDogsBreedUseCase;Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/usercase/DeleteDogsFromDataBaseUseCase;)V", "breed", "Landroidx/lifecycle/MutableLiveData;", "", "getBreed", "()Landroidx/lifecycle/MutableLiveData;", "setBreed", "(Landroidx/lifecycle/MutableLiveData;)V", "dogListLiveData", "", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/domain/models/Dog;", "getDogListLiveData", "setDogListLiveData", "progressBarLiveData", "", "getProgressBarLiveData", "setProgressBarLiveData", "delete", "", "dog", "list", "listForBreed", "searchByBreed", "app_debug"})
public final class DogViewModel extends androidx.lifecycle.ViewModel {
    private final com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase.GetDogsUseCase useCaseList = null;
    private final com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase.GetDogsBreedUseCase getDogsBreedUseCase = null;
    private final com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase.DeleteDogsFromDataBaseUseCase userCaseDeleteDatabase = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog>> dogListLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressBarLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> breed;
    
    @javax.inject.Inject
    public DogViewModel(@org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase.GetDogsUseCase useCaseList, @org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase.GetDogsBreedUseCase getDogsBreedUseCase, @org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.domain.usercase.DeleteDogsFromDataBaseUseCase userCaseDeleteDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog>> getDogListLiveData() {
        return null;
    }
    
    public final void setDogListLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProgressBarLiveData() {
        return null;
    }
    
    public final void setProgressBarLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getBreed() {
        return null;
    }
    
    public final void setBreed(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void list() {
    }
    
    public final void listForBreed(@org.jetbrains.annotations.NotNull
    java.lang.String breed) {
    }
    
    public final void searchByBreed(@org.jetbrains.annotations.NotNull
    java.lang.String breed) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull
    com.santi.pmdm.virgen.dogapicleanarchitecture.domain.models.Dog dog) {
    }
}