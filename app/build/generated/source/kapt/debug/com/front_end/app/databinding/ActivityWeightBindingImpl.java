package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityWeightBindingImpl extends ActivityWeightBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnthree, 7);
        sViewsWithIds.put(R.id.etRectangleTwentyOne, 8);
        sViewsWithIds.put(R.id.linearRowback, 9);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityWeightBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityWeightBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[8]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.frameWeight.setTag(null);
        this.image360F247848348.setTag(null);
        this.txtBack.setTag(null);
        this.txtNext.setTag(null);
        this.txtThree.setTag(null);
        this.txtWeusethisdat.setTag(null);
        this.txtWhatsyourCur.setTag(null);
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
        if (BR.weightVM == variableId) {
            setWeightVM((com.front_end.app.modules.weight.data.viewmodel.WeightVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setWeightVM(@Nullable com.front_end.app.modules.weight.data.viewmodel.WeightVM WeightVM) {
        this.mWeightVM = WeightVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.weightVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeWeightVMWeightModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.weight.data.model.WeightModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeWeightVMWeightModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.weight.data.model.WeightModel> WeightVMWeightModel, int fieldId) {
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
        java.lang.String weightVMWeightModelTxtWhatsyourCur = null;
        java.lang.String weightVMWeightModelTxtWeusethisdat = null;
        java.lang.String weightVMWeightModelTxtBack = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.weight.data.model.WeightModel> weightVMWeightModel = null;
        java.lang.String weightVMWeightModelTxtThree = null;
        java.lang.String weightVMWeightModelTxtNext = null;
        com.front_end.app.modules.weight.data.viewmodel.WeightVM weightVM = mWeightVM;
        com.front_end.app.modules.weight.data.model.WeightModel weightVMWeightModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (weightVM != null) {
                    // read weightVM.weightModel
                    weightVMWeightModel = weightVM.getWeightModel();
                }
                updateLiveDataRegistration(0, weightVMWeightModel);


                if (weightVMWeightModel != null) {
                    // read weightVM.weightModel.getValue()
                    weightVMWeightModelGetValue = weightVMWeightModel.getValue();
                }


                if (weightVMWeightModelGetValue != null) {
                    // read weightVM.weightModel.getValue().txtWhatsyourCur
                    weightVMWeightModelTxtWhatsyourCur = weightVMWeightModelGetValue.getTxtWhatsyourCur();
                    // read weightVM.weightModel.getValue().txtWeusethisdat
                    weightVMWeightModelTxtWeusethisdat = weightVMWeightModelGetValue.getTxtWeusethisdat();
                    // read weightVM.weightModel.getValue().txtBack
                    weightVMWeightModelTxtBack = weightVMWeightModelGetValue.getTxtBack();
                    // read weightVM.weightModel.getValue().txtThree
                    weightVMWeightModelTxtThree = weightVMWeightModelGetValue.getTxtThree();
                    // read weightVM.weightModel.getValue().txtNext
                    weightVMWeightModelTxtNext = weightVMWeightModelGetValue.getTxtNext();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image360F247848348, androidx.appcompat.content.res.AppCompatResources.getDrawable(image360F247848348.getContext(), R.drawable.img_360f247848348), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBack, weightVMWeightModelTxtBack);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNext, weightVMWeightModelTxtNext);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtThree, weightVMWeightModelTxtThree);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeusethisdat, weightVMWeightModelTxtWeusethisdat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWhatsyourCur, weightVMWeightModelTxtWhatsyourCur);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): weightVM.weightModel
        flag 1 (0x2L): weightVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}