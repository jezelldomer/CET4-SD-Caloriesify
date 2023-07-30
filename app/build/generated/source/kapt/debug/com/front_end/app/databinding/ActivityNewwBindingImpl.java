package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNewwBindingImpl extends ActivityNewwBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbarToolbar, 4);
        sViewsWithIds.put(R.id.linearRowarrowleft, 5);
        sViewsWithIds.put(R.id.imageArrowleft, 6);
        sViewsWithIds.put(R.id.imageFrameTen, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etContentandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of newVM.newModel.getValue().etContentValue
            //         is newVM.newModel.getValue().setEtContentValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etContent);
            // localize variables for thread safety
            // newVM.newModel.getValue() != null
            boolean newVMNewModelGetValueJavaLangObjectNull = false;
            // newVM
            com.front_end.app.modules.neww.data.viewmodel.NewwVM newVM = mNewVM;
            // newVM.newModel.getValue().etContentValue
            java.lang.String newVMNewModelEtContentValue = null;
            // newVM.newModel.getValue()
            com.front_end.app.modules.neww.data.model.NewwModel newVMNewModelGetValue = null;
            // newVM.newModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.neww.data.model.NewwModel> newVMNewModel = null;
            // newVM != null
            boolean newVMJavaLangObjectNull = false;
            // newVM.newModel != null
            boolean newVMNewModelJavaLangObjectNull = false;



            newVMJavaLangObjectNull = (newVM) != (null);
            if (newVMJavaLangObjectNull) {


                newVMNewModel = newVM.getNewModel();

                newVMNewModelJavaLangObjectNull = (newVMNewModel) != (null);
                if (newVMNewModelJavaLangObjectNull) {


                    newVMNewModelGetValue = newVMNewModel.getValue();

                    newVMNewModelGetValueJavaLangObjectNull = (newVMNewModelGetValue) != (null);
                    if (newVMNewModelGetValueJavaLangObjectNull) {




                        newVMNewModelGetValue.setEtContentValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etUntitledOneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of newVM.newModel.getValue().etUntitledOneValue
            //         is newVM.newModel.getValue().setEtUntitledOneValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etUntitledOne);
            // localize variables for thread safety
            // newVM.newModel.getValue() != null
            boolean newVMNewModelGetValueJavaLangObjectNull = false;
            // newVM
            com.front_end.app.modules.neww.data.viewmodel.NewwVM newVM = mNewVM;
            // newVM.newModel.getValue().etUntitledOneValue
            java.lang.String newVMNewModelEtUntitledOneValue = null;
            // newVM.newModel.getValue()
            com.front_end.app.modules.neww.data.model.NewwModel newVMNewModelGetValue = null;
            // newVM.newModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.neww.data.model.NewwModel> newVMNewModel = null;
            // newVM != null
            boolean newVMJavaLangObjectNull = false;
            // newVM.newModel != null
            boolean newVMNewModelJavaLangObjectNull = false;



            newVMJavaLangObjectNull = (newVM) != (null);
            if (newVMJavaLangObjectNull) {


                newVMNewModel = newVM.getNewModel();

                newVMNewModelJavaLangObjectNull = (newVMNewModel) != (null);
                if (newVMNewModelJavaLangObjectNull) {


                    newVMNewModelGetValue = newVMNewModel.getValue();

                    newVMNewModelGetValueJavaLangObjectNull = (newVMNewModelGetValue) != (null);
                    if (newVMNewModelGetValueJavaLangObjectNull) {




                        newVMNewModelGetValue.setEtUntitledOneValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityNewwBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityNewwBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[5]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.etContent.setTag(null);
        this.etUntitledOne.setTag(null);
        this.linearNew.setTag(null);
        this.txtUntitled.setTag(null);
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
        if (BR.newVM == variableId) {
            setNewVM((com.front_end.app.modules.neww.data.viewmodel.NewwVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNewVM(@Nullable com.front_end.app.modules.neww.data.viewmodel.NewwVM NewVM) {
        this.mNewVM = NewVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.newVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNewVMNewModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.neww.data.model.NewwModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNewVMNewModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.neww.data.model.NewwModel> NewVMNewModel, int fieldId) {
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
        com.front_end.app.modules.neww.data.viewmodel.NewwVM newVM = mNewVM;
        java.lang.String newVMNewModelEtUntitledOneValue = null;
        java.lang.String newVMNewModelTxtUntitled = null;
        java.lang.String newVMNewModelEtContentValue = null;
        com.front_end.app.modules.neww.data.model.NewwModel newVMNewModelGetValue = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.neww.data.model.NewwModel> newVMNewModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (newVM != null) {
                    // read newVM.newModel
                    newVMNewModel = newVM.getNewModel();
                }
                updateLiveDataRegistration(0, newVMNewModel);


                if (newVMNewModel != null) {
                    // read newVM.newModel.getValue()
                    newVMNewModelGetValue = newVMNewModel.getValue();
                }


                if (newVMNewModelGetValue != null) {
                    // read newVM.newModel.getValue().etUntitledOneValue
                    newVMNewModelEtUntitledOneValue = newVMNewModelGetValue.getEtUntitledOneValue();
                    // read newVM.newModel.getValue().txtUntitled
                    newVMNewModelTxtUntitled = newVMNewModelGetValue.getTxtUntitled();
                    // read newVM.newModel.getValue().etContentValue
                    newVMNewModelEtContentValue = newVMNewModelGetValue.getEtContentValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etContent, newVMNewModelEtContentValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etUntitledOne, newVMNewModelEtUntitledOneValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUntitled, newVMNewModelTxtUntitled);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etContent, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etContentandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etUntitledOne, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etUntitledOneandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): newVM.newModel
        flag 1 (0x2L): newVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}