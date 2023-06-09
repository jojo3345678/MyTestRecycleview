// Generated by data binding compiler. Do not edit!
package com.example.recycleviewtest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recycleviewtest.FriendsViewModel;
import com.example.recycleviewtest.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentFriendsBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout frameLayout;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final SearchView searchView;

  @Bindable
  protected FriendsViewModel mViewModel;

  protected FragmentFriendsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout frameLayout, RecyclerView recyclerView, SearchView searchView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.frameLayout = frameLayout;
    this.recyclerView = recyclerView;
    this.searchView = searchView;
  }

  public abstract void setViewModel(@Nullable FriendsViewModel viewModel);

  @Nullable
  public FriendsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentFriendsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_friends, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFriendsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentFriendsBinding>inflateInternal(inflater, R.layout.fragment_friends, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFriendsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_friends, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentFriendsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentFriendsBinding>inflateInternal(inflater, R.layout.fragment_friends, null, false, component);
  }

  public static FragmentFriendsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentFriendsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentFriendsBinding)bind(component, view, R.layout.fragment_friends);
  }
}
