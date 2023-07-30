package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowSettingBindingImpl extends RowSettingBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageGroup105, 3);
        sViewsWithIds.put(R.id.linearColumnadjustmacronut, 4);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowSettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private RowSettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.linearRowgroup105.setTag(null);
        this.txtAdjustMacroNut.setTag(null);
        this.txtCarbsProtein.setTag(null);
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
        if (BR.settingRowModel == variableId) {
            setSettingRowModel((com.front_end.app.modules.setting.data.model.SettingRowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSettingRowModel(@Nullable com.front_end.app.modules.setting.data.model.SettingRowModel SettingRowModel) {
        this.mSettingRowModel = SettingRowModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.settingRowModel);
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
        java.lang.String settingRowModelTxtAdjustMacroNut = null;
        com.front_end.app.modules.setting.data.model.SettingRowModel settingRowModel = mSettingRowModel;
        java.lang.String settingRowModelTxtCarbsProtein = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (settingRowModel != null) {
                    // read settingRowModel.txtAdjustMacroNut
                    settingRowModelTxtAdjustMacroNut = settingRowModel.getTxtAdjustMacroNut();
                    // read settingRowModel.txtCarbsProtein
                    settingRowModelTxtCarbsProtein = settingRowModel.getTxtCarbsProtein();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAdjustMacroNut, settingRowModelTxtAdjustMacroNut);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCarbsProtein, settingRowModelTxtCarbsProtein);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): settingRowModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}