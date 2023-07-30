package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySchedBindingImpl extends ActivitySchedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameSched, 6);
        sViewsWithIds.put(R.id.linearColumntodaysplan, 7);
        sViewsWithIds.put(R.id.linearRowrectangleten, 8);
        sViewsWithIds.put(R.id.viewRectangleTen, 9);
        sViewsWithIds.put(R.id.frameStackrectanglesix, 10);
        sViewsWithIds.put(R.id.imageRectangleSix, 11);
        sViewsWithIds.put(R.id.linearColumnweekday, 12);
        sViewsWithIds.put(R.id.frameStackarrowfive, 13);
        sViewsWithIds.put(R.id.imageArrowFive, 14);
        sViewsWithIds.put(R.id.floatingBtnFloatingactionbutton, 15);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySchedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivitySchedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[15]
            , (android.widget.FrameLayout) bindings[6]
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[10]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.view.View) bindings[9]
            );
        this.frameStacktodaysplan.setTag(null);
        this.txtHinesDrive.setTag(null);
        this.txtTime.setTag(null);
        this.txtTodaysplan.setTag(null);
        this.txtWeekday.setTag(null);
        this.txtYouKatieFour.setTag(null);
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
        if (BR.schedVM == variableId) {
            setSchedVM((com.front_end.app.modules.sched.data.viewmodel.SchedVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSchedVM(@Nullable com.front_end.app.modules.sched.data.viewmodel.SchedVM SchedVM) {
        this.mSchedVM = SchedVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.schedVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSchedVMSchedModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.sched.data.model.SchedModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSchedVMSchedModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.sched.data.model.SchedModel> SchedVMSchedModel, int fieldId) {
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
        java.lang.String schedVMSchedModelTxtWeekday = null;
        java.lang.String schedVMSchedModelTxtHinesDrive = null;
        java.lang.String schedVMSchedModelTxtTime = null;
        java.lang.String schedVMSchedModelTxtTodaysplan = null;
        java.lang.String schedVMSchedModelTxtYouKatieFour = null;
        com.front_end.app.modules.sched.data.model.SchedModel schedVMSchedModelGetValue = null;
        com.front_end.app.modules.sched.data.viewmodel.SchedVM schedVM = mSchedVM;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.sched.data.model.SchedModel> schedVMSchedModel = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (schedVM != null) {
                    // read schedVM.schedModel
                    schedVMSchedModel = schedVM.getSchedModel();
                }
                updateLiveDataRegistration(0, schedVMSchedModel);


                if (schedVMSchedModel != null) {
                    // read schedVM.schedModel.getValue()
                    schedVMSchedModelGetValue = schedVMSchedModel.getValue();
                }


                if (schedVMSchedModelGetValue != null) {
                    // read schedVM.schedModel.getValue().txtWeekday
                    schedVMSchedModelTxtWeekday = schedVMSchedModelGetValue.getTxtWeekday();
                    // read schedVM.schedModel.getValue().txtHinesDrive
                    schedVMSchedModelTxtHinesDrive = schedVMSchedModelGetValue.getTxtHinesDrive();
                    // read schedVM.schedModel.getValue().txtTime
                    schedVMSchedModelTxtTime = schedVMSchedModelGetValue.getTxtTime();
                    // read schedVM.schedModel.getValue().txtTodaysplan
                    schedVMSchedModelTxtTodaysplan = schedVMSchedModelGetValue.getTxtTodaysplan();
                    // read schedVM.schedModel.getValue().txtYouKatieFour
                    schedVMSchedModelTxtYouKatieFour = schedVMSchedModelGetValue.getTxtYouKatieFour();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtHinesDrive, schedVMSchedModelTxtHinesDrive);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTime, schedVMSchedModelTxtTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtTodaysplan, schedVMSchedModelTxtTodaysplan);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtWeekday, schedVMSchedModelTxtWeekday);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtYouKatieFour, schedVMSchedModelTxtYouKatieFour);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): schedVM.schedModel
        flag 1 (0x2L): schedVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}