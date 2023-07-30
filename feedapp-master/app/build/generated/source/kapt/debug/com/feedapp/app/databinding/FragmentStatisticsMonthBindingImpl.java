package com.feedapp.app.databinding;
import com.feedapp.app.R;
import com.feedapp.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentStatisticsMonthBindingImpl extends FragmentStatisticsMonthBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.activity_history_chart_container, 1);
        sViewsWithIds.put(R.id.chart, 2);
        sViewsWithIds.put(R.id.dropdown_container, 3);
        sViewsWithIds.put(R.id.title_month, 4);
        sViewsWithIds.put(R.id.title_nutrient, 5);
        sViewsWithIds.put(R.id.month_til, 6);
        sViewsWithIds.put(R.id.month_dropdown, 7);
        sViewsWithIds.put(R.id.nutrient_til, 8);
        sViewsWithIds.put(R.id.nutrient_dropdown, 9);
        sViewsWithIds.put(R.id.btn_save_pdf, 10);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentStatisticsMonthBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentStatisticsMonthBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[10]
            , (com.github.mikephil.charting.charts.BarChart) bindings[2]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.AutoCompleteTextView) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (android.widget.AutoCompleteTextView) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewmodel((com.feedapp.app.viewModels.StatisticsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.feedapp.app.viewModels.StatisticsViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}