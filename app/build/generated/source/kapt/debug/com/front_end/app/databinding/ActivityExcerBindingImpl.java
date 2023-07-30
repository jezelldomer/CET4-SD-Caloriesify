package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityExcerBindingImpl extends ActivityExcerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollViewScrollview, 21);
        sViewsWithIds.put(R.id.linearExcer, 22);
        sViewsWithIds.put(R.id.linearColumnarrowfive, 23);
        sViewsWithIds.put(R.id.frameStackarrowfive, 24);
        sViewsWithIds.put(R.id.imageArrowFive, 25);
        sViewsWithIds.put(R.id.linearColumncarbs, 26);
        sViewsWithIds.put(R.id.linearRowcarbs, 27);
        sViewsWithIds.put(R.id.linearRowweight, 28);
        sViewsWithIds.put(R.id.linearRowarrowone, 29);
        sViewsWithIds.put(R.id.linearRowarrowtwo, 30);
        sViewsWithIds.put(R.id.imageArrowTwo, 31);
        sViewsWithIds.put(R.id.imageCalendar, 32);
        sViewsWithIds.put(R.id.imageArrowOne, 33);
        sViewsWithIds.put(R.id.frameStackgroupfortyone, 34);
        sViewsWithIds.put(R.id.linearColumngroupfortyone, 35);
        sViewsWithIds.put(R.id.frameStackexercise, 36);
        sViewsWithIds.put(R.id.linearRowexercise, 37);
        sViewsWithIds.put(R.id.linearColumnexercise, 38);
        sViewsWithIds.put(R.id.linearColumnlanguage, 39);
        sViewsWithIds.put(R.id.btnAddItems, 40);
        sViewsWithIds.put(R.id.frameStackellipseten, 41);
        sViewsWithIds.put(R.id.viewEllipseTen, 42);
        sViewsWithIds.put(R.id.frameStackwater, 43);
        sViewsWithIds.put(R.id.linearRowwater, 44);
        sViewsWithIds.put(R.id.linearColumnwater, 45);
        sViewsWithIds.put(R.id.imageUntitleddesignFour, 46);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityExcerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 47, sIncludes, sViewsWithIds));
    }
    private ActivityExcerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[40]
            , (android.widget.FrameLayout) bindings[24]
            , (android.widget.FrameLayout) bindings[41]
            , (android.widget.FrameLayout) bindings[36]
            , (android.widget.FrameLayout) bindings[34]
            , (android.widget.FrameLayout) bindings[43]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[33]
            , (android.widget.ImageView) bindings[31]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.ImageView) bindings[46]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[38]
            , (android.widget.LinearLayout) bindings[35]
            , (android.widget.LinearLayout) bindings[39]
            , (android.widget.LinearLayout) bindings[45]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[29]
            , (android.widget.LinearLayout) bindings[30]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.LinearLayout) bindings[44]
            , (android.widget.LinearLayout) bindings[28]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (androidx.core.widget.NestedScrollView) bindings[21]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[42]
            );
        this.imageBeigeIllustrat.setTag(null);
        this.imageUntitleddesignThree.setTag(null);
        this.linearColumnarrowtwo.setTag(null);
        this.recyclerExcer.setTag(null);
        this.txtBreakfast.setTag(null);
        this.txtCarbs.setTag(null);
        this.txtDuration.setTag(null);
        this.txtExercise.setTag(null);
        this.txtFat.setTag(null);
        this.txtGroupFortyOne.setTag(null);
        this.txtGroupFortyOneFour.setTag(null);
        this.txtLanguage.setTag(null);
        this.txtNine.setTag(null);
        this.txtProtein.setTag(null);
        this.txtRecommended356.setTag(null);
        this.txtRecommended5Lt.setTag(null);
        this.txtTime.setTag(null);
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
        if (BR.excerVM == variableId) {
            setExcerVM((com.front_end.app.modules.excer.data.viewmodel.ExcerVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setExcerVM(@Nullable com.front_end.app.modules.excer.data.viewmodel.ExcerVM ExcerVM) {
        this.mExcerVM = ExcerVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.excerVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeExcerVMExcerModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.excer.data.model.ExcerModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeExcerVMExcerModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.excer.data.model.ExcerModel> ExcerVMExcerModel, int fieldId) {
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
        java.lang.String excerVMExcerModelTxtDuration = null;
        java.lang.String excerVMExcerModelTxtWeightOne = null;
        java.lang.String excerVMExcerModelTxtProtein = null;
        com.front_end.app.modules.excer.data.model.ExcerModel excerVMExcerModelGetValue = null;
        java.lang.String excerVMExcerModelTxtFat = null;
        java.lang.String excerVMExcerModelTxtExercise = null;
        java.lang.String excerVMExcerModelTxtRecommended5Lt = null;
        com.front_end.app.modules.excer.data.viewmodel.ExcerVM excerVM = mExcerVM;
        java.lang.String excerVMExcerModelTxtRecommended356 = null;
        java.lang.String excerVMExcerModelTxtTime = null;
        java.lang.String excerVMExcerModelTxtGroupFortyOneFour = null;
        java.lang.String excerVMExcerModelTxtLanguage = null;
        java.lang.String excerVMExcerModelTxtNine = null;
        java.lang.String excerVMExcerModelTxtWater = null;
        java.lang.String excerVMExcerModelTxtWeight = null;
        java.lang.String excerVMExcerModelTxtCarbs = null;
        java.lang.String excerVMExcerModelTxtBreakfast = null;
        java.lang.String excerVMExcerModelTxtGroupFortyOne = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.excer.data.model.ExcerModel> excerVMExcerModel = null;
        java.lang.String excerVMExcerModelTxtWeightTwo = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (excerVM != null) {
                    // read excerVM.excerModel
                    excerVMExcerModel = excerVM.getExcerModel();
                }
                updateLiveDataRegistration(0, excerVMExcerModel);


                if (excerVMExcerModel != null) {
                    // read excerVM.excerModel.getValue()
                    excerVMExcerModelGetValue = excerVMExcerModel.getValue();
                }


                if (excerVMExcerModelGetValue != null) {
                    // read excerVM.excerModel.getValue().txtDuration
                    excerVMExcerModelTxtDuration = excerVMExcerModelGetValue.getTxtDuration();
                    // read excerVM.excerModel.getValue().txtWeightOne
                    excerVMExcerModelTxtWeightOne = excerVMExcerModelGetValue.getTxtWeightOne();
                    // read excerVM.excerModel.getValue().txtProtein
                    excerVMExcerModelTxtProtein = excerVMExcerModelGetValue.getTxtProtein();
                    // read excerVM.excerModel.getValue().txtFat
                    excerVMExcerModelTxtFat = excerVMExcerModelGetValue.getTxtFat();
                    // read excerVM.excerModel.getValue().txtExercise
                    excerVMExcerModelTxtExercise = excerVMExcerModelGetValue.getTxtExercise();
                    // read excerVM.excerModel.getValue().txtRecommended5Lt
                    excerVMExcerModelTxtRecommended5Lt = excerVMExcerModelGetValue.getTxtRecommended5Lt();
                    // read excerVM.excerModel.getValue().txtRecommended356
                    excerVMExcerModelTxtRecommended356 = excerVMExcerModelGetValue.getTxtRecommended356();
                    // read excerVM.excerModel.getValue().txtTime
                    excerVMExcerModelTxtTime = excerVMExcerModelGetValue.getTxtTime();
                    // read excerVM.excerModel.getValue().txtGroupFortyOneFour
                    excerVMExcerModelTxtGroupFortyOneFour = excerVMExcerModelGetValue.getTxtGroupFortyOneFour();
                    // read excerVM.excerModel.getValue().txtLanguage
                    excerVMExcerModelTxtLanguage = excerVMExcerModelGetValue.getTxtLanguage();
                    // read excerVM.excerModel.getValue().txtNine
                    excerVMExcerModelTxtNine = excerVMExcerModelGetValue.getTxtNine();
                    // read excerVM.excerModel.getValue().txtWater
                    excerVMExcerModelTxtWater = excerVMExcerModelGetValue.getTxtWater();
                    // read excerVM.excerModel.getValue().txtWeight
                    excerVMExcerModelTxtWeight = excerVMExcerModelGetValue.getTxtWeight();
                    // read excerVM.excerModel.getValue().txtCarbs
                    excerVMExcerModelTxtCarbs = excerVMExcerModelGetValue.getTxtCarbs();
                    // read excerVM.excerModel.getValue().txtBreakfast
                    excerVMExcerModelTxtBreakfast = excerVMExcerModelGetValue.getTxtBreakfast();
                    // read excerVM.excerModel.getValue().txtGroupFortyOne
                    excerVMExcerModelTxtGroupFortyOne = excerVMExcerModelGetValue.getTxtGroupFortyOne();
                    // read excerVM.excerModel.getValue().txtWeightTwo
                    excerVMExcerModelTxtWeightTwo = excerVMExcerModelGetValue.getTxtWeightTwo();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBeigeIllustrat, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBeigeIllustrat.getContext(), R.drawable.img_beigeillustrat), (float)0f, (boolean)false);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageUntitleddesignThree, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageUntitleddesignThree.getContext(), R.drawable.img_untitleddesign_78x83), (float)0f, (boolean)false);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerExcer, recyclerExcer.getResources().getDimension(R.dimen._24pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBreakfast, excerVMExcerModelTxtBreakfast);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCarbs, excerVMExcerModelTxtCarbs);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDuration, excerVMExcerModelTxtDuration);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtExercise, excerVMExcerModelTxtExercise);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFat, excerVMExcerModelTxtFat);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOne, excerVMExcerModelTxtGroupFortyOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOneFour, excerVMExcerModelTxtGroupFortyOneFour);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLanguage, excerVMExcerModelTxtLanguage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNine, excerVMExcerModelTxtNine);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtProtein, excerVMExcerModelTxtProtein);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended356, excerVMExcerModelTxtRecommended356);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended5Lt, excerVMExcerModelTxtRecommended5Lt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTime, excerVMExcerModelTxtTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWater, excerVMExcerModelTxtWater);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeight, excerVMExcerModelTxtWeight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeightOne, excerVMExcerModelTxtWeightOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeightTwo, excerVMExcerModelTxtWeightTwo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): excerVM.excerModel
        flag 1 (0x2L): excerVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}