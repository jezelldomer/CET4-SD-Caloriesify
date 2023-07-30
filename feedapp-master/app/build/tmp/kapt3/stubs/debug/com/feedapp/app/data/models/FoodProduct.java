package com.feedapp.app.data.models;

import java.lang.System;

/**
 * Class that is exported from FoodDatabase
 */
@androidx.room.Entity(tableName = "food")
@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\'\n\u0002\u0010\u000e\n\u0003\b\u00d0\u0001\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0003B\u0095\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010.\u001a\u00020/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010T\u001a\u00020\u0007\u00a2\u0006\u0002\u0010UJ\u0013\u0010\u00ad\u0001\u001a\u00020\u00052\u0007\u0010\u00ae\u0001\u001a\u00020\u0000H\u0096\u0002J\n\u0010\u00af\u0001\u001a\u00020\u0005H\u00c6\u0003J\u0011\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00b1\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\n\u0010\u00b6\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\u0007H\u00c6\u0003J\u0011\u0010\u00b8\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00ba\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00bc\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00bd\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00c7\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00ca\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00cd\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00ce\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\n\u0010\u00d2\u0001\u001a\u00020/H\u00c6\u0003J\u0011\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00d4\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00d8\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00d9\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00db\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00de\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00df\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00e0\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00e2\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00e3\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00e4\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00e5\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00e6\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00e7\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00e8\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00e9\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00ea\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00eb\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00ec\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00ed\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00ee\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00ef\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00f0\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00f1\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00f2\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00f3\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00f4\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00f5\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00f6\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00f7\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00f8\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u0011\u0010\u00f9\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\n\u0010\u00fa\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u00fb\u0001\u001a\u00020\u0007H\u00c6\u0003J\u0011\u0010\u00fc\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010WJ\u00ac\u0007\u0010\u00fd\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010.\u001a\u00020/2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010T\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00fe\u0001J\u0017\u0010\u00ff\u0001\u001a\u00030\u0080\u00022\n\u0010\u00ae\u0001\u001a\u0005\u0018\u00010\u0081\u0002H\u00d6\u0003J\n\u0010\u0082\u0002\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0083\u0002\u001a\u00020/H\u0016R\u001a\u0010 \u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bV\u0010WR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bY\u0010WR\u001a\u0010O\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bZ\u0010WR\u001a\u0010F\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\b[\u0010WR\u001a\u0010*\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\b\\\u0010WR\u001a\u0010N\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\b]\u0010WR\u001a\u0010-\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\b^\u0010WR\u001a\u0010;\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\b_\u0010WR\u001a\u00100\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\b`\u0010WR\u001a\u0010G\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\ba\u0010WR\u0016\u0010T\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0016\u0010\r\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010cR\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\be\u0010WR\u001a\u00104\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bf\u0010WR\u001a\u0010E\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bg\u0010WR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bh\u0010WR\u001a\u00108\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bi\u0010WR\u001a\u0010@\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bj\u0010WR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bk\u0010WR\u001a\u00107\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bl\u0010WR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bm\u0010WR\u001a\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bn\u0010WR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bo\u0010WR\u0016\u0010\u0016\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010cR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bq\u0010WR\u001a\u0010(\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\br\u0010WR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bs\u0010WR\u001a\u0010J\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bt\u0010WR\u001a\u0010&\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bu\u0010WR\u001a\u0010D\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\bv\u0010WR\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001a\u0010A\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\b{\u0010WR\u001a\u0010Q\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\b|\u0010WR\u001a\u00109\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\b}\u0010WR\u001a\u0010K\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\b~\u0010WR\u001a\u0010%\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010X\u001a\u0004\b\u007f\u0010WR\u001b\u0010<\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0080\u0001\u0010WR\u001b\u0010=\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0081\u0001\u0010WR\u001b\u0010:\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0082\u0001\u0010WR\u001b\u00106\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0083\u0001\u0010WR\u001b\u0010\'\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0084\u0001\u0010WR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0085\u0001\u0010WR\u001b\u0010>\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0086\u0001\u0010WR\u001b\u0010M\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0087\u0001\u0010WR\"\u0010.\u001a\u00020/8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u008c\u0001\u0010WR\u001b\u0010C\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u008d\u0001\u0010WR\u001b\u0010I\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u008e\u0001\u0010WR\u001b\u00103\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u008f\u0001\u0010WR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0090\u0001\u0010WR\u001b\u0010+\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0091\u0001\u0010WR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0092\u0001\u0010WR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0093\u0001\u0010WR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0094\u0001\u0010WR\u001b\u00105\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0095\u0001\u0010WR\u0017\u0010\u0015\u001a\u00020\u00078\u0016X\u0097\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010cR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0097\u0001\u0010WR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0098\u0001\u0010WR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u0099\u0001\u0010WR\u001b\u0010S\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u009a\u0001\u0010WR\u001b\u0010L\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u009b\u0001\u0010WR\u001b\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u009c\u0001\u0010WR\u001b\u0010?\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u009d\u0001\u0010WR\u001b\u0010,\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u009e\u0001\u0010WR\u001b\u0010R\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u009f\u0001\u0010WR\u001b\u0010)\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u00a0\u0001\u0010WR\u001b\u00102\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u00a1\u0001\u0010WR\u001b\u0010H\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u00a2\u0001\u0010WR\u001b\u0010P\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u00a3\u0001\u0010WR\u001b\u0010B\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u00a4\u0001\u0010WR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u00a5\u0001\u0010WR\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u00a6\u0001\u0010WR\u001b\u0010!\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u00a7\u0001\u0010WR\u001b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u00a8\u0001\u0010WR\u001b\u00101\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u00a9\u0001\u0010WR\u001b\u0010#\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u00aa\u0001\u0010WR\u001b\u0010$\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u00ab\u0001\u0010WR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010X\u001a\u0005\b\u00ac\u0001\u0010W\u00a8\u0006\u0084\u0002"}, d2 = {"Lcom/feedapp/app/data/models/FoodProduct;", "", "Lcom/feedapp/app/data/models/localdb/IProduct;", "()V", "id", "", "cryptoxanthin", "", "totalfolates", "ergocalciferol_d2", "niacin_b3", "cobalamin_b12", "energy_without_dietary_fibre", "carbs", "fluoride", "pantothenic_acid_b5", "thiamin_b1", "folicacid", "retinol", "alpha_carotene", "pyridoxine_b6", "proteins", "fats", "tin", "chloride", "omega_g", "zinc", "o_poly_fats_g", "energy", "molybdenum", "phosphorus", "provitamin_a", "alcohol", "total_dietary_fibre", "sat_fats_g", "vitamin_c", "vitamin_e", "magnesium", "galactose", "moisture", "folatenatural", "sucrose", "arsenic", "omega", "sodium", "beta_carotene", "name", "", "cadmium", "vitamin_a_retinol_equivalents", "sugar", "o_poly_fats", "cholecalciferol_d3", "potassium", "mercury", "dietary_folate_equivalents", "cobalt", "lactose", "manganese", "biotin_b7", "maltose", "maltotriose", "mono_fats", "selenium", "copper", "iodine", "t_poly_fats_g", "nickel", "glucose", "chromium", "antimony", "calcium", "sulphur", "nitrogen", "fructose", "lead", "sat_fats", "mono_fats_g", "ash", "aluminium", "t_poly_fats", "iron", "starch", "riboflavin_b2", "calories", "(ILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;FFLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;F)V", "getAlcohol", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getAlpha_carotene", "getAluminium", "getAntimony", "getArsenic", "getAsh", "getBeta_carotene", "getBiotin_b7", "getCadmium", "getCalcium", "getCalories", "()F", "getCarbs", "getChloride", "getCholecalciferol_d3", "getChromium", "getCobalamin_b12", "getCobalt", "getCopper", "getCryptoxanthin", "getDietary_folate_equivalents", "getEnergy", "getEnergy_without_dietary_fibre", "getErgocalciferol_d2", "getFats", "getFluoride", "getFolatenatural", "getFolicacid", "getFructose", "getGalactose", "getGlucose", "getId", "()I", "setId", "(I)V", "getIodine", "getIron", "getLactose", "getLead", "getMagnesium", "getMaltose", "getMaltotriose", "getManganese", "getMercury", "getMoisture", "getMolybdenum", "getMono_fats", "getMono_fats_g", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getNiacin_b3", "getNickel", "getNitrogen", "getO_poly_fats", "getO_poly_fats_g", "getOmega", "getOmega_g", "getPantothenic_acid_b5", "getPhosphorus", "getPotassium", "getProteins", "getProvitamin_a", "getPyridoxine_b6", "getRetinol", "getRiboflavin_b2", "getSat_fats", "getSat_fats_g", "getSelenium", "getSodium", "getStarch", "getSucrose", "getSugar", "getSulphur", "getT_poly_fats", "getT_poly_fats_g", "getThiamin_b1", "getTin", "getTotal_dietary_fibre", "getTotalfolates", "getVitamin_a_retinol_equivalents", "getVitamin_c", "getVitamin_e", "getZinc", "compareTo", "other", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component8", "component9", "copy", "(ILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;FFLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;F)Lcom/feedapp/app/data/models/FoodProduct;", "equals", "", "", "hashCode", "toString", "app_debug"})
public final class FoodProduct implements java.lang.Comparable<com.feedapp.app.data.models.FoodProduct>, com.feedapp.app.data.models.localdb.IProduct {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey()
    private int id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "cryptoxanthin")
    private final java.lang.Float cryptoxanthin = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "totalfolates")
    private final java.lang.Float totalfolates = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ergocalciferol_d2")
    private final java.lang.Float ergocalciferol_d2 = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "niacin_b3")
    private final java.lang.Float niacin_b3 = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "cobalamin_b12")
    private final java.lang.Float cobalamin_b12 = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "energy_without_dietary_fibre")
    private final java.lang.Float energy_without_dietary_fibre = null;
    @androidx.room.ColumnInfo(name = "carbs")
    private final float carbs = 0.0F;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "fluoride")
    private final java.lang.Float fluoride = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "pantothenic_acid_b5")
    private final java.lang.Float pantothenic_acid_b5 = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "thiamin_b1")
    private final java.lang.Float thiamin_b1 = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "folicacid")
    private final java.lang.Float folicacid = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "retinol")
    private final java.lang.Float retinol = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "alpha_carotene")
    private final java.lang.Float alpha_carotene = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "pyridoxine_b6")
    private final java.lang.Float pyridoxine_b6 = null;
    @androidx.room.ColumnInfo(name = "protein")
    private final float proteins = 0.0F;
    @androidx.room.ColumnInfo(name = "fat")
    private final float fats = 0.0F;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "tin")
    private final java.lang.Float tin = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "chloride")
    private final java.lang.Float chloride = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "omega_g")
    private final java.lang.Float omega_g = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "zinc")
    private final java.lang.Float zinc = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "o_poly_fats_g")
    private final java.lang.Float o_poly_fats_g = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "energy")
    private final java.lang.Float energy = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "molybdenum")
    private final java.lang.Float molybdenum = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "phosphorus")
    private final java.lang.Float phosphorus = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "provitamin_a")
    private final java.lang.Float provitamin_a = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "alcohol")
    private final java.lang.Float alcohol = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "total_dietary_fibre")
    private final java.lang.Float total_dietary_fibre = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "sat_fats_g")
    private final java.lang.Float sat_fats_g = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "vitamin_c")
    private final java.lang.Float vitamin_c = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "vitamin_e")
    private final java.lang.Float vitamin_e = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "magnesium")
    private final java.lang.Float magnesium = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "galactose")
    private final java.lang.Float galactose = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "moisture")
    private final java.lang.Float moisture = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "folatenatural")
    private final java.lang.Float folatenatural = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "sucrose")
    private final java.lang.Float sucrose = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "arsenic")
    private final java.lang.Float arsenic = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "omega")
    private final java.lang.Float omega = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "sodium")
    private final java.lang.Float sodium = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "beta_carotene")
    private final java.lang.Float beta_carotene = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "cadmium")
    private final java.lang.Float cadmium = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "vitamin_a_retinol_equivalents")
    private final java.lang.Float vitamin_a_retinol_equivalents = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "sugar")
    private final java.lang.Float sugar = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "o_poly_fats")
    private final java.lang.Float o_poly_fats = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "cholecalciferol_d3")
    private final java.lang.Float cholecalciferol_d3 = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "potassium")
    private final java.lang.Float potassium = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "mercury")
    private final java.lang.Float mercury = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "dietary_folate_equivalents")
    private final java.lang.Float dietary_folate_equivalents = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "cobalt")
    private final java.lang.Float cobalt = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "lactose")
    private final java.lang.Float lactose = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "manganese")
    private final java.lang.Float manganese = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "biotin_b7")
    private final java.lang.Float biotin_b7 = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "maltose")
    private final java.lang.Float maltose = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "maltotriose")
    private final java.lang.Float maltotriose = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "mono_fats")
    private final java.lang.Float mono_fats = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "selenium")
    private final java.lang.Float selenium = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "copper")
    private final java.lang.Float copper = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "iodine")
    private final java.lang.Float iodine = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "t_poly_fats_g")
    private final java.lang.Float t_poly_fats_g = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "nickel")
    private final java.lang.Float nickel = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "glucose")
    private final java.lang.Float glucose = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "chromium")
    private final java.lang.Float chromium = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "antimony")
    private final java.lang.Float antimony = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "calcium")
    private final java.lang.Float calcium = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "sulphur")
    private final java.lang.Float sulphur = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "nitrogen")
    private final java.lang.Float nitrogen = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "fructose")
    private final java.lang.Float fructose = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "lead")
    private final java.lang.Float lead = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "sat_fats")
    private final java.lang.Float sat_fats = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "mono_fats_g")
    private final java.lang.Float mono_fats_g = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ash")
    private final java.lang.Float ash = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "aluminium")
    private final java.lang.Float aluminium = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "t_poly_fats")
    private final java.lang.Float t_poly_fats = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "iron")
    private final java.lang.Float iron = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "starch")
    private final java.lang.Float starch = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "riboflavin_b2")
    private final java.lang.Float riboflavin_b2 = null;
    @androidx.room.ColumnInfo(name = "calories")
    private final float calories = 0.0F;
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.FoodProduct other) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int getId() {
        return 0;
    }
    
    @java.lang.Override()
    public void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getCryptoxanthin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getTotalfolates() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getErgocalciferol_d2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getNiacin_b3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getCobalamin_b12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getEnergy_without_dietary_fibre() {
        return null;
    }
    
    @java.lang.Override()
    public float getCarbs() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getFluoride() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getPantothenic_acid_b5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getThiamin_b1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getFolicacid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getRetinol() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getAlpha_carotene() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getPyridoxine_b6() {
        return null;
    }
    
    @java.lang.Override()
    public float getProteins() {
        return 0.0F;
    }
    
    @java.lang.Override()
    public float getFats() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getTin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getChloride() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getOmega_g() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getZinc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getO_poly_fats_g() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getEnergy() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getMolybdenum() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getPhosphorus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getProvitamin_a() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getAlcohol() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getTotal_dietary_fibre() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getSat_fats_g() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getVitamin_c() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getVitamin_e() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getMagnesium() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getGalactose() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getMoisture() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getFolatenatural() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getSucrose() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getArsenic() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getOmega() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getSodium() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getBeta_carotene() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getCadmium() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getVitamin_a_retinol_equivalents() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getSugar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getO_poly_fats() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getCholecalciferol_d3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getPotassium() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getMercury() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getDietary_folate_equivalents() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getCobalt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getLactose() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getManganese() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getBiotin_b7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getMaltose() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getMaltotriose() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getMono_fats() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getSelenium() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getCopper() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getIodine() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getT_poly_fats_g() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getNickel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getGlucose() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getChromium() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getAntimony() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getCalcium() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getSulphur() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getNitrogen() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getFructose() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getLead() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getSat_fats() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getMono_fats_g() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getAsh() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getAluminium() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getT_poly_fats() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getIron() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getStarch() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getRiboflavin_b2() {
        return null;
    }
    
    @java.lang.Override()
    public float getCalories() {
        return 0.0F;
    }
    
    public FoodProduct(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Float cryptoxanthin, @org.jetbrains.annotations.Nullable()
    java.lang.Float totalfolates, @org.jetbrains.annotations.Nullable()
    java.lang.Float ergocalciferol_d2, @org.jetbrains.annotations.Nullable()
    java.lang.Float niacin_b3, @org.jetbrains.annotations.Nullable()
    java.lang.Float cobalamin_b12, @org.jetbrains.annotations.Nullable()
    java.lang.Float energy_without_dietary_fibre, float carbs, @org.jetbrains.annotations.Nullable()
    java.lang.Float fluoride, @org.jetbrains.annotations.Nullable()
    java.lang.Float pantothenic_acid_b5, @org.jetbrains.annotations.Nullable()
    java.lang.Float thiamin_b1, @org.jetbrains.annotations.Nullable()
    java.lang.Float folicacid, @org.jetbrains.annotations.Nullable()
    java.lang.Float retinol, @org.jetbrains.annotations.Nullable()
    java.lang.Float alpha_carotene, @org.jetbrains.annotations.Nullable()
    java.lang.Float pyridoxine_b6, float proteins, float fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float tin, @org.jetbrains.annotations.Nullable()
    java.lang.Float chloride, @org.jetbrains.annotations.Nullable()
    java.lang.Float omega_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float zinc, @org.jetbrains.annotations.Nullable()
    java.lang.Float o_poly_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float energy, @org.jetbrains.annotations.Nullable()
    java.lang.Float molybdenum, @org.jetbrains.annotations.Nullable()
    java.lang.Float phosphorus, @org.jetbrains.annotations.Nullable()
    java.lang.Float provitamin_a, @org.jetbrains.annotations.Nullable()
    java.lang.Float alcohol, @org.jetbrains.annotations.Nullable()
    java.lang.Float total_dietary_fibre, @org.jetbrains.annotations.Nullable()
    java.lang.Float sat_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float vitamin_c, @org.jetbrains.annotations.Nullable()
    java.lang.Float vitamin_e, @org.jetbrains.annotations.Nullable()
    java.lang.Float magnesium, @org.jetbrains.annotations.Nullable()
    java.lang.Float galactose, @org.jetbrains.annotations.Nullable()
    java.lang.Float moisture, @org.jetbrains.annotations.Nullable()
    java.lang.Float folatenatural, @org.jetbrains.annotations.Nullable()
    java.lang.Float sucrose, @org.jetbrains.annotations.Nullable()
    java.lang.Float arsenic, @org.jetbrains.annotations.Nullable()
    java.lang.Float omega, @org.jetbrains.annotations.Nullable()
    java.lang.Float sodium, @org.jetbrains.annotations.Nullable()
    java.lang.Float beta_carotene, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Float cadmium, @org.jetbrains.annotations.Nullable()
    java.lang.Float vitamin_a_retinol_equivalents, @org.jetbrains.annotations.Nullable()
    java.lang.Float sugar, @org.jetbrains.annotations.Nullable()
    java.lang.Float o_poly_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float cholecalciferol_d3, @org.jetbrains.annotations.Nullable()
    java.lang.Float potassium, @org.jetbrains.annotations.Nullable()
    java.lang.Float mercury, @org.jetbrains.annotations.Nullable()
    java.lang.Float dietary_folate_equivalents, @org.jetbrains.annotations.Nullable()
    java.lang.Float cobalt, @org.jetbrains.annotations.Nullable()
    java.lang.Float lactose, @org.jetbrains.annotations.Nullable()
    java.lang.Float manganese, @org.jetbrains.annotations.Nullable()
    java.lang.Float biotin_b7, @org.jetbrains.annotations.Nullable()
    java.lang.Float maltose, @org.jetbrains.annotations.Nullable()
    java.lang.Float maltotriose, @org.jetbrains.annotations.Nullable()
    java.lang.Float mono_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float selenium, @org.jetbrains.annotations.Nullable()
    java.lang.Float copper, @org.jetbrains.annotations.Nullable()
    java.lang.Float iodine, @org.jetbrains.annotations.Nullable()
    java.lang.Float t_poly_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float nickel, @org.jetbrains.annotations.Nullable()
    java.lang.Float glucose, @org.jetbrains.annotations.Nullable()
    java.lang.Float chromium, @org.jetbrains.annotations.Nullable()
    java.lang.Float antimony, @org.jetbrains.annotations.Nullable()
    java.lang.Float calcium, @org.jetbrains.annotations.Nullable()
    java.lang.Float sulphur, @org.jetbrains.annotations.Nullable()
    java.lang.Float nitrogen, @org.jetbrains.annotations.Nullable()
    java.lang.Float fructose, @org.jetbrains.annotations.Nullable()
    java.lang.Float lead, @org.jetbrains.annotations.Nullable()
    java.lang.Float sat_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float mono_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float ash, @org.jetbrains.annotations.Nullable()
    java.lang.Float aluminium, @org.jetbrains.annotations.Nullable()
    java.lang.Float t_poly_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float iron, @org.jetbrains.annotations.Nullable()
    java.lang.Float starch, @org.jetbrains.annotations.Nullable()
    java.lang.Float riboflavin_b2, float calories) {
        super();
    }
    
    public FoodProduct() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component7() {
        return null;
    }
    
    public final float component8() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component15() {
        return null;
    }
    
    public final float component16() {
        return 0.0F;
    }
    
    public final float component17() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component40() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component49() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component50() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component51() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component52() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component53() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component54() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component55() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component56() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component57() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component58() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component59() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component60() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component61() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component62() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component63() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component64() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component65() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component66() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component67() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component68() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component69() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component70() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component71() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component72() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component73() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component74() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component75() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component76() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component77() {
        return null;
    }
    
    public final float component78() {
        return 0.0F;
    }
    
    /**
     * Class that is exported from FoodDatabase
     */
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.FoodProduct copy(int id, @org.jetbrains.annotations.Nullable()
    java.lang.Float cryptoxanthin, @org.jetbrains.annotations.Nullable()
    java.lang.Float totalfolates, @org.jetbrains.annotations.Nullable()
    java.lang.Float ergocalciferol_d2, @org.jetbrains.annotations.Nullable()
    java.lang.Float niacin_b3, @org.jetbrains.annotations.Nullable()
    java.lang.Float cobalamin_b12, @org.jetbrains.annotations.Nullable()
    java.lang.Float energy_without_dietary_fibre, float carbs, @org.jetbrains.annotations.Nullable()
    java.lang.Float fluoride, @org.jetbrains.annotations.Nullable()
    java.lang.Float pantothenic_acid_b5, @org.jetbrains.annotations.Nullable()
    java.lang.Float thiamin_b1, @org.jetbrains.annotations.Nullable()
    java.lang.Float folicacid, @org.jetbrains.annotations.Nullable()
    java.lang.Float retinol, @org.jetbrains.annotations.Nullable()
    java.lang.Float alpha_carotene, @org.jetbrains.annotations.Nullable()
    java.lang.Float pyridoxine_b6, float proteins, float fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float tin, @org.jetbrains.annotations.Nullable()
    java.lang.Float chloride, @org.jetbrains.annotations.Nullable()
    java.lang.Float omega_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float zinc, @org.jetbrains.annotations.Nullable()
    java.lang.Float o_poly_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float energy, @org.jetbrains.annotations.Nullable()
    java.lang.Float molybdenum, @org.jetbrains.annotations.Nullable()
    java.lang.Float phosphorus, @org.jetbrains.annotations.Nullable()
    java.lang.Float provitamin_a, @org.jetbrains.annotations.Nullable()
    java.lang.Float alcohol, @org.jetbrains.annotations.Nullable()
    java.lang.Float total_dietary_fibre, @org.jetbrains.annotations.Nullable()
    java.lang.Float sat_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float vitamin_c, @org.jetbrains.annotations.Nullable()
    java.lang.Float vitamin_e, @org.jetbrains.annotations.Nullable()
    java.lang.Float magnesium, @org.jetbrains.annotations.Nullable()
    java.lang.Float galactose, @org.jetbrains.annotations.Nullable()
    java.lang.Float moisture, @org.jetbrains.annotations.Nullable()
    java.lang.Float folatenatural, @org.jetbrains.annotations.Nullable()
    java.lang.Float sucrose, @org.jetbrains.annotations.Nullable()
    java.lang.Float arsenic, @org.jetbrains.annotations.Nullable()
    java.lang.Float omega, @org.jetbrains.annotations.Nullable()
    java.lang.Float sodium, @org.jetbrains.annotations.Nullable()
    java.lang.Float beta_carotene, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Float cadmium, @org.jetbrains.annotations.Nullable()
    java.lang.Float vitamin_a_retinol_equivalents, @org.jetbrains.annotations.Nullable()
    java.lang.Float sugar, @org.jetbrains.annotations.Nullable()
    java.lang.Float o_poly_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float cholecalciferol_d3, @org.jetbrains.annotations.Nullable()
    java.lang.Float potassium, @org.jetbrains.annotations.Nullable()
    java.lang.Float mercury, @org.jetbrains.annotations.Nullable()
    java.lang.Float dietary_folate_equivalents, @org.jetbrains.annotations.Nullable()
    java.lang.Float cobalt, @org.jetbrains.annotations.Nullable()
    java.lang.Float lactose, @org.jetbrains.annotations.Nullable()
    java.lang.Float manganese, @org.jetbrains.annotations.Nullable()
    java.lang.Float biotin_b7, @org.jetbrains.annotations.Nullable()
    java.lang.Float maltose, @org.jetbrains.annotations.Nullable()
    java.lang.Float maltotriose, @org.jetbrains.annotations.Nullable()
    java.lang.Float mono_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float selenium, @org.jetbrains.annotations.Nullable()
    java.lang.Float copper, @org.jetbrains.annotations.Nullable()
    java.lang.Float iodine, @org.jetbrains.annotations.Nullable()
    java.lang.Float t_poly_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float nickel, @org.jetbrains.annotations.Nullable()
    java.lang.Float glucose, @org.jetbrains.annotations.Nullable()
    java.lang.Float chromium, @org.jetbrains.annotations.Nullable()
    java.lang.Float antimony, @org.jetbrains.annotations.Nullable()
    java.lang.Float calcium, @org.jetbrains.annotations.Nullable()
    java.lang.Float sulphur, @org.jetbrains.annotations.Nullable()
    java.lang.Float nitrogen, @org.jetbrains.annotations.Nullable()
    java.lang.Float fructose, @org.jetbrains.annotations.Nullable()
    java.lang.Float lead, @org.jetbrains.annotations.Nullable()
    java.lang.Float sat_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float mono_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float ash, @org.jetbrains.annotations.Nullable()
    java.lang.Float aluminium, @org.jetbrains.annotations.Nullable()
    java.lang.Float t_poly_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float iron, @org.jetbrains.annotations.Nullable()
    java.lang.Float starch, @org.jetbrains.annotations.Nullable()
    java.lang.Float riboflavin_b2, float calories) {
        return null;
    }
    
    /**
     * Class that is exported from FoodDatabase
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Class that is exported from FoodDatabase
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}