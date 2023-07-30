package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPassBindingImpl extends ActivityPassBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnfive, 12);
        sViewsWithIds.put(R.id.linearRowback, 13);
    }
    // views
    @NonNull
    private final android.widget.EditText mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPassBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityPassBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (android.widget.EditText) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.EditText) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            );
        this.framePass.setTag(null);
        this.image360F247848348.setTag(null);
        this.mboundView9 = (android.widget.EditText) bindings[9];
        this.mboundView9.setTag(null);
        this.txtBack.setTag(null);
        this.txtFive.setTag(null);
        this.txtGroup568.setTag(null);
        this.txtIncaseofForg.setTag(null);
        this.txtNext.setTag(null);
        this.txtWhatisthenam.setTag(null);
        this.txtWhatisthenamOne.setTag(null);
        this.txtWhatisthenamThree.setTag(null);
        this.txtWhoisyourInt.setTag(null);
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
        if (BR.passVM == variableId) {
            setPassVM((com.front_end.app.modules.pass.data.viewmodel.PassVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPassVM(@Nullable com.front_end.app.modules.pass.data.viewmodel.PassVM PassVM) {
        this.mPassVM = PassVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.passVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePassVMPassModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.pass.data.model.PassModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangePassVMPassModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.pass.data.model.PassModel> PassVMPassModel, int fieldId) {
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
        java.lang.String passVMPassModelTxtWhatisthenamThree = null;
        java.lang.String passVMPassModelTxtWhatisthenamOne = null;
        com.front_end.app.modules.pass.data.viewmodel.PassVM passVM = mPassVM;
        java.lang.String passVMPassModelTxtGroup567 = null;
        java.lang.String passVMPassModelTxtGroup568 = null;
        java.lang.String passVMPassModelTxtWhoisyourInt = null;
        java.lang.String passVMPassModelTxtFive = null;
        com.front_end.app.modules.pass.data.model.PassModel passVMPassModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.pass.data.model.PassModel> passVMPassModel = null;
        java.lang.String passVMPassModelTxtWhatisthenam = null;
        java.lang.String passVMPassModelTxtIncaseofForg = null;
        java.lang.String passVMPassModelTxtNext = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (passVM != null) {
                    // read passVM.passModel
                    passVMPassModel = passVM.getPassModel();
                }
                updateLiveDataRegistration(0, passVMPassModel);


                if (passVMPassModel != null) {
                    // read passVM.passModel.getValue()
                    passVMPassModelGetValue = passVMPassModel.getValue();
                }


                if (passVMPassModelGetValue != null) {
                    // read passVM.passModel.getValue().txtWhatisthenamThree
                    passVMPassModelTxtWhatisthenamThree = passVMPassModelGetValue.getTxtWhatisthenamThree();
                    // read passVM.passModel.getValue().txtWhatisthenamOne
                    passVMPassModelTxtWhatisthenamOne = passVMPassModelGetValue.getTxtWhatisthenamOne();
                    // read passVM.passModel.getValue().txtGroup567
                    passVMPassModelTxtGroup567 = passVMPassModelGetValue.getTxtGroup567();
                    // read passVM.passModel.getValue().txtGroup568
                    passVMPassModelTxtGroup568 = passVMPassModelGetValue.getTxtGroup568();
                    // read passVM.passModel.getValue().txtWhoisyourInt
                    passVMPassModelTxtWhoisyourInt = passVMPassModelGetValue.getTxtWhoisyourInt();
                    // read passVM.passModel.getValue().txtFive
                    passVMPassModelTxtFive = passVMPassModelGetValue.getTxtFive();
                    // read passVM.passModel.getValue().txtWhatisthenam
                    passVMPassModelTxtWhatisthenam = passVMPassModelGetValue.getTxtWhatisthenam();
                    // read passVM.passModel.getValue().txtIncaseofForg
                    passVMPassModelTxtIncaseofForg = passVMPassModelGetValue.getTxtIncaseofForg();
                    // read passVM.passModel.getValue().txtNext
                    passVMPassModelTxtNext = passVMPassModelGetValue.getTxtNext();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image360F247848348, androidx.appcompat.content.res.AppCompatResources.getDrawable(image360F247848348.getContext(), R.drawable.img_360f247848348), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, passVMPassModelTxtGroup567);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBack, passVMPassModelTxtNext);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFive, passVMPassModelTxtFive);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroup568, passVMPassModelTxtGroup568);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtIncaseofForg, passVMPassModelTxtIncaseofForg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNext, passVMPassModelTxtNext);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWhatisthenam, passVMPassModelTxtWhatisthenam);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWhatisthenamOne, passVMPassModelTxtWhatisthenamOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWhatisthenamThree, passVMPassModelTxtWhatisthenamThree);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWhoisyourInt, passVMPassModelTxtWhoisyourInt);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): passVM.passModel
        flag 1 (0x2L): passVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}