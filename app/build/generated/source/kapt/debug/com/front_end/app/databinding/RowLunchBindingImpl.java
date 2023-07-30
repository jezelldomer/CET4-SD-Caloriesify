package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowLunchBindingImpl extends RowLunchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearRowdinner, 5);
        sViewsWithIds.put(R.id.linearColumndinner, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowLunchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private RowLunchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.imageUntitleddesignOne.setTag(null);
        this.linearRowuntitleddesignOne.setTag(null);
        this.txtDinner.setTag(null);
        this.txtGroupFortyOneOne.setTag(null);
        this.txtRecommended535One.setTag(null);
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
        if (BR.lunchRowModel == variableId) {
            setLunchRowModel((com.front_end.app.modules.lunch.data.model.LunchRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLunchRowModel(@Nullable com.front_end.app.modules.lunch.data.model.LunchRowModel LunchRowModel) {
        this.mLunchRowModel = LunchRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.lunchRowModel);
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
        java.lang.String lunchRowModelTxtGroupFortyOneOne = null;
        java.lang.String lunchRowModelTxtRecommended535One = null;
        com.front_end.app.modules.lunch.data.model.LunchRowModel lunchRowModel = mLunchRowModel;
        java.lang.String lunchRowModelTxtDinner = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (lunchRowModel != null) {
                    // read lunchRowModel.txtGroupFortyOneOne
                    lunchRowModelTxtGroupFortyOneOne = lunchRowModel.getTxtGroupFortyOneOne();
                    // read lunchRowModel.txtRecommended535One
                    lunchRowModelTxtRecommended535One = lunchRowModel.getTxtRecommended535One();
                    // read lunchRowModel.txtDinner
                    lunchRowModelTxtDinner = lunchRowModel.getTxtDinner();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageUntitleddesignOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageUntitleddesignOne.getContext(), R.drawable.img_untitleddesign_61x64), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtDinner, lunchRowModelTxtDinner);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOneOne, lunchRowModelTxtGroupFortyOneOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended535One, lunchRowModelTxtRecommended535One);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): lunchRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}