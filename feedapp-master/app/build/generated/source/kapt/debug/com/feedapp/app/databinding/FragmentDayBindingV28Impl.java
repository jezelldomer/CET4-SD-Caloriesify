package com.feedapp.app.databinding;
import com.feedapp.app.R;
import com.feedapp.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentDayBindingV28Impl extends FragmentDayBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.waterContainer, 3);
        sViewsWithIds.put(R.id.cardview_lottie, 4);
        sViewsWithIds.put(R.id.fragment_day_recycler, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDayBindingV28Impl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentDayBindingV28Impl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.view.View) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.waterTextAmount.setTag(null);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((com.feedapp.app.viewModels.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.feedapp.app.viewModels.HomeViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelCurrentDay((androidx.lifecycle.LiveData<com.feedapp.app.data.models.day.Day>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelCurrentDay(androidx.lifecycle.LiveData<com.feedapp.app.data.models.day.Day> ViewmodelCurrentDay, int fieldId) {
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
        androidx.lifecycle.LiveData<com.feedapp.app.data.models.day.Day> viewmodelCurrentDay = null;
        com.feedapp.app.data.models.day.Day viewmodelCurrentDayGetValue = null;
        com.feedapp.app.viewModels.HomeViewModel viewmodel = mViewmodel;
        int viewmodelCurrentDayWaterNum = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.currentDay
                    viewmodelCurrentDay = viewmodel.getCurrentDay();
                }
                updateLiveDataRegistration(0, viewmodelCurrentDay);


                if (viewmodelCurrentDay != null) {
                    // read viewmodel.currentDay.getValue()
                    viewmodelCurrentDayGetValue = viewmodelCurrentDay.getValue();
                }


                if (viewmodelCurrentDayGetValue != null) {
                    // read viewmodel.currentDay.getValue().waterNum
                    viewmodelCurrentDayWaterNum = viewmodelCurrentDayGetValue.getWaterNum();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.feedapp.app.util.BindingAdapters.water(this.waterTextAmount, viewmodelCurrentDayWaterNum);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.currentDay
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}