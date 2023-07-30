package com.feedapp.app.data.models.connection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/feedapp/app/data/models/connection/ConnectionLiveData;", "Landroidx/lifecycle/LiveData;", "Lcom/feedapp/app/data/models/connection/ConnectionModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "MOBILE_DATA", "", "getMOBILE_DATA", "()I", "WIFI_DATA", "getWIFI_DATA", "getContext", "()Landroid/content/Context;", "networkReceiver", "Landroid/content/BroadcastReceiver;", "onActive", "", "onInactive", "app_debug"})
public final class ConnectionLiveData extends androidx.lifecycle.LiveData<com.feedapp.app.data.models.connection.ConnectionModel> {
    private final int WIFI_DATA = 0;
    private final int MOBILE_DATA = 0;
    private final android.content.BroadcastReceiver networkReceiver = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @java.lang.Override()
    protected void onActive() {
    }
    
    @java.lang.Override()
    protected void onInactive() {
    }
    
    public final int getWIFI_DATA() {
        return 0;
    }
    
    public final int getMOBILE_DATA() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public ConnectionLiveData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}