package com.santi.pmdm.virgen.dogapicleanarchitecture.ui.views;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.pmdm.virgen.dogapi.ui.adapter.DogAdapter;
import com.santi.pmdm.virgen.dogapicleanarchitecture.databinding.ActivityMainBinding;
import com.santi.pmdm.virgen.dogapicleanarchitecture.ui.modelview.DogViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/santi/pmdm/virgen/dogapicleanarchitecture/ui/views/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "()V", "adapter", "Lcom/pmdm/virgen/dogapi/ui/adapter/DogAdapter;", "binding", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/databinding/ActivityMainBinding;", "dogViewModel", "Lcom/santi/pmdm/virgen/dogapicleanarchitecture/ui/modelview/DogViewModel;", "getDogViewModel", "()Lcom/santi/pmdm/virgen/dogapicleanarchitecture/ui/modelview/DogViewModel;", "dogViewModel$delegate", "Lkotlin/Lazy;", "hideKeyBoard", "", "initRecyclerView", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onQueryTextChange", "", "newText", "", "onQueryTextSubmit", "query", "registerLiveData", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements androidx.appcompat.widget.SearchView.OnQueryTextListener {
    private com.santi.pmdm.virgen.dogapicleanarchitecture.databinding.ActivityMainBinding binding;
    private com.pmdm.virgen.dogapi.ui.adapter.DogAdapter adapter;
    private final kotlin.Lazy dogViewModel$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.santi.pmdm.virgen.dogapicleanarchitecture.ui.modelview.DogViewModel getDogViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void registerLiveData() {
    }
    
    private final void loadData() {
    }
    
    @java.lang.Override
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable
    java.lang.String newText) {
        return false;
    }
    
    private final void hideKeyBoard() {
    }
}