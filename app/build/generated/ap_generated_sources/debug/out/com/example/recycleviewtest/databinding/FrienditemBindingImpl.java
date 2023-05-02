package com.example.recycleviewtest.databinding;
import com.example.recycleviewtest.R;
import com.example.recycleviewtest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FrienditemBindingImpl extends FrienditemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FrienditemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FrienditemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.ivbigfriend.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvchatname.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.recycleviewtest.FriendViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.recycleviewtest.FriendViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelFriend((androidx.lifecycle.MutableLiveData<com.example.recycleviewtest.Friend>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelFriend(androidx.lifecycle.MutableLiveData<com.example.recycleviewtest.Friend> ViewModelFriend, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int viewModelFriendImageId = 0;
        com.example.recycleviewtest.Friend viewModelFriendGetValue = null;
        androidx.lifecycle.MutableLiveData<com.example.recycleviewtest.Friend> viewModelFriend = null;
        java.lang.String viewModelFriendName = null;
        com.example.recycleviewtest.FriendViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.friend
                    viewModelFriend = viewModel.getFriend();
                }
                updateLiveDataRegistration(0, viewModelFriend);


                if (viewModelFriend != null) {
                    // read viewModel.friend.getValue()
                    viewModelFriendGetValue = viewModelFriend.getValue();
                }


                if (viewModelFriendGetValue != null) {
                    // read viewModel.friend.getValue().imageId
                    viewModelFriendImageId = viewModelFriendGetValue.getImageId();
                    // read viewModel.friend.getValue().name
                    viewModelFriendName = viewModelFriendGetValue.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.ivbigfriend.setImageResource(viewModelFriendImageId);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvchatname, viewModelFriendName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.friend
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}