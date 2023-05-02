package com.example.recycleviewtest;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.recycleviewtest.databinding.FragmentFriendChatBindingImpl;
import com.example.recycleviewtest.databinding.FragmentFriendsBindingImpl;
import com.example.recycleviewtest.databinding.FrienditemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTFRIENDCHAT = 1;

  private static final int LAYOUT_FRAGMENTFRIENDS = 2;

  private static final int LAYOUT_FRIENDITEM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.recycleviewtest.R.layout.fragment_friend_chat, LAYOUT_FRAGMENTFRIENDCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.recycleviewtest.R.layout.fragment_friends, LAYOUT_FRAGMENTFRIENDS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.recycleviewtest.R.layout.frienditem, LAYOUT_FRIENDITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTFRIENDCHAT: {
          if ("layout/fragment_friend_chat_0".equals(tag)) {
            return new FragmentFriendChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_friend_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFRIENDS: {
          if ("layout/fragment_friends_0".equals(tag)) {
            return new FragmentFriendsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_friends is invalid. Received: " + tag);
        }
        case  LAYOUT_FRIENDITEM: {
          if ("layout/frienditem_0".equals(tag)) {
            return new FrienditemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for frienditem is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_friend_chat_0", com.example.recycleviewtest.R.layout.fragment_friend_chat);
      sKeys.put("layout/fragment_friends_0", com.example.recycleviewtest.R.layout.fragment_friends);
      sKeys.put("layout/frienditem_0", com.example.recycleviewtest.R.layout.frienditem);
    }
  }
}
