package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySavedBindingImpl extends ActivitySavedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySavedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivitySavedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.frameSAVED.setTag(null);
        this.image360F247848348.setTag(null);
        this.txtSAVED.setTag(null);
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
        if (BR.savedVM == variableId) {
            setSavedVM((com.front_end.app.modules.saved.data.viewmodel.SavedVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSavedVM(@Nullable com.front_end.app.modules.saved.data.viewmodel.SavedVM SavedVM) {
        this.mSavedVM = SavedVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.savedVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSavedVMSavedModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.saved.data.model.SavedModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSavedVMSavedModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.saved.data.model.SavedModel> SavedVMSavedModel, int fieldId) {
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
        java.lang.String savedVMSavedModelTxtSAVED = null;
        com.front_end.app.modules.saved.data.model.SavedModel savedVMSavedModelGetValue = null;
        com.front_end.app.modules.saved.data.viewmodel.SavedVM savedVM = mSavedVM;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.saved.data.model.SavedModel> savedVMSavedModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (savedVM != null) {
                    // read savedVM.savedModel
                    savedVMSavedModel = savedVM.getSavedModel();
                }
                updateLiveDataRegistration(0, savedVMSavedModel);


                if (savedVMSavedModel != null) {
                    // read savedVM.savedModel.getValue()
                    savedVMSavedModelGetValue = savedVMSavedModel.getValue();
                }


                if (savedVMSavedModelGetValue != null) {
                    // read savedVM.savedModel.getValue().txtSAVED
                    savedVMSavedModelTxtSAVED = savedVMSavedModelGetValue.getTxtSAVED();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image360F247848348, androidx.appcompat.content.res.AppCompatResources.getDrawable(image360F247848348.getContext(), R.drawable.img_360f247848348), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSAVED, savedVMSavedModelTxtSAVED);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): savedVM.savedModel
        flag 1 (0x2L): savedVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}