package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTallBindingImpl extends ActivityTallBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumntwo, 9);
        sViewsWithIds.put(R.id.linearRowrectangletwentyone, 10);
        sViewsWithIds.put(R.id.linearRowback, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etRectangleTwentyFourandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of tallVM.tallModel.getValue().etRectangleTwentyFourValue
            //         is tallVM.tallModel.getValue().setEtRectangleTwentyFourValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etRectangleTwentyFour);
            // localize variables for thread safety
            // tallVM.tallModel.getValue().etRectangleTwentyFourValue
            java.lang.String tallVMTallModelEtRectangleTwentyFourValue = null;
            // tallVM.tallModel != null
            boolean tallVMTallModelJavaLangObjectNull = false;
            // tallVM.tallModel.getValue() != null
            boolean tallVMTallModelGetValueJavaLangObjectNull = false;
            // tallVM
            com.front_end.app.modules.tall.data.viewmodel.TallVM tallVM = mTallVM;
            // tallVM != null
            boolean tallVMJavaLangObjectNull = false;
            // tallVM.tallModel.getValue()
            com.front_end.app.modules.tall.data.model.TallModel tallVMTallModelGetValue = null;
            // tallVM.tallModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.tall.data.model.TallModel> tallVMTallModel = null;



            tallVMJavaLangObjectNull = (tallVM) != (null);
            if (tallVMJavaLangObjectNull) {


                tallVMTallModel = tallVM.getTallModel();

                tallVMTallModelJavaLangObjectNull = (tallVMTallModel) != (null);
                if (tallVMTallModelJavaLangObjectNull) {


                    tallVMTallModelGetValue = tallVMTallModel.getValue();

                    tallVMTallModelGetValueJavaLangObjectNull = (tallVMTallModelGetValue) != (null);
                    if (tallVMTallModelGetValueJavaLangObjectNull) {




                        tallVMTallModelGetValue.setEtRectangleTwentyFourValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etRectangleTwentyOneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of tallVM.tallModel.getValue().etRectangleTwentyOneValue
            //         is tallVM.tallModel.getValue().setEtRectangleTwentyOneValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etRectangleTwentyOne);
            // localize variables for thread safety
            // tallVM.tallModel != null
            boolean tallVMTallModelJavaLangObjectNull = false;
            // tallVM.tallModel.getValue() != null
            boolean tallVMTallModelGetValueJavaLangObjectNull = false;
            // tallVM
            com.front_end.app.modules.tall.data.viewmodel.TallVM tallVM = mTallVM;
            // tallVM != null
            boolean tallVMJavaLangObjectNull = false;
            // tallVM.tallModel.getValue()
            com.front_end.app.modules.tall.data.model.TallModel tallVMTallModelGetValue = null;
            // tallVM.tallModel.getValue().etRectangleTwentyOneValue
            java.lang.String tallVMTallModelEtRectangleTwentyOneValue = null;
            // tallVM.tallModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.tall.data.model.TallModel> tallVMTallModel = null;



            tallVMJavaLangObjectNull = (tallVM) != (null);
            if (tallVMJavaLangObjectNull) {


                tallVMTallModel = tallVM.getTallModel();

                tallVMTallModelJavaLangObjectNull = (tallVMTallModel) != (null);
                if (tallVMTallModelJavaLangObjectNull) {


                    tallVMTallModelGetValue = tallVMTallModel.getValue();

                    tallVMTallModelGetValueJavaLangObjectNull = (tallVMTallModelGetValue) != (null);
                    if (tallVMTallModelGetValueJavaLangObjectNull) {




                        tallVMTallModelGetValue.setEtRectangleTwentyOneValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityTallBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityTallBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[4]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            );
        this.etRectangleTwentyFour.setTag(null);
        this.etRectangleTwentyOne.setTag(null);
        this.frameTall.setTag(null);
        this.image360F247848348.setTag(null);
        this.txtBack.setTag(null);
        this.txtHowTallareyo.setTag(null);
        this.txtNext.setTag(null);
        this.txtTwo.setTag(null);
        this.txtWeusethisdat.setTag(null);
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
        if (BR.tallVM == variableId) {
            setTallVM((com.front_end.app.modules.tall.data.viewmodel.TallVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTallVM(@Nullable com.front_end.app.modules.tall.data.viewmodel.TallVM TallVM) {
        this.mTallVM = TallVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tallVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTallVMTallModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.tall.data.model.TallModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTallVMTallModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.tall.data.model.TallModel> TallVMTallModel, int fieldId) {
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
        java.lang.String tallVMTallModelTxtBack = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.tall.data.model.TallModel> tallVMTallModel = null;
        java.lang.String tallVMTallModelTxtWeusethisdat = null;
        java.lang.String tallVMTallModelEtRectangleTwentyOneValue = null;
        java.lang.String tallVMTallModelTxtHowTallareyo = null;
        java.lang.String tallVMTallModelTxtTwo = null;
        java.lang.String tallVMTallModelEtRectangleTwentyFourValue = null;
        java.lang.String tallVMTallModelTxtNext = null;
        com.front_end.app.modules.tall.data.viewmodel.TallVM tallVM = mTallVM;
        com.front_end.app.modules.tall.data.model.TallModel tallVMTallModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (tallVM != null) {
                    // read tallVM.tallModel
                    tallVMTallModel = tallVM.getTallModel();
                }
                updateLiveDataRegistration(0, tallVMTallModel);


                if (tallVMTallModel != null) {
                    // read tallVM.tallModel.getValue()
                    tallVMTallModelGetValue = tallVMTallModel.getValue();
                }


                if (tallVMTallModelGetValue != null) {
                    // read tallVM.tallModel.getValue().txtBack
                    tallVMTallModelTxtBack = tallVMTallModelGetValue.getTxtBack();
                    // read tallVM.tallModel.getValue().txtWeusethisdat
                    tallVMTallModelTxtWeusethisdat = tallVMTallModelGetValue.getTxtWeusethisdat();
                    // read tallVM.tallModel.getValue().etRectangleTwentyOneValue
                    tallVMTallModelEtRectangleTwentyOneValue = tallVMTallModelGetValue.getEtRectangleTwentyOneValue();
                    // read tallVM.tallModel.getValue().txtHowTallareyo
                    tallVMTallModelTxtHowTallareyo = tallVMTallModelGetValue.getTxtHowTallareyo();
                    // read tallVM.tallModel.getValue().txtTwo
                    tallVMTallModelTxtTwo = tallVMTallModelGetValue.getTxtTwo();
                    // read tallVM.tallModel.getValue().etRectangleTwentyFourValue
                    tallVMTallModelEtRectangleTwentyFourValue = tallVMTallModelGetValue.getEtRectangleTwentyFourValue();
                    // read tallVM.tallModel.getValue().txtNext
                    tallVMTallModelTxtNext = tallVMTallModelGetValue.getTxtNext();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etRectangleTwentyFour, tallVMTallModelEtRectangleTwentyFourValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etRectangleTwentyOne, tallVMTallModelEtRectangleTwentyOneValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBack, tallVMTallModelTxtBack);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtHowTallareyo, tallVMTallModelTxtHowTallareyo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNext, tallVMTallModelTxtNext);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTwo, tallVMTallModelTxtTwo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeusethisdat, tallVMTallModelTxtWeusethisdat);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etRectangleTwentyFour, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etRectangleTwentyFourandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etRectangleTwentyOne, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etRectangleTwentyOneandroidTextAttrChanged);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image360F247848348, androidx.appcompat.content.res.AppCompatResources.getDrawable(image360F247848348.getContext(), R.drawable.img_360f247848348), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tallVM.tallModel
        flag 1 (0x2L): tallVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}