package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDetailsBindingImpl extends ActivityDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnarrowfive, 6);
        sViewsWithIds.put(R.id.toolbarToolbar, 7);
        sViewsWithIds.put(R.id.linearRowarrowfive, 8);
        sViewsWithIds.put(R.id.frameStackarrowfive, 9);
        sViewsWithIds.put(R.id.imageArrowFive, 10);
        sViewsWithIds.put(R.id.linearRowyourbmi, 11);
        sViewsWithIds.put(R.id.linearColumndescription, 12);
        sViewsWithIds.put(R.id.btnSaveResults, 13);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[13]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.FrameLayout) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[11]
            , (androidx.appcompat.widget.Toolbar) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.frameDetails.setTag(null);
        this.txtDescription.setTag(null);
        this.txtObese.setTag(null);
        this.txtSUMMARY.setTag(null);
        this.txtThreeHundredThirtyThree.setTag(null);
        this.txtYourBMI.setTag(null);
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
        if (BR.detailsVM == variableId) {
            setDetailsVM((com.front_end.app.modules.details.data.viewmodel.DetailsVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDetailsVM(@Nullable com.front_end.app.modules.details.data.viewmodel.DetailsVM DetailsVM) {
        this.mDetailsVM = DetailsVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.detailsVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDetailsVMDetailsModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.details.data.model.DetailsModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDetailsVMDetailsModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.details.data.model.DetailsModel> DetailsVMDetailsModel, int fieldId) {
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
        com.front_end.app.modules.details.data.model.DetailsModel detailsVMDetailsModelGetValue = null;
        java.lang.String detailsVMDetailsModelTxtThreeHundredThirtyThree = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.details.data.model.DetailsModel> detailsVMDetailsModel = null;
        java.lang.String detailsVMDetailsModelTxtObese = null;
        java.lang.String detailsVMDetailsModelTxtSUMMARY = null;
        java.lang.String detailsVMDetailsModelTxtDescription = null;
        java.lang.String detailsVMDetailsModelTxtYourBMI = null;
        com.front_end.app.modules.details.data.viewmodel.DetailsVM detailsVM = mDetailsVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (detailsVM != null) {
                    // read detailsVM.detailsModel
                    detailsVMDetailsModel = detailsVM.getDetailsModel();
                }
                updateLiveDataRegistration(0, detailsVMDetailsModel);


                if (detailsVMDetailsModel != null) {
                    // read detailsVM.detailsModel.getValue()
                    detailsVMDetailsModelGetValue = detailsVMDetailsModel.getValue();
                }


                if (detailsVMDetailsModelGetValue != null) {
                    // read detailsVM.detailsModel.getValue().txtThreeHundredThirtyThree
                    detailsVMDetailsModelTxtThreeHundredThirtyThree = detailsVMDetailsModelGetValue.getTxtThreeHundredThirtyThree();
                    // read detailsVM.detailsModel.getValue().txtObese
                    detailsVMDetailsModelTxtObese = detailsVMDetailsModelGetValue.getTxtObese();
                    // read detailsVM.detailsModel.getValue().txtSUMMARY
                    detailsVMDetailsModelTxtSUMMARY = detailsVMDetailsModelGetValue.getTxtSUMMARY();
                    // read detailsVM.detailsModel.getValue().txtDescription
                    detailsVMDetailsModelTxtDescription = detailsVMDetailsModelGetValue.getTxtDescription();
                    // read detailsVM.detailsModel.getValue().txtYourBMI
                    detailsVMDetailsModelTxtYourBMI = detailsVMDetailsModelGetValue.getTxtYourBMI();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDescription, detailsVMDetailsModelTxtDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtObese, detailsVMDetailsModelTxtObese);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSUMMARY, detailsVMDetailsModelTxtSUMMARY);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtThreeHundredThirtyThree, detailsVMDetailsModelTxtThreeHundredThirtyThree);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtYourBMI, detailsVMDetailsModelTxtYourBMI);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): detailsVM.detailsModel
        flag 1 (0x2L): detailsVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}