package com.feedapp.app.databinding;
import com.feedapp.app.R;
import com.feedapp.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentHomeUpMenuBindingImpl extends FragmentHomeUpMenuBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout, 6);
        sViewsWithIds.put(R.id.fragment_home_up_pBar, 7);
        sViewsWithIds.put(R.id.up_menu_carbs_text, 8);
        sViewsWithIds.put(R.id.up_menu_proteins_text, 9);
        sViewsWithIds.put(R.id.up_menu_fats_text, 10);
        sViewsWithIds.put(R.id.up_menu_carbs_bar, 11);
        sViewsWithIds.put(R.id.up_menu_proteins_bar, 12);
        sViewsWithIds.put(R.id.up_menu_fats_bar, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeUpMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentHomeUpMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.ProgressBar) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.ProgressBar) bindings[11]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ProgressBar) bindings[13]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.ProgressBar) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.upMenuCaloriesText.setTag(null);
        this.upMenuCarbsLeft.setTag(null);
        this.upMenuFatsLeft.setTag(null);
        this.upMenuProteinsLeft.setTag(null);
        this.upMenuSubText.setTag(null);
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
                return onChangeViewmodelUserLeftValues((androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.UserLeftValues>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelUserLeftValues(androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.UserLeftValues> ViewmodelUserLeftValues, int fieldId) {
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
        int viewmodelUserLeftValuesCaloriesFirstIntValue = 0;
        java.lang.Boolean viewmodelUserLeftValuesCaloriesSecond = null;
        kotlin.Triple<java.lang.Integer,java.lang.Boolean,java.lang.Integer> viewmodelUserLeftValuesCalories = null;
        java.lang.Integer viewmodelUserLeftValuesCaloriesFirst = null;
        androidx.lifecycle.LiveData<com.feedapp.app.data.models.user.UserLeftValues> viewmodelUserLeftValues = null;
        boolean viewmodelUserLeftValuesCaloriesSecondBooleanValue = false;
        kotlin.Triple<java.lang.Integer,java.lang.Boolean,java.lang.Integer> viewmodelUserLeftValuesProteinsLeft = null;
        kotlin.Triple<java.lang.Integer,java.lang.Boolean,java.lang.Integer> viewmodelUserLeftValuesFatsLeft = null;
        java.lang.String stringValueOfViewmodelUserLeftValuesCaloriesFirstIntValue = null;
        kotlin.Triple<java.lang.Integer,java.lang.Boolean,java.lang.Integer> viewmodelUserLeftValuesCarbsLeft = null;
        com.feedapp.app.data.models.user.UserLeftValues viewmodelUserLeftValuesGetValue = null;
        com.feedapp.app.viewModels.HomeViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.userLeftValues
                    viewmodelUserLeftValues = viewmodel.getUserLeftValues();
                }
                updateLiveDataRegistration(0, viewmodelUserLeftValues);


                if (viewmodelUserLeftValues != null) {
                    // read viewmodel.userLeftValues.getValue()
                    viewmodelUserLeftValuesGetValue = viewmodelUserLeftValues.getValue();
                }


                if (viewmodelUserLeftValuesGetValue != null) {
                    // read viewmodel.userLeftValues.getValue().calories
                    viewmodelUserLeftValuesCalories = viewmodelUserLeftValuesGetValue.getCalories();
                    // read viewmodel.userLeftValues.getValue().proteinsLeft
                    viewmodelUserLeftValuesProteinsLeft = viewmodelUserLeftValuesGetValue.getProteinsLeft();
                    // read viewmodel.userLeftValues.getValue().fatsLeft
                    viewmodelUserLeftValuesFatsLeft = viewmodelUserLeftValuesGetValue.getFatsLeft();
                    // read viewmodel.userLeftValues.getValue().carbsLeft
                    viewmodelUserLeftValuesCarbsLeft = viewmodelUserLeftValuesGetValue.getCarbsLeft();
                }


                if (viewmodelUserLeftValuesCalories != null) {
                    // read viewmodel.userLeftValues.getValue().calories.second
                    viewmodelUserLeftValuesCaloriesSecond = viewmodelUserLeftValuesCalories.getSecond();
                    // read viewmodel.userLeftValues.getValue().calories.first
                    viewmodelUserLeftValuesCaloriesFirst = viewmodelUserLeftValuesCalories.getFirst();
                }


                if (viewmodelUserLeftValuesCaloriesSecond != null) {
                    // read viewmodel.userLeftValues.getValue().calories.second.booleanValue()
                    viewmodelUserLeftValuesCaloriesSecondBooleanValue = viewmodelUserLeftValuesCaloriesSecond.booleanValue();
                }
                if (viewmodelUserLeftValuesCaloriesFirst != null) {
                    // read viewmodel.userLeftValues.getValue().calories.first.intValue()
                    viewmodelUserLeftValuesCaloriesFirstIntValue = viewmodelUserLeftValuesCaloriesFirst.intValue();
                }


                // read String.valueOf(viewmodel.userLeftValues.getValue().calories.first.intValue())
                stringValueOfViewmodelUserLeftValuesCaloriesFirstIntValue = java.lang.String.valueOf(viewmodelUserLeftValuesCaloriesFirstIntValue);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.upMenuCaloriesText, stringValueOfViewmodelUserLeftValuesCaloriesFirstIntValue);
            com.feedapp.app.util.BindingAdapters.nutrientLeftOrOver(this.upMenuCarbsLeft, viewmodelUserLeftValuesCarbsLeft);
            com.feedapp.app.util.BindingAdapters.nutrientLeftOrOver(this.upMenuFatsLeft, viewmodelUserLeftValuesFatsLeft);
            com.feedapp.app.util.BindingAdapters.nutrientLeftOrOver(this.upMenuProteinsLeft, viewmodelUserLeftValuesProteinsLeft);
            com.feedapp.app.util.BindingAdapters.kcalLeftOrOver(this.upMenuSubText, viewmodelUserLeftValuesCaloriesSecondBooleanValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.userLeftValues
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}