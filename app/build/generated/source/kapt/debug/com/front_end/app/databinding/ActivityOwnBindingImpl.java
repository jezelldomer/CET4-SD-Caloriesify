package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityOwnBindingImpl extends ActivityOwnBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumncreateyourown, 6);
        sViewsWithIds.put(R.id.linearRowcarbs, 7);
        sViewsWithIds.put(R.id.linearColumn00, 8);
        sViewsWithIds.put(R.id.btn00, 9);
        sViewsWithIds.put(R.id.linearRowprotein, 10);
        sViewsWithIds.put(R.id.linearColumn00One, 11);
        sViewsWithIds.put(R.id.btn00One, 12);
        sViewsWithIds.put(R.id.linearRowfats, 13);
        sViewsWithIds.put(R.id.linearColumn00Two, 14);
        sViewsWithIds.put(R.id.btn00Two, 15);
        sViewsWithIds.put(R.id.btnProceed, 16);
        sViewsWithIds.put(R.id.btnBack, 17);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityOwnBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityOwnBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (androidx.appcompat.widget.AppCompatButton) bindings[12]
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (androidx.appcompat.widget.AppCompatButton) bindings[17]
            , (androidx.appcompat.widget.AppCompatButton) bindings[16]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            );
        this.frameOwn.setTag(null);
        this.image360F247848348.setTag(null);
        this.txtCarbs.setTag(null);
        this.txtCreateyourOwn.setTag(null);
        this.txtFats.setTag(null);
        this.txtProtein.setTag(null);
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
        if (BR.ownVM == variableId) {
            setOwnVM((com.front_end.app.modules.own.data.viewmodel.OwnVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOwnVM(@Nullable com.front_end.app.modules.own.data.viewmodel.OwnVM OwnVM) {
        this.mOwnVM = OwnVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.ownVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeOwnVMOwnModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.own.data.model.OwnModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOwnVMOwnModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.own.data.model.OwnModel> OwnVMOwnModel, int fieldId) {
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
        java.lang.String ownVMOwnModelTxtFats = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.own.data.model.OwnModel> ownVMOwnModel = null;
        java.lang.String ownVMOwnModelTxtProtein = null;
        java.lang.String ownVMOwnModelTxtCarbs = null;
        java.lang.String ownVMOwnModelTxtCreateyourOwn = null;
        com.front_end.app.modules.own.data.model.OwnModel ownVMOwnModelGetValue = null;
        com.front_end.app.modules.own.data.viewmodel.OwnVM ownVM = mOwnVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (ownVM != null) {
                    // read ownVM.ownModel
                    ownVMOwnModel = ownVM.getOwnModel();
                }
                updateLiveDataRegistration(0, ownVMOwnModel);


                if (ownVMOwnModel != null) {
                    // read ownVM.ownModel.getValue()
                    ownVMOwnModelGetValue = ownVMOwnModel.getValue();
                }


                if (ownVMOwnModelGetValue != null) {
                    // read ownVM.ownModel.getValue().txtFats
                    ownVMOwnModelTxtFats = ownVMOwnModelGetValue.getTxtFats();
                    // read ownVM.ownModel.getValue().txtProtein
                    ownVMOwnModelTxtProtein = ownVMOwnModelGetValue.getTxtProtein();
                    // read ownVM.ownModel.getValue().txtCarbs
                    ownVMOwnModelTxtCarbs = ownVMOwnModelGetValue.getTxtCarbs();
                    // read ownVM.ownModel.getValue().txtCreateyourOwn
                    ownVMOwnModelTxtCreateyourOwn = ownVMOwnModelGetValue.getTxtCreateyourOwn();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.image360F247848348, androidx.appcompat.content.res.AppCompatResources.getDrawable(image360F247848348.getContext(), R.drawable.img_360f247848348_887x427), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCarbs, ownVMOwnModelTxtCarbs);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCreateyourOwn, ownVMOwnModelTxtCreateyourOwn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFats, ownVMOwnModelTxtFats);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtProtein, ownVMOwnModelTxtProtein);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): ownVM.ownModel
        flag 1 (0x2L): ownVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}