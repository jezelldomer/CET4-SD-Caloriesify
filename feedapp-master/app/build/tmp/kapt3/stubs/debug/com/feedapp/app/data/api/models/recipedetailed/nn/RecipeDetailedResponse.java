package com.feedapp.app.data.api.models.recipedetailed.nn;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0003\b\u0084\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010$\u001a\u00020\u0014\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\b\b\u0002\u0010&\u001a\u00020\b\u0012\b\b\u0002\u0010\'\u001a\u00020\n\u0012\b\b\u0002\u0010(\u001a\u00020\b\u0012\b\b\u0002\u0010)\u001a\u00020\b\u0012\b\b\u0002\u0010*\u001a\u00020\b\u0012\b\b\u0002\u0010+\u001a\u00020\b\u0012\b\b\u0002\u0010,\u001a\u00020\u0014\u0012\b\b\u0002\u0010-\u001a\u00020\b\u0012\b\b\u0002\u0010.\u001a\u00020/\u00a2\u0006\u0002\u00100J\n\u0010\u008c\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\bH\u00c6\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010NJ\n\u0010\u0090\u0001\u001a\u00020\u0003H\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\u001cH\u00c6\u0003J\u0010\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0010\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\u001fH\u00c6\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003H\u00c6\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0014H\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\u0014H\u00c6\u0003J\n\u0010\u00a8\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u00020/H\u00c6\u0003J\f\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010\u00ab\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003J\n\u0010\u00ac\u0001\u001a\u00020\bH\u00c6\u0003J\u0010\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003J\u0010\u0010\u00ae\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u00c6\u0003J\u0010\u0010\u00af\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005H\u00c6\u0003J\u00aa\u0003\u0010\u00b0\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0002\u0010\f\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010$\u001a\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\'\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\b2\b\b\u0002\u0010+\u001a\u00020\b2\b\b\u0002\u0010,\u001a\u00020\u00142\b\b\u0002\u0010-\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020/H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00b1\u0001J\u0016\u0010\u00b2\u0001\u001a\u00020\b2\n\u0010\u00b3\u0001\u001a\u0005\u0018\u00010\u00b4\u0001H\u00d6\u0003J\n\u0010\u00b5\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u00b6\u0001\u001a\u00020\nH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u00106\"\u0004\bB\u00108R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010>\"\u0004\bF\u0010@R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010>\"\u0004\bH\u0010@R\u001a\u0010\u0011\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010:\"\u0004\bJ\u0010<R\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u00106\"\u0004\bL\u00108R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010Q\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u00102\"\u0004\bS\u00104R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010:\"\u0004\bU\u0010<R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010:\"\u0004\bW\u0010<R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010:\"\u0004\bY\u0010<R\u001a\u0010\u0019\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u00106\"\u0004\b[\u00108R\u001a\u0010\u001a\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u00106\"\u0004\b]\u00108R\u001a\u0010\u001b\u001a\u00020\u001cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010>\"\u0004\bc\u0010@R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u00102\"\u0004\bi\u00104R\u001a\u0010!\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u00102\"\u0004\bk\u00104R\u001c\u0010\"\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010:\"\u0004\bm\u0010<R\u001c\u0010#\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010:\"\u0004\bo\u0010<R\u001a\u0010$\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001a\u0010%\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010:\"\u0004\bu\u0010<R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010>\"\u0004\bw\u0010@R\u001a\u0010&\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u00106\"\u0004\by\u00108R\u001a\u0010\'\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010:\"\u0004\b{\u0010<R\u001a\u0010(\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u00106\"\u0004\b}\u00108R\u001a\u0010)\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u00106\"\u0004\b\u007f\u00108R\u001c\u0010*\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u00106\"\u0005\b\u0081\u0001\u00108R\u001c\u0010+\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u00106\"\u0005\b\u0083\u0001\u00108R\u001c\u0010,\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010q\"\u0005\b\u0085\u0001\u0010sR\u001c\u0010-\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u00106\"\u0005\b\u0087\u0001\u00108R\u001e\u0010.\u001a\u00020/X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001\u00a8\u0006\u00b7\u0001"}, d2 = {"Lcom/feedapp/app/data/api/models/recipedetailed/nn/RecipeDetailedResponse;", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/RecipeDetailedResponseI;", "aggregateLikes", "", "steps", "", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/AnalyzedInstruction;", "cheap", "", "creditsText", "", "cuisines", "dairyFree", "diets", "dishTypes", "extendedIngredients", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/ExtendedIngredient;", "gaps", "glutenFree", "healthScore", "", "id", "image", "imageType", "instructions", "ketogenic", "lowFodmap", "nutrition", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/Nutrition;", "occasions", "pricePerServing", "", "readyInMinutes", "servings", "sourceName", "sourceUrl", "spoonacularScore", "spoonacularSourceUrl", "sustainable", "title", "vegan", "vegetarian", "veryHealthy", "veryPopular", "weightWatcherSmartPoints", "whole30", "winePairing", "Lcom/feedapp/app/data/api/models/recipedetailed/nn/WinePairing;", "(ILjava/util/List;ZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/Float;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/feedapp/app/data/api/models/recipedetailed/nn/Nutrition;Ljava/util/List;DIILjava/lang/String;Ljava/lang/String;FLjava/lang/String;ZLjava/lang/String;ZZZZFZLcom/feedapp/app/data/api/models/recipedetailed/nn/WinePairing;)V", "getAggregateLikes", "()I", "setAggregateLikes", "(I)V", "getCheap", "()Z", "setCheap", "(Z)V", "getCreditsText", "()Ljava/lang/String;", "setCreditsText", "(Ljava/lang/String;)V", "getCuisines", "()Ljava/util/List;", "setCuisines", "(Ljava/util/List;)V", "getDairyFree", "setDairyFree", "getDiets", "setDiets", "getDishTypes", "setDishTypes", "getExtendedIngredients", "setExtendedIngredients", "getGaps", "setGaps", "getGlutenFree", "setGlutenFree", "getHealthScore", "()Ljava/lang/Float;", "setHealthScore", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getId", "setId", "getImage", "setImage", "getImageType", "setImageType", "getInstructions", "setInstructions", "getKetogenic", "setKetogenic", "getLowFodmap", "setLowFodmap", "getNutrition", "()Lcom/feedapp/app/data/api/models/recipedetailed/nn/Nutrition;", "setNutrition", "(Lcom/feedapp/app/data/api/models/recipedetailed/nn/Nutrition;)V", "getOccasions", "setOccasions", "getPricePerServing", "()D", "setPricePerServing", "(D)V", "getReadyInMinutes", "setReadyInMinutes", "getServings", "setServings", "getSourceName", "setSourceName", "getSourceUrl", "setSourceUrl", "getSpoonacularScore", "()F", "setSpoonacularScore", "(F)V", "getSpoonacularSourceUrl", "setSpoonacularSourceUrl", "getSteps", "setSteps", "getSustainable", "setSustainable", "getTitle", "setTitle", "getVegan", "setVegan", "getVegetarian", "setVegetarian", "getVeryHealthy", "setVeryHealthy", "getVeryPopular", "setVeryPopular", "getWeightWatcherSmartPoints", "setWeightWatcherSmartPoints", "getWhole30", "setWhole30", "getWinePairing", "()Lcom/feedapp/app/data/api/models/recipedetailed/nn/WinePairing;", "setWinePairing", "(Lcom/feedapp/app/data/api/models/recipedetailed/nn/WinePairing;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/util/List;ZLjava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/lang/Float;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLcom/feedapp/app/data/api/models/recipedetailed/nn/Nutrition;Ljava/util/List;DIILjava/lang/String;Ljava/lang/String;FLjava/lang/String;ZLjava/lang/String;ZZZZFZLcom/feedapp/app/data/api/models/recipedetailed/nn/WinePairing;)Lcom/feedapp/app/data/api/models/recipedetailed/nn/RecipeDetailedResponse;", "equals", "other", "", "hashCode", "toString", "app_debug"})
public final class RecipeDetailedResponse implements com.feedapp.app.data.api.models.recipedetailed.nn.RecipeDetailedResponseI {
    private int aggregateLikes;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "analyzedInstructions")
    private java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.AnalyzedInstruction> steps;
    private boolean cheap;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String creditsText;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> cuisines;
    private boolean dairyFree;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> diets;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> dishTypes;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.ExtendedIngredient> extendedIngredients;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String gaps;
    private boolean glutenFree;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float healthScore;
    private int id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String image;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String imageType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String instructions;
    private boolean ketogenic;
    private boolean lowFodmap;
    @org.jetbrains.annotations.NotNull()
    private com.feedapp.app.data.api.models.recipedetailed.nn.Nutrition nutrition;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> occasions;
    private double pricePerServing;
    private int readyInMinutes;
    private int servings;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sourceName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sourceUrl;
    private float spoonacularScore;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String spoonacularSourceUrl;
    private boolean sustainable;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    private boolean vegan;
    private boolean vegetarian;
    private boolean veryHealthy;
    private boolean veryPopular;
    private float weightWatcherSmartPoints;
    private boolean whole30;
    @org.jetbrains.annotations.NotNull()
    private com.feedapp.app.data.api.models.recipedetailed.nn.WinePairing winePairing;
    
    public final int getAggregateLikes() {
        return 0;
    }
    
    public final void setAggregateLikes(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.AnalyzedInstruction> getSteps() {
        return null;
    }
    
    public final void setSteps(@org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.AnalyzedInstruction> p0) {
    }
    
    public final boolean getCheap() {
        return false;
    }
    
    public final void setCheap(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreditsText() {
        return null;
    }
    
    public final void setCreditsText(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCuisines() {
        return null;
    }
    
    public final void setCuisines(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public final boolean getDairyFree() {
        return false;
    }
    
    public final void setDairyFree(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDiets() {
        return null;
    }
    
    public final void setDiets(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDishTypes() {
        return null;
    }
    
    public final void setDishTypes(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.ExtendedIngredient> getExtendedIngredients() {
        return null;
    }
    
    public final void setExtendedIngredients(@org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.ExtendedIngredient> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGaps() {
        return null;
    }
    
    public final void setGaps(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getGlutenFree() {
        return false;
    }
    
    public final void setGlutenFree(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getHealthScore() {
        return null;
    }
    
    public final void setHealthScore(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageType() {
        return null;
    }
    
    public final void setImageType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInstructions() {
        return null;
    }
    
    public final void setInstructions(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getKetogenic() {
        return false;
    }
    
    public final void setKetogenic(boolean p0) {
    }
    
    public final boolean getLowFodmap() {
        return false;
    }
    
    public final void setLowFodmap(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.feedapp.app.data.api.models.recipedetailed.nn.Nutrition getNutrition() {
        return null;
    }
    
    @java.lang.Override()
    public void setNutrition(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.api.models.recipedetailed.nn.Nutrition p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getOccasions() {
        return null;
    }
    
    public final void setOccasions(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public final double getPricePerServing() {
        return 0.0;
    }
    
    public final void setPricePerServing(double p0) {
    }
    
    public final int getReadyInMinutes() {
        return 0;
    }
    
    public final void setReadyInMinutes(int p0) {
    }
    
    public final int getServings() {
        return 0;
    }
    
    public final void setServings(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSourceName() {
        return null;
    }
    
    public final void setSourceName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSourceUrl() {
        return null;
    }
    
    public final void setSourceUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final float getSpoonacularScore() {
        return 0.0F;
    }
    
    public final void setSpoonacularScore(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSpoonacularSourceUrl() {
        return null;
    }
    
    public final void setSpoonacularSourceUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getSustainable() {
        return false;
    }
    
    public final void setSustainable(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getVegan() {
        return false;
    }
    
    public final void setVegan(boolean p0) {
    }
    
    public final boolean getVegetarian() {
        return false;
    }
    
    public final void setVegetarian(boolean p0) {
    }
    
    public final boolean getVeryHealthy() {
        return false;
    }
    
    public final void setVeryHealthy(boolean p0) {
    }
    
    public final boolean getVeryPopular() {
        return false;
    }
    
    public final void setVeryPopular(boolean p0) {
    }
    
    public final float getWeightWatcherSmartPoints() {
        return 0.0F;
    }
    
    public final void setWeightWatcherSmartPoints(float p0) {
    }
    
    public final boolean getWhole30() {
        return false;
    }
    
    public final void setWhole30(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.api.models.recipedetailed.nn.WinePairing getWinePairing() {
        return null;
    }
    
    public final void setWinePairing(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.api.models.recipedetailed.nn.WinePairing p0) {
    }
    
    public RecipeDetailedResponse(int aggregateLikes, @org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.AnalyzedInstruction> steps, boolean cheap, @org.jetbrains.annotations.Nullable()
    java.lang.String creditsText, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> cuisines, boolean dairyFree, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> diets, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> dishTypes, @org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.ExtendedIngredient> extendedIngredients, @org.jetbrains.annotations.NotNull()
    java.lang.String gaps, boolean glutenFree, @org.jetbrains.annotations.Nullable()
    java.lang.Float healthScore, int id, @org.jetbrains.annotations.Nullable()
    java.lang.String image, @org.jetbrains.annotations.Nullable()
    java.lang.String imageType, @org.jetbrains.annotations.Nullable()
    java.lang.String instructions, boolean ketogenic, boolean lowFodmap, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.api.models.recipedetailed.nn.Nutrition nutrition, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> occasions, double pricePerServing, int readyInMinutes, int servings, @org.jetbrains.annotations.Nullable()
    java.lang.String sourceName, @org.jetbrains.annotations.Nullable()
    java.lang.String sourceUrl, float spoonacularScore, @org.jetbrains.annotations.NotNull()
    java.lang.String spoonacularSourceUrl, boolean sustainable, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean vegan, boolean vegetarian, boolean veryHealthy, boolean veryPopular, float weightWatcherSmartPoints, boolean whole30, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.api.models.recipedetailed.nn.WinePairing winePairing) {
        super();
    }
    
    public RecipeDetailedResponse() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.AnalyzedInstruction> component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.ExtendedIngredient> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    public final boolean component11() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component12() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    public final boolean component17() {
        return false;
    }
    
    public final boolean component18() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.api.models.recipedetailed.nn.Nutrition component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component20() {
        return null;
    }
    
    public final double component21() {
        return 0.0;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final int component23() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    public final float component26() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    public final boolean component28() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component29() {
        return null;
    }
    
    public final boolean component30() {
        return false;
    }
    
    public final boolean component31() {
        return false;
    }
    
    public final boolean component32() {
        return false;
    }
    
    public final boolean component33() {
        return false;
    }
    
    public final float component34() {
        return 0.0F;
    }
    
    public final boolean component35() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.api.models.recipedetailed.nn.WinePairing component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.api.models.recipedetailed.nn.RecipeDetailedResponse copy(int aggregateLikes, @org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.AnalyzedInstruction> steps, boolean cheap, @org.jetbrains.annotations.Nullable()
    java.lang.String creditsText, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> cuisines, boolean dairyFree, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> diets, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> dishTypes, @org.jetbrains.annotations.NotNull()
    java.util.List<com.feedapp.app.data.api.models.recipedetailed.nn.ExtendedIngredient> extendedIngredients, @org.jetbrains.annotations.NotNull()
    java.lang.String gaps, boolean glutenFree, @org.jetbrains.annotations.Nullable()
    java.lang.Float healthScore, int id, @org.jetbrains.annotations.Nullable()
    java.lang.String image, @org.jetbrains.annotations.Nullable()
    java.lang.String imageType, @org.jetbrains.annotations.Nullable()
    java.lang.String instructions, boolean ketogenic, boolean lowFodmap, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.api.models.recipedetailed.nn.Nutrition nutrition, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> occasions, double pricePerServing, int readyInMinutes, int servings, @org.jetbrains.annotations.Nullable()
    java.lang.String sourceName, @org.jetbrains.annotations.Nullable()
    java.lang.String sourceUrl, float spoonacularScore, @org.jetbrains.annotations.NotNull()
    java.lang.String spoonacularSourceUrl, boolean sustainable, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean vegan, boolean vegetarian, boolean veryHealthy, boolean veryPopular, float weightWatcherSmartPoints, boolean whole30, @org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.api.models.recipedetailed.nn.WinePairing winePairing) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}