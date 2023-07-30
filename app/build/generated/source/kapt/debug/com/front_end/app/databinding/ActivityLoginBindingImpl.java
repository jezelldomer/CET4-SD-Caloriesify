package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameLogin, 12);
        sViewsWithIds.put(R.id.frameStackrectangleone, 13);
        sViewsWithIds.put(R.id.imageRectangleOne, 14);
        sViewsWithIds.put(R.id.linearColumnwelcomelogin, 15);
        sViewsWithIds.put(R.id.frameStackwelcomelogin, 16);
        sViewsWithIds.put(R.id.frameStacklineone, 17);
        sViewsWithIds.put(R.id.lineLineOne, 18);
        sViewsWithIds.put(R.id.textInputLayStackuser, 19);
        sViewsWithIds.put(R.id.textInputLayStacklock, 20);
        sViewsWithIds.put(R.id.linearRowrememberme, 21);
        sViewsWithIds.put(R.id.checkBoxRememberMe, 22);
        sViewsWithIds.put(R.id.btnForgotPassword, 23);
        sViewsWithIds.put(R.id.imageArrowright, 24);
        sViewsWithIds.put(R.id.linearColumnorloginwith, 25);
        sViewsWithIds.put(R.id.frameStackorloginwith, 26);
        sViewsWithIds.put(R.id.linearRowgroupfour, 27);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etGroupFiveandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginVM.loginModel.getValue().etGroupFiveValue
            //         is loginVM.loginModel.getValue().setEtGroupFiveValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etGroupFive);
            // localize variables for thread safety
            // loginVM != null
            boolean loginVMJavaLangObjectNull = false;
            // loginVM.loginModel.getValue()
            com.front_end.app.modules.login.data.model.LoginModel loginVMLoginModelGetValue = null;
            // loginVM.loginModel != null
            boolean loginVMLoginModelJavaLangObjectNull = false;
            // loginVM.loginModel.getValue().etGroupFiveValue
            java.lang.String loginVMLoginModelEtGroupFiveValue = null;
            // loginVM.loginModel.getValue() != null
            boolean loginVMLoginModelGetValueJavaLangObjectNull = false;
            // loginVM.loginModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.login.data.model.LoginModel> loginVMLoginModel = null;
            // loginVM
            com.front_end.app.modules.login.data.viewmodel.LoginVM loginVM = mLoginVM;



            loginVMJavaLangObjectNull = (loginVM) != (null);
            if (loginVMJavaLangObjectNull) {


                loginVMLoginModel = loginVM.getLoginModel();

                loginVMLoginModelJavaLangObjectNull = (loginVMLoginModel) != (null);
                if (loginVMLoginModelJavaLangObjectNull) {


                    loginVMLoginModelGetValue = loginVMLoginModel.getValue();

                    loginVMLoginModelGetValueJavaLangObjectNull = (loginVMLoginModelGetValue) != (null);
                    if (loginVMLoginModelGetValueJavaLangObjectNull) {




                        loginVMLoginModelGetValue.setEtGroupFiveValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etGroupFourandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginVM.loginModel.getValue().etGroupFourValue
            //         is loginVM.loginModel.getValue().setEtGroupFourValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etGroupFour);
            // localize variables for thread safety
            // loginVM != null
            boolean loginVMJavaLangObjectNull = false;
            // loginVM.loginModel.getValue()
            com.front_end.app.modules.login.data.model.LoginModel loginVMLoginModelGetValue = null;
            // loginVM.loginModel != null
            boolean loginVMLoginModelJavaLangObjectNull = false;
            // loginVM.loginModel.getValue() != null
            boolean loginVMLoginModelGetValueJavaLangObjectNull = false;
            // loginVM.loginModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.login.data.model.LoginModel> loginVMLoginModel = null;
            // loginVM.loginModel.getValue().etGroupFourValue
            java.lang.String loginVMLoginModelEtGroupFourValue = null;
            // loginVM
            com.front_end.app.modules.login.data.viewmodel.LoginVM loginVM = mLoginVM;



            loginVMJavaLangObjectNull = (loginVM) != (null);
            if (loginVMJavaLangObjectNull) {


                loginVMLoginModel = loginVM.getLoginModel();

                loginVMLoginModelJavaLangObjectNull = (loginVMLoginModel) != (null);
                if (loginVMLoginModelJavaLangObjectNull) {


                    loginVMLoginModelGetValue = loginVMLoginModel.getValue();

                    loginVMLoginModelGetValueJavaLangObjectNull = (loginVMLoginModelGetValue) != (null);
                    if (loginVMLoginModelGetValueJavaLangObjectNull) {




                        loginVMLoginModelGetValue.setEtGroupFourValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etGroupThreeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginVM.loginModel.getValue().etGroupThreeValue
            //         is loginVM.loginModel.getValue().setEtGroupThreeValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etGroupThree);
            // localize variables for thread safety
            // loginVM.loginModel.getValue().etGroupThreeValue
            java.lang.String loginVMLoginModelEtGroupThreeValue = null;
            // loginVM != null
            boolean loginVMJavaLangObjectNull = false;
            // loginVM.loginModel.getValue()
            com.front_end.app.modules.login.data.model.LoginModel loginVMLoginModelGetValue = null;
            // loginVM.loginModel != null
            boolean loginVMLoginModelJavaLangObjectNull = false;
            // loginVM.loginModel.getValue() != null
            boolean loginVMLoginModelGetValueJavaLangObjectNull = false;
            // loginVM.loginModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.login.data.model.LoginModel> loginVMLoginModel = null;
            // loginVM
            com.front_end.app.modules.login.data.viewmodel.LoginVM loginVM = mLoginVM;



            loginVMJavaLangObjectNull = (loginVM) != (null);
            if (loginVMJavaLangObjectNull) {


                loginVMLoginModel = loginVM.getLoginModel();

                loginVMLoginModelJavaLangObjectNull = (loginVMLoginModel) != (null);
                if (loginVMLoginModelJavaLangObjectNull) {


                    loginVMLoginModelGetValue = loginVMLoginModel.getValue();

                    loginVMLoginModelGetValueJavaLangObjectNull = (loginVMLoginModelGetValue) != (null);
                    if (loginVMLoginModelGetValueJavaLangObjectNull) {




                        loginVMLoginModelGetValue.setEtGroupThreeValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etStacklockandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginVM.loginModel.getValue().etStacklockValue
            //         is loginVM.loginModel.getValue().setEtStacklockValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etStacklock);
            // localize variables for thread safety
            // loginVM != null
            boolean loginVMJavaLangObjectNull = false;
            // loginVM.loginModel.getValue()
            com.front_end.app.modules.login.data.model.LoginModel loginVMLoginModelGetValue = null;
            // loginVM.loginModel != null
            boolean loginVMLoginModelJavaLangObjectNull = false;
            // loginVM.loginModel.getValue() != null
            boolean loginVMLoginModelGetValueJavaLangObjectNull = false;
            // loginVM.loginModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.login.data.model.LoginModel> loginVMLoginModel = null;
            // loginVM
            com.front_end.app.modules.login.data.viewmodel.LoginVM loginVM = mLoginVM;
            // loginVM.loginModel.getValue().etStacklockValue
            java.lang.String loginVMLoginModelEtStacklockValue = null;



            loginVMJavaLangObjectNull = (loginVM) != (null);
            if (loginVMJavaLangObjectNull) {


                loginVMLoginModel = loginVM.getLoginModel();

                loginVMLoginModelJavaLangObjectNull = (loginVMLoginModel) != (null);
                if (loginVMLoginModelJavaLangObjectNull) {


                    loginVMLoginModelGetValue = loginVMLoginModel.getValue();

                    loginVMLoginModelGetValueJavaLangObjectNull = (loginVMLoginModelGetValue) != (null);
                    if (loginVMLoginModelGetValueJavaLangObjectNull) {




                        loginVMLoginModelGetValue.setEtStacklockValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etStackuserandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of loginVM.loginModel.getValue().etStackuserValue
            //         is loginVM.loginModel.getValue().setEtStackuserValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etStackuser);
            // localize variables for thread safety
            // loginVM.loginModel.getValue().etStackuserValue
            java.lang.String loginVMLoginModelEtStackuserValue = null;
            // loginVM != null
            boolean loginVMJavaLangObjectNull = false;
            // loginVM.loginModel.getValue()
            com.front_end.app.modules.login.data.model.LoginModel loginVMLoginModelGetValue = null;
            // loginVM.loginModel != null
            boolean loginVMLoginModelJavaLangObjectNull = false;
            // loginVM.loginModel.getValue() != null
            boolean loginVMLoginModelGetValueJavaLangObjectNull = false;
            // loginVM.loginModel
            androidx.lifecycle.MutableLiveData<com.front_end.app.modules.login.data.model.LoginModel> loginVMLoginModel = null;
            // loginVM
            com.front_end.app.modules.login.data.viewmodel.LoginVM loginVM = mLoginVM;



            loginVMJavaLangObjectNull = (loginVM) != (null);
            if (loginVMJavaLangObjectNull) {


                loginVMLoginModel = loginVM.getLoginModel();

                loginVMLoginModelJavaLangObjectNull = (loginVMLoginModel) != (null);
                if (loginVMLoginModelJavaLangObjectNull) {


                    loginVMLoginModelGetValue = loginVMLoginModel.getValue();

                    loginVMLoginModelGetValueJavaLangObjectNull = (loginVMLoginModelGetValue) != (null);
                    if (loginVMLoginModelGetValueJavaLangObjectNull) {




                        loginVMLoginModelGetValue.setEtStackuserValue(((java.lang.String) (callbackArg_0)));
                    }
                }
            }
        }
    };

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[23]
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[22]
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (android.widget.FrameLayout) bindings[12]
            , (android.widget.FrameLayout) bindings[17]
            , (android.widget.FrameLayout) bindings[26]
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.FrameLayout) bindings[16]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.view.View) bindings[18]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[21]
            , (com.google.android.material.textfield.TextInputLayout) bindings[20]
            , (com.google.android.material.textfield.TextInputLayout) bindings[19]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.etGroupFive.setTag(null);
        this.etGroupFour.setTag(null);
        this.etGroupThree.setTag(null);
        this.etStacklock.setTag(null);
        this.etStackuser.setTag(null);
        this.frameStackrectanglethirteen.setTag(null);
        this.imageRectangleThirteen.setTag(null);
        this.imageRectangleTwelve.setTag(null);
        this.txtLOGIN.setTag(null);
        this.txtOrLoginwith.setTag(null);
        this.txtSIGNUP.setTag(null);
        this.txtWelcomeLogin.setTag(null);
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
        if (BR.loginVM == variableId) {
            setLoginVM((com.front_end.app.modules.login.data.viewmodel.LoginVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginVM(@Nullable com.front_end.app.modules.login.data.viewmodel.LoginVM LoginVM) {
        this.mLoginVM = LoginVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.loginVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginVMLoginModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.login.data.model.LoginModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginVMLoginModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.login.data.model.LoginModel> LoginVMLoginModel, int fieldId) {
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
        java.lang.String loginVMLoginModelEtGroupThreeValue = null;
        java.lang.String loginVMLoginModelEtGroupFourValue = null;
        java.lang.String loginVMLoginModelEtStackuserValue = null;
        java.lang.String loginVMLoginModelTxtOrLoginwith = null;
        java.lang.String loginVMLoginModelTxtLOGIN = null;
        com.front_end.app.modules.login.data.viewmodel.LoginVM loginVM = mLoginVM;
        java.lang.String loginVMLoginModelTxtWelcomeLogin = null;
        java.lang.String loginVMLoginModelTxtSIGNUP = null;
        java.lang.String loginVMLoginModelEtStacklockValue = null;
        java.lang.String loginVMLoginModelEtGroupFiveValue = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.login.data.model.LoginModel> loginVMLoginModel = null;
        com.front_end.app.modules.login.data.model.LoginModel loginVMLoginModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (loginVM != null) {
                    // read loginVM.loginModel
                    loginVMLoginModel = loginVM.getLoginModel();
                }
                updateLiveDataRegistration(0, loginVMLoginModel);


                if (loginVMLoginModel != null) {
                    // read loginVM.loginModel.getValue()
                    loginVMLoginModelGetValue = loginVMLoginModel.getValue();
                }


                if (loginVMLoginModelGetValue != null) {
                    // read loginVM.loginModel.getValue().etGroupThreeValue
                    loginVMLoginModelEtGroupThreeValue = loginVMLoginModelGetValue.getEtGroupThreeValue();
                    // read loginVM.loginModel.getValue().etGroupFourValue
                    loginVMLoginModelEtGroupFourValue = loginVMLoginModelGetValue.getEtGroupFourValue();
                    // read loginVM.loginModel.getValue().etStackuserValue
                    loginVMLoginModelEtStackuserValue = loginVMLoginModelGetValue.getEtStackuserValue();
                    // read loginVM.loginModel.getValue().txtOrLoginwith
                    loginVMLoginModelTxtOrLoginwith = loginVMLoginModelGetValue.getTxtOrLoginwith();
                    // read loginVM.loginModel.getValue().txtLOGIN
                    loginVMLoginModelTxtLOGIN = loginVMLoginModelGetValue.getTxtLOGIN();
                    // read loginVM.loginModel.getValue().txtWelcomeLogin
                    loginVMLoginModelTxtWelcomeLogin = loginVMLoginModelGetValue.getTxtWelcomeLogin();
                    // read loginVM.loginModel.getValue().txtSIGNUP
                    loginVMLoginModelTxtSIGNUP = loginVMLoginModelGetValue.getTxtSIGNUP();
                    // read loginVM.loginModel.getValue().etStacklockValue
                    loginVMLoginModelEtStacklockValue = loginVMLoginModelGetValue.getEtStacklockValue();
                    // read loginVM.loginModel.getValue().etGroupFiveValue
                    loginVMLoginModelEtGroupFiveValue = loginVMLoginModelGetValue.getEtGroupFiveValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etGroupFive, loginVMLoginModelEtGroupFiveValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etGroupFour, loginVMLoginModelEtGroupFourValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etGroupThree, loginVMLoginModelEtGroupThreeValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etStacklock, loginVMLoginModelEtStacklockValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etStackuser, loginVMLoginModelEtStackuserValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLOGIN, loginVMLoginModelTxtLOGIN);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtOrLoginwith, loginVMLoginModelTxtOrLoginwith);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSIGNUP, loginVMLoginModelTxtSIGNUP);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWelcomeLogin, loginVMLoginModelTxtWelcomeLogin);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etGroupFive, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etGroupFiveandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etGroupFour, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etGroupFourandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etGroupThree, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etGroupThreeandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etStacklock, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etStacklockandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etStackuser, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etStackuserandroidTextAttrChanged);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangleThirteen, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangleThirteen.getContext(), R.drawable.img_rectangle13_451x428), (float)0f, (boolean)false);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangleTwelve, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangleTwelve.getContext(), R.drawable.img_rectangle13), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginVM.loginModel
        flag 1 (0x2L): loginVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}