package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAgeBindingImpl extends ActivityAgeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnone, 8);
        sViewsWithIds.put(R.id.linearRowback, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etRectangleTwentyOneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of ageVM.ageModel.getValue().etRectangleTwentyOneValue
            //         is ageVM.ageModel.getValue().setEtRectangleTwentyOneValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etRectangleTwentyOne);
            // localize variables for thread safety
            // ageVM
            com.front_end.app.modules.age.data.viewmodel.AgeVM ageVM = mAgeVM;
            // ageVM != null
            boolean ageVMJavaLangObjectNull = false;
            // ageVM.ageModel.getValue() != null
            boolean ageVMAgeModelGetValueJavaLangObjectNull = false;
            // ageVM.ageModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.age.data.model.AgeModel> ageVMAgeModel = null;
            // ageVM.ageModel.getValue()
            com.front_end.app.modules.age.data.model.AgeModel ageVMAgeModelGetValue = null;
            // ageVM.ageModel.getValue().etRectangleTwentyOneValue
            java.lang.String ageVMAgeModelEtRectangleTwentyOneValue = null;
            // ageVM.ageModel != null
            boolean ageVMAgeModelJavaLangObjectNull = false;



            ageVMJavaLangObjectNull = (ageVM) != (null);
            if (ageVMJavaLangObjectNull) {


                ageVMAgeModel = ageVM.getAgeModel();

                ageVMAgeModelJavaLangObjectNull = (ageVMAgeModel) != (null);
                if (ageVMAgeModelJavaLangObjectNull) {


                    ageVMAgeModelGetValue = ageVMAgeModel.getValue();

                    ageVMAgeModelGetValueJavaLangObjectNull = (ageVMAgeModelGetValue) != (null);
                    if (ageVMAgeModelGetValueJavaLangObjectNull) {




                        ageVMAgeModelGetValue.setEtRectangleTwentyOneValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityAgeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityAgeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.etRectangleTwentyOne.setTag(null);
        this.image360F247848348.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtBack.setTag(null);
        this.txtNext.setTag(null);
        this.txtOne.setTag(null);
        this.txtWeusethisdat.setTag(null);
        this.txtWhatsyourage.setTag(null);
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
        if (BR.ageVM == variableId) {
            setAgeVM((com.front_end.app.modules.age.data.viewmodel.AgeVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAgeVM(@Nullable com.front_end.app.modules.age.data.viewmodel.AgeVM AgeVM) {
        this.mAgeVM = AgeVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ageVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAgeVMAgeModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.age.data.model.AgeModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAgeVMAgeModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.age.data.model.AgeModel> AgeVMAgeModel, int fieldId) {
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
        java.lang.String ageVMAgeModelTxtWhatsyourage = null;
        java.lang.String ageVMAgeModelTxtWeusethisdat = null;
        java.lang.String ageVMAgeModelTxtOne = null;
        java.lang.String ageVMAgeModelTxtNext = null;
        com.front_end.app.modules.age.data.viewmodel.AgeVM ageVM = mAgeVM;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.age.data.model.AgeModel> ageVMAgeModel = null;
        com.front_end.app.modules.age.data.model.AgeModel ageVMAgeModelGetValue = null;
        java.lang.String ageVMAgeModelEtRectangleTwentyOneValue = null;
        java.lang.String ageVMAgeModelTxtBack = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (ageVM != null) {
                    // read ageVM.ageModel
                    ageVMAgeModel = ageVM.getAgeModel();
                }
                updateLiveDataRegistration(0, ageVMAgeModel);


                if (ageVMAgeModel != null) {
                    // read ageVM.ageModel.getValue()
                    ageVMAgeModelGetValue = ageVMAgeModel.getValue();
                }


                if (ageVMAgeModelGetValue != null) {
                    // read ageVM.ageModel.getValue().txtWhatsyourage
                    ageVMAgeModelTxtWhatsyourage = ageVMAgeModelGetValue.getTxtWhatsyourage();
                    // read ageVM.ageModel.getValue().txtWeusethisdat
                    ageVMAgeModelTxtWeusethisdat = ageVMAgeModelGetValue.getTxtWeusethisdat();
                    // read ageVM.ageModel.getValue().txtOne
                    ageVMAgeModelTxtOne = ageVMAgeModelGetValue.getTxtOne();
                    // read ageVM.ageModel.getValue().txtNext
                    ageVMAgeModelTxtNext = ageVMAgeModelGetValue.getTxtNext();
                    // read ageVM.ageModel.getValue().etRectangleTwentyOneValue
                    ageVMAgeModelEtRectangleTwentyOneValue = ageVMAgeModelGetValue.getEtRectangleTwentyOneValue();
                    // read ageVM.ageModel.getValue().txtBack
                    ageVMAgeModelTxtBack = ageVMAgeModelGetValue.getTxtBack();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etRectangleTwentyOne, ageVMAgeModelEtRectangleTwentyOneValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBack, ageVMAgeModelTxtBack);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNext, ageVMAgeModelTxtNext);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtOne, ageVMAgeModelTxtOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeusethisdat, ageVMAgeModelTxtWeusethisdat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWhatsyourage, ageVMAgeModelTxtWhatsyourage);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etRectangleTwentyOne, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etRectangleTwentyOneandroidTextAttrChanged);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image360F247848348, androidx.appcompat.content.res.AppCompatResources.getDrawable(image360F247848348.getContext(), R.drawable.img_360f247848348), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ageVM.ageModel
        flag 1 (0x2L): ageVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}