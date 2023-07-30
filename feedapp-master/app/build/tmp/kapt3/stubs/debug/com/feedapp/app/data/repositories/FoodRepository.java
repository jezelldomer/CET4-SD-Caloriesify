package com.feedapp.app.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u001fJ\n\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0006\u0010\"\u001a\u00020\u001fJ\u000e\u0010#\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\nJ\u0016\u0010$\u001a\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0&H\u0002JY\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J\u0010\u00103\u001a\u0004\u0018\u00010\n2\u0006\u00104\u001a\u00020\u001fJ\u0014\u00105\u001a\b\u0012\u0004\u0012\u00020\n0&2\u0006\u0010(\u001a\u00020)J\u0006\u00106\u001a\u00020\u0015J\b\u00107\u001a\u00020\u0013H\u0002J\b\u00108\u001a\u00020\u0013H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2 = {"Lcom/feedapp/app/data/repositories/FoodRepository;", "", "context", "Landroid/content/Context;", "foodProductDao", "Lcom/feedapp/app/data/databases/daos/FoodProductDao;", "(Landroid/content/Context;Lcom/feedapp/app/data/databases/daos/FoodProductDao;)V", "_myProducts", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/feedapp/app/data/models/FoodProduct;", "getContext", "()Landroid/content/Context;", "myProducts", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getMyProducts", "()Landroidx/lifecycle/LiveData;", "checkFirebaseCustomProducts", "", "deleteProduct", "Lkotlinx/coroutines/Job;", "product", "getCalories", "", "caloriesInOnePortion", "hundredMultiplier", "getCustomProducts", "getEnergy", "caloriesInHundredGrams", "getLastIndex", "", "getProductsDocRef", "Lcom/google/firebase/firestore/DocumentReference;", "getSize", "insertProduct", "insertProducts", "products", "", "saveProduct", "name", "", "energy", "proteinsInHundred", "fatsInHundred", "carbsInHundred", "sugar", "sFats", "uFats", "tFats", "(Ljava/lang/String;FFFFFFFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchById", "id", "searchByName", "updateProducts", "uploadProductsFromFirebase", "uploadProductsToFirebase", "app_debug"})
public final class FoodRepository {
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.feedapp.app.data.models.FoodProduct>> _myProducts = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final com.feedapp.app.data.databases.daos.FoodProductDao foodProductDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.feedapp.app.data.models.FoodProduct>> getMyProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.feedapp.app.data.models.FoodProduct searchById(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.feedapp.app.data.models.FoodProduct> searchByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public final void insertProduct(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.FoodProduct product) {
    }
    
    public final int getSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteProduct(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.FoodProduct product) {
        return null;
    }
    
    public final int getLastIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCustomProducts() {
        return null;
    }
    
    private final void checkFirebaseCustomProducts() {
    }
    
    private final com.google.firebase.firestore.DocumentReference getProductsDocRef() {
        return null;
    }
    
    private final void uploadProductsFromFirebase() {
    }
    
    private final kotlinx.coroutines.Job insertProducts(java.util.List<com.feedapp.app.data.models.FoodProduct> products) {
        return null;
    }
    
    private final void uploadProductsToFirebase() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String name, float energy, float proteinsInHundred, float fatsInHundred, float carbsInHundred, float sugar, float sFats, float uFats, float tFats, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p9) {
        return null;
    }
    
    public final float getCalories(float caloriesInOnePortion, float hundredMultiplier) {
        return 0.0F;
    }
    
    public final float getEnergy(float caloriesInHundredGrams) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @javax.inject.Inject()
    public FoodRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.databases.daos.FoodProductDao foodProductDao) {
        super();
    }
}