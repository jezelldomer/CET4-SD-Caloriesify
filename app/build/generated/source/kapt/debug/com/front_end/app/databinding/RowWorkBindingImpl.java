package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowWorkBindingImpl extends RowWorkBinding  {

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

    public RowWorkBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private RowWorkBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        if (BR.workRowModel == variableId) {
            setWorkRowModel((com.front_end.app.modules.work.data.model.WorkRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setWorkRowModel(@Nullable com.front_end.app.modules.work.data.model.WorkRowModel WorkRowModel) {
        this.mWorkRowModel = WorkRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.workRowModel);
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
        java.lang.String workRowModelTxtJournal = null;
        java.lang.String workRowModelTxtDiet = null;
        com.front_end.app.modules.work.data.model.WorkRowModel workRowModel = mWorkRowModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (workRowModel != null) {
                    // read workRowModel.txtJournal
                    workRowModelTxtJournal = workRowModel.getTxtJournal();
                    // read workRowModel.txtDiet
                    workRowModelTxtDiet = workRowModel.getTxtDiet();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDiet, workRowModelTxtDiet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtJournal, workRowModelTxtJournal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): workRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}