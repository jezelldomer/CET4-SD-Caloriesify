package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityObeseBindingImpl extends ActivityObeseBinding  {

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

    public ActivityObeseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityObeseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        this.linearObese.setTag(null);
        this.txtObsesse.setTag(null);
        this.txtYouhaveObese.setTag(null);
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
        if (BR.obeseVM == variableId) {
            setObeseVM((com.front_end.app.modules.obese.data.viewmodel.ObeseVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setObeseVM(@Nullable com.front_end.app.modules.obese.data.viewmodel.ObeseVM ObeseVM) {
        this.mObeseVM = ObeseVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.obeseVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeObeseVMObeseModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.obese.data.model.ObeseModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeObeseVMObeseModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.obese.data.model.ObeseModel> ObeseVMObeseModel, int fieldId) {
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
        java.lang.String obeseVMObeseModelTxtYouhaveObese = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.obese.data.model.ObeseModel> obeseVMObeseModel = null;
        com.front_end.app.modules.obese.data.viewmodel.ObeseVM obeseVM = mObeseVM;
        java.lang.String obeseVMObeseModelTxtObsesse = null;
        com.front_end.app.modules.obese.data.model.ObeseModel obeseVMObeseModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (obeseVM != null) {
                    // read obeseVM.obeseModel
                    obeseVMObeseModel = obeseVM.getObeseModel();
                }
                updateLiveDataRegistration(0, obeseVMObeseModel);


                if (obeseVMObeseModel != null) {
                    // read obeseVM.obeseModel.getValue()
                    obeseVMObeseModelGetValue = obeseVMObeseModel.getValue();
                }


                if (obeseVMObeseModelGetValue != null) {
                    // read obeseVM.obeseModel.getValue().txtYouhaveObese
                    obeseVMObeseModelTxtYouhaveObese = obeseVMObeseModelGetValue.getTxtYouhaveObese();
                    // read obeseVM.obeseModel.getValue().txtObsesse
                    obeseVMObeseModelTxtObsesse = obeseVMObeseModelGetValue.getTxtObsesse();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtObsesse, obeseVMObeseModelTxtObsesse);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtYouhaveObese, obeseVMObeseModelTxtYouhaveObese);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): obeseVM.obeseModel
        flag 1 (0x2L): obeseVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}