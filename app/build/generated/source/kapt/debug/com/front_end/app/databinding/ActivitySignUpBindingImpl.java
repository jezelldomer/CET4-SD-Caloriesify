package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySignUpBindingImpl extends ActivitySignUpBinding  {

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
        sViewsWithIds.put(R.id.btnLightbulb, 27);
        sViewsWithIds.put(R.id.imageIcons8lgbtSixtyFour, 28);
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
            // Inverse of signUpVM.signUpModel.getValue().etStackvectorValue
            //         is signUpVM.signUpModel.getValue().setEtStackvectorValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etGroupFive);
            // localize variables for thread safety
            // signUpVM.signUpModel.getValue() != null
            boolean signUpVMSignUpModelGetValueJavaLangObjectNull = false;
            // signUpVM.signUpModel.getValue().etStackvectorValue
            java.lang.String signUpVMSignUpModelEtStackvectorValue = null;
            // signUpVM.signUpModel != null
            boolean signUpVMSignUpModelJavaLangObjectNull = false;
            // signUpVM
            com.front_end.app.modules.signup.data.viewmodel.SignUpVM signUpVM = mSignUpVM;
            // signUpVM != null
            boolean signUpVMJavaLangObjectNull = false;
            // signUpVM.signUpModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.signup.data.model.SignUpModel> signUpVMSignUpModel = null;
            // signUpVM.signUpModel.getValue()
            com.front_end.app.modules.signup.data.model.SignUpModel signUpVMSignUpModelGetValue = null;



            signUpVMJavaLangObjectNull = (signUpVM) != (null);
            if (signUpVMJavaLangObjectNull) {


                signUpVMSignUpModel = signUpVM.getSignUpModel();

                signUpVMSignUpModelJavaLangObjectNull = (signUpVMSignUpModel) != (null);
                if (signUpVMSignUpModelJavaLangObjectNull) {


                    signUpVMSignUpModelGetValue = signUpVMSignUpModel.getValue();

                    signUpVMSignUpModelGetValueJavaLangObjectNull = (signUpVMSignUpModelGetValue) != (null);
                    if (signUpVMSignUpModelGetValueJavaLangObjectNull) {




                        signUpVMSignUpModelGetValue.setEtStackvectorValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etGroupFourandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signUpVM.signUpModel.getValue().etStackvectorValue
            //         is signUpVM.signUpModel.getValue().setEtStackvectorValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etGroupFour);
            // localize variables for thread safety
            // signUpVM.signUpModel.getValue() != null
            boolean signUpVMSignUpModelGetValueJavaLangObjectNull = false;
            // signUpVM.signUpModel.getValue().etStackvectorValue
            java.lang.String signUpVMSignUpModelEtStackvectorValue = null;
            // signUpVM.signUpModel != null
            boolean signUpVMSignUpModelJavaLangObjectNull = false;
            // signUpVM
            com.front_end.app.modules.signup.data.viewmodel.SignUpVM signUpVM = mSignUpVM;
            // signUpVM != null
            boolean signUpVMJavaLangObjectNull = false;
            // signUpVM.signUpModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.signup.data.model.SignUpModel> signUpVMSignUpModel = null;
            // signUpVM.signUpModel.getValue()
            com.front_end.app.modules.signup.data.model.SignUpModel signUpVMSignUpModelGetValue = null;



            signUpVMJavaLangObjectNull = (signUpVM) != (null);
            if (signUpVMJavaLangObjectNull) {


                signUpVMSignUpModel = signUpVM.getSignUpModel();

                signUpVMSignUpModelJavaLangObjectNull = (signUpVMSignUpModel) != (null);
                if (signUpVMSignUpModelJavaLangObjectNull) {


                    signUpVMSignUpModelGetValue = signUpVMSignUpModel.getValue();

                    signUpVMSignUpModelGetValueJavaLangObjectNull = (signUpVMSignUpModelGetValue) != (null);
                    if (signUpVMSignUpModelGetValueJavaLangObjectNull) {




                        signUpVMSignUpModelGetValue.setEtStackvectorValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etGroupThreeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signUpVM.signUpModel.getValue().etStackvectorValue
            //         is signUpVM.signUpModel.getValue().setEtStackvectorValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etGroupThree);
            // localize variables for thread safety
            // signUpVM.signUpModel.getValue() != null
            boolean signUpVMSignUpModelGetValueJavaLangObjectNull = false;
            // signUpVM.signUpModel.getValue().etStackvectorValue
            java.lang.String signUpVMSignUpModelEtStackvectorValue = null;
            // signUpVM.signUpModel != null
            boolean signUpVMSignUpModelJavaLangObjectNull = false;
            // signUpVM
            com.front_end.app.modules.signup.data.viewmodel.SignUpVM signUpVM = mSignUpVM;
            // signUpVM != null
            boolean signUpVMJavaLangObjectNull = false;
            // signUpVM.signUpModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.signup.data.model.SignUpModel> signUpVMSignUpModel = null;
            // signUpVM.signUpModel.getValue()
            com.front_end.app.modules.signup.data.model.SignUpModel signUpVMSignUpModelGetValue = null;



            signUpVMJavaLangObjectNull = (signUpVM) != (null);
            if (signUpVMJavaLangObjectNull) {


                signUpVMSignUpModel = signUpVM.getSignUpModel();

                signUpVMSignUpModelJavaLangObjectNull = (signUpVMSignUpModel) != (null);
                if (signUpVMSignUpModelJavaLangObjectNull) {


                    signUpVMSignUpModelGetValue = signUpVMSignUpModel.getValue();

                    signUpVMSignUpModelGetValueJavaLangObjectNull = (signUpVMSignUpModelGetValue) != (null);
                    if (signUpVMSignUpModelGetValueJavaLangObjectNull) {




                        signUpVMSignUpModelGetValue.setEtStackvectorValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etStacklockandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signUpVM.signUpModel.getValue().etStackvectorValue
            //         is signUpVM.signUpModel.getValue().setEtStackvectorValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etStacklock);
            // localize variables for thread safety
            // signUpVM.signUpModel.getValue() != null
            boolean signUpVMSignUpModelGetValueJavaLangObjectNull = false;
            // signUpVM.signUpModel.getValue().etStackvectorValue
            java.lang.String signUpVMSignUpModelEtStackvectorValue = null;
            // signUpVM.signUpModel != null
            boolean signUpVMSignUpModelJavaLangObjectNull = false;
            // signUpVM
            com.front_end.app.modules.signup.data.viewmodel.SignUpVM signUpVM = mSignUpVM;
            // signUpVM != null
            boolean signUpVMJavaLangObjectNull = false;
            // signUpVM.signUpModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.signup.data.model.SignUpModel> signUpVMSignUpModel = null;
            // signUpVM.signUpModel.getValue()
            com.front_end.app.modules.signup.data.model.SignUpModel signUpVMSignUpModelGetValue = null;



            signUpVMJavaLangObjectNull = (signUpVM) != (null);
            if (signUpVMJavaLangObjectNull) {


                signUpVMSignUpModel = signUpVM.getSignUpModel();

                signUpVMSignUpModelJavaLangObjectNull = (signUpVMSignUpModel) != (null);
                if (signUpVMSignUpModelJavaLangObjectNull) {


                    signUpVMSignUpModelGetValue = signUpVMSignUpModel.getValue();

                    signUpVMSignUpModelGetValueJavaLangObjectNull = (signUpVMSignUpModelGetValue) != (null);
                    if (signUpVMSignUpModelGetValueJavaLangObjectNull) {




                        signUpVMSignUpModelGetValue.setEtStackvectorValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etStackuserandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signUpVM.signUpModel.getValue().etStackuserValue
            //         is signUpVM.signUpModel.getValue().setEtStackuserValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etStackuser);
            // localize variables for thread safety
            // signUpVM.signUpModel.getValue() != null
            boolean signUpVMSignUpModelGetValueJavaLangObjectNull = false;
            // signUpVM.signUpModel != null
            boolean signUpVMSignUpModelJavaLangObjectNull = false;
            // signUpVM
            com.front_end.app.modules.signup.data.viewmodel.SignUpVM signUpVM = mSignUpVM;
            // signUpVM != null
            boolean signUpVMJavaLangObjectNull = false;
            // signUpVM.signUpModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.signup.data.model.SignUpModel> signUpVMSignUpModel = null;
            // signUpVM.signUpModel.getValue().etStackuserValue
            java.lang.String signUpVMSignUpModelEtStackuserValue = null;
            // signUpVM.signUpModel.getValue()
            com.front_end.app.modules.signup.data.model.SignUpModel signUpVMSignUpModelGetValue = null;



            signUpVMJavaLangObjectNull = (signUpVM) != (null);
            if (signUpVMJavaLangObjectNull) {


                signUpVMSignUpModel = signUpVM.getSignUpModel();

                signUpVMSignUpModelJavaLangObjectNull = (signUpVMSignUpModel) != (null);
                if (signUpVMSignUpModelJavaLangObjectNull) {


                    signUpVMSignUpModelGetValue = signUpVMSignUpModel.getValue();

                    signUpVMSignUpModelGetValueJavaLangObjectNull = (signUpVMSignUpModelGetValue) != (null);
                    if (signUpVMSignUpModelGetValueJavaLangObjectNull) {




                        signUpVMSignUpModelGetValue.setEtStackuserValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etStackvectorandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signUpVM.signUpModel.getValue().etStackvectorValue
            //         is signUpVM.signUpModel.getValue().setEtStackvectorValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etStackvector);
            // localize variables for thread safety
            // signUpVM.signUpModel.getValue() != null
            boolean signUpVMSignUpModelGetValueJavaLangObjectNull = false;
            // signUpVM.signUpModel.getValue().etStackvectorValue
            java.lang.String signUpVMSignUpModelEtStackvectorValue = null;
            // signUpVM.signUpModel != null
            boolean signUpVMSignUpModelJavaLangObjectNull = false;
            // signUpVM
            com.front_end.app.modules.signup.data.viewmodel.SignUpVM signUpVM = mSignUpVM;
            // signUpVM != null
            boolean signUpVMJavaLangObjectNull = false;
            // signUpVM.signUpModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.signup.data.model.SignUpModel> signUpVMSignUpModel = null;
            // signUpVM.signUpModel.getValue()
            com.front_end.app.modules.signup.data.model.SignUpModel signUpVMSignUpModelGetValue = null;



            signUpVMJavaLangObjectNull = (signUpVM) != (null);
            if (signUpVMJavaLangObjectNull) {


                signUpVMSignUpModel = signUpVM.getSignUpModel();

                signUpVMSignUpModelJavaLangObjectNull = (signUpVMSignUpModel) != (null);
                if (signUpVMSignUpModelJavaLangObjectNull) {


                    signUpVMSignUpModelGetValue = signUpVMSignUpModel.getValue();

                    signUpVMSignUpModelGetValueJavaLangObjectNull = (signUpVMSignUpModelGetValue) != (null);
                    if (signUpVMSignUpModelGetValueJavaLangObjectNull) {




                        signUpVMSignUpModelGetValue.setEtStackvectorValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtOrLoginwithandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of signUpVM.signUpModel.getValue().etStackvectorValue
            //         is signUpVM.signUpModel.getValue().setEtStackvectorValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtOrLoginwith);
            // localize variables for thread safety
            // signUpVM.signUpModel.getValue() != null
            boolean signUpVMSignUpModelGetValueJavaLangObjectNull = false;
            // signUpVM.signUpModel.getValue().etStackvectorValue
            java.lang.String signUpVMSignUpModelEtStackvectorValue = null;
            // signUpVM.signUpModel != null
            boolean signUpVMSignUpModelJavaLangObjectNull = false;
            // signUpVM
            com.front_end.app.modules.signup.data.viewmodel.SignUpVM signUpVM = mSignUpVM;
            // signUpVM != null
            boolean signUpVMJavaLangObjectNull = false;
            // signUpVM.signUpModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.signup.data.model.SignUpModel> signUpVMSignUpModel = null;
            // signUpVM.signUpModel.getValue()
            com.front_end.app.modules.signup.data.model.SignUpModel signUpVMSignUpModelGetValue = null;



            signUpVMJavaLangObjectNull = (signUpVM) != (null);
            if (signUpVMJavaLangObjectNull) {


                signUpVMSignUpModel = signUpVM.getSignUpModel();

                signUpVMSignUpModelJavaLangObjectNull = (signUpVMSignUpModel) != (null);
                if (signUpVMSignUpModelJavaLangObjectNull) {


                    signUpVMSignUpModelGetValue = signUpVMSignUpModel.getValue();

                    signUpVMSignUpModelGetValueJavaLangObjectNull = (signUpVMSignUpModelGetValue) != (null);
                    if (signUpVMSignUpModelGetValueJavaLangObjectNull) {




                        signUpVMSignUpModelGetValue.setEtStackvectorValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivitySignUpBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private ActivitySignUpBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[27]
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
            , (android.widget.ImageView) bindings[28]
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
        if (BR.signUpVM == variableId) {
            setSignUpVM((com.front_end.app.modules.signup.data.viewmodel.SignUpVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSignUpVM(@Nullable com.front_end.app.modules.signup.data.viewmodel.SignUpVM SignUpVM) {
        this.mSignUpVM = SignUpVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.signUpVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSignUpVMSignUpModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.signup.data.model.SignUpModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSignUpVMSignUpModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.signup.data.model.SignUpModel> SignUpVMSignUpModel, int fieldId) {
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
        java.lang.String signUpVMSignUpModelTxtWelcomeSignUp = null;
        com.front_end.app.modules.signup.data.model.SignUpModel signUpVMSignUpModelGetValue = null;
        java.lang.String signUpVMSignUpModelEtStackvectorValue = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.signup.data.model.SignUpModel> signUpVMSignUpModel = null;
        java.lang.String signUpVMSignUpModelEtStackuserValue = null;
        java.lang.String signUpVMSignUpModelTxtTermAndCondition = null;
        java.lang.String signUpVMSignUpModelTxtSIGNUP = null;
        java.lang.String signUpVMSignUpModelTxtLOGIN = null;
        com.front_end.app.modules.signup.data.viewmodel.SignUpVM signUpVM = mSignUpVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (signUpVM != null) {
                    // read signUpVM.signUpModel
                    signUpVMSignUpModel = signUpVM.getSignUpModel();
                }
                updateLiveDataRegistration(0, signUpVMSignUpModel);


                if (signUpVMSignUpModel != null) {
                    // read signUpVM.signUpModel.getValue()
                    signUpVMSignUpModelGetValue = signUpVMSignUpModel.getValue();
                }


                if (signUpVMSignUpModelGetValue != null) {
                    // read signUpVM.signUpModel.getValue().txtWelcomeSignUp
                    signUpVMSignUpModelTxtWelcomeSignUp = signUpVMSignUpModelGetValue.getTxtWelcomeSignUp();
                    // read signUpVM.signUpModel.getValue().etStackvectorValue
                    signUpVMSignUpModelEtStackvectorValue = signUpVMSignUpModelGetValue.getEtStackvectorValue();
                    // read signUpVM.signUpModel.getValue().etStackuserValue
                    signUpVMSignUpModelEtStackuserValue = signUpVMSignUpModelGetValue.getEtStackuserValue();
                    // read signUpVM.signUpModel.getValue().txtTermAndCondition
                    signUpVMSignUpModelTxtTermAndCondition = signUpVMSignUpModelGetValue.getTxtTermAndCondition();
                    // read signUpVM.signUpModel.getValue().txtSIGNUP
                    signUpVMSignUpModelTxtSIGNUP = signUpVMSignUpModelGetValue.getTxtSIGNUP();
                    // read signUpVM.signUpModel.getValue().txtLOGIN
                    signUpVMSignUpModelTxtLOGIN = signUpVMSignUpModelGetValue.getTxtLOGIN();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etGroupFive, signUpVMSignUpModelEtStackvectorValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etGroupFour, signUpVMSignUpModelEtStackvectorValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etGroupThree, signUpVMSignUpModelEtStackvectorValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etStacklock, signUpVMSignUpModelEtStackvectorValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etStackuser, signUpVMSignUpModelEtStackuserValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etStackvector, signUpVMSignUpModelEtStackvectorValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLOGIN, signUpVMSignUpModelTxtLOGIN);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtOrLoginwith, signUpVMSignUpModelEtStackvectorValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSIGNUP, signUpVMSignUpModelTxtSIGNUP);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTermAndCondition, signUpVMSignUpModelTxtTermAndCondition);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWelcomeSignUp, signUpVMSignUpModelTxtWelcomeSignUp);
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
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtOrLoginwith, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtOrLoginwithandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): signUpVM.signUpModel
        flag 1 (0x2L): signUpVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}