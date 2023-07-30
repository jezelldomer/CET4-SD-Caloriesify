package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityBmiBindingImpl extends ActivityBmiBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnrectangletwentyfive, 9);
        sViewsWithIds.put(R.id.frameStackrectangletwentyfive, 10);
        sViewsWithIds.put(R.id.imageRectangleTwentyFive, 11);
        sViewsWithIds.put(R.id.linearColumnuser, 12);
        sViewsWithIds.put(R.id.btnUser, 13);
        sViewsWithIds.put(R.id.linearColumngoodmorningus, 14);
        sViewsWithIds.put(R.id.linearRowvector, 15);
        sViewsWithIds.put(R.id.linearColumn, 16);
        sViewsWithIds.put(R.id.linearColumnvector, 17);
        sViewsWithIds.put(R.id.imageVector, 18);
        sViewsWithIds.put(R.id.linearColumnvolume, 19);
        sViewsWithIds.put(R.id.imageVolume, 20);
        sViewsWithIds.put(R.id.linearRowfire, 21);
        sViewsWithIds.put(R.id.linearColumnfire, 22);
        sViewsWithIds.put(R.id.imageFire, 23);
        sViewsWithIds.put(R.id.linearColumnfavorite, 24);
        sViewsWithIds.put(R.id.btnCheckmark, 25);
        sViewsWithIds.put(R.id.imageFavorite, 26);
        sViewsWithIds.put(R.id.linearColumnairplane, 27);
        sViewsWithIds.put(R.id.imageAirplane, 28);
        sViewsWithIds.put(R.id.btnProceed, 29);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityBmiBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 30, sIncludes, sViewsWithIds));
    }
    private ActivityBmiBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[25]
            , (androidx.appcompat.widget.AppCompatButton) bindings[29]
            , (android.widget.ImageButton) bindings[13]
            , (android.widget.FrameLayout) bindings[10]
            , (android.widget.ImageView) bindings[28]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[27]
            , (android.widget.FrameLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerBmi.setTag(null);
        this.txtBMI.setTag(null);
        this.txtCreateyourCus.setTag(null);
        this.txtDiet.setTag(null);
        this.txtGoodMorningUS.setTag(null);
        this.txtJournal.setTag(null);
        this.txtLetsstartwit.setTag(null);
        this.txtWorkout.setTag(null);
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
        if (BR.bmiVM == variableId) {
            setBmiVM((com.front_end.app.modules.bmi.data.viewmodel.BmiVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setBmiVM(@Nullable com.front_end.app.modules.bmi.data.viewmodel.BmiVM BmiVM) {
        this.mBmiVM = BmiVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.bmiVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBmiVMBmiModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.bmi.data.model.BmiModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBmiVMBmiModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.bmi.data.model.BmiModel> BmiVMBmiModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.bmi.data.model.BmiModel> bmiVMBmiModel = null;
        java.lang.String bmiVMBmiModelTxtGoodMorningUS = null;
        java.lang.String bmiVMBmiModelTxtCreateyourCus = null;
        java.lang.String bmiVMBmiModelTxtLetsstartwit = null;
        java.lang.String bmiVMBmiModelTxtWorkout = null;
        com.front_end.app.modules.bmi.data.model.BmiModel bmiVMBmiModelGetValue = null;
        java.lang.String bmiVMBmiModelTxtJournal = null;
        com.front_end.app.modules.bmi.data.viewmodel.BmiVM bmiVM = mBmiVM;
        java.lang.String bmiVMBmiModelTxtDiet = null;
        java.lang.String bmiVMBmiModelTxtBMI = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (bmiVM != null) {
                    // read bmiVM.bmiModel
                    bmiVMBmiModel = bmiVM.getBmiModel();
                }
                updateLiveDataRegistration(0, bmiVMBmiModel);


                if (bmiVMBmiModel != null) {
                    // read bmiVM.bmiModel.getValue()
                    bmiVMBmiModelGetValue = bmiVMBmiModel.getValue();
                }


                if (bmiVMBmiModelGetValue != null) {
                    // read bmiVM.bmiModel.getValue().txtGoodMorningUS
                    bmiVMBmiModelTxtGoodMorningUS = bmiVMBmiModelGetValue.getTxtGoodMorningUS();
                    // read bmiVM.bmiModel.getValue().txtCreateyourCus
                    bmiVMBmiModelTxtCreateyourCus = bmiVMBmiModelGetValue.getTxtCreateyourCus();
                    // read bmiVM.bmiModel.getValue().txtLetsstartwit
                    bmiVMBmiModelTxtLetsstartwit = bmiVMBmiModelGetValue.getTxtLetsstartwit();
                    // read bmiVM.bmiModel.getValue().txtWorkout
                    bmiVMBmiModelTxtWorkout = bmiVMBmiModelGetValue.getTxtWorkout();
                    // read bmiVM.bmiModel.getValue().txtJournal
                    bmiVMBmiModelTxtJournal = bmiVMBmiModelGetValue.getTxtJournal();
                    // read bmiVM.bmiModel.getValue().txtDiet
                    bmiVMBmiModelTxtDiet = bmiVMBmiModelGetValue.getTxtDiet();
                    // read bmiVM.bmiModel.getValue().txtBMI
                    bmiVMBmiModelTxtBMI = bmiVMBmiModelGetValue.getTxtBMI();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerBmi, recyclerBmi.getResources().getDimension(R.dimen._22pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBMI, bmiVMBmiModelTxtBMI);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCreateyourCus, bmiVMBmiModelTxtCreateyourCus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDiet, bmiVMBmiModelTxtDiet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGoodMorningUS, bmiVMBmiModelTxtGoodMorningUS);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtJournal, bmiVMBmiModelTxtJournal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLetsstartwit, bmiVMBmiModelTxtLetsstartwit);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWorkout, bmiVMBmiModelTxtWorkout);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bmiVM.bmiModel
        flag 1 (0x2L): bmiVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}