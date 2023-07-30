package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowWaterBindingImpl extends RowWaterBinding  {

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

    public RowWaterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private RowWaterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        this.txtGroupFortyOneOne.setTag(null);
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
        if (BR.waterRowModel == variableId) {
            setWaterRowModel((com.front_end.app.modules.water.data.model.WaterRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setWaterRowModel(@Nullable com.front_end.app.modules.water.data.model.WaterRowModel WaterRowModel) {
        this.mWaterRowModel = WaterRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.waterRowModel);
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
        java.lang.String waterRowModelTxtLunch = null;
        java.lang.String waterRowModelTxtGroupFortyOneOne = null;
        com.front_end.app.modules.water.data.model.WaterRowModel waterRowModel = mWaterRowModel;
        java.lang.String waterRowModelTxtRecommended535 = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (waterRowModel != null) {
                    // read waterRowModel.txtLunch
                    waterRowModelTxtLunch = waterRowModel.getTxtLunch();
                    // read waterRowModel.txtGroupFortyOneOne
                    waterRowModelTxtGroupFortyOneOne = waterRowModel.getTxtGroupFortyOneOne();
                    // read waterRowModel.txtRecommended535
                    waterRowModelTxtRecommended535 = waterRowModel.getTxtRecommended535();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageUntitleddesign, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageUntitleddesign.getContext(), R.drawable.img_untitleddesign), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOneOne, waterRowModelTxtGroupFortyOneOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLunch, waterRowModelTxtLunch);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommended535, waterRowModelTxtRecommended535);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): waterRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}