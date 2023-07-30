package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityHomeBindingImpl extends ActivityHomeBinding  {

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

    public ActivityHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private ActivityHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[28]
            , (android.widget.ImageButton) bindings[13]
            , (android.widget.FrameLayout) bindings[10]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.LinearLayout) bindings[24]
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
        this.recyclerHome.setTag(null);
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
        if (BR.homeVM == variableId) {
            setHomeVM((com.front_end.app.modules.home.data.viewmodel.HomeVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHomeVM(@Nullable com.front_end.app.modules.home.data.viewmodel.HomeVM HomeVM) {
        this.mHomeVM = HomeVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.homeVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHomeVMHomeModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.home.data.model.HomeModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHomeVMHomeModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.home.data.model.HomeModel> HomeVMHomeModel, int fieldId) {
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
        java.lang.String homeVMHomeModelTxtLetsstartwit = null;
        java.lang.String homeVMHomeModelTxtDiet = null;
        com.front_end.app.modules.home.data.model.HomeModel homeVMHomeModelGetValue = null;
        java.lang.String homeVMHomeModelTxtCreateyourCus = null;
        java.lang.String homeVMHomeModelTxtBMI = null;
        com.front_end.app.modules.home.data.viewmodel.HomeVM homeVM = mHomeVM;
        java.lang.String homeVMHomeModelTxtJournal = null;
        java.lang.String homeVMHomeModelTxtWorkout = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.home.data.model.HomeModel> homeVMHomeModel = null;
        java.lang.String homeVMHomeModelTxtGoodMorningUS = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (homeVM != null) {
                    // read homeVM.homeModel
                    homeVMHomeModel = homeVM.getHomeModel();
                }
                updateLiveDataRegistration(0, homeVMHomeModel);


                if (homeVMHomeModel != null) {
                    // read homeVM.homeModel.getValue()
                    homeVMHomeModelGetValue = homeVMHomeModel.getValue();
                }


                if (homeVMHomeModelGetValue != null) {
                    // read homeVM.homeModel.getValue().txtLetsstartwit
                    homeVMHomeModelTxtLetsstartwit = homeVMHomeModelGetValue.getTxtLetsstartwit();
                    // read homeVM.homeModel.getValue().txtDiet
                    homeVMHomeModelTxtDiet = homeVMHomeModelGetValue.getTxtDiet();
                    // read homeVM.homeModel.getValue().txtCreateyourCus
                    homeVMHomeModelTxtCreateyourCus = homeVMHomeModelGetValue.getTxtCreateyourCus();
                    // read homeVM.homeModel.getValue().txtBMI
                    homeVMHomeModelTxtBMI = homeVMHomeModelGetValue.getTxtBMI();
                    // read homeVM.homeModel.getValue().txtJournal
                    homeVMHomeModelTxtJournal = homeVMHomeModelGetValue.getTxtJournal();
                    // read homeVM.homeModel.getValue().txtWorkout
                    homeVMHomeModelTxtWorkout = homeVMHomeModelGetValue.getTxtWorkout();
                    // read homeVM.homeModel.getValue().txtGoodMorningUS
                    homeVMHomeModelTxtGoodMorningUS = homeVMHomeModelGetValue.getTxtGoodMorningUS();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerHome, recyclerHome.getResources().getDimension(R.dimen._31pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBMI, homeVMHomeModelTxtBMI);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCreateyourCus, homeVMHomeModelTxtCreateyourCus);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDiet, homeVMHomeModelTxtDiet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGoodMorningUS, homeVMHomeModelTxtGoodMorningUS);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtJournal, homeVMHomeModelTxtJournal);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLetsstartwit, homeVMHomeModelTxtLetsstartwit);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWorkout, homeVMHomeModelTxtWorkout);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): homeVM.homeModel
        flag 1 (0x2L): homeVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}