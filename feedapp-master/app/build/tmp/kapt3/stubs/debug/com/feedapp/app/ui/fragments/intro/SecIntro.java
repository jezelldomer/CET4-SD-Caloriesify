package com.feedapp.app.ui.fragments.intro;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0006\u0010\u0017\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/feedapp/app/ui/fragments/intro/SecIntro;", "Landroidx/fragment/app/Fragment;", "Lcom/github/paolorotolo/appintro/ISlidePolicy;", "()V", "introViewModel", "Lcom/feedapp/app/viewModels/IntroductionViewModel;", "isPolicyRespected", "", "isVisible", "view", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onUserIllegallyRequestedNextPage", "", "onViewCreated", "setListeners", "setObservers", "unblockButton", "Companion", "app_debug"})
public final class SecIntro extends androidx.fragment.app.Fragment implements com.github.paolorotolo.appintro.ISlidePolicy {
    private com.feedapp.app.viewModels.IntroductionViewModel introViewModel;
    public static final com.feedapp.app.ui.fragments.intro.SecIntro.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public boolean isPolicyRespected() {
        return false;
    }
    
    @java.lang.Override()
    public void onUserIllegallyRequestedNextPage() {
    }
    
    private final boolean isVisible(android.view.View view) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setObservers() {
    }
    
    private final void setListeners(android.view.View view) {
    }
    
    public final void unblockButton() {
    }
    
    public SecIntro() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/feedapp/app/ui/fragments/intro/SecIntro$Companion;", "", "()V", "newInstance", "Lcom/feedapp/app/ui/fragments/intro/SecIntro;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.feedapp.app.ui.fragments.intro.SecIntro newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}