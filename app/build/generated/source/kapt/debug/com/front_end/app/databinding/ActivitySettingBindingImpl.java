package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySettingBindingImpl extends ActivitySettingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbarToolbar, 14);
        sViewsWithIds.put(R.id.linearRowarrowfive, 15);
        sViewsWithIds.put(R.id.linearColumnarrowfive, 16);
        sViewsWithIds.put(R.id.frameStackarrowfive, 17);
        sViewsWithIds.put(R.id.imageArrowFive, 18);
        sViewsWithIds.put(R.id.linearColumnprofile, 19);
        sViewsWithIds.put(R.id.frameStackellipsetwentyfive, 20);
        sViewsWithIds.put(R.id.viewEllipseTwentyFive, 21);
        sViewsWithIds.put(R.id.imageUser, 22);
        sViewsWithIds.put(R.id.lineLineTwo, 23);
        sViewsWithIds.put(R.id.linearRowcurrentweight, 24);
        sViewsWithIds.put(R.id.linearRowgoal, 25);
        sViewsWithIds.put(R.id.linearRowtargetweight, 26);
        sViewsWithIds.put(R.id.btnCustomization, 27);
        sViewsWithIds.put(R.id.linearRowlinethree, 28);
        sViewsWithIds.put(R.id.linearColumnlinethree, 29);
        sViewsWithIds.put(R.id.lineLineThree, 30);
        sViewsWithIds.put(R.id.linearRowuserOne, 31);
        sViewsWithIds.put(R.id.imageUserOne, 32);
        sViewsWithIds.put(R.id.lineLineFour, 33);
        sViewsWithIds.put(R.id.lineLineSix, 34);
        sViewsWithIds.put(R.id.imageArrowEight, 35);
        sViewsWithIds.put(R.id.imageArrowNine, 36);
        sViewsWithIds.put(R.id.imageArrowTen, 37);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 38, sIncludes, sViewsWithIds));
    }
    private ActivitySettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[27]
            , (android.widget.FrameLayout) bindings[17]
            , (android.widget.FrameLayout) bindings[20]
            , (android.widget.ImageView) bindings[35]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[36]
            , (android.widget.ImageView) bindings[37]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[32]
            , (android.view.View) bindings[33]
            , (android.view.View) bindings[34]
            , (android.view.View) bindings[30]
            , (android.view.View) bindings[23]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (androidx.appcompat.widget.Toolbar) bindings[14]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.view.View) bindings[21]
            );
        this.linearSetting.setTag(null);
        this.recyclerSetting.setTag(null);
        this.txtAccountSetting.setTag(null);
        this.txtAgeCounter.setTag(null);
        this.txtCurrentweight.setTag(null);
        this.txtEmaildatapir.setTag(null);
        this.txtGoal.setTag(null);
        this.txtLoseWeight.setTag(null);
        this.txtNamePirate.setTag(null);
        this.txtPersonalDetail.setTag(null);
        this.txtProfile.setTag(null);
        this.txtTargetWeight.setTag(null);
        this.txtWeight.setTag(null);
        this.txtWeightOne.setTag(null);
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
        if (BR.settingVM == variableId) {
            setSettingVM((com.front_end.app.modules.setting.data.viewmodel.SettingVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSettingVM(@Nullable com.front_end.app.modules.setting.data.viewmodel.SettingVM SettingVM) {
        this.mSettingVM = SettingVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.settingVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSettingVMSettingModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.setting.data.model.SettingModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSettingVMSettingModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.setting.data.model.SettingModel> SettingVMSettingModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.setting.data.model.SettingModel> settingVMSettingModel = null;
        java.lang.String settingVMSettingModelTxtAccountSetting = null;
        java.lang.String settingVMSettingModelTxtProfile = null;
        java.lang.String settingVMSettingModelTxtCurrentweight = null;
        java.lang.String settingVMSettingModelTxtTargetWeight = null;
        java.lang.String settingVMSettingModelTxtPersonalDetail = null;
        java.lang.String settingVMSettingModelTxtGoal = null;
        java.lang.String settingVMSettingModelTxtWeightOne = null;
        java.lang.String settingVMSettingModelTxtWeight = null;
        com.front_end.app.modules.setting.data.viewmodel.SettingVM settingVM = mSettingVM;
        java.lang.String settingVMSettingModelTxtLoseWeight = null;
        java.lang.String settingVMSettingModelTxtNamePirate = null;
        com.front_end.app.modules.setting.data.model.SettingModel settingVMSettingModelGetValue = null;
        java.lang.String settingVMSettingModelTxtAgeCounter = null;
        java.lang.String settingVMSettingModelTxtEmaildatapir = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (settingVM != null) {
                    // read settingVM.settingModel
                    settingVMSettingModel = settingVM.getSettingModel();
                }
                updateLiveDataRegistration(0, settingVMSettingModel);


                if (settingVMSettingModel != null) {
                    // read settingVM.settingModel.getValue()
                    settingVMSettingModelGetValue = settingVMSettingModel.getValue();
                }


                if (settingVMSettingModelGetValue != null) {
                    // read settingVM.settingModel.getValue().txtAccountSetting
                    settingVMSettingModelTxtAccountSetting = settingVMSettingModelGetValue.getTxtAccountSetting();
                    // read settingVM.settingModel.getValue().txtProfile
                    settingVMSettingModelTxtProfile = settingVMSettingModelGetValue.getTxtProfile();
                    // read settingVM.settingModel.getValue().txtCurrentweight
                    settingVMSettingModelTxtCurrentweight = settingVMSettingModelGetValue.getTxtCurrentweight();
                    // read settingVM.settingModel.getValue().txtTargetWeight
                    settingVMSettingModelTxtTargetWeight = settingVMSettingModelGetValue.getTxtTargetWeight();
                    // read settingVM.settingModel.getValue().txtPersonalDetail
                    settingVMSettingModelTxtPersonalDetail = settingVMSettingModelGetValue.getTxtPersonalDetail();
                    // read settingVM.settingModel.getValue().txtGoal
                    settingVMSettingModelTxtGoal = settingVMSettingModelGetValue.getTxtGoal();
                    // read settingVM.settingModel.getValue().txtWeightOne
                    settingVMSettingModelTxtWeightOne = settingVMSettingModelGetValue.getTxtWeightOne();
                    // read settingVM.settingModel.getValue().txtWeight
                    settingVMSettingModelTxtWeight = settingVMSettingModelGetValue.getTxtWeight();
                    // read settingVM.settingModel.getValue().txtLoseWeight
                    settingVMSettingModelTxtLoseWeight = settingVMSettingModelGetValue.getTxtLoseWeight();
                    // read settingVM.settingModel.getValue().txtNamePirate
                    settingVMSettingModelTxtNamePirate = settingVMSettingModelGetValue.getTxtNamePirate();
                    // read settingVM.settingModel.getValue().txtAgeCounter
                    settingVMSettingModelTxtAgeCounter = settingVMSettingModelGetValue.getTxtAgeCounter();
                    // read settingVM.settingModel.getValue().txtEmaildatapir
                    settingVMSettingModelTxtEmaildatapir = settingVMSettingModelGetValue.getTxtEmaildatapir();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerSetting, recyclerSetting.getResources().getDimension(R.dimen._28pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAccountSetting, settingVMSettingModelTxtAccountSetting);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAgeCounter, settingVMSettingModelTxtAgeCounter);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCurrentweight, settingVMSettingModelTxtCurrentweight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmaildatapir, settingVMSettingModelTxtEmaildatapir);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGoal, settingVMSettingModelTxtGoal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLoseWeight, settingVMSettingModelTxtLoseWeight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNamePirate, settingVMSettingModelTxtNamePirate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPersonalDetail, settingVMSettingModelTxtPersonalDetail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtProfile, settingVMSettingModelTxtProfile);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTargetWeight, settingVMSettingModelTxtTargetWeight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeight, settingVMSettingModelTxtWeight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeightOne, settingVMSettingModelTxtWeightOne);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): settingVM.settingModel
        flag 1 (0x2L): settingVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}