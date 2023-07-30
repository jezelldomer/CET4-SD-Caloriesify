package com.feedapp.app.databinding;
import com.feedapp.app.R;
import com.feedapp.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentMyMealsBindingImpl extends FragmentMyMealsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fragment_products_title, 4);
        sViewsWithIds.put(R.id.fragment_my_meals_rv, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ProgressBar mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMyMealsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentMyMealsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        this.fragmentMyMeals100g.setTag(null);
        this.fragmentProductsNoText.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.ProgressBar) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.mealsVM == variableId) {
            setMealsVM((com.feedapp.app.viewModels.MyMealsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMealsVM(@Nullable com.feedapp.app.viewModels.MyMealsViewModel MealsVM) {
        this.mMealsVM = MealsVM;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.mealsVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMealsVMIsProgressBarVisible((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeMealsVMIsTextNoMealsVisible((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMealsVMIsProgressBarVisible(androidx.lifecycle.MutableLiveData<java.lang.Boolean> MealsVMIsProgressBarVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMealsVMIsTextNoMealsVisible(androidx.lifecycle.MutableLiveData<java.lang.Boolean> MealsVMIsTextNoMealsVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> mealsVMIsProgressBarVisible = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxMealsVMIsProgressBarVisibleGetValue = false;
        com.feedapp.app.viewModels.MyMealsViewModel mealsVM = mMealsVM;
        boolean mealsVMIsTextNoMealsVisibleMealsVMIsProgressBarVisibleBooleanFalse = false;
        boolean MealsVMIsProgressBarVisible1 = false;
        int mealsVMIsProgressBarVisibleViewVISIBLEViewGONE = 0;
        java.lang.Boolean mealsVMIsTextNoMealsVisibleGetValue = null;
        boolean mealsVMIsTextNoMealsVisible = false;
        java.lang.Boolean mealsVMIsProgressBarVisibleGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> MealsVMIsTextNoMealsVisible1 = null;
        int mealsVMIsTextNoMealsVisibleMealsVMIsProgressBarVisibleBooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxMealsVMIsTextNoMealsVisibleGetValue = false;
        int mealsVMIsTextNoMealsVisibleViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (mealsVM != null) {
                        // read mealsVM.isProgressBarVisible()
                        mealsVMIsProgressBarVisible = mealsVM.isProgressBarVisible();
                    }
                    updateLiveDataRegistration(0, mealsVMIsProgressBarVisible);


                    if (mealsVMIsProgressBarVisible != null) {
                        // read mealsVM.isProgressBarVisible().getValue()
                        mealsVMIsProgressBarVisibleGetValue = mealsVMIsProgressBarVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isProgressBarVisible().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxMealsVMIsProgressBarVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(mealsVMIsProgressBarVisibleGetValue);
                if((dirtyFlags & 0xdL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxMealsVMIsProgressBarVisibleGetValue) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isProgressBarVisible().getValue()) ? View.VISIBLE : View.GONE
                    mealsVMIsProgressBarVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxMealsVMIsProgressBarVisibleGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

                if (mealsVM != null) {
                    // read mealsVM.isTextNoMealsVisible()
                    MealsVMIsTextNoMealsVisible1 = mealsVM.isTextNoMealsVisible();
                }
                updateLiveDataRegistration(1, MealsVMIsTextNoMealsVisible1);


                if (MealsVMIsTextNoMealsVisible1 != null) {
                    // read mealsVM.isTextNoMealsVisible().getValue()
                    mealsVMIsTextNoMealsVisibleGetValue = MealsVMIsTextNoMealsVisible1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isTextNoMealsVisible().getValue())
                androidxDatabindingViewDataBindingSafeUnboxMealsVMIsTextNoMealsVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(mealsVMIsTextNoMealsVisibleGetValue);
            if((dirtyFlags & 0xeL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxMealsVMIsTextNoMealsVisibleGetValue) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isTextNoMealsVisible().getValue())
                mealsVMIsTextNoMealsVisible = !androidxDatabindingViewDataBindingSafeUnboxMealsVMIsTextNoMealsVisibleGetValue;
            if((dirtyFlags & 0xfL) != 0) {
                if(mealsVMIsTextNoMealsVisible) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isTextNoMealsVisible().getValue()) ? View.VISIBLE : View.GONE
                    mealsVMIsTextNoMealsVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxMealsVMIsTextNoMealsVisibleGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                if (mealsVM != null) {
                    // read mealsVM.isProgressBarVisible()
                    mealsVMIsProgressBarVisible = mealsVM.isProgressBarVisible();
                }
                updateLiveDataRegistration(0, mealsVMIsProgressBarVisible);


                if (mealsVMIsProgressBarVisible != null) {
                    // read mealsVM.isProgressBarVisible().getValue()
                    mealsVMIsProgressBarVisibleGetValue = mealsVMIsProgressBarVisible.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isProgressBarVisible().getValue())
                androidxDatabindingViewDataBindingSafeUnboxMealsVMIsProgressBarVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(mealsVMIsProgressBarVisibleGetValue);
            if((dirtyFlags & 0xdL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxMealsVMIsProgressBarVisibleGetValue) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isProgressBarVisible().getValue())
                MealsVMIsProgressBarVisible1 = !androidxDatabindingViewDataBindingSafeUnboxMealsVMIsProgressBarVisibleGetValue;
        }

        if ((dirtyFlags & 0xfL) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isTextNoMealsVisible().getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isProgressBarVisible().getValue()) : false
                mealsVMIsTextNoMealsVisibleMealsVMIsProgressBarVisibleBooleanFalse = ((mealsVMIsTextNoMealsVisible) ? (MealsVMIsProgressBarVisible1) : (false));
            if((dirtyFlags & 0xfL) != 0) {
                if(mealsVMIsTextNoMealsVisibleMealsVMIsProgressBarVisibleBooleanFalse) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isTextNoMealsVisible().getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isProgressBarVisible().getValue()) : false ? View.VISIBLE : View.GONE
                mealsVMIsTextNoMealsVisibleMealsVMIsProgressBarVisibleBooleanFalseViewVISIBLEViewGONE = ((mealsVMIsTextNoMealsVisibleMealsVMIsProgressBarVisibleBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            this.fragmentMyMeals100g.setVisibility(mealsVMIsTextNoMealsVisibleMealsVMIsProgressBarVisibleBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.fragmentProductsNoText.setVisibility(mealsVMIsTextNoMealsVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mboundView3.setVisibility(mealsVMIsProgressBarVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mealsVM.isProgressBarVisible()
        flag 1 (0x2L): mealsVM.isTextNoMealsVisible()
        flag 2 (0x3L): mealsVM
        flag 3 (0x4L): null
        flag 4 (0x5L): !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isTextNoMealsVisible().getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isProgressBarVisible().getValue()) : false
        flag 5 (0x6L): !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isTextNoMealsVisible().getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isProgressBarVisible().getValue()) : false
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isProgressBarVisible().getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isProgressBarVisible().getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isTextNoMealsVisible().getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isProgressBarVisible().getValue()) : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isTextNoMealsVisible().getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isProgressBarVisible().getValue()) : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isTextNoMealsVisible().getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(mealsVM.isTextNoMealsVisible().getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}