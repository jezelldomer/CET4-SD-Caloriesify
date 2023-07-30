package com.feedapp.app.data.databases.daos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\nH&\u00a8\u0006\r"}, d2 = {"Lcom/feedapp/app/data/databases/daos/LocalProductDao;", "T", "", "searchById", "id", "", "(I)Ljava/lang/Object;", "searchByName", "", "name", "", "searchBySuggestion", "suggestion", "app_debug"})
public abstract interface LocalProductDao<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<T> searchByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.Nullable()
    public abstract T searchById(int id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<java.lang.String> searchBySuggestion(@org.jetbrains.annotations.NotNull()
    java.lang.String suggestion);
}