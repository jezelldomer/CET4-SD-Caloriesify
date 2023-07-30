package com.feedapp.app.databinding;
import com.feedapp.app.R;
import com.feedapp.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentHomeDownMenuBindingImpl extends FragmentHomeDownMenuBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fragment_home_nsv, 4);
        sViewsWithIds.put(R.id.fragment_home_down_main_container, 5);
        sViewsWithIds.put(R.id.fragment_home_arrow_layout, 6);
        sViewsWithIds.put(R.id.fragment_home_down_date_switcher, 7);
        sViewsWithIds.put(R.id.home_down_menu_viewpager, 8);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeDownMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentHomeDownMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[2]
            , (com.google.android.material.button.MaterialButton) bindings[1]
            , (android.widget.TextSwitcher) bindings[7]
            , (android.widget.RelativeLayout) bindings[5]
            , (androidx.core.widget.NestedScrollView) bindings[4]
            , (com.feedapp.app.ui.adapters.WrapContentHeightViewPager) bindings[8]
            );
        this.fragmentHomeDownArrowLeft.setTag(null);
        this.fragmentHomeDownArrowRight.setTag(null);
        this.fragmentHomeDownDateButton.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
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
                return onChangeViewmodelIsResettingDateOrSwiping((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelIsResettingDateOrSwiping(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelIsResettingDateOrSwiping, int fieldId) {
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
        java.lang.Boolean viewmodelIsResettingDateOrSwipingGetValue = null;
        boolean viewmodelIsResettingDateOrSwiping = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelIsResettingDateOrSwiping1 = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsResettingDateOrSwiping = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsResettingDateOrSwipingGetValue = false;
        com.feedapp.app.viewModels.HomeViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.isResettingDateOrSwiping()
                    ViewmodelIsResettingDateOrSwiping1 = viewmodel.isResettingDateOrSwiping();
                }
                updateLiveDataRegistration(0, ViewmodelIsResettingDateOrSwiping1);


                if (ViewmodelIsResettingDateOrSwiping1 != null) {
                    // read viewmodel.isResettingDateOrSwiping().getValue()
                    viewmodelIsResettingDateOrSwipingGetValue = ViewmodelIsResettingDateOrSwiping1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isResettingDateOrSwiping().getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewmodelIsResettingDateOrSwipingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsResettingDateOrSwipingGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isResettingDateOrSwiping().getValue())
                viewmodelIsResettingDateOrSwiping = !androidxDatabindingViewDataBindingSafeUnboxViewmodelIsResettingDateOrSwipingGetValue;


                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isResettingDateOrSwiping().getValue()))
                androidxDatabindingViewDataBindingSafeUnboxViewmodelIsResettingDateOrSwiping = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsResettingDateOrSwiping);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.fragmentHomeDownArrowLeft.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsResettingDateOrSwiping);
            this.fragmentHomeDownArrowRight.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsResettingDateOrSwiping);
            this.fragmentHomeDownDateButton.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsResettingDateOrSwiping);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.isResettingDateOrSwiping()
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}