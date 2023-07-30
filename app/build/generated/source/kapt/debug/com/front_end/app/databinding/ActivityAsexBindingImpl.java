package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAsexBindingImpl extends ActivityAsexBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameAsex, 14);
        sViewsWithIds.put(R.id.frameStackrectangleone, 15);
        sViewsWithIds.put(R.id.imageRectangleOne, 16);
        sViewsWithIds.put(R.id.linearColumnrectanglesixteen, 17);
        sViewsWithIds.put(R.id.frameStackrectanglesixteen, 18);
        sViewsWithIds.put(R.id.linearRowlogin, 19);
        sViewsWithIds.put(R.id.frameStacklineone, 20);
        sViewsWithIds.put(R.id.lineLineOne, 21);
        sViewsWithIds.put(R.id.textInputLayStackuser, 22);
        sViewsWithIds.put(R.id.textInputLayStackvector, 23);
        sViewsWithIds.put(R.id.textInputLayStacklock, 24);
        sViewsWithIds.put(R.id.linearRowvectorOne, 25);
        sViewsWithIds.put(R.id.imageVectorOne, 26);
        sViewsWithIds.put(R.id.imageLightbulb, 27);
        sViewsWithIds.put(R.id.btnGroup503, 28);
        sViewsWithIds.put(R.id.imageArrowright, 29);
        sViewsWithIds.put(R.id.linearColumnorloginwith, 30);
        sViewsWithIds.put(R.id.frameStackorloginwith, 31);
        sViewsWithIds.put(R.id.linearRowgroupfour, 32);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etGroupFiveandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of asexVM.asexModel.getValue().etStackvectorValue
            //         is asexVM.asexModel.getValue().setEtStackvectorValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etGroupFive);
            // localize variables for thread safety
            // asexVM.asexModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.asex.data.model.AsexModel> asexVMAsexModel = null;
            // asexVM.asexModel.getValue()
            com.front_end.app.modules.asex.data.model.AsexModel asexVMAsexModelGetValue = null;
            // asexVM != null
            boolean asexVMJavaLangObjectNull = false;
            // asexVM
            com.front_end.app.modules.asex.data.viewmodel.AsexVM asexVM = mAsexVM;
            // asexVM.asexModel.getValue() != null
            boolean asexVMAsexModelGetValueJavaLangObjectNull = false;
            // asexVM.asexModel.getValue().etStackvectorValue
            java.lang.String asexVMAsexModelEtStackvectorValue = null;
            // asexVM.asexModel != null
            boolean asexVMAsexModelJavaLangObjectNull = false;



            asexVMJavaLangObjectNull = (asexVM) != (null);
            if (asexVMJavaLangObjectNull) {


                asexVMAsexModel = asexVM.getAsexModel();

                asexVMAsexModelJavaLangObjectNull = (asexVMAsexModel) != (null);
                if (asexVMAsexModelJavaLangObjectNull) {


                    asexVMAsexModelGetValue = asexVMAsexModel.getValue();

                    asexVMAsexModelGetValueJavaLangObjectNull = (asexVMAsexModelGetValue) != (null);
                    if (asexVMAsexModelGetValueJavaLangObjectNull) {




                        asexVMAsexModelGetValue.setEtStackvectorValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etGroupFourandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of asexVM.asexModel.getValue().etStackvectorValue
            //         is asexVM.asexModel.getValue().setEtStackvectorValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etGroupFour);
            // localize variables for thread safety
            // asexVM.asexModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.asex.data.model.AsexModel> asexVMAsexModel = null;
            // asexVM.asexModel.getValue()
            com.front_end.app.modules.asex.data.model.AsexModel asexVMAsexModelGetValue = null;
            // asexVM != null
            boolean asexVMJavaLangObjectNull = false;
            // asexVM
            com.front_end.app.modules.asex.data.viewmodel.AsexVM asexVM = mAsexVM;
            // asexVM.asexModel.getValue() != null
            boolean asexVMAsexModelGetValueJavaLangObjectNull = false;
            // asexVM.asexModel.getValue().etStackvectorValue
            java.lang.String asexVMAsexModelEtStackvectorValue = null;
            // asexVM.asexModel != null
            boolean asexVMAsexModelJavaLangObjectNull = false;



            asexVMJavaLangObjectNull = (asexVM) != (null);
            if (asexVMJavaLangObjectNull) {


                asexVMAsexModel = asexVM.getAsexModel();

                asexVMAsexModelJavaLangObjectNull = (asexVMAsexModel) != (null);
                if (asexVMAsexModelJavaLangObjectNull) {


                    asexVMAsexModelGetValue = asexVMAsexModel.getValue();

                    asexVMAsexModelGetValueJavaLangObjectNull = (asexVMAsexModelGetValue) != (null);
                    if (asexVMAsexModelGetValueJavaLangObjectNull) {




                        asexVMAsexModelGetValue.setEtStackvectorValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etGroupThreeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of asexVM.asexModel.getValue().etStackvectorValue
            //         is asexVM.asexModel.getValue().setEtStackvectorValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etGroupThree);
            // localize variables for thread safety
            // asexVM.asexModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.asex.data.model.AsexModel> asexVMAsexModel = null;
            // asexVM.asexModel.getValue()
            com.front_end.app.modules.asex.data.model.AsexModel asexVMAsexModelGetValue = null;
            // asexVM != null
            boolean asexVMJavaLangObjectNull = false;
            // asexVM
            com.front_end.app.modules.asex.data.viewmodel.AsexVM asexVM = mAsexVM;
            // asexVM.asexModel.getValue() != null
            boolean asexVMAsexModelGetValueJavaLangObjectNull = false;
            // asexVM.asexModel.getValue().etStackvectorValue
            java.lang.String asexVMAsexModelEtStackvectorValue = null;
            // asexVM.asexModel != null
            boolean asexVMAsexModelJavaLangObjectNull = false;



            asexVMJavaLangObjectNull = (asexVM) != (null);
            if (asexVMJavaLangObjectNull) {


                asexVMAsexModel = asexVM.getAsexModel();

                asexVMAsexModelJavaLangObjectNull = (asexVMAsexModel) != (null);
                if (asexVMAsexModelJavaLangObjectNull) {


                    asexVMAsexModelGetValue = asexVMAsexModel.getValue();

                    asexVMAsexModelGetValueJavaLangObjectNull = (asexVMAsexModelGetValue) != (null);
                    if (asexVMAsexModelGetValueJavaLangObjectNull) {




                        asexVMAsexModelGetValue.setEtStackvectorValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etStacklockandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of asexVM.asexModel.getValue().etStackvectorValue
            //         is asexVM.asexModel.getValue().setEtStackvectorValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etStacklock);
            // localize variables for thread safety
            // asexVM.asexModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.asex.data.model.AsexModel> asexVMAsexModel = null;
            // asexVM.asexModel.getValue()
            com.front_end.app.modules.asex.data.model.AsexModel asexVMAsexModelGetValue = null;
            // asexVM != null
            boolean asexVMJavaLangObjectNull = false;
            // asexVM
            com.front_end.app.modules.asex.data.viewmodel.AsexVM asexVM = mAsexVM;
            // asexVM.asexModel.getValue() != null
            boolean asexVMAsexModelGetValueJavaLangObjectNull = false;
            // asexVM.asexModel.getValue().etStackvectorValue
            java.lang.String asexVMAsexModelEtStackvectorValue = null;
            // asexVM.asexModel != null
            boolean asexVMAsexModelJavaLangObjectNull = false;



            asexVMJavaLangObjectNull = (asexVM) != (null);
            if (asexVMJavaLangObjectNull) {


                asexVMAsexModel = asexVM.getAsexModel();

                asexVMAsexModelJavaLangObjectNull = (asexVMAsexModel) != (null);
                if (asexVMAsexModelJavaLangObjectNull) {


                    asexVMAsexModelGetValue = asexVMAsexModel.getValue();

                    asexVMAsexModelGetValueJavaLangObjectNull = (asexVMAsexModelGetValue) != (null);
                    if (asexVMAsexModelGetValueJavaLangObjectNull) {




                        asexVMAsexModelGetValue.setEtStackvectorValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etStackuserandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of asexVM.asexModel.getValue().etStackuserValue
            //         is asexVM.asexModel.getValue().setEtStackuserValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etStackuser);
            // localize variables for thread safety
            // asexVM.asexModel.getValue().etStackuserValue
            java.lang.String asexVMAsexModelEtStackuserValue = null;
            // asexVM.asexModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.asex.data.model.AsexModel> asexVMAsexModel = null;
            // asexVM.asexModel.getValue()
            com.front_end.app.modules.asex.data.model.AsexModel asexVMAsexModelGetValue = null;
            // asexVM != null
            boolean asexVMJavaLangObjectNull = false;
            // asexVM
            com.front_end.app.modules.asex.data.viewmodel.AsexVM asexVM = mAsexVM;
            // asexVM.asexModel.getValue() != null
            boolean asexVMAsexModelGetValueJavaLangObjectNull = false;
            // asexVM.asexModel != null
            boolean asexVMAsexModelJavaLangObjectNull = false;



            asexVMJavaLangObjectNull = (asexVM) != (null);
            if (asexVMJavaLangObjectNull) {


                asexVMAsexModel = asexVM.getAsexModel();

                asexVMAsexModelJavaLangObjectNull = (asexVMAsexModel) != (null);
                if (asexVMAsexModelJavaLangObjectNull) {


                    asexVMAsexModelGetValue = asexVMAsexModel.getValue();

                    asexVMAsexModelGetValueJavaLangObjectNull = (asexVMAsexModelGetValue) != (null);
                    if (asexVMAsexModelGetValueJavaLangObjectNull) {




                        asexVMAsexModelGetValue.setEtStackuserValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etStackvectorandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of asexVM.asexModel.getValue().etStackvectorValue
            //         is asexVM.asexModel.getValue().setEtStackvectorValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etStackvector);
            // localize variables for thread safety
            // asexVM.asexModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.asex.data.model.AsexModel> asexVMAsexModel = null;
            // asexVM.asexModel.getValue()
            com.front_end.app.modules.asex.data.model.AsexModel asexVMAsexModelGetValue = null;
            // asexVM != null
            boolean asexVMJavaLangObjectNull = false;
            // asexVM
            com.front_end.app.modules.asex.data.viewmodel.AsexVM asexVM = mAsexVM;
            // asexVM.asexModel.getValue() != null
            boolean asexVMAsexModelGetValueJavaLangObjectNull = false;
            // asexVM.asexModel.getValue().etStackvectorValue
            java.lang.String asexVMAsexModelEtStackvectorValue = null;
            // asexVM.asexModel != null
            boolean asexVMAsexModelJavaLangObjectNull = false;



            asexVMJavaLangObjectNull = (asexVM) != (null);
            if (asexVMJavaLangObjectNull) {


                asexVMAsexModel = asexVM.getAsexModel();

                asexVMAsexModelJavaLangObjectNull = (asexVMAsexModel) != (null);
                if (asexVMAsexModelJavaLangObjectNull) {


                    asexVMAsexModelGetValue = asexVMAsexModel.getValue();

                    asexVMAsexModelGetValueJavaLangObjectNull = (asexVMAsexModelGetValue) != (null);
                    if (asexVMAsexModelGetValueJavaLangObjectNull) {




                        asexVMAsexModelGetValue.setEtStackvectorValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityAsexBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private ActivityAsexBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[28]
            , (androidx.appcompat.widget.AppCompatButton) bindings[13]
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (androidx.appcompat.widget.AppCompatButton) bindings[12]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.FrameLayout) bindings[20]
            , (android.widget.FrameLayout) bindings[31]
            , (android.widget.FrameLayout) bindings[15]
            , (android.widget.FrameLayout) bindings[18]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[26]
            , (android.view.View) bindings[21]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[25]
            , (com.google.android.material.textfield.TextInputLayout) bindings[24]
            , (com.google.android.material.textfield.TextInputLayout) bindings[22]
            , (com.google.android.material.textfield.TextInputLayout) bindings[23]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            );
        this.etGroupFive.setTag(null);
        this.etGroupFour.setTag(null);
        this.etGroupThree.setTag(null);
        this.etStacklock.setTag(null);
        this.etStackuser.setTag(null);
        this.etStackvector.setTag(null);
        this.frameStackrectanglethirteen.setTag(null);
        this.imageRectangleSixteen.setTag(null);
        this.imageRectangleThirteen.setTag(null);
        this.txtLOGIN.setTag(null);
        this.txtOrLoginwith.setTag(null);
        this.txtSIGNUP.setTag(null);
        this.txtTermAndCondition.setTag(null);
        this.txtWelcomeSignUp.setTag(null);
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
        if (BR.asexVM == variableId) {
            setAsexVM((com.front_end.app.modules.asex.data.viewmodel.AsexVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAsexVM(@Nullable com.front_end.app.modules.asex.data.viewmodel.AsexVM AsexVM) {
        this.mAsexVM = AsexVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.asexVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeAsexVMAsexModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.asex.data.model.AsexModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeAsexVMAsexModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.asex.data.model.AsexModel> AsexVMAsexModel, int fieldId) {
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
        com.front_end.app.modules.asex.data.viewmodel.AsexVM asexVM = mAsexVM;
        java.lang.String asexVMAsexModelEtStackvectorValue = null;
        java.lang.String asexVMAsexModelEtStackuserValue = null;
        java.lang.String asexVMAsexModelTxtTermAndCondition = null;
        java.lang.String asexVMAsexModelTxtSIGNUP = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.asex.data.model.AsexModel> asexVMAsexModel = null;
        java.lang.String asexVMAsexModelTxtWelcomeSignUp = null;
        java.lang.String asexVMAsexModelTxtLOGIN = null;
        com.front_end.app.modules.asex.data.model.AsexModel asexVMAsexModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (asexVM != null) {
                    // read asexVM.asexModel
                    asexVMAsexModel = asexVM.getAsexModel();
                }
                updateLiveDataRegistration(0, asexVMAsexModel);


                if (asexVMAsexModel != null) {
                    // read asexVM.asexModel.getValue()
                    asexVMAsexModelGetValue = asexVMAsexModel.getValue();
                }


                if (asexVMAsexModelGetValue != null) {
                    // read asexVM.asexModel.getValue().etStackvectorValue
                    asexVMAsexModelEtStackvectorValue = asexVMAsexModelGetValue.getEtStackvectorValue();
                    // read asexVM.asexModel.getValue().etStackuserValue
                    asexVMAsexModelEtStackuserValue = asexVMAsexModelGetValue.getEtStackuserValue();
                    // read asexVM.asexModel.getValue().txtTermAndCondition
                    asexVMAsexModelTxtTermAndCondition = asexVMAsexModelGetValue.getTxtTermAndCondition();
                    // read asexVM.asexModel.getValue().txtSIGNUP
                    asexVMAsexModelTxtSIGNUP = asexVMAsexModelGetValue.getTxtSIGNUP();
                    // read asexVM.asexModel.getValue().txtWelcomeSignUp
                    asexVMAsexModelTxtWelcomeSignUp = asexVMAsexModelGetValue.getTxtWelcomeSignUp();
                    // read asexVM.asexModel.getValue().txtLOGIN
                    asexVMAsexModelTxtLOGIN = asexVMAsexModelGetValue.getTxtLOGIN();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etGroupFive, asexVMAsexModelEtStackvectorValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etGroupFour, asexVMAsexModelEtStackvectorValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etGroupThree, asexVMAsexModelEtStackvectorValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etStacklock, asexVMAsexModelEtStackvectorValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etStackuser, asexVMAsexModelEtStackuserValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etStackvector, asexVMAsexModelEtStackvectorValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLOGIN, asexVMAsexModelTxtLOGIN);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtOrLoginwith, asexVMAsexModelEtStackvectorValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSIGNUP, asexVMAsexModelTxtSIGNUP);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTermAndCondition, asexVMAsexModelTxtTermAndCondition);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWelcomeSignUp, asexVMAsexModelTxtWelcomeSignUp);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etGroupFive, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etGroupFiveandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etGroupFour, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etGroupFourandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etGroupThree, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etGroupThreeandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etStacklock, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etStacklockandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etStackuser, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etStackuserandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etStackvector, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etStackvectorandroidTextAttrChanged);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangleSixteen, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangleSixteen.getContext(), R.drawable.img_rectangle13), (float)0f, (boolean)false);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangleThirteen, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangleThirteen.getContext(), R.drawable.img_rectangle13_451x428), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): asexVM.asexModel
        flag 1 (0x2L): asexVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}