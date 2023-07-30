package com.feedapp.app.data.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\bX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/feedapp/app/data/interfaces/ViewPagerPageListenerCallback;", "", "isResettingDateOrSwiping", "", "()Z", "setResettingDateOrSwiping", "(Z)V", "scrollState", "", "getScrollState", "()I", "setScrollState", "(I)V", "updateDayAndDate", "", "position", "app_debug"})
public abstract interface ViewPagerPageListenerCallback {
    
    public abstract void updateDayAndDate(int position);
    
    public abstract int getScrollState();
    
    public abstract void setScrollState(int p0);
    
    public abstract boolean isResettingDateOrSwiping();
    
    public abstract void setResettingDateOrSwiping(boolean p0);
}