package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoadingPageBindingImpl extends ActivityLoadingPageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLoadingPageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityLoadingPageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.frameLoadingpage.setTag(null);
        this.imageImageFive.setTag(null);
        this.imageImageSix.setTag(null);
        this.txtEatwellasyou.setTag(null);
        this.txtProcessingAn.setTag(null);
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
        if (BR.loadingPageVM == variableId) {
            setLoadingPageVM((com.front_end.app.modules.loadingpage.data.viewmodel.LoadingPageVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoadingPageVM(@Nullable com.front_end.app.modules.loadingpage.data.viewmodel.LoadingPageVM LoadingPageVM) {
        this.mLoadingPageVM = LoadingPageVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.loadingPageVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoadingPageVMLoadingPageModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.loadingpage.data.model.LoadingPageModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoadingPageVMLoadingPageModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.loadingpage.data.model.LoadingPageModel> LoadingPageVMLoadingPageModel, int fieldId) {
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
        java.lang.String loadingPageVMLoadingPageModelTxtEatwellasyou = null;
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.loadingpage.data.model.LoadingPageModel> loadingPageVMLoadingPageModel = null;
        com.front_end.app.modules.loadingpage.data.viewmodel.LoadingPageVM loadingPageVM = mLoadingPageVM;
        java.lang.String loadingPageVMLoadingPageModelTxtProcessingAn = null;
        com.front_end.app.modules.loadingpage.data.model.LoadingPageModel loadingPageVMLoadingPageModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (loadingPageVM != null) {
                    // read loadingPageVM.loadingPageModel
                    loadingPageVMLoadingPageModel = loadingPageVM.getLoadingPageModel();
                }
                updateLiveDataRegistration(0, loadingPageVMLoadingPageModel);


                if (loadingPageVMLoadingPageModel != null) {
                    // read loadingPageVM.loadingPageModel.getValue()
                    loadingPageVMLoadingPageModelGetValue = loadingPageVMLoadingPageModel.getValue();
                }


                if (loadingPageVMLoadingPageModelGetValue != null) {
                    // read loadingPageVM.loadingPageModel.getValue().txtEatwellasyou
                    loadingPageVMLoadingPageModelTxtEatwellasyou = loadingPageVMLoadingPageModelGetValue.getTxtEatwellasyou();
                    // read loadingPageVM.loadingPageModel.getValue().txtProcessingAn
                    loadingPageVMLoadingPageModelTxtProcessingAn = loadingPageVMLoadingPageModelGetValue.getTxtProcessingAn();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageFive, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageFive.getContext(), R.drawable.img_image5), (float)0f, (boolean)false);
            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageSix, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageSix.getContext(), R.drawable.img_image6), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEatwellasyou, loadingPageVMLoadingPageModelTxtEatwellasyou);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtProcessingAn, loadingPageVMLoadingPageModelTxtProcessingAn);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loadingPageVM.loadingPageModel
        flag 1 (0x2L): loadingPageVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}