package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNormalBindingImpl extends ActivityNormalBinding  {

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

    public ActivityNormalBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityNormalBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        this.linearNormal.setTag(null);
        this.txtNormal.setTag(null);
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
        if (BR.normalVM == variableId) {
            setNormalVM((com.front_end.app.modules.normal.data.viewmodel.NormalVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNormalVM(@Nullable com.front_end.app.modules.normal.data.viewmodel.NormalVM NormalVM) {
        this.mNormalVM = NormalVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.normalVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNormalVMNormalModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.normal.data.model.NormalModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNormalVMNormalModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.normal.data.model.NormalModel> NormalVMNormalModel, int fieldId) {
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
        java.lang.String normalVMNormalModelTxtYouhaveNormal = null;
        com.front_end.app.modules.normal.data.viewmodel.NormalVM normalVM = mNormalVM;
        java.lang.String normalVMNormalModelTxtNormal = null;
        com.front_end.app.modules.normal.data.model.NormalModel normalVMNormalModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.normal.data.model.NormalModel> normalVMNormalModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (normalVM != null) {
                    // read normalVM.normalModel
                    normalVMNormalModel = normalVM.getNormalModel();
                }
                updateLiveDataRegistration(0, normalVMNormalModel);


                if (normalVMNormalModel != null) {
                    // read normalVM.normalModel.getValue()
                    normalVMNormalModelGetValue = normalVMNormalModel.getValue();
                }


                if (normalVMNormalModelGetValue != null) {
                    // read normalVM.normalModel.getValue().txtYouhaveNormal
                    normalVMNormalModelTxtYouhaveNormal = normalVMNormalModelGetValue.getTxtYouhaveNormal();
                    // read normalVM.normalModel.getValue().txtNormal
                    normalVMNormalModelTxtNormal = normalVMNormalModelGetValue.getTxtNormal();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNormal, normalVMNormalModelTxtNormal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtYouhaveNormal, normalVMNormalModelTxtYouhaveNormal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): normalVM.normalModel
        flag 1 (0x2L): normalVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}