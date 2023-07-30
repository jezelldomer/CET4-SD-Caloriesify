package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowListeggBindingImpl extends RowListeggBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnegg, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowListeggBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RowListeggBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.linearRowegg.setTag(null);
        this.txtEgg.setTag(null);
        this.txtLargeCounter.setTag(null);
        this.txtOneHundredFortyThree.setTag(null);
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
        if (BR.listeggRowModel == variableId) {
            setListeggRowModel((com.front_end.app.modules.breakfast.data.model.ListeggRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListeggRowModel(@Nullable com.front_end.app.modules.breakfast.data.model.ListeggRowModel ListeggRowModel) {
        this.mListeggRowModel = ListeggRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listeggRowModel);
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
        java.lang.String listeggRowModelTxtEgg = null;
        java.lang.String listeggRowModelTxtLargeCounter = null;
        com.front_end.app.modules.breakfast.data.model.ListeggRowModel listeggRowModel = mListeggRowModel;
        java.lang.String listeggRowModelTxtOneHundredFortyThree = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (listeggRowModel != null) {
                    // read listeggRowModel.txtEgg
                    listeggRowModelTxtEgg = listeggRowModel.getTxtEgg();
                    // read listeggRowModel.txtLargeCounter
                    listeggRowModelTxtLargeCounter = listeggRowModel.getTxtLargeCounter();
                    // read listeggRowModel.txtOneHundredFortyThree
                    listeggRowModelTxtOneHundredFortyThree = listeggRowModel.getTxtOneHundredFortyThree();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEgg, listeggRowModelTxtEgg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLargeCounter, listeggRowModelTxtLargeCounter);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtOneHundredFortyThree, listeggRowModelTxtOneHundredFortyThree);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): listeggRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}