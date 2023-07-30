package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDietBindingImpl extends ActivityDietBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnrectangletwentyfive, 8);
        sViewsWithIds.put(R.id.frameStackrectangletwentyfive, 9);
        sViewsWithIds.put(R.id.imageRectangleTwentyFive, 10);
        sViewsWithIds.put(R.id.linearColumnuser, 11);
        sViewsWithIds.put(R.id.btnUser, 12);
        sViewsWithIds.put(R.id.linearColumngoodmorningus, 13);
        sViewsWithIds.put(R.id.linearRowvector, 14);
        sViewsWithIds.put(R.id.linearColumn, 15);
        sViewsWithIds.put(R.id.linearColumnvector, 16);
        sViewsWithIds.put(R.id.imageVector, 17);
        sViewsWithIds.put(R.id.linearColumnvolume, 18);
        sViewsWithIds.put(R.id.btnCheckmark, 19);
        sViewsWithIds.put(R.id.imageVolume, 20);
        sViewsWithIds.put(R.id.linearRowfire, 21);
        sViewsWithIds.put(R.id.linearColumnfire, 22);
        sViewsWithIds.put(R.id.imageFire, 23);
        sViewsWithIds.put(R.id.linearColumnfavorite, 24);
        sViewsWithIds.put(R.id.imageFavorite, 25);
        sViewsWithIds.put(R.id.linearColumnairplane, 26);
        sViewsWithIds.put(R.id.imageAirplane, 27);
        sViewsWithIds.put(R.id.btnProceed, 28);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDietBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private ActivityDietBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[19]
            , (androidx.appcompat.widget.AppCompatButton) bindings[28]
            , (android.widget.ImageButton) bindings[12]
            , (android.widget.FrameLayout) bindings[9]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.FrameLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.dietVM == variableId) {
            setDietVM((com.front_end.app.modules.diet.data.viewmodel.DietVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDietVM(@Nullable com.front_end.app.modules.diet.data.viewmodel.DietVM DietVM) {
        this.mDietVM = DietVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.dietVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDietVMDietModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.diet.data.model.DietModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDietVMDietModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.diet.data.model.DietModel> DietVMDietModel, int fieldId) {
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
        java.lang.String dietVMDietModelTxtBMI = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.diet.data.model.DietModel> dietVMDietModel = null;
        com.front_end.app.modules.diet.data.model.DietModel dietVMDietModelGetValue = null;
        java.lang.String dietVMDietModelTxtCreateyourCus = null;
        java.lang.String dietVMDietModelTxtWorkout = null;
        java.lang.String dietVMDietModelTxtJournal = null;
        java.lang.String dietVMDietModelTxtLetsstartwit = null;
        java.lang.String dietVMDietModelTxtDiet = null;
        java.lang.String dietVMDietModelTxtGoodMorningUS = null;
        com.front_end.app.modules.diet.data.viewmodel.DietVM dietVM = mDietVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (dietVM != null) {
                    // read dietVM.dietModel
                    dietVMDietModel = dietVM.getDietModel();
                }
                updateLiveDataRegistration(0, dietVMDietModel);


                if (dietVMDietModel != null) {
                    // read dietVM.dietModel.getValue()
                    dietVMDietModelGetValue = dietVMDietModel.getValue();
                }


                if (dietVMDietModelGetValue != null) {
                    // read dietVM.dietModel.getValue().txtBMI
                    dietVMDietModelTxtBMI = dietVMDietModelGetValue.getTxtBMI();
                    // read dietVM.dietModel.getValue().txtCreateyourCus
                    dietVMDietModelTxtCreateyourCus = dietVMDietModelGetValue.getTxtCreateyourCus();
                    // read dietVM.dietModel.getValue().txtWorkout
                    dietVMDietModelTxtWorkout = dietVMDietModelGetValue.getTxtWorkout();
                    // read dietVM.dietModel.getValue().txtJournal
                    dietVMDietModelTxtJournal = dietVMDietModelGetValue.getTxtJournal();
                    // read dietVM.dietModel.getValue().txtLetsstartwit
                    dietVMDietModelTxtLetsstartwit = dietVMDietModelGetValue.getTxtLetsstartwit();
                    // read dietVM.dietModel.getValue().txtDiet
                    dietVMDietModelTxtDiet = dietVMDietModelGetValue.getTxtDiet();
                    // read dietVM.dietModel.getValue().txtGoodMorningUS
                    dietVMDietModelTxtGoodMorningUS = dietVMDietModelGetValue.getTxtGoodMorningUS();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBMI, dietVMDietModelTxtBMI);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCreateyourCus, dietVMDietModelTxtCreateyourCus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDiet, dietVMDietModelTxtDiet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGoodMorningUS, dietVMDietModelTxtGoodMorningUS);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtJournal, dietVMDietModelTxtJournal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLetsstartwit, dietVMDietModelTxtLetsstartwit);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWorkout, dietVMDietModelTxtWorkout);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dietVM.dietModel
        flag 1 (0x2L): dietVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}