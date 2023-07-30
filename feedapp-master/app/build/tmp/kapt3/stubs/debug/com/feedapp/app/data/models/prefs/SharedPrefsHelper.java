package com.feedapp.app.data.models.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\bJ\u0010\u0010\u0013\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0014\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper;", "", "sp", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getLocalSearchPreferred", "", "isHomeGuideShowed", "", "isIntroShowed", "isProductsUiGuideShowed", "saveDontAskDownloadDB", "saveHomeUiGuideShowed", "saveIntroductionPassed", "", "saveLocalDBDownloaded", "code", "saveProductsUiGuideShowed", "saveShowedCautionDialog", "setLocalSearchPreferred", "shouldAskDownloadDB", "shouldShowCautionDialog", "Companion", "app_debug"})
public final class SharedPrefsHelper {
    private final android.content.SharedPreferences sp = null;
    private static final java.lang.String SP_CAUTION_DIALOG = "ShouldShowCautionDialog";
    private static final java.lang.String SP_KEY_INTRO_PRODUCTS = "productsUi";
    public static final com.feedapp.app.data.models.prefs.SharedPrefsHelper.Companion Companion = null;
    
    public final boolean saveDontAskDownloadDB() {
        return false;
    }
    
    public final boolean saveLocalDBDownloaded(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return false;
    }
    
    public final boolean shouldAskDownloadDB() {
        return false;
    }
    
    public final boolean isIntroShowed() {
        return false;
    }
    
    public final boolean isHomeGuideShowed() {
        return false;
    }
    
    public final void saveIntroductionPassed() {
    }
    
    public final boolean saveHomeUiGuideShowed() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocalSearchPreferred() {
        return null;
    }
    
    public final boolean setLocalSearchPreferred(@org.jetbrains.annotations.Nullable()
    java.lang.String code) {
        return false;
    }
    
    public final boolean shouldShowCautionDialog() {
        return false;
    }
    
    public final boolean saveShowedCautionDialog() {
        return false;
    }
    
    public final boolean isProductsUiGuideShowed() {
        return false;
    }
    
    public final void saveProductsUiGuideShowed() {
    }
    
    @javax.inject.Inject()
    public SharedPrefsHelper(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sp) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/feedapp/app/data/models/prefs/SharedPrefsHelper$Companion;", "", "()V", "SP_CAUTION_DIALOG", "", "SP_KEY_INTRO_PRODUCTS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}