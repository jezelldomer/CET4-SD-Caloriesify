package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDinnerBindingImpl extends ActivityDinnerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 24);
        sViewsWithIds.put(R.id.linearDinner, 25);
        sViewsWithIds.put(R.id.linearColumnarrowfive, 26);
        sViewsWithIds.put(R.id.frameStackarrowfive, 27);
        sViewsWithIds.put(R.id.imageArrowFive, 28);
        sViewsWithIds.put(R.id.linearColumncarbs, 29);
        sViewsWithIds.put(R.id.linearRowcarbs, 30);
        sViewsWithIds.put(R.id.linearRowweight, 31);
        sViewsWithIds.put(R.id.linearRowarrowone, 32);
        sViewsWithIds.put(R.id.linearRowarrowtwo, 33);
        sViewsWithIds.put(R.id.imageArrowTwo, 34);
        sViewsWithIds.put(R.id.imageCalendar, 35);
        sViewsWithIds.put(R.id.imageArrowOne, 36);
        sViewsWithIds.put(R.id.frameStackuntitleddesign, 37);
        sViewsWithIds.put(R.id.frameStackgroupfortyone, 38);
        sViewsWithIds.put(R.id.linearColumngroupfortyone, 39);
        sViewsWithIds.put(R.id.linearRowuntitleddesign, 40);
        sViewsWithIds.put(R.id.linearRowlunch, 41);
        sViewsWithIds.put(R.id.linearColumnlunch, 42);
        sViewsWithIds.put(R.id.linearRowuntitleddesignOne, 43);
        sViewsWithIds.put(R.id.linearRowdinner, 44);
        sViewsWithIds.put(R.id.linearColumndinner, 45);
        sViewsWithIds.put(R.id.btnNetCarbs16Fat66Protein23, 46);
        sViewsWithIds.put(R.id.btnAddItems, 47);
        sViewsWithIds.put(R.id.frameStackellipseten, 48);
        sViewsWithIds.put(R.id.viewEllipseTen, 49);
        sViewsWithIds.put(R.id.frameStackwater, 50);
        sViewsWithIds.put(R.id.linearRowwater, 51);
        sViewsWithIds.put(R.id.linearColumnwater, 52);
        sViewsWithIds.put(R.id.imageUntitleddesignFour, 53);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDinnerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 54, sIncludes, sViewsWithIds));
    }
    private ActivityDinnerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[47]
            , (androidx.appcompat.widget.AppCompatButton) bindings[46]
            , (android.widget.FrameLayout) bindings[27]
            , (android.widget.FrameLayout) bindings[48]
            , (android.widget.FrameLayout) bindings[38]
            , (android.widget.FrameLayout) bindings[37]
            , (android.widget.FrameLayout) bindings[50]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[36]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[35]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[53]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[45]
            , (android.widget.LinearLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[42]
            , (android.widget.LinearLayout) bindings[52]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.LinearLayout) bindings[44]
            , (android.widget.LinearLayout) bindings[41]
            , (android.widget.LinearLayout) bindings[40]
            , (android.widget.LinearLayout) bindings[43]
            , (android.widget.LinearLayout) bindings[51]
            , (android.widget.LinearLayout) bindings[31]
            , (androidx.recyclerview.widget.RecyclerView) bindings[20]
            , (androidx.core.widget.NestedScrollView) bindings[24]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[49]
            );
        this.imageBeigeIllustrat.setTag(null);
        this.imageUntitleddesign.setTag(null);
        this.imageUntitleddesignOne.setTag(null);
        this.linearColumnarrowtwo.setTag(null);
        this.recyclerDinner.setTag(null);
        this.txtBreakfast.setTag(null);
        this.txtCarbs.setTag(null);
        this.txtDinner.setTag(null);
        this.txtDuration.setTag(null);
        this.txtEight.setTag(null);
        this.txtFat.setTag(null);
        this.txtGroupFortyOne.setTag(null);
        this.txtGroupFortyOneFour.setTag(null);
        this.txtGroupFortyOneOne.setTag(null);
        this.txtLunch.setTag(null);
        this.txtProtein.setTag(null);
        this.txtRecommended356.setTag(null);
        this.txtRecommended535.setTag(null);
        this.txtRecommended535One.setTag(null);
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
        if (BR.dinnerVM == variableId) {
            setDinnerVM((com.front_end.app.modules.dinner.data.viewmodel.DinnerVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDinnerVM(@Nullable com.front_end.app.modules.dinner.data.viewmodel.DinnerVM DinnerVM) {
        this.mDinnerVM = DinnerVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dinnerVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDinnerVMDinnerModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.dinner.data.model.DinnerModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDinnerVMDinnerModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.dinner.data.model.DinnerModel> DinnerVMDinnerModel, int fieldId) {
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
        java.lang.String dinnerVMDinnerModelTxtWeight = null;
        com.front_end.app.modules.dinner.data.viewmodel.DinnerVM dinnerVM = mDinnerVM;
        com.front_end.app.modules.dinner.data.model.DinnerModel dinnerVMDinnerModelGetValue = null;
        java.lang.String dinnerVMDinnerModelTxtWeightTwo = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.dinner.data.model.DinnerModel> dinnerVMDinnerModel = null;
        java.lang.String dinnerVMDinnerModelTxtWater = null;
        java.lang.String dinnerVMDinnerModelTxtDuration = null;
        java.lang.String dinnerVMDinnerModelTxtGroupFortyOne = null;
        java.lang.String dinnerVMDinnerModelTxtGroupFortyOneOne = null;
        java.lang.String dinnerVMDinnerModelTxtEight = null;
        java.lang.String dinnerVMDinnerModelTxtLunch = null;
        java.lang.String dinnerVMDinnerModelTxtFat = null;
        java.lang.String dinnerVMDinnerModelTxtBreakfast = null;
        java.lang.String dinnerVMDinnerModelTxtRecommended5Lt = null;
        java.lang.String dinnerVMDinnerModelTxtProtein = null;
        java.lang.String dinnerVMDinnerModelTxtRecommended356 = null;
        java.lang.String dinnerVMDinnerModelTxtCarbs = null;
        java.lang.String dinnerVMDinnerModelTxtGroupFortyOneFour = null;
        java.lang.String dinnerVMDinnerModelTxtWeightOne = null;
        java.lang.String dinnerVMDinnerModelTxtDinner = null;
        java.lang.String dinnerVMDinnerModelTxtRecommended535 = null;
        java.lang.String dinnerVMDinnerModelTxtRecommended535One = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (dinnerVM != null) {
                    // read dinnerVM.dinnerModel
                    dinnerVMDinnerModel = dinnerVM.getDinnerModel();
                }
                updateLiveDataRegistration(0, dinnerVMDinnerModel);


                if (dinnerVMDinnerModel != null) {
                    // read dinnerVM.dinnerModel.getValue()
                    dinnerVMDinnerModelGetValue = dinnerVMDinnerModel.getValue();
                }


                if (dinnerVMDinnerModelGetValue != null) {
                    // read dinnerVM.dinnerModel.getValue().txtWeight
                    dinnerVMDinnerModelTxtWeight = dinnerVMDinnerModelGetValue.getTxtWeight();
                    // read dinnerVM.dinnerModel.getValue().txtWeightTwo
                    dinnerVMDinnerModelTxtWeightTwo = dinnerVMDinnerModelGetValue.getTxtWeightTwo();
                    // read dinnerVM.dinnerModel.getValue().txtWater
                    dinnerVMDinnerModelTxtWater = dinnerVMDinnerModelGetValue.getTxtWater();
                    // read dinnerVM.dinnerModel.getValue().txtDuration
                    dinnerVMDinnerModelTxtDuration = dinnerVMDinnerModelGetValue.getTxtDuration();
                    // read dinnerVM.dinnerModel.getValue().txtGroupFortyOne
                    dinnerVMDinnerModelTxtGroupFortyOne = dinnerVMDinnerModelGetValue.getTxtGroupFortyOne();
                    // read dinnerVM.dinnerModel.getValue().txtGroupFortyOneOne
                    dinnerVMDinnerModelTxtGroupFortyOneOne = dinnerVMDinnerModelGetValue.getTxtGroupFortyOneOne();
                    // read dinnerVM.dinnerModel.getValue().txtEight
                    dinnerVMDinnerModelTxtEight = dinnerVMDinnerModelGetValue.getTxtEight();
                    // read dinnerVM.dinnerModel.getValue().txtLunch
                    dinnerVMDinnerModelTxtLunch = dinnerVMDinnerModelGetValue.getTxtLunch();
                    // read dinnerVM.dinnerModel.getValue().txtFat
                    dinnerVMDinnerModelTxtFat = dinnerVMDinnerModelGetValue.getTxtFat();
                    // read dinnerVM.dinnerModel.getValue().txtBreakfast
                    dinnerVMDinnerModelTxtBreakfast = dinnerVMDinnerModelGetValue.getTxtBreakfast();
                    // read dinnerVM.dinnerModel.getValue().txtRecommended5Lt
                    dinnerVMDinnerModelTxtRecommended5Lt = dinnerVMDinnerModelGetValue.getTxtRecommended5Lt();
                    // read dinnerVM.dinnerModel.getValue().txtProtein
                    dinnerVMDinnerModelTxtProtein = dinnerVMDinnerModelGetValue.getTxtProtein();
                    // read dinnerVM.dinnerModel.getValue().txtRecommended356
                    dinnerVMDinnerModelTxtRecommended356 = dinnerVMDinnerModelGetValue.getTxtRecommended356();
                    // read dinnerVM.dinnerModel.getValue().txtCarbs
                    dinnerVMDinnerModelTxtCarbs = dinnerVMDinnerModelGetValue.getTxtCarbs();
                    // read dinnerVM.dinnerModel.getValue().txtGroupFortyOneFour
                    dinnerVMDinnerModelTxtGroupFortyOneFour = dinnerVMDinnerModelGetValue.getTxtGroupFortyOneFour();
                    // read dinnerVM.dinnerModel.getValue().txtWeightOne
                    dinnerVMDinnerModelTxtWeightOne = dinnerVMDinnerModelGetValue.getTxtWeightOne();
                    // read dinnerVM.dinnerModel.getValue().txtDinner
                    dinnerVMDinnerModelTxtDinner = dinnerVMDinnerModelGetValue.getTxtDinner();
                    // read dinnerVM.dinnerModel.getValue().txtRecommended535
                    dinnerVMDinnerModelTxtRecommended535 = dinnerVMDinnerModelGetValue.getTxtRecommended535();
                    // read dinnerVM.dinnerModel.getValue().txtRecommended535One
                    dinnerVMDinnerModelTxtRecommended535One = dinnerVMDinnerModelGetValue.getTxtRecommended535One();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBeigeIllustrat, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBeigeIllustrat.getContext(), R.drawable.img_beigeillustrat), (float)0f, (boolean)false);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageUntitleddesign, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageUntitleddesign.getContext(), R.drawable.img_untitleddesign), (float)0f, (boolean)false);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageUntitleddesignOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageUntitleddesignOne.getContext(), R.drawable.img_untitleddesign_64x64), (float)0f, (boolean)false);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerDinner, recyclerDinner.getResources().getDimension(R.dimen._20pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBreakfast, dinnerVMDinnerModelTxtBreakfast);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCarbs, dinnerVMDinnerModelTxtCarbs);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDinner, dinnerVMDinnerModelTxtDinner);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDuration, dinnerVMDinnerModelTxtDuration);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEight, dinnerVMDinnerModelTxtEight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFat, dinnerVMDinnerModelTxtFat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOne, dinnerVMDinnerModelTxtGroupFortyOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOneFour, dinnerVMDinnerModelTxtGroupFortyOneFour);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOneOne, dinnerVMDinnerModelTxtGroupFortyOneOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLunch, dinnerVMDinnerModelTxtLunch);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtProtein, dinnerVMDinnerModelTxtProtein);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended356, dinnerVMDinnerModelTxtRecommended356);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended535, dinnerVMDinnerModelTxtRecommended535);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended535One, dinnerVMDinnerModelTxtRecommended535One);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended5Lt, dinnerVMDinnerModelTxtRecommended5Lt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWater, dinnerVMDinnerModelTxtWater);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeight, dinnerVMDinnerModelTxtWeight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeightOne, dinnerVMDinnerModelTxtWeightOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeightTwo, dinnerVMDinnerModelTxtWeightTwo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dinnerVM.dinnerModel
        flag 1 (0x2L): dinnerVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}