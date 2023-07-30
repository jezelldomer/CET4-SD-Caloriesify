package com.feedapp.app.data.models;

import java.lang.System;

/**
 * represents possible types of bottom navigation tabs
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/feedapp/app/data/models/FragmentNavigationType;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "setCode", "(I)V", "PRODUCTS", "HOME", "RECIPES", "SETTINGS", "app_debug"})
public enum FragmentNavigationType {
    /*public static final*/ PRODUCTS /* = new PRODUCTS(0) */,
    /*public static final*/ HOME /* = new HOME(0) */,
    /*public static final*/ RECIPES /* = new RECIPES(0) */,
    /*public static final*/ SETTINGS /* = new SETTINGS(0) */;
    private int code;
    
    public final int getCode() {
        return 0;
    }
    
    public final void setCode(int p0) {
    }
    
    FragmentNavigationType(int code) {
    }
}