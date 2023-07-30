package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCarbsBindingImpl extends ActivityCarbsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnarrowfive, 16);
        sViewsWithIds.put(R.id.frameStackarrowfive, 17);
        sViewsWithIds.put(R.id.imageArrowFive, 18);
        sViewsWithIds.put(R.id.linearColumncarbs, 19);
        sViewsWithIds.put(R.id.linearRowcarbs, 20);
        sViewsWithIds.put(R.id.linearRowweight, 21);
        sViewsWithIds.put(R.id.linearRowarrowone, 22);
        sViewsWithIds.put(R.id.linearRowarrowtwo, 23);
        sViewsWithIds.put(R.id.imageArrowTwo, 24);
        sViewsWithIds.put(R.id.imageCalendar, 25);
        sViewsWithIds.put(R.id.imageArrowOne, 26);
        sViewsWithIds.put(R.id.frameStackgroupfortyone, 27);
        sViewsWithIds.put(R.id.linearColumngroupfortyone, 28);
        sViewsWithIds.put(R.id.frameStackwater, 29);
        sViewsWithIds.put(R.id.linearRowwater, 30);
        sViewsWithIds.put(R.id.linearColumnwater, 31);
        sViewsWithIds.put(R.id.imageUntitleddesignFour, 32);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCarbsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private ActivityCarbsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.FrameLayout) bindings[17]
            , (android.widget.FrameLayout) bindings[27]
            , (android.widget.FrameLayout) bindings[29]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.LinearLayout) bindings[21]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            );
        this.imageBeigeIllustrat.setTag(null);
        this.linearCarbs.setTag(null);
        this.recyclerCarbs.setTag(null);
        this.txtBreakfast.setTag(null);
        this.txtCarbs.setTag(null);
        this.txtDuration.setTag(null);
        this.txtFat.setTag(null);
        this.txtGroupFortyOne.setTag(null);
        this.txtGroupFortyOneFive.setTag(null);
        this.txtProtein.setTag(null);
        this.txtRecommended356.setTag(null);
        this.txtRecommended5Lt.setTag(null);
        this.txtWater.setTag(null);
        this.txtWeight.setTag(null);
        this.txtWeightOne.setTag(null);
        this.txtWeightTwo.setTag(null);
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
        if (BR.carbsVM == variableId) {
            setCarbsVM((com.front_end.app.modules.carbs.data.viewmodel.CarbsVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCarbsVM(@Nullable com.front_end.app.modules.carbs.data.viewmodel.CarbsVM CarbsVM) {
        this.mCarbsVM = CarbsVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.carbsVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCarbsVMCarbsModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.carbs.data.model.CarbsModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCarbsVMCarbsModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.carbs.data.model.CarbsModel> CarbsVMCarbsModel, int fieldId) {
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
        java.lang.String carbsVMCarbsModelTxtRecommended5Lt = null;
        java.lang.String carbsVMCarbsModelTxtGroupFortyOne = null;
        java.lang.String carbsVMCarbsModelTxtWeightTwo = null;
        java.lang.String carbsVMCarbsModelTxtBreakfast = null;
        java.lang.String carbsVMCarbsModelTxtGroupFortyOneFive = null;
        java.lang.String carbsVMCarbsModelTxtFat = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.carbs.data.model.CarbsModel> carbsVMCarbsModel = null;
        java.lang.String carbsVMCarbsModelTxtRecommended356 = null;
        java.lang.String carbsVMCarbsModelTxtProtein = null;
        com.front_end.app.modules.carbs.data.viewmodel.CarbsVM carbsVM = mCarbsVM;
        com.front_end.app.modules.carbs.data.model.CarbsModel carbsVMCarbsModelGetValue = null;
        java.lang.String carbsVMCarbsModelTxtDuration = null;
        java.lang.String carbsVMCarbsModelTxtWeight = null;
        java.lang.String carbsVMCarbsModelTxtWeightOne = null;
        java.lang.String carbsVMCarbsModelTxtWater = null;
        java.lang.String carbsVMCarbsModelTxtCarbs = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (carbsVM != null) {
                    // read carbsVM.carbsModel
                    carbsVMCarbsModel = carbsVM.getCarbsModel();
                }
                updateLiveDataRegistration(0, carbsVMCarbsModel);


                if (carbsVMCarbsModel != null) {
                    // read carbsVM.carbsModel.getValue()
                    carbsVMCarbsModelGetValue = carbsVMCarbsModel.getValue();
                }


                if (carbsVMCarbsModelGetValue != null) {
                    // read carbsVM.carbsModel.getValue().txtRecommended5Lt
                    carbsVMCarbsModelTxtRecommended5Lt = carbsVMCarbsModelGetValue.getTxtRecommended5Lt();
                    // read carbsVM.carbsModel.getValue().txtGroupFortyOne
                    carbsVMCarbsModelTxtGroupFortyOne = carbsVMCarbsModelGetValue.getTxtGroupFortyOne();
                    // read carbsVM.carbsModel.getValue().txtWeightTwo
                    carbsVMCarbsModelTxtWeightTwo = carbsVMCarbsModelGetValue.getTxtWeightTwo();
                    // read carbsVM.carbsModel.getValue().txtBreakfast
                    carbsVMCarbsModelTxtBreakfast = carbsVMCarbsModelGetValue.getTxtBreakfast();
                    // read carbsVM.carbsModel.getValue().txtGroupFortyOneFive
                    carbsVMCarbsModelTxtGroupFortyOneFive = carbsVMCarbsModelGetValue.getTxtGroupFortyOneFive();
                    // read carbsVM.carbsModel.getValue().txtFat
                    carbsVMCarbsModelTxtFat = carbsVMCarbsModelGetValue.getTxtFat();
                    // read carbsVM.carbsModel.getValue().txtRecommended356
                    carbsVMCarbsModelTxtRecommended356 = carbsVMCarbsModelGetValue.getTxtRecommended356();
                    // read carbsVM.carbsModel.getValue().txtProtein
                    carbsVMCarbsModelTxtProtein = carbsVMCarbsModelGetValue.getTxtProtein();
                    // read carbsVM.carbsModel.getValue().txtDuration
                    carbsVMCarbsModelTxtDuration = carbsVMCarbsModelGetValue.getTxtDuration();
                    // read carbsVM.carbsModel.getValue().txtWeight
                    carbsVMCarbsModelTxtWeight = carbsVMCarbsModelGetValue.getTxtWeight();
                    // read carbsVM.carbsModel.getValue().txtWeightOne
                    carbsVMCarbsModelTxtWeightOne = carbsVMCarbsModelGetValue.getTxtWeightOne();
                    // read carbsVM.carbsModel.getValue().txtWater
                    carbsVMCarbsModelTxtWater = carbsVMCarbsModelGetValue.getTxtWater();
                    // read carbsVM.carbsModel.getValue().txtCarbs
                    carbsVMCarbsModelTxtCarbs = carbsVMCarbsModelGetValue.getTxtCarbs();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBeigeIllustrat, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBeigeIllustrat.getContext(), R.drawable.img_beigeillustrat), (float)0f, (boolean)false);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerCarbs, recyclerCarbs.getResources().getDimension(R.dimen._23pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBreakfast, carbsVMCarbsModelTxtBreakfast);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCarbs, carbsVMCarbsModelTxtCarbs);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDuration, carbsVMCarbsModelTxtDuration);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFat, carbsVMCarbsModelTxtFat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOne, carbsVMCarbsModelTxtGroupFortyOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOneFive, carbsVMCarbsModelTxtGroupFortyOneFive);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtProtein, carbsVMCarbsModelTxtProtein);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended356, carbsVMCarbsModelTxtRecommended356);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended5Lt, carbsVMCarbsModelTxtRecommended5Lt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWater, carbsVMCarbsModelTxtWater);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeight, carbsVMCarbsModelTxtWeight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeightOne, carbsVMCarbsModelTxtWeightOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeightTwo, carbsVMCarbsModelTxtWeightTwo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): carbsVM.carbsModel
        flag 1 (0x2L): carbsVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}