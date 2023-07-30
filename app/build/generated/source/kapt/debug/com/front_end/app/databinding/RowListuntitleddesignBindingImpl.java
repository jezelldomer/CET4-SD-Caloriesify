package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowListuntitleddesignBindingImpl extends RowListuntitleddesignBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearRowlunch, 5);
        sViewsWithIds.put(R.id.linearColumnlunch, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowListuntitleddesignBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private RowListuntitleddesignBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.imageUntitleddesign.setTag(null);
        this.linearRowuntitleddesign.setTag(null);
        this.txtGroupFortyOne.setTag(null);
        this.txtLunch.setTag(null);
        this.txtRecommended535.setTag(null);
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
        if (BR.listuntitleddesignRowModel == variableId) {
            setListuntitleddesignRowModel((com.front_end.app.modules.breakfast.data.model.ListuntitleddesignRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setListuntitleddesignRowModel(@Nullable com.front_end.app.modules.breakfast.data.model.ListuntitleddesignRowModel ListuntitleddesignRowModel) {
        this.mListuntitleddesignRowModel = ListuntitleddesignRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listuntitleddesignRowModel);
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
        java.lang.String listuntitleddesignRowModelTxtGroupFortyOne = null;
        java.lang.String listuntitleddesignRowModelTxtRecommended535 = null;
        com.front_end.app.modules.breakfast.data.model.ListuntitleddesignRowModel listuntitleddesignRowModel = mListuntitleddesignRowModel;
        java.lang.String listuntitleddesignRowModelTxtLunch = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (listuntitleddesignRowModel != null) {
                    // read listuntitleddesignRowModel.txtGroupFortyOne
                    listuntitleddesignRowModelTxtGroupFortyOne = listuntitleddesignRowModel.getTxtGroupFortyOne();
                    // read listuntitleddesignRowModel.txtRecommended535
                    listuntitleddesignRowModelTxtRecommended535 = listuntitleddesignRowModel.getTxtRecommended535();
                    // read listuntitleddesignRowModel.txtLunch
                    listuntitleddesignRowModelTxtLunch = listuntitleddesignRowModel.getTxtLunch();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageUntitleddesign, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageUntitleddesign.getContext(), R.drawable.img_untitleddesign), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOne, listuntitleddesignRowModelTxtGroupFortyOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLunch, listuntitleddesignRowModelTxtLunch);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended535, listuntitleddesignRowModelTxtRecommended535);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): listuntitleddesignRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}