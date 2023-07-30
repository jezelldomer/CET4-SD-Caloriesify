package com.front_end.app.appcomponents.base;

import java.lang.System;

/**
 * Base Controller Functions used in activities, fragments, dialogs, bottomsheet
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/front_end/app/appcomponents/base/BaseControllerFunctionsImpl;", "", "addObservers", "", "onInitialized", "setUpClicks", "app_debug"})
public abstract interface BaseControllerFunctionsImpl {
    
    /**
     * All initialization related work will be done in this method.
     * i.e. Handling lifecycle methods.
     */
    public abstract void onInitialized();
    
    /**
     * All observer listener code will be handled in this method inside controllers.
     */
    public abstract void addObservers();
    
    /**
     * All click action code will be handled in this method inside controllers.
     */
    public abstract void setUpClicks();
    
    /**
     * Base Controller Functions used in activities, fragments, dialogs, bottomsheet
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
        
        /**
         * All initialization related work will be done in this method.
         * i.e. Handling lifecycle methods.
         */
        public static void onInitialized(@org.jetbrains.annotations.NotNull
        com.front_end.app.appcomponents.base.BaseControllerFunctionsImpl $this) {
        }
        
        /**
         * All observer listener code will be handled in this method inside controllers.
         */
        public static void addObservers(@org.jetbrains.annotations.NotNull
        com.front_end.app.appcomponents.base.BaseControllerFunctionsImpl $this) {
        }
    }
}