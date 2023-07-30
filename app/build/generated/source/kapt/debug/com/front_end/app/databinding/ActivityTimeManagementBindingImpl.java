package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTimeManagementBindingImpl extends ActivityTimeManagementBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbarToolbar, 5);
        sViewsWithIds.put(R.id.linearRowarrowfive, 6);
        sViewsWithIds.put(R.id.frameStackarrowfive, 7);
        sViewsWithIds.put(R.id.imageArrowFive, 8);
        sViewsWithIds.put(R.id.btnCheckmark, 9);
        sViewsWithIds.put(R.id.linearRowarrowleft, 10);
        sViewsWithIds.put(R.id.imageArrowleft, 11);
        sViewsWithIds.put(R.id.imageFrameTen, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTimeManagementBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityTimeManagementBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[9]
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.appcompat.widget.Toolbar) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        this.linearTimemanagement.setTag(null);
        this.txtActivity.setTag(null);
        this.txtTime.setTag(null);
        this.txtUntitled.setTag(null);
        this.txtWith.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.timeManagementVM == variableId) {
            setTimeManagementVM((com.front_end.app.modules.timemanagement.data.viewmodel.TimeManagementVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTimeManagementVM(@Nullable com.front_end.app.modules.timemanagement.data.viewmodel.TimeManagementVM TimeManagementVM) {
        this.mTimeManagementVM = TimeManagementVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.timeManagementVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTimeManagementVMTimeManagementModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.timemanagement.data.model.TimeManagementModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTimeManagementVMTimeManagementModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.timemanagement.data.model.TimeManagementModel> TimeManagementVMTimeManagementModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String timeManagementVMTimeManagementModelTxtTime = null;
        java.lang.String timeManagementVMTimeManagementModelTxtWith = null;
        java.lang.String timeManagementVMTimeManagementModelTxtUntitled = null;
        com.front_end.app.modules.timemanagement.data.viewmodel.TimeManagementVM timeManagementVM = mTimeManagementVM;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.timemanagement.data.model.TimeManagementModel> timeManagementVMTimeManagementModel = null;
        java.lang.String timeManagementVMTimeManagementModelTxtActivity = null;
        com.front_end.app.modules.timemanagement.data.model.TimeManagementModel timeManagementVMTimeManagementModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (timeManagementVM != null) {
                    // read timeManagementVM.timeManagementModel
                    timeManagementVMTimeManagementModel = timeManagementVM.getTimeManagementModel();
                }
                updateLiveDataRegistration(0, timeManagementVMTimeManagementModel);


                if (timeManagementVMTimeManagementModel != null) {
                    // read timeManagementVM.timeManagementModel.getValue()
                    timeManagementVMTimeManagementModelGetValue = timeManagementVMTimeManagementModel.getValue();
                }


                if (timeManagementVMTimeManagementModelGetValue != null) {
                    // read timeManagementVM.timeManagementModel.getValue().txtTime
                    timeManagementVMTimeManagementModelTxtTime = timeManagementVMTimeManagementModelGetValue.getTxtTime();
                    // read timeManagementVM.timeManagementModel.getValue().txtWith
                    timeManagementVMTimeManagementModelTxtWith = timeManagementVMTimeManagementModelGetValue.getTxtWith();
                    // read timeManagementVM.timeManagementModel.getValue().txtUntitled
                    timeManagementVMTimeManagementModelTxtUntitled = timeManagementVMTimeManagementModelGetValue.getTxtUntitled();
                    // read timeManagementVM.timeManagementModel.getValue().txtActivity
                    timeManagementVMTimeManagementModelTxtActivity = timeManagementVMTimeManagementModelGetValue.getTxtActivity();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtActivity, timeManagementVMTimeManagementModelTxtActivity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTime, timeManagementVMTimeManagementModelTxtTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtUntitled, timeManagementVMTimeManagementModelTxtUntitled);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWith, timeManagementVMTimeManagementModelTxtWith);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): timeManagementVM.timeManagementModel
        flag 1 (0x2L): timeManagementVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}