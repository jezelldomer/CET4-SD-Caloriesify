package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityWelcomeScreenBindingImpl extends ActivityWelcomeScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btnGetStarted, 2);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityWelcomeScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ActivityWelcomeScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[0]
            );
        this.imageRectangleThirteen.setTag(null);
        this.linearWelcomeScreen.setTag(null);
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
        if (BR.welcomeScreenVM == variableId) {
            setWelcomeScreenVM((com.front_end.app.modules.welcomescreen.data.viewmodel.WelcomeScreenVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setWelcomeScreenVM(@Nullable com.front_end.app.modules.welcomescreen.data.viewmodel.WelcomeScreenVM WelcomeScreenVM) {
        this.mWelcomeScreenVM = WelcomeScreenVM;
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
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            com.front_end.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageRectangleThirteen, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageRectangleThirteen.getContext(), R.drawable.img_rectangle13), (float)0f, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): welcomeScreenVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}