package com.front_end.app.appcomponents.di;

import java.lang.System;

/**
 * The application class which used to start koin for dependency injection
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0002\u00a8\u0006\n"}, d2 = {"Lcom/front_end/app/appcomponents/di/MyApp;", "Landroid/app/Application;", "()V", "getKoinModules", "", "Lorg/koin/core/module/Module;", "onCreate", "", "preferenceModule", "Companion", "app_debug"})
public final class MyApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull
    public static final com.front_end.app.appcomponents.di.MyApp.Companion Companion = null;
    private static com.front_end.app.appcomponents.di.MyApp instance;
    
    public MyApp() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    /**
     * method which prepares [PreferenceHelper]s koin module
     * @return [Module] - the koin module
     */
    private final org.koin.core.module.Module preferenceModule() {
        return null;
    }
    
    /**
     * method which returns the list of koin module to register
     * @return MutableList<Module> - list of koin modules
     */
    private final java.util.List<org.koin.core.module.Module> getKoinModules() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/front_end/app/appcomponents/di/MyApp$Companion;", "", "()V", "instance", "Lcom/front_end/app/appcomponents/di/MyApp;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * method to get instance of application object
         */
        @org.jetbrains.annotations.NotNull
        public final com.front_end.app.appcomponents.di.MyApp getInstance() {
            return null;
        }
    }
}