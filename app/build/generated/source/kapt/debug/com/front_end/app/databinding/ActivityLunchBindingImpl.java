package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLunchBindingImpl extends ActivityLunchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 20);
        sViewsWithIds.put(R.id.linearLunch, 21);
        sViewsWithIds.put(R.id.linearColumnarrowfive, 22);
        sViewsWithIds.put(R.id.frameStackarrowfive, 23);
        sViewsWithIds.put(R.id.imageArrowFive, 24);
        sViewsWithIds.put(R.id.linearColumncarbs, 25);
        sViewsWithIds.put(R.id.linearRowcarbs, 26);
        sViewsWithIds.put(R.id.linearRowweight, 27);
        sViewsWithIds.put(R.id.linearRowarrowone, 28);
        sViewsWithIds.put(R.id.linearRowarrowtwo, 29);
        sViewsWithIds.put(R.id.imageArrowTwo, 30);
        sViewsWithIds.put(R.id.imageCalendar, 31);
        sViewsWithIds.put(R.id.imageArrowOne, 32);
        sViewsWithIds.put(R.id.frameStackgroupfortyone, 33);
        sViewsWithIds.put(R.id.linearColumngroupfortyone, 34);
        sViewsWithIds.put(R.id.frameStacklunch, 35);
        sViewsWithIds.put(R.id.linearRowlunch, 36);
        sViewsWithIds.put(R.id.linearColumnlunch, 37);
        sViewsWithIds.put(R.id.btnAddItems, 38);
        sViewsWithIds.put(R.id.frameStackellipseten, 39);
        sViewsWithIds.put(R.id.viewEllipseTen, 40);
        sViewsWithIds.put(R.id.btnNetCarbs16Fat66Protein23, 41);
        sViewsWithIds.put(R.id.frameStackwater, 42);
        sViewsWithIds.put(R.id.linearRowwater, 43);
        sViewsWithIds.put(R.id.linearColumnwater, 44);
        sViewsWithIds.put(R.id.imageUntitleddesignFour, 45);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLunchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 46, sIncludes, sViewsWithIds));
    }
    private ActivityLunchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[38]
            , (androidx.appcompat.widget.AppCompatButton) bindings[41]
            , (android.widget.FrameLayout) bindings[23]
            , (android.widget.FrameLayout) bindings[39]
            , (android.widget.FrameLayout) bindings[33]
            , (android.widget.FrameLayout) bindings[35]
            , (android.widget.FrameLayout) bindings[42]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[31]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[45]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[34]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.LinearLayout) bindings[44]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[36]
            , (android.widget.LinearLayout) bindings[43]
            , (android.widget.LinearLayout) bindings[27]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (androidx.core.widget.NestedScrollView) bindings[20]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[40]
            );
        this.imageBeigeIllustrat.setTag(null);
        this.imageUntitleddesign.setTag(null);
        this.linearColumnarrowtwo.setTag(null);
        this.recyclerLunch.setTag(null);
        this.txtBreakfast.setTag(null);
        this.txtCarbs.setTag(null);
        this.txtDuration.setTag(null);
        this.txtFat.setTag(null);
        this.txtGroupFortyOne.setTag(null);
        this.txtGroupFortyOneFour.setTag(null);
        this.txtLunch.setTag(null);
        this.txtProtein.setTag(null);
        this.txtRecommended356.setTag(null);
        this.txtRecommended535.setTag(null);
        this.txtRecommended5Lt.setTag(null);
        this.txtSeven.setTag(null);
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
        if (BR.lunchVM == variableId) {
            setLunchVM((com.front_end.app.modules.lunch.data.viewmodel.LunchVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLunchVM(@Nullable com.front_end.app.modules.lunch.data.viewmodel.LunchVM LunchVM) {
        this.mLunchVM = LunchVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.lunchVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLunchVMLunchModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.lunch.data.model.LunchModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLunchVMLunchModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.lunch.data.model.LunchModel> LunchVMLunchModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.lunch.data.model.LunchModel> lunchVMLunchModel = null;
        java.lang.String lunchVMLunchModelTxtRecommended535 = null;
        com.front_end.app.modules.lunch.data.viewmodel.LunchVM lunchVM = mLunchVM;
        java.lang.String lunchVMLunchModelTxtProtein = null;
        java.lang.String lunchVMLunchModelTxtBreakfast = null;
        java.lang.String lunchVMLunchModelTxtSeven = null;
        java.lang.String lunchVMLunchModelTxtDuration = null;
        java.lang.String lunchVMLunchModelTxtWater = null;
        java.lang.String lunchVMLunchModelTxtRecommended356 = null;
        java.lang.String lunchVMLunchModelTxtCarbs = null;
        java.lang.String lunchVMLunchModelTxtWeightOne = null;
        com.front_end.app.modules.lunch.data.model.LunchModel lunchVMLunchModelGetValue = null;
        java.lang.String lunchVMLunchModelTxtGroupFortyOne = null;
        java.lang.String lunchVMLunchModelTxtWeightTwo = null;
        java.lang.String lunchVMLunchModelTxtWeight = null;
        java.lang.String lunchVMLunchModelTxtRecommended5Lt = null;
        java.lang.String lunchVMLunchModelTxtGroupFortyOneFour = null;
        java.lang.String lunchVMLunchModelTxtLunch = null;
        java.lang.String lunchVMLunchModelTxtFat = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (lunchVM != null) {
                    // read lunchVM.lunchModel
                    lunchVMLunchModel = lunchVM.getLunchModel();
                }
                updateLiveDataRegistration(0, lunchVMLunchModel);


                if (lunchVMLunchModel != null) {
                    // read lunchVM.lunchModel.getValue()
                    lunchVMLunchModelGetValue = lunchVMLunchModel.getValue();
                }


                if (lunchVMLunchModelGetValue != null) {
                    // read lunchVM.lunchModel.getValue().txtRecommended535
                    lunchVMLunchModelTxtRecommended535 = lunchVMLunchModelGetValue.getTxtRecommended535();
                    // read lunchVM.lunchModel.getValue().txtProtein
                    lunchVMLunchModelTxtProtein = lunchVMLunchModelGetValue.getTxtProtein();
                    // read lunchVM.lunchModel.getValue().txtBreakfast
                    lunchVMLunchModelTxtBreakfast = lunchVMLunchModelGetValue.getTxtBreakfast();
                    // read lunchVM.lunchModel.getValue().txtSeven
                    lunchVMLunchModelTxtSeven = lunchVMLunchModelGetValue.getTxtSeven();
                    // read lunchVM.lunchModel.getValue().txtDuration
                    lunchVMLunchModelTxtDuration = lunchVMLunchModelGetValue.getTxtDuration();
                    // read lunchVM.lunchModel.getValue().txtWater
                    lunchVMLunchModelTxtWater = lunchVMLunchModelGetValue.getTxtWater();
                    // read lunchVM.lunchModel.getValue().txtRecommended356
                    lunchVMLunchModelTxtRecommended356 = lunchVMLunchModelGetValue.getTxtRecommended356();
                    // read lunchVM.lunchModel.getValue().txtCarbs
                    lunchVMLunchModelTxtCarbs = lunchVMLunchModelGetValue.getTxtCarbs();
                    // read lunchVM.lunchModel.getValue().txtWeightOne
                    lunchVMLunchModelTxtWeightOne = lunchVMLunchModelGetValue.getTxtWeightOne();
                    // read lunchVM.lunchModel.getValue().txtGroupFortyOne
                    lunchVMLunchModelTxtGroupFortyOne = lunchVMLunchModelGetValue.getTxtGroupFortyOne();
                    // read lunchVM.lunchModel.getValue().txtWeightTwo
                    lunchVMLunchModelTxtWeightTwo = lunchVMLunchModelGetValue.getTxtWeightTwo();
                    // read lunchVM.lunchModel.getValue().txtWeight
                    lunchVMLunchModelTxtWeight = lunchVMLunchModelGetValue.getTxtWeight();
                    // read lunchVM.lunchModel.getValue().txtRecommended5Lt
                    lunchVMLunchModelTxtRecommended5Lt = lunchVMLunchModelGetValue.getTxtRecommended5Lt();
                    // read lunchVM.lunchModel.getValue().txtGroupFortyOneFour
                    lunchVMLunchModelTxtGroupFortyOneFour = lunchVMLunchModelGetValue.getTxtGroupFortyOneFour();
                    // read lunchVM.lunchModel.getValue().txtLunch
                    lunchVMLunchModelTxtLunch = lunchVMLunchModelGetValue.getTxtLunch();
                    // read lunchVM.lunchModel.getValue().txtFat
                    lunchVMLunchModelTxtFat = lunchVMLunchModelGetValue.getTxtFat();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBeigeIllustrat, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBeigeIllustrat.getContext(), R.drawable.img_beigeillustrat), (float)0f, (boolean)false);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageUntitleddesign, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageUntitleddesign.getContext(), R.drawable.img_untitleddesign_91x73), (float)0f, (boolean)false);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerLunch, recyclerLunch.getResources().getDimension(R.dimen._29pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBreakfast, lunchVMLunchModelTxtBreakfast);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCarbs, lunchVMLunchModelTxtCarbs);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDuration, lunchVMLunchModelTxtDuration);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFat, lunchVMLunchModelTxtFat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOne, lunchVMLunchModelTxtGroupFortyOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOneFour, lunchVMLunchModelTxtGroupFortyOneFour);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLunch, lunchVMLunchModelTxtLunch);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtProtein, lunchVMLunchModelTxtProtein);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended356, lunchVMLunchModelTxtRecommended356);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended535, lunchVMLunchModelTxtRecommended535);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended5Lt, lunchVMLunchModelTxtRecommended5Lt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSeven, lunchVMLunchModelTxtSeven);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWater, lunchVMLunchModelTxtWater);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeight, lunchVMLunchModelTxtWeight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeightOne, lunchVMLunchModelTxtWeightOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeightTwo, lunchVMLunchModelTxtWeightTwo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): lunchVM.lunchModel
        flag 1 (0x2L): lunchVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}