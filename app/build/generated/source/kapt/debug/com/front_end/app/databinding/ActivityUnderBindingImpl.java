package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityUnderBindingImpl extends ActivityUnderBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearMainEclipse, 3);
        sViewsWithIds.put(R.id.frameStackellipseten, 4);
        sViewsWithIds.put(R.id.viewEllipseTen, 5);
        sViewsWithIds.put(R.id.btnDetails, 6);
        sViewsWithIds.put(R.id.btnBack, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityUnderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityUnderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (androidx.appcompat.widget.AppCompatButton) bindings[6]
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[5]
            );
        this.linearUnder.setTag(null);
        this.txtOverweight.setTag(null);
        this.txtYouhaveNormal.setTag(null);
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
        if (BR.underVM == variableId) {
            setUnderVM((com.front_end.app.modules.under.data.viewmodel.UnderVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUnderVM(@Nullable com.front_end.app.modules.under.data.viewmodel.UnderVM UnderVM) {
        this.mUnderVM = UnderVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.underVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUnderVMUnderModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.under.data.model.UnderModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUnderVMUnderModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.under.data.model.UnderModel> UnderVMUnderModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.under.data.model.UnderModel> underVMUnderModel = null;
        com.front_end.app.modules.under.data.model.UnderModel underVMUnderModelGetValue = null;
        com.front_end.app.modules.under.data.viewmodel.UnderVM underVM = mUnderVM;
        java.lang.String underVMUnderModelTxtOverweight = null;
        java.lang.String underVMUnderModelTxtYouhaveNormal = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (underVM != null) {
                    // read underVM.underModel
                    underVMUnderModel = underVM.getUnderModel();
                }
                updateLiveDataRegistration(0, underVMUnderModel);


                if (underVMUnderModel != null) {
                    // read underVM.underModel.getValue()
                    underVMUnderModelGetValue = underVMUnderModel.getValue();
                }


                if (underVMUnderModelGetValue != null) {
                    // read underVM.underModel.getValue().txtOverweight
                    underVMUnderModelTxtOverweight = underVMUnderModelGetValue.getTxtOverweight();
                    // read underVM.underModel.getValue().txtYouhaveNormal
                    underVMUnderModelTxtYouhaveNormal = underVMUnderModelGetValue.getTxtYouhaveNormal();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtOverweight, underVMUnderModelTxtOverweight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtYouhaveNormal, underVMUnderModelTxtYouhaveNormal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): underVM.underModel
        flag 1 (0x2L): underVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}