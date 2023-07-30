package com.feedapp.app.databinding;
import com.feedapp.app.R;
import com.feedapp.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivitySearchBindingImpl extends ActivitySearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.activity_search_appbar, 7);
        sViewsWithIds.put(R.id.activity_search_searchBar, 8);
        sViewsWithIds.put(R.id.activity_search_text_choose_ll, 9);
        sViewsWithIds.put(R.id.activity_search_text_create_ll, 10);
        sViewsWithIds.put(R.id.activity_search_text_create, 11);
        sViewsWithIds.put(R.id.activity_search_text_recent, 12);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivitySearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.google.android.material.appbar.AppBarLayout) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ProgressBar) bindings[6]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.RelativeLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (com.mancj.materialsearchbar.MaterialSearchBar) bindings[8]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.TextView) bindings[12]
            );
        this.activitySearchNotFound.setTag(null);
        this.activitySearchPb.setTag(null);
        this.activitySearchRl.setTag(null);
        this.activitySearchRlRecent.setTag(null);
        this.activitySearchRv.setTag(null);
        this.activitySearchRvRecent.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewmodel((com.feedapp.app.viewModels.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.feedapp.app.viewModels.SearchViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelHasSearched((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewmodelRecentProducts((androidx.lifecycle.LiveData<java.util.List<com.feedapp.app.data.models.RecentProduct>>) object, fieldId);
            case 2 :
                return onChangeViewmodelMeals((androidx.lifecycle.MediatorLiveData<java.util.List<com.feedapp.app.data.models.localdb.IProduct>>) object, fieldId);
            case 3 :
                return onChangeViewmodelIsSearching((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelHasSearched(androidx.lifecycle.LiveData<java.lang.Boolean> ViewmodelHasSearched, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelRecentProducts(androidx.lifecycle.LiveData<java.util.List<com.feedapp.app.data.models.RecentProduct>> ViewmodelRecentProducts, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelMeals(androidx.lifecycle.MediatorLiveData<java.util.List<com.feedapp.app.data.models.localdb.IProduct>> ViewmodelMeals, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelIsSearching(androidx.lifecycle.LiveData<java.lang.Boolean> ViewmodelIsSearching, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSearchingGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewmodelHasSearched = null;
        int viewmodelHasSearchedViewGONEViewVISIBLE = 0;
        int viewmodelIsSearchingViewVISIBLEViewINVISIBLE = 0;
        java.lang.Boolean viewmodelIsSearchingGetValue = null;
        int viewmodelHasSearchedViewOVERSCROLLNEVERViewOVERSCROLLALWAYS = 0;
        java.util.List<com.feedapp.app.data.models.RecentProduct> viewmodelRecentProductsGetValue = null;
        boolean viewmodelHasSearchedViewmodelMealsEmptyBooleanFalse = false;
        int viewmodelHasSearchedViewmodelMealsEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewmodelRecentProductsEmpty = false;
        boolean viewmodelMealsEmpty = false;
        int viewmodelHasSearchedViewOVERSCROLLALWAYSViewOVERSCROLLNEVER = 0;
        java.util.List<com.feedapp.app.data.models.localdb.IProduct> viewmodelMealsGetValue = null;
        boolean viewmodelRecentProductsEmptyViewmodelHasSearchedBooleanFalse = false;
        androidx.lifecycle.LiveData<java.util.List<com.feedapp.app.data.models.RecentProduct>> viewmodelRecentProducts = null;
        androidx.lifecycle.MediatorLiveData<java.util.List<com.feedapp.app.data.models.localdb.IProduct>> viewmodelMeals = null;
        boolean ViewmodelRecentProductsEmpty1 = false;
        boolean ViewmodelHasSearched1 = false;
        boolean viewmodelRecentProductsEmptyViewmodelHasSearchedBooleanFalseViewmodelRecentProductsEmptyBooleanFalse = false;
        java.lang.Boolean viewmodelHasSearchedGetValue = null;
        int viewmodelHasSearchedViewVISIBLEViewGONE = 0;
        int viewmodelRecentProductsEmptyViewmodelHasSearchedBooleanFalseViewmodelRecentProductsEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewmodelIsSearching = null;
        com.feedapp.app.viewModels.SearchViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x35L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.hasSearched
                        viewmodelHasSearched = viewmodel.getHasSearched();
                    }
                    updateLiveDataRegistration(0, viewmodelHasSearched);


                    if (viewmodelHasSearched != null) {
                        // read viewmodel.hasSearched.getValue()
                        viewmodelHasSearchedGetValue = viewmodelHasSearched.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelHasSearchedGetValue);
                if((dirtyFlags & 0x31L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x400000L;
                    }
                }
                if((dirtyFlags & 0x35L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }

                if ((dirtyFlags & 0x31L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? View.GONE : View.VISIBLE
                        viewmodelHasSearchedViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? View.OVER_SCROLL_NEVER : View.OVER_SCROLL_ALWAYS
                        viewmodelHasSearchedViewOVERSCROLLNEVERViewOVERSCROLLALWAYS = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue) ? (android.view.View.OVER_SCROLL_NEVER) : (android.view.View.OVER_SCROLL_ALWAYS));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? View.OVER_SCROLL_ALWAYS : View.OVER_SCROLL_NEVER
                        viewmodelHasSearchedViewOVERSCROLLALWAYSViewOVERSCROLLNEVER = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue) ? (android.view.View.OVER_SCROLL_ALWAYS) : (android.view.View.OVER_SCROLL_NEVER));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? View.VISIBLE : View.GONE
                        viewmodelHasSearchedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x33L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.recentProducts
                        viewmodelRecentProducts = viewmodel.getRecentProducts();
                    }
                    updateLiveDataRegistration(1, viewmodelRecentProducts);


                    if (viewmodelRecentProducts != null) {
                        // read viewmodel.recentProducts.getValue()
                        viewmodelRecentProductsGetValue = viewmodelRecentProducts.getValue();
                    }


                    if (viewmodelRecentProductsGetValue != null) {
                        // read viewmodel.recentProducts.getValue().empty
                        viewmodelRecentProductsEmpty = viewmodelRecentProductsGetValue.isEmpty();
                    }


                    // read !viewmodel.recentProducts.getValue().empty
                    ViewmodelRecentProductsEmpty1 = !viewmodelRecentProductsEmpty;
                if((dirtyFlags & 0x33L) != 0) {
                    if(ViewmodelRecentProductsEmpty1) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.isSearching()
                        viewmodelIsSearching = viewmodel.isSearching();
                    }
                    updateLiveDataRegistration(3, viewmodelIsSearching);


                    if (viewmodelIsSearching != null) {
                        // read viewmodel.isSearching().getValue()
                        viewmodelIsSearchingGetValue = viewmodelIsSearching.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSearching().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSearchingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsSearchingGetValue);
                if((dirtyFlags & 0x38L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSearchingGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSearching().getValue()) ? View.VISIBLE : View.INVISIBLE
                    viewmodelIsSearchingViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSearchingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80000L) != 0) {

                if (viewmodel != null) {
                    // read viewmodel.hasSearched
                    viewmodelHasSearched = viewmodel.getHasSearched();
                }
                updateLiveDataRegistration(0, viewmodelHasSearched);


                if (viewmodelHasSearched != null) {
                    // read viewmodel.hasSearched.getValue()
                    viewmodelHasSearchedGetValue = viewmodelHasSearched.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelHasSearchedGetValue);
            if((dirtyFlags & 0x31L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue) {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x10000L;
                        dirtyFlags |= 0x400000L;
                }
            }
            if((dirtyFlags & 0x35L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue())
                ViewmodelHasSearched1 = !androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue;
        }

        if ((dirtyFlags & 0x33L) != 0) {

                // read !viewmodel.recentProducts.getValue().empty ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false
                viewmodelRecentProductsEmptyViewmodelHasSearchedBooleanFalse = ((ViewmodelRecentProductsEmpty1) ? (ViewmodelHasSearched1) : (false));
            if((dirtyFlags & 0x33L) != 0) {
                if(viewmodelRecentProductsEmptyViewmodelHasSearchedBooleanFalse) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x2000L) != 0) {

                if (viewmodel != null) {
                    // read viewmodel.meals
                    viewmodelMeals = viewmodel.getMeals();
                }
                updateLiveDataRegistration(2, viewmodelMeals);


                if (viewmodelMeals != null) {
                    // read viewmodel.meals.getValue()
                    viewmodelMealsGetValue = viewmodelMeals.getValue();
                }


                if (viewmodelMealsGetValue != null) {
                    // read viewmodel.meals.getValue().empty
                    viewmodelMealsEmpty = viewmodelMealsGetValue.isEmpty();
                }
        }
        if ((dirtyFlags & 0x33L) != 0) {

                // read !viewmodel.recentProducts.getValue().empty ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? !viewmodel.recentProducts.getValue().empty : false
                viewmodelRecentProductsEmptyViewmodelHasSearchedBooleanFalseViewmodelRecentProductsEmptyBooleanFalse = ((viewmodelRecentProductsEmptyViewmodelHasSearchedBooleanFalse) ? (ViewmodelRecentProductsEmpty1) : (false));
            if((dirtyFlags & 0x33L) != 0) {
                if(viewmodelRecentProductsEmptyViewmodelHasSearchedBooleanFalseViewmodelRecentProductsEmptyBooleanFalse) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }


                // read !viewmodel.recentProducts.getValue().empty ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? !viewmodel.recentProducts.getValue().empty : false ? View.VISIBLE : View.GONE
                viewmodelRecentProductsEmptyViewmodelHasSearchedBooleanFalseViewmodelRecentProductsEmptyBooleanFalseViewVISIBLEViewGONE = ((viewmodelRecentProductsEmptyViewmodelHasSearchedBooleanFalseViewmodelRecentProductsEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }

        if ((dirtyFlags & 0x35L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? viewmodel.meals.getValue().empty : false
                viewmodelHasSearchedViewmodelMealsEmptyBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue) ? (viewmodelMealsEmpty) : (false));
            if((dirtyFlags & 0x35L) != 0) {
                if(viewmodelHasSearchedViewmodelMealsEmptyBooleanFalse) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? viewmodel.meals.getValue().empty : false ? View.VISIBLE : View.GONE
                viewmodelHasSearchedViewmodelMealsEmptyBooleanFalseViewVISIBLEViewGONE = ((viewmodelHasSearchedViewmodelMealsEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x35L) != 0) {
            // api target 1

            this.activitySearchNotFound.setVisibility(viewmodelHasSearchedViewmodelMealsEmptyBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.activitySearchPb.setVisibility(viewmodelIsSearchingViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.activitySearchRl.setVisibility(viewmodelHasSearchedViewGONEViewVISIBLE);
            this.activitySearchRv.setVisibility(viewmodelHasSearchedViewVISIBLEViewGONE);
            this.activitySearchRvRecent.setVisibility(viewmodelHasSearchedViewGONEViewVISIBLE);
            // api target 9
            if(getBuildSdkInt() >= 9) {

                this.activitySearchRv.setOverScrollMode(viewmodelHasSearchedViewOVERSCROLLNEVERViewOVERSCROLLALWAYS);
                this.activitySearchRvRecent.setOverScrollMode(viewmodelHasSearchedViewOVERSCROLLALWAYSViewOVERSCROLLNEVER);
            }
        }
        if ((dirtyFlags & 0x33L) != 0) {
            // api target 1

            this.activitySearchRlRecent.setVisibility(viewmodelRecentProductsEmptyViewmodelHasSearchedBooleanFalseViewmodelRecentProductsEmptyBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.hasSearched
        flag 1 (0x2L): viewmodel.recentProducts
        flag 2 (0x3L): viewmodel.meals
        flag 3 (0x4L): viewmodel.isSearching()
        flag 4 (0x5L): viewmodel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? View.GONE : View.VISIBLE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSearching().getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSearching().getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? View.OVER_SCROLL_NEVER : View.OVER_SCROLL_ALWAYS
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? View.OVER_SCROLL_NEVER : View.OVER_SCROLL_ALWAYS
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? viewmodel.meals.getValue().empty : false
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? viewmodel.meals.getValue().empty : false
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? viewmodel.meals.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? viewmodel.meals.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? View.OVER_SCROLL_ALWAYS : View.OVER_SCROLL_NEVER
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? View.OVER_SCROLL_ALWAYS : View.OVER_SCROLL_NEVER
        flag 18 (0x13L): !viewmodel.recentProducts.getValue().empty ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false
        flag 19 (0x14L): !viewmodel.recentProducts.getValue().empty ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false
        flag 20 (0x15L): !viewmodel.recentProducts.getValue().empty ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? !viewmodel.recentProducts.getValue().empty : false
        flag 21 (0x16L): !viewmodel.recentProducts.getValue().empty ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? !viewmodel.recentProducts.getValue().empty : false
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): !viewmodel.recentProducts.getValue().empty ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? !viewmodel.recentProducts.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): !viewmodel.recentProducts.getValue().empty ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? !viewmodel.recentProducts.getValue().empty : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}