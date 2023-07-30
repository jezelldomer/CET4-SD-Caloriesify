package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityWastedBindingImpl extends ActivityWastedBinding  {

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

    public ActivityWastedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityWastedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        this.linearWasted.setTag(null);
        this.txtUnderweight.setTag(null);
        this.txtYouhaveUnderw.setTag(null);
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
        if (BR.wastedVM == variableId) {
            setWastedVM((com.front_end.app.modules.wasted.data.viewmodel.WastedVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setWastedVM(@Nullable com.front_end.app.modules.wasted.data.viewmodel.WastedVM WastedVM) {
        this.mWastedVM = WastedVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.wastedVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeWastedVMWastedModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.wasted.data.model.WastedModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeWastedVMWastedModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.wasted.data.model.WastedModel> WastedVMWastedModel, int fieldId) {
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
        java.lang.String wastedVMWastedModelTxtYouhaveUnderw = null;
        java.lang.String wastedVMWastedModelTxtUnderweight = null;
        com.front_end.app.modules.wasted.data.model.WastedModel wastedVMWastedModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.wasted.data.model.WastedModel> wastedVMWastedModel = null;
        com.front_end.app.modules.wasted.data.viewmodel.WastedVM wastedVM = mWastedVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (wastedVM != null) {
                    // read wastedVM.wastedModel
                    wastedVMWastedModel = wastedVM.getWastedModel();
                }
                updateLiveDataRegistration(0, wastedVMWastedModel);


                if (wastedVMWastedModel != null) {
                    // read wastedVM.wastedModel.getValue()
                    wastedVMWastedModelGetValue = wastedVMWastedModel.getValue();
                }


                if (wastedVMWastedModelGetValue != null) {
                    // read wastedVM.wastedModel.getValue().txtYouhaveUnderw
                    wastedVMWastedModelTxtYouhaveUnderw = wastedVMWastedModelGetValue.getTxtYouhaveUnderw();
                    // read wastedVM.wastedModel.getValue().txtUnderweight
                    wastedVMWastedModelTxtUnderweight = wastedVMWastedModelGetValue.getTxtUnderweight();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUnderweight, wastedVMWastedModelTxtUnderweight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtYouhaveUnderw, wastedVMWastedModelTxtYouhaveUnderw);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): wastedVM.wastedModel
        flag 1 (0x2L): wastedVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}