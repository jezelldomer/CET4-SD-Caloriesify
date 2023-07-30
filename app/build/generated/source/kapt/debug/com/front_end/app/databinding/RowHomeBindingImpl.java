package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowHomeBindingImpl extends RowHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumn, 3);
        sViewsWithIds.put(R.id.linearColumnvector, 4);
        sViewsWithIds.put(R.id.imageVector, 5);
        sViewsWithIds.put(R.id.linearColumnvolume, 6);
        sViewsWithIds.put(R.id.imageVolume, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private RowHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.linearRowvector.setTag(null);
        this.txtDiet.setTag(null);
        this.txtJournal.setTag(null);
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
        if (BR.homeRowModel == variableId) {
            setHomeRowModel((com.front_end.app.modules.home.data.model.HomeRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHomeRowModel(@Nullable com.front_end.app.modules.home.data.model.HomeRowModel HomeRowModel) {
        this.mHomeRowModel = HomeRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.homeRowModel);
        super.requestRebind();
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
        com.front_end.app.modules.home.data.model.HomeRowModel homeRowModel = mHomeRowModel;
        java.lang.String homeRowModelTxtDiet = null;
        java.lang.String homeRowModelTxtJournal = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (homeRowModel != null) {
                    // read homeRowModel.txtDiet
                    homeRowModelTxtDiet = homeRowModel.getTxtDiet();
                    // read homeRowModel.txtJournal
                    homeRowModelTxtJournal = homeRowModel.getTxtJournal();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDiet, homeRowModelTxtDiet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtJournal, homeRowModelTxtJournal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): homeRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}