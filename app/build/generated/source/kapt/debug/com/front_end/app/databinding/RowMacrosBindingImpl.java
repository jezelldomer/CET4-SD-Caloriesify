package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowMacrosBindingImpl extends RowMacrosBinding  {

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

    public RowMacrosBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private RowMacrosBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        if (BR.macrosRowModel == variableId) {
            setMacrosRowModel((com.front_end.app.modules.macros.data.model.MacrosRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMacrosRowModel(@Nullable com.front_end.app.modules.macros.data.model.MacrosRowModel MacrosRowModel) {
        this.mMacrosRowModel = MacrosRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.macrosRowModel);
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
        java.lang.String macrosRowModelTxtJournal = null;
        java.lang.String macrosRowModelTxtDiet = null;
        com.front_end.app.modules.macros.data.model.MacrosRowModel macrosRowModel = mMacrosRowModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (macrosRowModel != null) {
                    // read macrosRowModel.txtJournal
                    macrosRowModelTxtJournal = macrosRowModel.getTxtJournal();
                    // read macrosRowModel.txtDiet
                    macrosRowModelTxtDiet = macrosRowModel.getTxtDiet();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDiet, macrosRowModelTxtDiet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtJournal, macrosRowModelTxtJournal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): macrosRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}