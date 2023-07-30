package com.feedapp.app.databinding;
import com.feedapp.app.R;
import com.feedapp.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ActivityDetailedFoodBindingImpl extends ActivityDetailedFoodBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 19);
        sViewsWithIds.put(R.id.activity_detailed_collapsing_toolbar, 20);
        sViewsWithIds.put(R.id.activity_detailed_toolbar, 21);
        sViewsWithIds.put(R.id.detailed_cardview1, 22);
        sViewsWithIds.put(R.id.detailed_add_product, 23);
        sViewsWithIds.put(R.id.activity_detailed_rl3, 24);
        sViewsWithIds.put(R.id.activity_detailed_rl2, 25);
        sViewsWithIds.put(R.id.activity_detailed_info_kcal, 26);
        sViewsWithIds.put(R.id.activity_detailed_info_proteins, 27);
        sViewsWithIds.put(R.id.activity_detailed_info_fats, 28);
        sViewsWithIds.put(R.id.activity_detailed_info_carbs, 29);
        sViewsWithIds.put(R.id.activity_detailed_rl1, 30);
        sViewsWithIds.put(R.id.detailed_quantity, 31);
        sViewsWithIds.put(R.id.detailed_quantity_dropdown, 32);
        sViewsWithIds.put(R.id.detailed_quantity_edit, 33);
        sViewsWithIds.put(R.id.detailed_cardview2, 34);
        sViewsWithIds.put(R.id.detailed_nutrition_title, 35);
        sViewsWithIds.put(R.id.detailed_nutrition_calories, 36);
        sViewsWithIds.put(R.id.detailed_nutrition_proteins, 37);
        sViewsWithIds.put(R.id.detailed_nutrition_fats, 38);
        sViewsWithIds.put(R.id.detailed_nutrition_carbs, 39);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDetailedFoodBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 40, sIncludes, sViewsWithIds));
    }
    private ActivityDetailedFoodBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[20]
            , (android.widget.RelativeLayout) bindings[29]
            , (android.widget.RelativeLayout) bindings[28]
            , (android.widget.RelativeLayout) bindings[26]
            , (android.widget.RelativeLayout) bindings[27]
            , (android.widget.RelativeLayout) bindings[30]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[25]
            , (android.widget.RelativeLayout) bindings[24]
            , (androidx.appcompat.widget.Toolbar) bindings[21]
            , (com.google.android.material.appbar.AppBarLayout) bindings[19]
            , (com.google.android.material.button.MaterialButton) bindings[23]
            , (android.widget.TextView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[22]
            , (androidx.cardview.widget.CardView) bindings[34]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[36]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[39]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[38]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[37]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[35]
            , (android.widget.TextView) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[31]
            , (android.widget.AutoCompleteTextView) bindings[32]
            , (android.widget.EditText) bindings[33]
            );
        this.detailedCarbsValue.setTag(null);
        this.detailedFatsValue.setTag(null);
        this.detailedKcalValue.setTag(null);
        this.detailedNutritionCaloriesValue.setTag(null);
        this.detailedNutritionCarbsValue.setTag(null);
        this.detailedNutritionFatsValue.setTag(null);
        this.detailedNutritionFiber.setTag(null);
        this.detailedNutritionFiberValue.setTag(null);
        this.detailedNutritionMono.setTag(null);
        this.detailedNutritionMonoValue.setTag(null);
        this.detailedNutritionPoly.setTag(null);
        this.detailedNutritionPolyValue.setTag(null);
        this.detailedNutritionProteinsValue.setTag(null);
        this.detailedNutritionS.setTag(null);
        this.detailedNutritionSValue.setTag(null);
        this.detailedNutritionSugars.setTag(null);
        this.detailedNutritionSugarsValue.setTag(null);
        this.detailedProteinsValue.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
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
            setViewmodel((com.feedapp.app.viewModels.DetailedViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.feedapp.app.viewModels.DetailedViewModel Viewmodel) {
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
                return onChangeViewmodelFoodInfo((androidx.lifecycle.LiveData<com.feedapp.app.data.models.FoodProduct>) object, fieldId);
            case 1 :
                return onChangeViewmodelMultiplier((androidx.lifecycle.LiveData<java.lang.Double>) object, fieldId);
            case 2 :
                return onChangeViewmodelUsingLocal((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewmodelLocalFoodInfo((androidx.lifecycle.LiveData<com.feedapp.app.data.models.localdb.IProduct>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelFoodInfo(androidx.lifecycle.LiveData<com.feedapp.app.data.models.FoodProduct> ViewmodelFoodInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelMultiplier(androidx.lifecycle.LiveData<java.lang.Double> ViewmodelMultiplier, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelUsingLocal(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewmodelUsingLocal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelLocalFoodInfo(androidx.lifecycle.LiveData<com.feedapp.app.data.models.localdb.IProduct> ViewmodelLocalFoodInfo, int fieldId) {
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
        float viewmodelLocalFoodInfoFats = 0f;
        java.lang.Boolean viewmodelUsingLocalGetValue = null;
        float viewmodelFoodInfoCarbs = 0f;
        float viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoFatsViewmodelLocalFoodInfoFats = 0f;
        float viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoCaloriesViewmodelLocalFoodInfoCalories = 0f;
        float viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoProteinsViewmodelLocalFoodInfoProteins = 0f;
        float androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoSugar = 0f;
        java.lang.Float viewmodelFoodInfoSugar = null;
        float viewmodelLocalFoodInfoCalories = 0f;
        float androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoMonoFatsG = 0f;
        androidx.lifecycle.LiveData<com.feedapp.app.data.models.FoodProduct> viewmodelFoodInfo = null;
        float viewmodelFoodInfoOPolyFatsGViewmodelFoodInfoTPolyFatsG = 0f;
        float androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoTotalDietaryFibre = 0f;
        java.lang.Double viewmodelMultiplierGetValue = null;
        float androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoSatFatsG = 0f;
        float androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoOPolyFatsGViewmodelFoodInfoTPolyFatsG = 0f;
        boolean viewmodelFoodInfoJavaLangObjectNull = false;
        java.lang.Float viewmodelFoodInfoMonoFatsG = null;
        float viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoCarbsViewmodelLocalFoodInfoCarbs = 0f;
        float viewmodelLocalFoodInfoCarbs = 0f;
        float viewmodelFoodInfoProteins = 0f;
        double androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue = 0.0;
        java.lang.Float viewmodelFoodInfoTotalDietaryFibre = null;
        androidx.lifecycle.LiveData<java.lang.Double> viewmodelMultiplier = null;
        com.feedapp.app.data.models.localdb.IProduct viewmodelLocalFoodInfoGetValue = null;
        float viewmodelLocalFoodInfoProteins = 0f;
        java.lang.Float viewmodelFoodInfoOPolyFatsG = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewmodelUsingLocal = null;
        java.lang.Float viewmodelFoodInfoTPolyFatsG = null;
        float androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoOPolyFatsG = 0f;
        com.feedapp.app.data.models.FoodProduct viewmodelFoodInfoGetValue = null;
        float androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoTPolyFatsG = 0f;
        float viewmodelFoodInfoCalories = 0f;
        androidx.lifecycle.LiveData<com.feedapp.app.data.models.localdb.IProduct> viewmodelLocalFoodInfo = null;
        java.lang.Float viewmodelFoodInfoSatFatsG = null;
        float viewmodelFoodInfoFats = 0f;
        com.feedapp.app.viewModels.DetailedViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x3bL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.foodInfo
                        viewmodelFoodInfo = viewmodel.getFoodInfo();
                        // read viewmodel.multiplier
                        viewmodelMultiplier = viewmodel.getMultiplier();
                    }
                    updateLiveDataRegistration(0, viewmodelFoodInfo);
                    updateLiveDataRegistration(1, viewmodelMultiplier);


                    if (viewmodelFoodInfo != null) {
                        // read viewmodel.foodInfo.getValue()
                        viewmodelFoodInfoGetValue = viewmodelFoodInfo.getValue();
                    }
                    if (viewmodelMultiplier != null) {
                        // read viewmodel.multiplier.getValue()
                        viewmodelMultiplierGetValue = viewmodelMultiplier.getValue();
                    }

                if ((dirtyFlags & 0x33L) != 0) {

                        if (viewmodelFoodInfoGetValue != null) {
                            // read viewmodel.foodInfo.getValue().sugar
                            viewmodelFoodInfoSugar = viewmodelFoodInfoGetValue.getSugar();
                            // read viewmodel.foodInfo.getValue().mono_fats_g
                            viewmodelFoodInfoMonoFatsG = viewmodelFoodInfoGetValue.getMono_fats_g();
                            // read viewmodel.foodInfo.getValue().total_dietary_fibre
                            viewmodelFoodInfoTotalDietaryFibre = viewmodelFoodInfoGetValue.getTotal_dietary_fibre();
                            // read viewmodel.foodInfo.getValue().o_poly_fats_g
                            viewmodelFoodInfoOPolyFatsG = viewmodelFoodInfoGetValue.getO_poly_fats_g();
                            // read viewmodel.foodInfo.getValue().t_poly_fats_g
                            viewmodelFoodInfoTPolyFatsG = viewmodelFoodInfoGetValue.getT_poly_fats_g();
                            // read viewmodel.foodInfo.getValue().sat_fats_g
                            viewmodelFoodInfoSatFatsG = viewmodelFoodInfoGetValue.getSat_fats_g();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.foodInfo.getValue().sugar)
                        androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoSugar = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelFoodInfoSugar);
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.foodInfo.getValue().mono_fats_g)
                        androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoMonoFatsG = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelFoodInfoMonoFatsG);
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.foodInfo.getValue().total_dietary_fibre)
                        androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoTotalDietaryFibre = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelFoodInfoTotalDietaryFibre);
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.foodInfo.getValue().o_poly_fats_g)
                        androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoOPolyFatsG = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelFoodInfoOPolyFatsG);
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.foodInfo.getValue().t_poly_fats_g)
                        androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoTPolyFatsG = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelFoodInfoTPolyFatsG);
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.foodInfo.getValue().sat_fats_g)
                        androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoSatFatsG = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelFoodInfoSatFatsG);


                        // read (androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.foodInfo.getValue().o_poly_fats_g)) + (androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.foodInfo.getValue().t_poly_fats_g))
                        viewmodelFoodInfoOPolyFatsGViewmodelFoodInfoTPolyFatsG = (androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoOPolyFatsG) + (androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoTPolyFatsG);


                        // read androidx.databinding.ViewDataBinding.safeUnbox((androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.foodInfo.getValue().o_poly_fats_g)) + (androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.foodInfo.getValue().t_poly_fats_g)))
                        androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoOPolyFatsGViewmodelFoodInfoTPolyFatsG = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelFoodInfoOPolyFatsGViewmodelFoodInfoTPolyFatsG);
                }

                    // read viewmodel.foodInfo.getValue() != null
                    viewmodelFoodInfoJavaLangObjectNull = (viewmodelFoodInfoGetValue) != (null);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.multiplier.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelMultiplierGetValue);
                if((dirtyFlags & 0x3bL) != 0) {
                    if(viewmodelFoodInfoJavaLangObjectNull) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000L;
                    }
                }

                if ((dirtyFlags & 0x33L) != 0) {
                }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.usingLocal
                        viewmodelUsingLocal = viewmodel.getUsingLocal();
                    }
                    updateLiveDataRegistration(2, viewmodelUsingLocal);


                    if (viewmodelUsingLocal != null) {
                        // read viewmodel.usingLocal.getValue()
                        viewmodelUsingLocalGetValue = viewmodelUsingLocal.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x2000L) != 0) {

                if (viewmodelFoodInfoGetValue != null) {
                    // read viewmodel.foodInfo.getValue().carbs
                    viewmodelFoodInfoCarbs = viewmodelFoodInfoGetValue.getCarbs();
                }
        }
        if ((dirtyFlags & 0x800L) != 0) {

                if (viewmodelFoodInfoGetValue != null) {
                    // read viewmodel.foodInfo.getValue().proteins
                    viewmodelFoodInfoProteins = viewmodelFoodInfoGetValue.getProteins();
                }
        }
        if ((dirtyFlags & 0x200L) != 0) {

                if (viewmodelFoodInfoGetValue != null) {
                    // read viewmodel.foodInfo.getValue().calories
                    viewmodelFoodInfoCalories = viewmodelFoodInfoGetValue.getCalories();
                }
        }
        if ((dirtyFlags & 0x1540L) != 0) {

                if (viewmodel != null) {
                    // read viewmodel.localFoodInfo
                    viewmodelLocalFoodInfo = viewmodel.getLocalFoodInfo();
                }
                updateLiveDataRegistration(3, viewmodelLocalFoodInfo);


                if (viewmodelLocalFoodInfo != null) {
                    // read viewmodel.localFoodInfo.getValue()
                    viewmodelLocalFoodInfoGetValue = viewmodelLocalFoodInfo.getValue();
                }

            if ((dirtyFlags & 0x40L) != 0) {

                    if (viewmodelLocalFoodInfoGetValue != null) {
                        // read viewmodel.localFoodInfo.getValue().fats
                        viewmodelLocalFoodInfoFats = viewmodelLocalFoodInfoGetValue.getFats();
                    }
            }
            if ((dirtyFlags & 0x100L) != 0) {

                    if (viewmodelLocalFoodInfoGetValue != null) {
                        // read viewmodel.localFoodInfo.getValue().calories
                        viewmodelLocalFoodInfoCalories = viewmodelLocalFoodInfoGetValue.getCalories();
                    }
            }
            if ((dirtyFlags & 0x1000L) != 0) {

                    if (viewmodelLocalFoodInfoGetValue != null) {
                        // read viewmodel.localFoodInfo.getValue().carbs
                        viewmodelLocalFoodInfoCarbs = viewmodelLocalFoodInfoGetValue.getCarbs();
                    }
            }
            if ((dirtyFlags & 0x400L) != 0) {

                    if (viewmodelLocalFoodInfoGetValue != null) {
                        // read viewmodel.localFoodInfo.getValue().proteins
                        viewmodelLocalFoodInfoProteins = viewmodelLocalFoodInfoGetValue.getProteins();
                    }
            }
        }
        if ((dirtyFlags & 0x80L) != 0) {

                if (viewmodelFoodInfoGetValue != null) {
                    // read viewmodel.foodInfo.getValue().fats
                    viewmodelFoodInfoFats = viewmodelFoodInfoGetValue.getFats();
                }
        }

        if ((dirtyFlags & 0x3bL) != 0) {

                // read viewmodel.foodInfo.getValue() != null ? viewmodel.foodInfo.getValue().fats : viewmodel.localFoodInfo.getValue().fats
                viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoFatsViewmodelLocalFoodInfoFats = ((viewmodelFoodInfoJavaLangObjectNull) ? (viewmodelFoodInfoFats) : (viewmodelLocalFoodInfoFats));
                // read viewmodel.foodInfo.getValue() != null ? viewmodel.foodInfo.getValue().calories : viewmodel.localFoodInfo.getValue().calories
                viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoCaloriesViewmodelLocalFoodInfoCalories = ((viewmodelFoodInfoJavaLangObjectNull) ? (viewmodelFoodInfoCalories) : (viewmodelLocalFoodInfoCalories));
                // read viewmodel.foodInfo.getValue() != null ? viewmodel.foodInfo.getValue().proteins : viewmodel.localFoodInfo.getValue().proteins
                viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoProteinsViewmodelLocalFoodInfoProteins = ((viewmodelFoodInfoJavaLangObjectNull) ? (viewmodelFoodInfoProteins) : (viewmodelLocalFoodInfoProteins));
                // read viewmodel.foodInfo.getValue() != null ? viewmodel.foodInfo.getValue().carbs : viewmodel.localFoodInfo.getValue().carbs
                viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoCarbsViewmodelLocalFoodInfoCarbs = ((viewmodelFoodInfoJavaLangObjectNull) ? (viewmodelFoodInfoCarbs) : (viewmodelLocalFoodInfoCarbs));
        }
        // batch finished
        if ((dirtyFlags & 0x3bL) != 0) {
            // api target 1

            com.feedapp.app.util.BindingAdapters.valueG(this.detailedCarbsValue, viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoCarbsViewmodelLocalFoodInfoCarbs, androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue);
            com.feedapp.app.util.BindingAdapters.valueG(this.detailedFatsValue, viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoFatsViewmodelLocalFoodInfoFats, androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue);
            com.feedapp.app.util.BindingAdapters.valueK(this.detailedKcalValue, viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoCaloriesViewmodelLocalFoodInfoCalories, androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue);
            com.feedapp.app.util.BindingAdapters.valueK(this.detailedNutritionCaloriesValue, viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoCaloriesViewmodelLocalFoodInfoCalories, androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue);
            com.feedapp.app.util.BindingAdapters.valueG(this.detailedNutritionCarbsValue, viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoCarbsViewmodelLocalFoodInfoCarbs, androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue);
            com.feedapp.app.util.BindingAdapters.valueG(this.detailedNutritionFatsValue, viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoFatsViewmodelLocalFoodInfoFats, androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue);
            com.feedapp.app.util.BindingAdapters.valueG(this.detailedNutritionProteinsValue, viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoProteinsViewmodelLocalFoodInfoProteins, androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue);
            com.feedapp.app.util.BindingAdapters.valueG(this.detailedProteinsValue, viewmodelFoodInfoJavaLangObjectNullViewmodelFoodInfoProteinsViewmodelLocalFoodInfoProteins, androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            com.feedapp.app.util.BindingAdapters.visibleIf(this.detailedNutritionFiber, viewmodelUsingLocalGetValue);
            com.feedapp.app.util.BindingAdapters.visibleIf(this.detailedNutritionFiberValue, viewmodelUsingLocalGetValue);
            com.feedapp.app.util.BindingAdapters.visibleIf(this.detailedNutritionMono, viewmodelUsingLocalGetValue);
            com.feedapp.app.util.BindingAdapters.visibleIf(this.detailedNutritionMonoValue, viewmodelUsingLocalGetValue);
            com.feedapp.app.util.BindingAdapters.visibleIf(this.detailedNutritionPoly, viewmodelUsingLocalGetValue);
            com.feedapp.app.util.BindingAdapters.visibleIf(this.detailedNutritionPolyValue, viewmodelUsingLocalGetValue);
            com.feedapp.app.util.BindingAdapters.visibleIf(this.detailedNutritionS, viewmodelUsingLocalGetValue);
            com.feedapp.app.util.BindingAdapters.visibleIf(this.detailedNutritionSValue, viewmodelUsingLocalGetValue);
            com.feedapp.app.util.BindingAdapters.visibleIf(this.detailedNutritionSugars, viewmodelUsingLocalGetValue);
            com.feedapp.app.util.BindingAdapters.visibleIf(this.detailedNutritionSugarsValue, viewmodelUsingLocalGetValue);
        }
        if ((dirtyFlags & 0x33L) != 0) {
            // api target 1

            com.feedapp.app.util.BindingAdapters.valueG(this.detailedNutritionFiberValue, androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoTotalDietaryFibre, androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue);
            com.feedapp.app.util.BindingAdapters.valueG(this.detailedNutritionMonoValue, androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoMonoFatsG, androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue);
            com.feedapp.app.util.BindingAdapters.valueG(this.detailedNutritionPolyValue, androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoOPolyFatsGViewmodelFoodInfoTPolyFatsG, androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue);
            com.feedapp.app.util.BindingAdapters.valueG(this.detailedNutritionSValue, androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoSatFatsG, androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue);
            com.feedapp.app.util.BindingAdapters.valueG(this.detailedNutritionSugarsValue, androidxDatabindingViewDataBindingSafeUnboxViewmodelFoodInfoSugar, androidxDatabindingViewDataBindingSafeUnboxViewmodelMultiplierGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.foodInfo
        flag 1 (0x2L): viewmodel.multiplier
        flag 2 (0x3L): viewmodel.usingLocal
        flag 3 (0x4L): viewmodel.localFoodInfo
        flag 4 (0x5L): viewmodel
        flag 5 (0x6L): null
        flag 6 (0x7L): viewmodel.foodInfo.getValue() != null ? viewmodel.foodInfo.getValue().fats : viewmodel.localFoodInfo.getValue().fats
        flag 7 (0x8L): viewmodel.foodInfo.getValue() != null ? viewmodel.foodInfo.getValue().fats : viewmodel.localFoodInfo.getValue().fats
        flag 8 (0x9L): viewmodel.foodInfo.getValue() != null ? viewmodel.foodInfo.getValue().calories : viewmodel.localFoodInfo.getValue().calories
        flag 9 (0xaL): viewmodel.foodInfo.getValue() != null ? viewmodel.foodInfo.getValue().calories : viewmodel.localFoodInfo.getValue().calories
        flag 10 (0xbL): viewmodel.foodInfo.getValue() != null ? viewmodel.foodInfo.getValue().proteins : viewmodel.localFoodInfo.getValue().proteins
        flag 11 (0xcL): viewmodel.foodInfo.getValue() != null ? viewmodel.foodInfo.getValue().proteins : viewmodel.localFoodInfo.getValue().proteins
        flag 12 (0xdL): viewmodel.foodInfo.getValue() != null ? viewmodel.foodInfo.getValue().carbs : viewmodel.localFoodInfo.getValue().carbs
        flag 13 (0xeL): viewmodel.foodInfo.getValue() != null ? viewmodel.foodInfo.getValue().carbs : viewmodel.localFoodInfo.getValue().carbs
    flag mapping end*/
    //end
}