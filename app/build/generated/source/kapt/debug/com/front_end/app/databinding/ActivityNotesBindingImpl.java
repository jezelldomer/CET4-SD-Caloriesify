package com.front_end.app.databinding;
import com.front_end.app.R;
import com.front_end.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNotesBindingImpl extends ActivityNotesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frameNotes, 2);
        sViewsWithIds.put(R.id.linearColumnarrowfive, 3);
        sViewsWithIds.put(R.id.toolbarToolbar, 4);
        sViewsWithIds.put(R.id.linearRowiconhamburge, 5);
        sViewsWithIds.put(R.id.linearRowarrowfive, 6);
        sViewsWithIds.put(R.id.frameStackarrowfive, 7);
        sViewsWithIds.put(R.id.imageArrowFive, 8);
        sViewsWithIds.put(R.id.imageIconhamburge, 9);
        sViewsWithIds.put(R.id.searchViewSearchbox, 10);
        sViewsWithIds.put(R.id.floatingBtnFloatingactionbutton, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNotesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityNotesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[11]
            , (android.widget.FrameLayout) bindings[2]
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[5]
            , (androidx.appcompat.widget.SearchView) bindings[10]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.frameStacknotes.setTag(null);
        this.txtNotes.setTag(null);
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
        if (BR.notesVM == variableId) {
            setNotesVM((com.front_end.app.modules.notes.data.viewmodel.NotesVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNotesVM(@Nullable com.front_end.app.modules.notes.data.viewmodel.NotesVM NotesVM) {
        this.mNotesVM = NotesVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.notesVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNotesVMNotesModel((androidx.lifecycle.MutableLiveData<com.front_end.app.modules.notes.data.model.NotesModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNotesVMNotesModel(androidx.lifecycle.MutableLiveData<com.front_end.app.modules.notes.data.model.NotesModel> NotesVMNotesModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.front_end.app.modules.notes.data.model.NotesModel> notesVMNotesModel = null;
        java.lang.String notesVMNotesModelTxtNotes = null;
        com.front_end.app.modules.notes.data.viewmodel.NotesVM notesVM = mNotesVM;
        com.front_end.app.modules.notes.data.model.NotesModel notesVMNotesModelGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (notesVM != null) {
                    // read notesVM.notesModel
                    notesVMNotesModel = notesVM.getNotesModel();
                }
                updateLiveDataRegistration(0, notesVMNotesModel);


                if (notesVMNotesModel != null) {
                    // read notesVM.notesModel.getValue()
                    notesVMNotesModelGetValue = notesVMNotesModel.getValue();
                }


                if (notesVMNotesModelGetValue != null) {
                    // read notesVM.notesModel.getValue().txtNotes
                    notesVMNotesModelTxtNotes = notesVMNotesModelGetValue.getTxtNotes();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNotes, notesVMNotesModelTxtNotes);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): notesVM.notesModel
        flag 1 (0x2L): notesVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}