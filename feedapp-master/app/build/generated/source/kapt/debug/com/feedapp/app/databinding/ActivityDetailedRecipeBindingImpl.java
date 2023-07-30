package com.feedapp.app.databinding;
import com.feedapp.app.R;
import com.feedapp.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityDetailedRecipeBindingImpl extends ActivityDetailedRecipeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.detailedRecipes_cl, 2);
        sViewsWithIds.put(R.id.detailedRecipes_collapsing_appbar, 3);
        sViewsWithIds.put(R.id.detailedRecipes_collapsing_toolbar, 4);
        sViewsWithIds.put(R.id.detailedRecipes_ct_image, 5);
        sViewsWithIds.put(R.id.detailedRecipes_toolbar, 6);
        sViewsWithIds.put(R.id.nsv, 7);
        sViewsWithIds.put(R.id.detailed_cardview1, 8);
        sViewsWithIds.put(R.id.detailed_recipe_title, 9);
        sViewsWithIds.put(R.id.detailed_recipe_credit_rl, 10);
        sViewsWithIds.put(R.id.detailed_recipe_credit, 11);
        sViewsWithIds.put(R.id.detailed_recipe_time_rl, 12);
        sViewsWithIds.put(R.id.detailed_recipe_time_image, 13);
        sViewsWithIds.put(R.id.detailed_recipe_time_text, 14);
        sViewsWithIds.put(R.id.detailed_cardview2, 15);
        sViewsWithIds.put(R.id.detailed_recipe_nutrition_rl, 16);
        sViewsWithIds.put(R.id.detailed_recipe_info_title, 17);
        sViewsWithIds.put(R.id.detailed_recipe_info_inOne, 18);
        sViewsWithIds.put(R.id.detailed_recipe_info_carbs_bar, 19);
        sViewsWithIds.put(R.id.detailed_recipe_info_carbs_text, 20);
        sViewsWithIds.put(R.id.detailed_recipe_fats_cl, 21);
        sViewsWithIds.put(R.id.detailed_recipe_info_fats_bar, 22);
        sViewsWithIds.put(R.id.detailed_recipe_info_fats_text, 23);
        sViewsWithIds.put(R.id.detailed_recipe_proteins_cl, 24);
        sViewsWithIds.put(R.id.detailed_recipe_info_proteins_bar, 25);
        sViewsWithIds.put(R.id.detailed_recipe_info_proteins_text, 26);
        sViewsWithIds.put(R.id.detailed_cardview3, 27);
        sViewsWithIds.put(R.id.detailed_recipe_ins_rl, 28);
        sViewsWithIds.put(R.id.detailed_recipe_ins_title, 29);
        sViewsWithIds.put(R.id.detailed_recipe_step_rv, 30);
        sViewsWithIds.put(R.id.detailed_cardview4, 31);
        sViewsWithIds.put(R.id.detailed_recipe_ing_rl, 32);
        sViewsWithIds.put(R.id.detailed_recipe_ing_title, 33);
        sViewsWithIds.put(R.id.detailed_recipe_ing_perServings, 34);
        sViewsWithIds.put(R.id.detailed_recipe_ing_rv, 35);
        sViewsWithIds.put(R.id.detailed_recipe_ing_no, 36);
        sViewsWithIds.put(R.id.detailed_recipe_fab, 37);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailedRecipeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 38, sIncludes, sViewsWithIds));
    }
    private ActivityDetailedRecipeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[27]
            , (androidx.cardview.widget.CardView) bindings[31]
            , (android.widget.TextView) bindings[11]
            , (android.widget.RelativeLayout) bindings[10]
            , (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) bindings[37]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (android.widget.ProgressBar) bindings[19]
            , (android.widget.TextView) bindings[20]
            , (android.widget.ProgressBar) bindings[22]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[18]
            , (android.widget.ProgressBar) bindings[25]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[36]
            , (android.widget.TextView) bindings[34]
            , (android.widget.RelativeLayout) bindings[32]
            , (androidx.recyclerview.widget.RecyclerView) bindings[35]
            , (android.widget.TextView) bindings[33]
            , (android.widget.RelativeLayout) bindings[28]
            , (android.widget.TextView) bindings[29]
            , (android.widget.RelativeLayout) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[24]
            , (androidx.recyclerview.widget.RecyclerView) bindings[30]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.RelativeLayout) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[9]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[2]
            , (com.google.android.material.appbar.AppBarLayout) bindings[3]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ProgressBar) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[6]
            , (androidx.core.widget.NestedScrollView) bindings[7]
            );
        this.detailedRecipesProgress.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
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
            setViewmodel((com.feedapp.app.viewModels.DetailedRecipeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.feedapp.app.viewModels.DetailedRecipeViewModel Viewmodel) {
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
                return onChangeViewmodelIsSearching((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelIsSearching(androidx.lifecycle.LiveData<java.lang.Boolean> ViewmodelIsSearching, int fieldId) {
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
        int viewmodelIsSearchingViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSearchingGetValue = false;
        java.lang.Boolean viewmodelIsSearchingGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewmodelIsSearching = null;
        com.feedapp.app.viewModels.DetailedRecipeViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.isSearching()
                    viewmodelIsSearching = viewmodel.isSearching();
                }
                updateLiveDataRegistration(0, viewmodelIsSearching);


                if (viewmodelIsSearching != null) {
                    // read viewmodel.isSearching().getValue()
                    viewmodelIsSearchingGetValue = viewmodelIsSearching.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSearching().getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSearchingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelIsSearchingGetValue);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSearchingGetValue) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSearching().getValue()) ? View.VISIBLE : View.GONE
                viewmodelIsSearchingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewmodelIsSearchingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.detailedRecipesProgress.setVisibility(viewmodelIsSearchingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.isSearching()
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSearching().getValue()) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.isSearching().getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}