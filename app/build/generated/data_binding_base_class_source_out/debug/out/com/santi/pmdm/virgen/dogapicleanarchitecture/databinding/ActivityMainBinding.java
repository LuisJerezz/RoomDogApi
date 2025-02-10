// Generated by view binder compiler. Do not edit!
package com.santi.pmdm.virgen.dogapicleanarchitecture.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.santi.pmdm.virgen.dogapicleanarchitecture.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout myLayoutPpal;

  @NonNull
  public final RecyclerView myRecyclerPpal;

  @NonNull
  public final SearchView mySearch;

  @NonNull
  public final ProgressBar progressBar;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout myLayoutPpal, @NonNull RecyclerView myRecyclerPpal,
      @NonNull SearchView mySearch, @NonNull ProgressBar progressBar) {
    this.rootView = rootView;
    this.myLayoutPpal = myLayoutPpal;
    this.myRecyclerPpal = myRecyclerPpal;
    this.mySearch = mySearch;
    this.progressBar = progressBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout myLayoutPpal = (ConstraintLayout) rootView;

      id = R.id.my_recycler_ppal;
      RecyclerView myRecyclerPpal = ViewBindings.findChildViewById(rootView, id);
      if (myRecyclerPpal == null) {
        break missingId;
      }

      id = R.id.my_search;
      SearchView mySearch = ViewBindings.findChildViewById(rootView, id);
      if (mySearch == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, myLayoutPpal, myRecyclerPpal,
          mySearch, progressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
