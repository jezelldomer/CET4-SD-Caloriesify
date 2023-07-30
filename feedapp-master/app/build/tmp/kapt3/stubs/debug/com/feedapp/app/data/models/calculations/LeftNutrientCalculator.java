package com.feedapp.app.data.models.calculations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J)\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/feedapp/app/data/models/calculations/LeftNutrientCalculator;", "", "()V", "calculateAmount", "Lkotlin/Pair;", "", "", "needed", "day", "Lcom/feedapp/app/data/models/day/Day;", "type", "Lcom/feedapp/app/data/models/BasicNutrientType;", "calculateNutrientAmount", "calculateNutrientProgress", "(Lcom/feedapp/app/data/models/BasicNutrientType;Ljava/lang/Integer;Lcom/feedapp/app/data/models/day/Day;)I", "calculateProgress", "app_debug"})
public final class LeftNutrientCalculator {
    
    /**
     * calculate left amount
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Integer, java.lang.Boolean> calculateAmount(int needed, @org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.models.day.Day day, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.BasicNutrientType type) {
        return null;
    }
    
    /**
     * calculate progress based on left amount
     */
    public final int calculateProgress(int needed, @org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.models.day.Day day, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.BasicNutrientType type) {
        return 0;
    }
    
    /**
     * calculate difference of current and needed amount
     *
     * @return isOverConsumed is true if amount is negative
     */
    private final kotlin.Pair<java.lang.Integer, java.lang.Boolean> calculateNutrientAmount(com.feedapp.app.data.models.BasicNutrientType type, int needed, com.feedapp.app.data.models.day.Day day) {
        return null;
    }
    
    /**
     * calculate difference of current and needed amount in percentage
     * if negative, 100 returned
     */
    private final int calculateNutrientProgress(com.feedapp.app.data.models.BasicNutrientType type, java.lang.Integer needed, com.feedapp.app.data.models.day.Day day) {
        return 0;
    }
    
    public LeftNutrientCalculator() {
        super();
    }
}