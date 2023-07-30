package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMacrosBindingImpl extends ActivityMacrosBinding  {

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
        sViewsWithIds.put(R.id.imageVolume, 19);
        sViewsWithIds.put(R.id.linearRowfire, 20);
        sViewsWithIds.put(R.id.linearColumnfire, 21);
        sViewsWithIds.put(R.id.imageFire, 22);
        sViewsWithIds.put(R.id.linearColumnfavorite, 23);
        sViewsWithIds.put(R.id.imageFavorite, 24);
        sViewsWithIds.put(R.id.linearColumnairplane, 25);
        sViewsWithIds.put(R.id.btnCheckmark, 26);
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

    public ActivityMacrosBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private ActivityMacrosBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[26]
            , (androidx.appcompat.widget.AppCompatButton) bindings[28]
            , (android.widget.ImageButton) bindings[12]
            , (android.widget.FrameLayout) bindings[9]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.FrameLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[20]
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
        if (BR.macrosVM == variableId) {
            setMacrosVM((com.front_end.app.modules.macros.data.viewmodel.MacrosVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMacrosVM(@Nullable com.front_end.app.modules.macros.data.viewmodel.MacrosVM MacrosVM) {
        this.mMacrosVM = MacrosVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.macrosVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMacrosVMMacrosModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.macros.data.model.MacrosModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMacrosVMMacrosModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.macros.data.model.MacrosModel> MacrosVMMacrosModel, int fieldId) {
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
        java.lang.String macrosVMMacrosModelTxtBMI = null;
        java.lang.String macrosVMMacrosModelTxtLetsstartwit = null;
        com.front_end.app.modules.macros.data.model.MacrosModel macrosVMMacrosModelGetValue = null;
        java.lang.String macrosVMMacrosModelTxtJournal = null;
        java.lang.String macrosVMMacrosModelTxtGoodMorningUS = null;
        com.front_end.app.modules.macros.data.viewmodel.MacrosVM macrosVM = mMacrosVM;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.macros.data.model.MacrosModel> macrosVMMacrosModel = null;
        java.lang.String macrosVMMacrosModelTxtCreateyourCus = null;
        java.lang.String macrosVMMacrosModelTxtWorkout = null;
        java.lang.String macrosVMMacrosModelTxtDiet = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (macrosVM != null) {
                    // read macrosVM.macrosModel
                    macrosVMMacrosModel = macrosVM.getMacrosModel();
                }
                updateLiveDataRegistration(0, macrosVMMacrosModel);


                if (macrosVMMacrosModel != null) {
                    // read macrosVM.macrosModel.getValue()
                    macrosVMMacrosModelGetValue = macrosVMMacrosModel.getValue();
                }


                if (macrosVMMacrosModelGetValue != null) {
                    // read macrosVM.macrosModel.getValue().txtBMI
                    macrosVMMacrosModelTxtBMI = macrosVMMacrosModelGetValue.getTxtBMI();
                    // read macrosVM.macrosModel.getValue().txtLetsstartwit
                    macrosVMMacrosModelTxtLetsstartwit = macrosVMMacrosModelGetValue.getTxtLetsstartwit();
                    // read macrosVM.macrosModel.getValue().txtJournal
                    macrosVMMacrosModelTxtJournal = macrosVMMacrosModelGetValue.getTxtJournal();
                    // read macrosVM.macrosModel.getValue().txtGoodMorningUS
                    macrosVMMacrosModelTxtGoodMorningUS = macrosVMMacrosModelGetValue.getTxtGoodMorningUS();
                    // read macrosVM.macrosModel.getValue().txtCreateyourCus
                    macrosVMMacrosModelTxtCreateyourCus = macrosVMMacrosModelGetValue.getTxtCreateyourCus();
                    // read macrosVM.macrosModel.getValue().txtWorkout
                    macrosVMMacrosModelTxtWorkout = macrosVMMacrosModelGetValue.getTxtWorkout();
                    // read macrosVM.macrosModel.getValue().txtDiet
                    macrosVMMacrosModelTxtDiet = macrosVMMacrosModelGetValue.getTxtDiet();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBMI, macrosVMMacrosModelTxtBMI);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCreateyourCus, macrosVMMacrosModelTxtCreateyourCus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDiet, macrosVMMacrosModelTxtDiet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGoodMorningUS, macrosVMMacrosModelTxtGoodMorningUS);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtJournal, macrosVMMacrosModelTxtJournal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLetsstartwit, macrosVMMacrosModelTxtLetsstartwit);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWorkout, macrosVMMacrosModelTxtWorkout);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): macrosVM.macrosModel
        flag 1 (0x2L): macrosVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}