package dev.jahidhasanco.bmicalculator.databinding;
import dev.jahidhasanco.bmicalculator.R;
import dev.jahidhasanco.bmicalculator.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView2, 1);
        sViewsWithIds.put(R.id.textView, 2);
        sViewsWithIds.put(R.id.bodyContainer, 3);
        sViewsWithIds.put(R.id.gender_wheel_view, 4);
        sViewsWithIds.put(R.id.weightRecyclerBtn, 5);
        sViewsWithIds.put(R.id.imageView, 6);
        sViewsWithIds.put(R.id.linearLayout, 7);
        sViewsWithIds.put(R.id.height_wheel, 8);
        sViewsWithIds.put(R.id.footerContainer, 9);
        sViewsWithIds.put(R.id.start_button, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (me.sujanpoudel.wheelview.WheelView) bindings[4]
            , (com.cncoderx.wheelview.WheelView) bindings[8]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.ScrollView) bindings[1]
            , (com.example.swipebutton_library.SwipeButton) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}