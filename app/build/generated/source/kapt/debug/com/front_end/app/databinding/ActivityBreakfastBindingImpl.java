package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityBreakfastBindingImpl extends ActivityBreakfastBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 17);
        sViewsWithIds.put(R.id.linearBreakfast, 18);
        sViewsWithIds.put(R.id.linearColumnarrowfive, 19);
        sViewsWithIds.put(R.id.frameStackarrowfive, 20);
        sViewsWithIds.put(R.id.imageArrowFive, 21);
        sViewsWithIds.put(R.id.linearColumncarbs, 22);
        sViewsWithIds.put(R.id.linearRowcarbs, 23);
        sViewsWithIds.put(R.id.linearRowweight, 24);
        sViewsWithIds.put(R.id.linearRowarrowone, 25);
        sViewsWithIds.put(R.id.linearRowarrowtwo, 26);
        sViewsWithIds.put(R.id.imageArrowTwo, 27);
        sViewsWithIds.put(R.id.imageCalendar, 28);
        sViewsWithIds.put(R.id.imageArrowOne, 29);
        sViewsWithIds.put(R.id.frameStackbreakfast, 30);
        sViewsWithIds.put(R.id.linearColumnbreakfast, 31);
        sViewsWithIds.put(R.id.linearRowbreakfast, 32);
        sViewsWithIds.put(R.id.frameStackellipseten, 33);
        sViewsWithIds.put(R.id.viewEllipseTen, 34);
        sViewsWithIds.put(R.id.btnAddItems, 35);
        sViewsWithIds.put(R.id.btnNetCarbs16Fat66Protein23, 36);
        sViewsWithIds.put(R.id.frameStackwater, 37);
        sViewsWithIds.put(R.id.linearRowwater, 38);
        sViewsWithIds.put(R.id.linearColumnwater, 39);
        sViewsWithIds.put(R.id.imageUntitleddesignFour, 40);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityBreakfastBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 41, sIncludes, sViewsWithIds));
    }
    private ActivityBreakfastBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[35]
            , (androidx.appcompat.widget.AppCompatButton) bindings[36]
            , (android.widget.FrameLayout) bindings[20]
            , (android.widget.FrameLayout) bindings[30]
            , (android.widget.FrameLayout) bindings[33]
            , (android.widget.FrameLayout) bindings[37]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[40]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[38]
            , (android.widget.LinearLayout) bindings[24]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (androidx.core.widget.NestedScrollView) bindings[17]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[34]
            );
        this.imageBeigeIllustrat.setTag(null);
        this.linearColumnarrowtwo.setTag(null);
        this.recyclerListegg.setTag(null);
        this.recyclerListuntitleddesign.setTag(null);
        this.txtBreakfast.setTag(null);
        this.txtCarbs.setTag(null);
        this.txtDuration.setTag(null);
        this.txtFat.setTag(null);
        this.txtGroupFortyOneFour.setTag(null);
        this.txtProtein.setTag(null);
        this.txtRecommended356.setTag(null);
        this.txtRecommended5Lt.setTag(null);
        this.txtSix.setTag(null);
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
        if (BR.breakfastVM == variableId) {
            setBreakfastVM((com.front_end.app.modules.breakfast.data.viewmodel.BreakfastVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBreakfastVM(@Nullable com.front_end.app.modules.breakfast.data.viewmodel.BreakfastVM BreakfastVM) {
        this.mBreakfastVM = BreakfastVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.breakfastVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBreakfastVMBreakfastModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.breakfast.data.model.BreakfastModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBreakfastVMBreakfastModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.breakfast.data.model.BreakfastModel> BreakfastVMBreakfastModel, int fieldId) {
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
        java.lang.String breakfastVMBreakfastModelTxtFat = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.breakfast.data.model.BreakfastModel> breakfastVMBreakfastModel = null;
        java.lang.String breakfastVMBreakfastModelTxtProtein = null;
        java.lang.String breakfastVMBreakfastModelTxtCarbs = null;
        java.lang.String breakfastVMBreakfastModelTxtBreakfast = null;
        java.lang.String breakfastVMBreakfastModelTxtGroupFortyOneFour = null;
        java.lang.String breakfastVMBreakfastModelTxtSix = null;
        com.front_end.app.modules.breakfast.data.viewmodel.BreakfastVM breakfastVM = mBreakfastVM;
        java.lang.String breakfastVMBreakfastModelTxtRecommended5Lt = null;
        java.lang.String breakfastVMBreakfastModelTxtWeightOne = null;
        com.front_end.app.modules.breakfast.data.model.BreakfastModel breakfastVMBreakfastModelGetValue = null;
        java.lang.String breakfastVMBreakfastModelTxtWeightTwo = null;
        java.lang.String breakfastVMBreakfastModelTxtWeight = null;
        java.lang.String breakfastVMBreakfastModelTxtWater = null;
        java.lang.String breakfastVMBreakfastModelTxtDuration = null;
        java.lang.String breakfastVMBreakfastModelTxtRecommended356 = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (breakfastVM != null) {
                    // read breakfastVM.breakfastModel
                    breakfastVMBreakfastModel = breakfastVM.getBreakfastModel();
                }
                updateLiveDataRegistration(0, breakfastVMBreakfastModel);


                if (breakfastVMBreakfastModel != null) {
                    // read breakfastVM.breakfastModel.getValue()
                    breakfastVMBreakfastModelGetValue = breakfastVMBreakfastModel.getValue();
                }


                if (breakfastVMBreakfastModelGetValue != null) {
                    // read breakfastVM.breakfastModel.getValue().txtFat
                    breakfastVMBreakfastModelTxtFat = breakfastVMBreakfastModelGetValue.getTxtFat();
                    // read breakfastVM.breakfastModel.getValue().txtProtein
                    breakfastVMBreakfastModelTxtProtein = breakfastVMBreakfastModelGetValue.getTxtProtein();
                    // read breakfastVM.breakfastModel.getValue().txtCarbs
                    breakfastVMBreakfastModelTxtCarbs = breakfastVMBreakfastModelGetValue.getTxtCarbs();
                    // read breakfastVM.breakfastModel.getValue().txtBreakfast
                    breakfastVMBreakfastModelTxtBreakfast = breakfastVMBreakfastModelGetValue.getTxtBreakfast();
                    // read breakfastVM.breakfastModel.getValue().txtGroupFortyOneFour
                    breakfastVMBreakfastModelTxtGroupFortyOneFour = breakfastVMBreakfastModelGetValue.getTxtGroupFortyOneFour();
                    // read breakfastVM.breakfastModel.getValue().txtSix
                    breakfastVMBreakfastModelTxtSix = breakfastVMBreakfastModelGetValue.getTxtSix();
                    // read breakfastVM.breakfastModel.getValue().txtRecommended5Lt
                    breakfastVMBreakfastModelTxtRecommended5Lt = breakfastVMBreakfastModelGetValue.getTxtRecommended5Lt();
                    // read breakfastVM.breakfastModel.getValue().txtWeightOne
                    breakfastVMBreakfastModelTxtWeightOne = breakfastVMBreakfastModelGetValue.getTxtWeightOne();
                    // read breakfastVM.breakfastModel.getValue().txtWeightTwo
                    breakfastVMBreakfastModelTxtWeightTwo = breakfastVMBreakfastModelGetValue.getTxtWeightTwo();
                    // read breakfastVM.breakfastModel.getValue().txtWeight
                    breakfastVMBreakfastModelTxtWeight = breakfastVMBreakfastModelGetValue.getTxtWeight();
                    // read breakfastVM.breakfastModel.getValue().txtWater
                    breakfastVMBreakfastModelTxtWater = breakfastVMBreakfastModelGetValue.getTxtWater();
                    // read breakfastVM.breakfastModel.getValue().txtDuration
                    breakfastVMBreakfastModelTxtDuration = breakfastVMBreakfastModelGetValue.getTxtDuration();
                    // read breakfastVM.breakfastModel.getValue().txtRecommended356
                    breakfastVMBreakfastModelTxtRecommended356 = breakfastVMBreakfastModelGetValue.getTxtRecommended356();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBeigeIllustrat, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBeigeIllustrat.getContext(), R.drawable.img_beigeillustrat), (float)0f, (boolean)false);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerListegg, recyclerListegg.getResources().getDimension(R.dimen._9pxh), (boolean)false);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerListuntitleddesign, recyclerListuntitleddesign.getResources().getDimension(R.dimen._23pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBreakfast, breakfastVMBreakfastModelTxtBreakfast);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCarbs, breakfastVMBreakfastModelTxtCarbs);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDuration, breakfastVMBreakfastModelTxtDuration);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFat, breakfastVMBreakfastModelTxtFat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOneFour, breakfastVMBreakfastModelTxtGroupFortyOneFour);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtProtein, breakfastVMBreakfastModelTxtProtein);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended356, breakfastVMBreakfastModelTxtRecommended356);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended5Lt, breakfastVMBreakfastModelTxtRecommended5Lt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSix, breakfastVMBreakfastModelTxtSix);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWater, breakfastVMBreakfastModelTxtWater);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeight, breakfastVMBreakfastModelTxtWeight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeightOne, breakfastVMBreakfastModelTxtWeightOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeightTwo, breakfastVMBreakfastModelTxtWeightTwo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): breakfastVM.breakfastModel
        flag 1 (0x2L): breakfastVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}