package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowDinnerBindingImpl extends RowDinnerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearRowsnacks, 5);
        sViewsWithIds.put(R.id.linearColumnsnacks, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowDinnerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private RowDinnerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.imageUntitleddesignTwo.setTag(null);
        this.linearRowuntitleddesignTwo.setTag(null);
        this.txtGroupFortyOneTwo.setTag(null);
        this.txtRecommendedEightyNine.setTag(null);
        this.txtSnacks.setTag(null);
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
        if (BR.dinnerRowModel == variableId) {
            setDinnerRowModel((com.front_end.app.modules.dinner.data.model.DinnerRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDinnerRowModel(@Nullable com.front_end.app.modules.dinner.data.model.DinnerRowModel DinnerRowModel) {
        this.mDinnerRowModel = DinnerRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.dinnerRowModel);
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
        java.lang.String dinnerRowModelTxtRecommendedEightyNine = null;
        java.lang.String dinnerRowModelTxtSnacks = null;
        java.lang.String dinnerRowModelTxtGroupFortyOneTwo = null;
        com.front_end.app.modules.dinner.data.model.DinnerRowModel dinnerRowModel = mDinnerRowModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (dinnerRowModel != null) {
                    // read dinnerRowModel.txtRecommendedEightyNine
                    dinnerRowModelTxtRecommendedEightyNine = dinnerRowModel.getTxtRecommendedEightyNine();
                    // read dinnerRowModel.txtSnacks
                    dinnerRowModelTxtSnacks = dinnerRowModel.getTxtSnacks();
                    // read dinnerRowModel.txtGroupFortyOneTwo
                    dinnerRowModelTxtGroupFortyOneTwo = dinnerRowModel.getTxtGroupFortyOneTwo();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageUntitleddesignTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageUntitleddesignTwo.getContext(), R.drawable.img_untitleddesign_54x68), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtGroupFortyOneTwo, dinnerRowModelTxtGroupFortyOneTwo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtRecommendedEightyNine, dinnerRowModelTxtRecommendedEightyNine);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtSnacks, dinnerRowModelTxtSnacks);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dinnerRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}