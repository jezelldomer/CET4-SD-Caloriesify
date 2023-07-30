package com.feedapp.app.databinding;
import com.feedapp.app.R;
import com.feedapp.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentRecipesBindingImpl extends FragmentRecipesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.fragment_recipes_breakfast_rl, 6);
        sViewsWithIds.put(R.id.fragment_recipes_breakfast_shimmer, 7);
        sViewsWithIds.put(R.id.fragment_recipes_breakfast_viewpager, 8);
        sViewsWithIds.put(R.id.activity_recipes_breakfast_title, 9);
        sViewsWithIds.put(R.id.fragment_recipes_lunch_rl, 10);
        sViewsWithIds.put(R.id.fragment_recipes_lunch_shimmer, 11);
        sViewsWithIds.put(R.id.fragment_recipes_lunch_viewpager, 12);
        sViewsWithIds.put(R.id.activity_recipes_lunch_title, 13);
        sViewsWithIds.put(R.id.fragment_recipes_snack_rl, 14);
        sViewsWithIds.put(R.id.fragment_recipes_snack_shimmer, 15);
        sViewsWithIds.put(R.id.fragment_recipes_snack_viewpager, 16);
        sViewsWithIds.put(R.id.activity_recipes_snack_title, 17);
        sViewsWithIds.put(R.id.fragment_recipes_dinner_shimmer, 18);
        sViewsWithIds.put(R.id.fragment_recipes_dinner_viewpager, 19);
        sViewsWithIds.put(R.id.activity_recipes_dinner_title, 20);
        sViewsWithIds.put(R.id.fragment_recipes_sResult_rl, 21);
        sViewsWithIds.put(R.id.fragment_recipes_searchBar, 22);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.ProgressBar mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRecipesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private FragmentRecipesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[17]
            , (android.widget.RelativeLayout) bindings[6]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[7]
            , (androidx.viewpager.widget.ViewPager) bindings[8]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[18]
            , (androidx.viewpager.widget.ViewPager) bindings[19]
            , (android.widget.RelativeLayout) bindings[10]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[11]
            , (androidx.viewpager.widget.ViewPager) bindings[12]
            , (android.widget.RelativeLayout) bindings[21]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (com.mancj.materialsearchbar.MaterialSearchBar) bindings[22]
            , (android.widget.RelativeLayout) bindings[14]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[15]
            , (androidx.viewpager.widget.ViewPager) bindings[16]
            , (android.widget.RelativeLayout) bindings[4]
            );
        this.fragmentRecipesSResultRv.setTag(null);
        this.fragmentRecipesVpRl.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ProgressBar) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
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
            setViewmodel((com.feedapp.app.viewModels.RecipeSearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.feedapp.app.viewModels.RecipeSearchViewModel Viewmodel) {
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
                return onChangeViewmodelHasSearched((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewmodelIsConnected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewmodelIsRecipesEmpty((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewmodelIsSearching((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelHasSearched(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelHasSearched, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelIsConnected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelIsConnected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelIsRecipesEmpty(androidx.lifecycle.LiveData<java.lang.Boolean> ViewmodelIsRecipesEmpty, int fieldId) {
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
        int viewmodelIsSearchingViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSearchingGetValue = false;
        boolean viewmodelIsRecipesEmptyViewmodelHasSearchedBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelHasSearched = null;
        java.lang.Boolean viewmodelIsSearchingGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsConnectedGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsRecipesEmptyGetValue = false;
        java.lang.Boolean viewmodelIsConnectedGetValue = null;
        int viewmodelIsConnectedViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelIsConnected = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewmodelIsRecipesEmpty = null;
        int viewmodelIsRecipesEmptyViewmodelHasSearchedBooleanFalseViewmodelIsConnectedBooleanFalseViewVISIBLEViewGONE = 0;
        int viewmodelIsConnectedViewmodelHasSearchedBooleanFalseViewVISIBLEViewGONE = 0;
        int ViewmodelIsConnectedViewmodelHasSearchedBooleanFalseViewVISIBLEViewGONE1 = 0;
        boolean viewmodelIsConnectedViewmodelHasSearchedBooleanFalse = false;
        boolean viewmodelIsRecipesEmptyViewmodelHasSearchedBooleanFalseViewmodelIsConnectedBooleanFalse = false;
        boolean ViewmodelHasSearched1 = false;
        boolean ViewmodelIsConnectedViewmodelHasSearchedBooleanFalse1 = false;
        java.lang.Boolean viewmodelHasSearchedGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewmodelIsSearching = null;
        java.lang.Boolean viewmodelIsRecipesEmptyGetValue = null;
        com.feedapp.app.viewModels.RecipeSearchViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x33L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.isConnected()
                        viewmodelIsConnected = viewmodel.isConnected();
                    }
                    updateLiveDataRegistration(1, viewmodelIsConnected);


                    if (viewmodelIsConnected != null) {
                        // read viewmodel.isConnected().getValue()
                        viewmodelIsConnectedGetValue = viewmodelIsConnected.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelIsConnectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsConnectedGetValue);
                if((dirtyFlags & 0x32L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsConnectedGetValue) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0x33L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsConnectedGetValue) {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x400000L;
                    }
                }

                if ((dirtyFlags & 0x32L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? View.GONE : View.VISIBLE
                        viewmodelIsConnectedViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsConnectedGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x37L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.isRecipesEmpty
                        viewmodelIsRecipesEmpty = viewmodel.isRecipesEmpty();
                    }
                    updateLiveDataRegistration(2, viewmodelIsRecipesEmpty);


                    if (viewmodelIsRecipesEmpty != null) {
                        // read viewmodel.isRecipesEmpty.getValue()
                        viewmodelIsRecipesEmptyGetValue = viewmodelIsRecipesEmpty.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isRecipesEmpty.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelIsRecipesEmptyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsRecipesEmptyGetValue);
                if((dirtyFlags & 0x37L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsRecipesEmptyGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
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
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSearching().getValue()) ? View.VISIBLE : View.GONE
                    viewmodelIsSearchingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSearchingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x200L) != 0) {

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
        }

        if ((dirtyFlags & 0x37L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isRecipesEmpty.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false
                viewmodelIsRecipesEmptyViewmodelHasSearchedBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsRecipesEmptyGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue) : (false));
            if((dirtyFlags & 0x37L) != 0) {
                if(viewmodelIsRecipesEmptyViewmodelHasSearchedBooleanFalse) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x200000L) != 0) {

                if (viewmodel != null) {
                    // read viewmodel.isConnected()
                    viewmodelIsConnected = viewmodel.isConnected();
                }
                updateLiveDataRegistration(1, viewmodelIsConnected);


                if (viewmodelIsConnected != null) {
                    // read viewmodel.isConnected().getValue()
                    viewmodelIsConnectedGetValue = viewmodelIsConnected.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewmodelIsConnectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsConnectedGetValue);
            if((dirtyFlags & 0x32L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsConnectedGetValue) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x33L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsConnectedGetValue) {
                        dirtyFlags |= 0x80000L;
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                        dirtyFlags |= 0x400000L;
                }
            }
        }

        if ((dirtyFlags & 0x37L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isRecipesEmpty.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) : false
                viewmodelIsRecipesEmptyViewmodelHasSearchedBooleanFalseViewmodelIsConnectedBooleanFalse = ((viewmodelIsRecipesEmptyViewmodelHasSearchedBooleanFalse) ? (androidxDatabindingViewDataBindingSafeUnboxViewmodelIsConnectedGetValue) : (false));
            if((dirtyFlags & 0x37L) != 0) {
                if(viewmodelIsRecipesEmptyViewmodelHasSearchedBooleanFalseViewmodelIsConnectedBooleanFalse) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isRecipesEmpty.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) : false ? View.VISIBLE : View.GONE
                viewmodelIsRecipesEmptyViewmodelHasSearchedBooleanFalseViewmodelIsConnectedBooleanFalseViewVISIBLEViewGONE = ((viewmodelIsRecipesEmptyViewmodelHasSearchedBooleanFalseViewmodelIsConnectedBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x880000L) != 0) {

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

            if ((dirtyFlags & 0x80000L) != 0) {

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue())
                    ViewmodelHasSearched1 = !androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue;
            }
        }

        if ((dirtyFlags & 0x33L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false
                viewmodelIsConnectedViewmodelHasSearchedBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsConnectedGetValue) ? (ViewmodelHasSearched1) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false
                ViewmodelIsConnectedViewmodelHasSearchedBooleanFalse1 = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsConnectedGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxViewmodelHasSearchedGetValue) : (false));
            if((dirtyFlags & 0x33L) != 0) {
                if(viewmodelIsConnectedViewmodelHasSearchedBooleanFalse) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0x33L) != 0) {
                if(ViewmodelIsConnectedViewmodelHasSearchedBooleanFalse1) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? View.VISIBLE : View.GONE
                viewmodelIsConnectedViewmodelHasSearchedBooleanFalseViewVISIBLEViewGONE = ((viewmodelIsConnectedViewmodelHasSearchedBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? View.VISIBLE : View.GONE
                ViewmodelIsConnectedViewmodelHasSearchedBooleanFalseViewVISIBLEViewGONE1 = ((ViewmodelIsConnectedViewmodelHasSearchedBooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x33L) != 0) {
            // api target 1

            this.fragmentRecipesSResultRv.setVisibility(ViewmodelIsConnectedViewmodelHasSearchedBooleanFalseViewVISIBLEViewGONE1);
            this.fragmentRecipesVpRl.setVisibility(viewmodelIsConnectedViewmodelHasSearchedBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x37L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewmodelIsRecipesEmptyViewmodelHasSearchedBooleanFalseViewmodelIsConnectedBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewmodelIsSearchingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewmodelIsConnectedViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.hasSearched
        flag 1 (0x2L): viewmodel.isConnected()
        flag 2 (0x3L): viewmodel.isRecipesEmpty
        flag 3 (0x4L): viewmodel.isSearching()
        flag 4 (0x5L): viewmodel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSearching().getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSearching().getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isRecipesEmpty.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isRecipesEmpty.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? View.GONE : View.VISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? View.GONE : View.VISIBLE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isRecipesEmpty.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isRecipesEmpty.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isRecipesEmpty.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) : false
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isRecipesEmpty.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) : false
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isConnected().getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.hasSearched.getValue()) : false
    flag mapping end*/
    //end
}