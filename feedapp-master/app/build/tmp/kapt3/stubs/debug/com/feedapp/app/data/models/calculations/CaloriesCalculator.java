package com.feedapp.app.data.models.calculations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002JO\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/feedapp/app/data/models/calculations/CaloriesCalculator;", "", "()V", "calculateCalories", "", "areValuesValid", "", "weight", "height", "age", "activityLevel", "Lcom/feedapp/app/data/models/user/UserActivityLevel;", "sex", "goal", "Lcom/feedapp/app/data/models/user/UserGoal;", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/feedapp/app/data/models/user/UserActivityLevel;Ljava/lang/Boolean;Lcom/feedapp/app/data/models/user/UserGoal;)I", "Companion", "app_debug"})
public final class CaloriesCalculator {
    public static final int CALORIES_MINIMUM = 1200;
    public static final double LOSE_WEIGHT_MULTIPLIER = 0.85;
    public static final double GAIN_WEIGHT_MULTIPLIER = 1.15;
    public static final com.feedapp.app.data.models.calculations.CaloriesCalculator.Companion Companion = null;
    
    /**
     * Calculate calories based on users characteristics
     */
    public final int calculateCalories(boolean areValuesValid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer weight, @org.jetbrains.annotations.Nullable()
    java.lang.Integer height, @org.jetbrains.annotations.Nullable()
    java.lang.Integer age, @org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.models.user.UserActivityLevel activityLevel, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean sex, @org.jetbrains.annotations.Nullable()
    com.feedapp.app.data.models.user.UserGoal goal) {
        return 0;
    }
    
    public CaloriesCalculator() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/feedapp/app/data/models/calculations/CaloriesCalculator$Companion;", "", "()V", "CALORIES_MINIMUM", "", "GAIN_WEIGHT_MULTIPLIER", "", "LOSE_WEIGHT_MULTIPLIER", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}