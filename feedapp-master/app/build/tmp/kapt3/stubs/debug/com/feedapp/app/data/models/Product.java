package com.feedapp.app.data.models;

import java.lang.System;

/**
 * all fields are counted with respect to consumed grams.
 * class used for saved foodproduct with grams consumed
 */
@androidx.room.Entity(tableName = "products")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\b\u00d6\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u00df\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010XJ\u0013\u0010\u0088\u0002\u001a\u00020\u00032\u0007\u0010\u0089\u0002\u001a\u00020\u0000H\u0096\u0002J\n\u0010\u008a\u0002\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\n\u0010\u0095\u0002\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\n\u0010\u00a0\u0002\u001a\u00020\u0006H\u00c6\u0003J\u0011\u0010\u00a1\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00a2\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00a3\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00a4\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00a5\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00a6\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00a7\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00a8\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00a9\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00aa\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\n\u0010\u00ab\u0002\u001a\u00020\u0006H\u00c6\u0003J\u0011\u0010\u00ac\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00ae\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00af\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00b0\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00b1\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00b2\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00b3\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00b4\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00b5\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\n\u0010\u00b6\u0002\u001a\u00020\tH\u00c6\u0003J\u0011\u0010\u00b7\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00b8\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00b9\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00ba\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00bb\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00bc\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00bd\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00be\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00bf\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00c0\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00c1\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00c2\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00c3\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00c4\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00c5\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00c6\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00c7\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00c8\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00c9\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00ca\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00cb\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00cc\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00cd\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00ce\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00cf\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00d0\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00d1\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00d2\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00d3\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00d4\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00d5\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00d6\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00d7\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00d8\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00d9\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00da\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00db\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00dc\u0002\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u00ea\u0007\u0010\u00dd\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00de\u0002J\u0017\u0010\u00df\u0002\u001a\u00030\u00e0\u00022\n\u0010\u0089\u0002\u001a\u0005\u0018\u00010\u00e1\u0002H\u00d6\u0003J\n\u0010\u00e2\u0002\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u00e3\u0002\u001a\u00020\tH\u0016R\u001e\u0010#\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\b^\u0010Z\"\u0004\b_\u0010\\R\u001e\u0010P\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\b`\u0010Z\"\u0004\ba\u0010\\R\u001e\u0010G\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bb\u0010Z\"\u0004\bc\u0010\\R\u001e\u0010-\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bd\u0010Z\"\u0004\be\u0010\\R\u001e\u0010O\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bf\u0010Z\"\u0004\bg\u0010\\R\u001e\u00100\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bh\u0010Z\"\u0004\bi\u0010\\R\u001e\u0010<\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bj\u0010Z\"\u0004\bk\u0010\\R\u001e\u00101\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bl\u0010Z\"\u0004\bm\u0010\\R\u001e\u0010H\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bn\u0010Z\"\u0004\bo\u0010\\R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bt\u0010Z\"\u0004\bu\u0010\\R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bv\u0010Z\"\u0004\bw\u0010\\R\u001e\u00105\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bx\u0010Z\"\u0004\by\u0010\\R\u001e\u0010U\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bz\u0010Z\"\u0004\b{\u0010\\R\u001e\u0010F\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\b|\u0010Z\"\u0004\b}\u0010\\R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\b~\u0010Z\"\u0004\b\u007f\u0010\\R \u00109\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u0080\u0001\u0010Z\"\u0005\b\u0081\u0001\u0010\\R \u0010A\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u0082\u0001\u0010Z\"\u0005\b\u0083\u0001\u0010\\R \u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u0084\u0001\u0010Z\"\u0005\b\u0085\u0001\u0010\\R \u00108\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u0086\u0001\u0010Z\"\u0005\b\u0087\u0001\u0010\\R \u0010\u001f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u0088\u0001\u0010Z\"\u0005\b\u0089\u0001\u0010\\R \u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u008a\u0001\u0010Z\"\u0005\b\u008b\u0001\u0010\\R \u0010\f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u008c\u0001\u0010Z\"\u0005\b\u008d\u0001\u0010\\R \u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u008e\u0001\u0010Z\"\u0005\b\u008f\u0001\u0010\\R \u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u0090\u0001\u0010Z\"\u0005\b\u0091\u0001\u0010\\R \u0010+\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u0092\u0001\u0010Z\"\u0005\b\u0093\u0001\u0010\\R \u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u0094\u0001\u0010Z\"\u0005\b\u0095\u0001\u0010\\R \u0010K\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u0096\u0001\u0010Z\"\u0005\b\u0097\u0001\u0010\\R \u0010)\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u0098\u0001\u0010Z\"\u0005\b\u0099\u0001\u0010\\R \u0010E\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u009a\u0001\u0010Z\"\u0005\b\u009b\u0001\u0010\\R \u0010B\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u009c\u0001\u0010Z\"\u0005\b\u009d\u0001\u0010\\R \u0010R\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u009e\u0001\u0010Z\"\u0005\b\u009f\u0001\u0010\\R \u0010:\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00a0\u0001\u0010Z\"\u0005\b\u00a1\u0001\u0010\\R \u0010L\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00a2\u0001\u0010Z\"\u0005\b\u00a3\u0001\u0010\\R \u0010(\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00a4\u0001\u0010Z\"\u0005\b\u00a5\u0001\u0010\\R \u0010=\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00a6\u0001\u0010Z\"\u0005\b\u00a7\u0001\u0010\\R \u0010>\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00a8\u0001\u0010Z\"\u0005\b\u00a9\u0001\u0010\\R \u0010;\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00aa\u0001\u0010Z\"\u0005\b\u00ab\u0001\u0010\\R \u00107\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00ac\u0001\u0010Z\"\u0005\b\u00ad\u0001\u0010\\R \u0010*\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00ae\u0001\u0010Z\"\u0005\b\u00af\u0001\u0010\\R \u0010 \u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00b0\u0001\u0010Z\"\u0005\b\u00b1\u0001\u0010\\R \u0010?\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00b2\u0001\u0010Z\"\u0005\b\u00b3\u0001\u0010\\R \u0010N\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00b4\u0001\u0010Z\"\u0005\b\u00b5\u0001\u0010\\R \u0010\r\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00b6\u0001\u0010Z\"\u0005\b\u00b7\u0001\u0010\\R \u0010D\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00b8\u0001\u0010Z\"\u0005\b\u00b9\u0001\u0010\\R \u0010J\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00ba\u0001\u0010Z\"\u0005\b\u00bb\u0001\u0010\\R \u00104\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00bc\u0001\u0010Z\"\u0005\b\u00bd\u0001\u0010\\R \u0010\u001e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00be\u0001\u0010Z\"\u0005\b\u00bf\u0001\u0010\\R \u0010.\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00c0\u0001\u0010Z\"\u0005\b\u00c1\u0001\u0010\\R \u0010\u001c\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00c2\u0001\u0010Z\"\u0005\b\u00c3\u0001\u0010\\R \u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00c4\u0001\u0010Z\"\u0005\b\u00c5\u0001\u0010\\R \u0010!\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00c6\u0001\u0010Z\"\u0005\b\u00c7\u0001\u0010\\R \u00106\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00c8\u0001\u0010Z\"\u0005\b\u00c9\u0001\u0010\\R \u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00ca\u0001\u0010Z\"\u0005\b\u00cb\u0001\u0010\\R \u0010\"\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00cc\u0001\u0010Z\"\u0005\b\u00cd\u0001\u0010\\R \u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00ce\u0001\u0010Z\"\u0005\b\u00cf\u0001\u0010\\R \u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00d0\u0001\u0010Z\"\u0005\b\u00d1\u0001\u0010\\R \u0010T\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00d2\u0001\u0010Z\"\u0005\b\u00d3\u0001\u0010\\R \u0010M\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00d4\u0001\u0010Z\"\u0005\b\u00d5\u0001\u0010\\R \u0010%\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00d6\u0001\u0010Z\"\u0005\b\u00d7\u0001\u0010\\R \u0010@\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00d8\u0001\u0010Z\"\u0005\b\u00d9\u0001\u0010\\R \u0010/\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00da\u0001\u0010Z\"\u0005\b\u00db\u0001\u0010\\R \u0010S\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00dc\u0001\u0010Z\"\u0005\b\u00dd\u0001\u0010\\R \u0010,\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00de\u0001\u0010Z\"\u0005\b\u00df\u0001\u0010\\R \u00103\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00e0\u0001\u0010Z\"\u0005\b\u00e1\u0001\u0010\\R \u0010I\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00e2\u0001\u0010Z\"\u0005\b\u00e3\u0001\u0010\\R \u0010Q\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00e4\u0001\u0010Z\"\u0005\b\u00e5\u0001\u0010\\R \u0010C\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00e6\u0001\u0010Z\"\u0005\b\u00e7\u0001\u0010\\R \u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00e8\u0001\u0010Z\"\u0005\b\u00e9\u0001\u0010\\R \u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00ea\u0001\u0010Z\"\u0005\b\u00eb\u0001\u0010\\R \u0010$\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00ec\u0001\u0010Z\"\u0005\b\u00ed\u0001\u0010\\R \u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00ee\u0001\u0010Z\"\u0005\b\u00ef\u0001\u0010\\R \u0010W\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00f0\u0001\u0010Z\"\u0005\b\u00f1\u0001\u0010\\R \u0010V\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00f2\u0001\u0010Z\"\u0005\b\u00f3\u0001\u0010\\R \u00102\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00f4\u0001\u0010Z\"\u0005\b\u00f5\u0001\u0010\\R \u0010&\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00f6\u0001\u0010Z\"\u0005\b\u00f7\u0001\u0010\\R \u0010\'\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00f8\u0001\u0010Z\"\u0005\b\u00f9\u0001\u0010\\R \u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010]\u001a\u0005\b\u00fa\u0001\u0010Z\"\u0005\b\u00fb\u0001\u0010\\R\u001c\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00fc\u0001\u0010q\"\u0005\b\u00fd\u0001\u0010sR\u001e\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00fe\u0001\u0010\u00ff\u0001\"\u0006\b\u0080\u0002\u0010\u0081\u0002R\"\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0002\u0010\u00ff\u0001\"\u0006\b\u0083\u0002\u0010\u0081\u0002R\u001e\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002\u00a8\u0006\u00e4\u0002"}, d2 = {"Lcom/feedapp/app/data/models/Product;", "", "id", "", "foodProductId", "eatenGrams", "", "consumedCalories", "name", "", "consumedCryptoxanthin", "consumedTotalfolates", "consumedErgocalciferol_d2", "consumedNiacin_b3", "consumedCobalamin_b12", "consumedEnergy_without_dietary_fibre", "consumedCarbs", "consumedFluoride", "consumedPantothenic_acid_b5", "consumedThiamin_b1", "consumedFolicacid", "consumedRetinol", "consumedAlpha_carotene", "consumedPyridoxine_b6", "consumedProtein", "consumedFat", "consumedTin", "consumedChloride", "consumedOmega_g", "consumedZinc", "consumedO_poly_fats_g", "consumedEnergy", "consumedMolybdenum", "consumedPhosphorus", "consumedProvitamin_a", "consumedAlcohol", "consumedTotal_dietary_fiber", "consumedSat_fats_g", "consumedVitamin_c", "consumedVitamin_e", "consumedMagnesium", "consumedGalactose", "consumedMoisture", "consumedFolatenatural", "consumedSucrose", "consumedArsenic", "consumedOmega", "consumedSodium", "consumedBeta_carotene", "consumedCadmium", "consumedVitamin_a_retinol_equivalents", "consumedSugar", "consumedO_poly_fats", "consumedCholecalciferol_d3", "consumedPotassium", "consumedMercury", "consumedDietary_folate_equivalents", "consumedCobalt", "consumedLactose", "consumedManganese", "consumedBiotin_b7", "consumedMaltose", "consumedMaltotriose", "consumedMono_fats", "consumedSelenium", "consumedCopper", "consumedIodine", "consumedT_poly_fats_g", "consumedNickel", "consumedGlucose", "consumedChromium", "consumedAntimony", "consumedCalcium", "consumedSulphur", "consumedNitrogen", "consumedFructose", "consumedLead", "consumedSat_fats", "consumedMono_fats_g", "consumedAsh", "consumedAluminium", "consumedT_poly_fats", "consumedIron", "consumedStarch", "consumedRiboflavin_b2", "consumedCholesterol", "consumedVitaminD", "consumedVitaminA", "(IIFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getConsumedAlcohol", "()Ljava/lang/Float;", "setConsumedAlcohol", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getConsumedAlpha_carotene", "setConsumedAlpha_carotene", "getConsumedAluminium", "setConsumedAluminium", "getConsumedAntimony", "setConsumedAntimony", "getConsumedArsenic", "setConsumedArsenic", "getConsumedAsh", "setConsumedAsh", "getConsumedBeta_carotene", "setConsumedBeta_carotene", "getConsumedBiotin_b7", "setConsumedBiotin_b7", "getConsumedCadmium", "setConsumedCadmium", "getConsumedCalcium", "setConsumedCalcium", "getConsumedCalories", "()F", "setConsumedCalories", "(F)V", "getConsumedCarbs", "setConsumedCarbs", "getConsumedChloride", "setConsumedChloride", "getConsumedCholecalciferol_d3", "setConsumedCholecalciferol_d3", "getConsumedCholesterol", "setConsumedCholesterol", "getConsumedChromium", "setConsumedChromium", "getConsumedCobalamin_b12", "setConsumedCobalamin_b12", "getConsumedCobalt", "setConsumedCobalt", "getConsumedCopper", "setConsumedCopper", "getConsumedCryptoxanthin", "setConsumedCryptoxanthin", "getConsumedDietary_folate_equivalents", "setConsumedDietary_folate_equivalents", "getConsumedEnergy", "setConsumedEnergy", "getConsumedEnergy_without_dietary_fibre", "setConsumedEnergy_without_dietary_fibre", "getConsumedErgocalciferol_d2", "setConsumedErgocalciferol_d2", "getConsumedFat", "setConsumedFat", "getConsumedFluoride", "setConsumedFluoride", "getConsumedFolatenatural", "setConsumedFolatenatural", "getConsumedFolicacid", "setConsumedFolicacid", "getConsumedFructose", "setConsumedFructose", "getConsumedGalactose", "setConsumedGalactose", "getConsumedGlucose", "setConsumedGlucose", "getConsumedIodine", "setConsumedIodine", "getConsumedIron", "setConsumedIron", "getConsumedLactose", "setConsumedLactose", "getConsumedLead", "setConsumedLead", "getConsumedMagnesium", "setConsumedMagnesium", "getConsumedMaltose", "setConsumedMaltose", "getConsumedMaltotriose", "setConsumedMaltotriose", "getConsumedManganese", "setConsumedManganese", "getConsumedMercury", "setConsumedMercury", "getConsumedMoisture", "setConsumedMoisture", "getConsumedMolybdenum", "setConsumedMolybdenum", "getConsumedMono_fats", "setConsumedMono_fats", "getConsumedMono_fats_g", "setConsumedMono_fats_g", "getConsumedNiacin_b3", "setConsumedNiacin_b3", "getConsumedNickel", "setConsumedNickel", "getConsumedNitrogen", "setConsumedNitrogen", "getConsumedO_poly_fats", "setConsumedO_poly_fats", "getConsumedO_poly_fats_g", "setConsumedO_poly_fats_g", "getConsumedOmega", "setConsumedOmega", "getConsumedOmega_g", "setConsumedOmega_g", "getConsumedPantothenic_acid_b5", "setConsumedPantothenic_acid_b5", "getConsumedPhosphorus", "setConsumedPhosphorus", "getConsumedPotassium", "setConsumedPotassium", "getConsumedProtein", "setConsumedProtein", "getConsumedProvitamin_a", "setConsumedProvitamin_a", "getConsumedPyridoxine_b6", "setConsumedPyridoxine_b6", "getConsumedRetinol", "setConsumedRetinol", "getConsumedRiboflavin_b2", "setConsumedRiboflavin_b2", "getConsumedSat_fats", "setConsumedSat_fats", "getConsumedSat_fats_g", "setConsumedSat_fats_g", "getConsumedSelenium", "setConsumedSelenium", "getConsumedSodium", "setConsumedSodium", "getConsumedStarch", "setConsumedStarch", "getConsumedSucrose", "setConsumedSucrose", "getConsumedSugar", "setConsumedSugar", "getConsumedSulphur", "setConsumedSulphur", "getConsumedT_poly_fats", "setConsumedT_poly_fats", "getConsumedT_poly_fats_g", "setConsumedT_poly_fats_g", "getConsumedThiamin_b1", "setConsumedThiamin_b1", "getConsumedTin", "setConsumedTin", "getConsumedTotal_dietary_fiber", "setConsumedTotal_dietary_fiber", "getConsumedTotalfolates", "setConsumedTotalfolates", "getConsumedVitaminA", "setConsumedVitaminA", "getConsumedVitaminD", "setConsumedVitaminD", "getConsumedVitamin_a_retinol_equivalents", "setConsumedVitamin_a_retinol_equivalents", "getConsumedVitamin_c", "setConsumedVitamin_c", "getConsumedVitamin_e", "setConsumedVitamin_e", "getConsumedZinc", "setConsumedZinc", "getEatenGrams", "setEatenGrams", "getFoodProductId", "()I", "setFoodProductId", "(I)V", "getId", "setId", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "compareTo", "other", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component9", "copy", "(IIFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/feedapp/app/data/models/Product;", "equals", "", "", "hashCode", "toString", "app_debug"})
public final class Product implements java.lang.Comparable<com.feedapp.app.data.models.Product> {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    private int foodProductId;
    private float eatenGrams;
    private float consumedCalories;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedCryptoxanthin;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedTotalfolates;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedErgocalciferol_d2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedNiacin_b3;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedCobalamin_b12;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedEnergy_without_dietary_fibre;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedCarbs;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedFluoride;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedPantothenic_acid_b5;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedThiamin_b1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedFolicacid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedRetinol;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedAlpha_carotene;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedPyridoxine_b6;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedProtein;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedFat;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedTin;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedChloride;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedOmega_g;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedZinc;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedO_poly_fats_g;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedEnergy;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedMolybdenum;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedPhosphorus;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedProvitamin_a;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedAlcohol;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedTotal_dietary_fiber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedSat_fats_g;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedVitamin_c;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedVitamin_e;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedMagnesium;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedGalactose;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedMoisture;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedFolatenatural;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedSucrose;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedArsenic;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedOmega;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedSodium;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedBeta_carotene;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedCadmium;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedVitamin_a_retinol_equivalents;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedSugar;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedO_poly_fats;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedCholecalciferol_d3;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedPotassium;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedMercury;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedDietary_folate_equivalents;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedCobalt;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedLactose;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedManganese;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedBiotin_b7;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedMaltose;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedMaltotriose;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedMono_fats;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedSelenium;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedCopper;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedIodine;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedT_poly_fats_g;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedNickel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedGlucose;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedChromium;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedAntimony;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedCalcium;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedSulphur;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedNitrogen;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedFructose;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedLead;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedSat_fats;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedMono_fats_g;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedAsh;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedAluminium;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedT_poly_fats;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedIron;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedStarch;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedRiboflavin_b2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedCholesterol;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedVitaminD;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float consumedVitaminA;
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    com.feedapp.app.data.models.Product other) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getFoodProductId() {
        return 0;
    }
    
    public final void setFoodProductId(int p0) {
    }
    
    public final float getEatenGrams() {
        return 0.0F;
    }
    
    public final void setEatenGrams(float p0) {
    }
    
    public final float getConsumedCalories() {
        return 0.0F;
    }
    
    public final void setConsumedCalories(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedCryptoxanthin() {
        return null;
    }
    
    public final void setConsumedCryptoxanthin(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedTotalfolates() {
        return null;
    }
    
    public final void setConsumedTotalfolates(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedErgocalciferol_d2() {
        return null;
    }
    
    public final void setConsumedErgocalciferol_d2(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedNiacin_b3() {
        return null;
    }
    
    public final void setConsumedNiacin_b3(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedCobalamin_b12() {
        return null;
    }
    
    public final void setConsumedCobalamin_b12(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedEnergy_without_dietary_fibre() {
        return null;
    }
    
    public final void setConsumedEnergy_without_dietary_fibre(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedCarbs() {
        return null;
    }
    
    public final void setConsumedCarbs(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedFluoride() {
        return null;
    }
    
    public final void setConsumedFluoride(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedPantothenic_acid_b5() {
        return null;
    }
    
    public final void setConsumedPantothenic_acid_b5(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedThiamin_b1() {
        return null;
    }
    
    public final void setConsumedThiamin_b1(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedFolicacid() {
        return null;
    }
    
    public final void setConsumedFolicacid(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedRetinol() {
        return null;
    }
    
    public final void setConsumedRetinol(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedAlpha_carotene() {
        return null;
    }
    
    public final void setConsumedAlpha_carotene(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedPyridoxine_b6() {
        return null;
    }
    
    public final void setConsumedPyridoxine_b6(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedProtein() {
        return null;
    }
    
    public final void setConsumedProtein(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedFat() {
        return null;
    }
    
    public final void setConsumedFat(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedTin() {
        return null;
    }
    
    public final void setConsumedTin(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedChloride() {
        return null;
    }
    
    public final void setConsumedChloride(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedOmega_g() {
        return null;
    }
    
    public final void setConsumedOmega_g(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedZinc() {
        return null;
    }
    
    public final void setConsumedZinc(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedO_poly_fats_g() {
        return null;
    }
    
    public final void setConsumedO_poly_fats_g(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedEnergy() {
        return null;
    }
    
    public final void setConsumedEnergy(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedMolybdenum() {
        return null;
    }
    
    public final void setConsumedMolybdenum(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedPhosphorus() {
        return null;
    }
    
    public final void setConsumedPhosphorus(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedProvitamin_a() {
        return null;
    }
    
    public final void setConsumedProvitamin_a(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedAlcohol() {
        return null;
    }
    
    public final void setConsumedAlcohol(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedTotal_dietary_fiber() {
        return null;
    }
    
    public final void setConsumedTotal_dietary_fiber(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedSat_fats_g() {
        return null;
    }
    
    public final void setConsumedSat_fats_g(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedVitamin_c() {
        return null;
    }
    
    public final void setConsumedVitamin_c(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedVitamin_e() {
        return null;
    }
    
    public final void setConsumedVitamin_e(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedMagnesium() {
        return null;
    }
    
    public final void setConsumedMagnesium(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedGalactose() {
        return null;
    }
    
    public final void setConsumedGalactose(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedMoisture() {
        return null;
    }
    
    public final void setConsumedMoisture(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedFolatenatural() {
        return null;
    }
    
    public final void setConsumedFolatenatural(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedSucrose() {
        return null;
    }
    
    public final void setConsumedSucrose(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedArsenic() {
        return null;
    }
    
    public final void setConsumedArsenic(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedOmega() {
        return null;
    }
    
    public final void setConsumedOmega(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedSodium() {
        return null;
    }
    
    public final void setConsumedSodium(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedBeta_carotene() {
        return null;
    }
    
    public final void setConsumedBeta_carotene(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedCadmium() {
        return null;
    }
    
    public final void setConsumedCadmium(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedVitamin_a_retinol_equivalents() {
        return null;
    }
    
    public final void setConsumedVitamin_a_retinol_equivalents(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedSugar() {
        return null;
    }
    
    public final void setConsumedSugar(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedO_poly_fats() {
        return null;
    }
    
    public final void setConsumedO_poly_fats(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedCholecalciferol_d3() {
        return null;
    }
    
    public final void setConsumedCholecalciferol_d3(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedPotassium() {
        return null;
    }
    
    public final void setConsumedPotassium(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedMercury() {
        return null;
    }
    
    public final void setConsumedMercury(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedDietary_folate_equivalents() {
        return null;
    }
    
    public final void setConsumedDietary_folate_equivalents(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedCobalt() {
        return null;
    }
    
    public final void setConsumedCobalt(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedLactose() {
        return null;
    }
    
    public final void setConsumedLactose(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedManganese() {
        return null;
    }
    
    public final void setConsumedManganese(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedBiotin_b7() {
        return null;
    }
    
    public final void setConsumedBiotin_b7(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedMaltose() {
        return null;
    }
    
    public final void setConsumedMaltose(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedMaltotriose() {
        return null;
    }
    
    public final void setConsumedMaltotriose(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedMono_fats() {
        return null;
    }
    
    public final void setConsumedMono_fats(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedSelenium() {
        return null;
    }
    
    public final void setConsumedSelenium(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedCopper() {
        return null;
    }
    
    public final void setConsumedCopper(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedIodine() {
        return null;
    }
    
    public final void setConsumedIodine(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedT_poly_fats_g() {
        return null;
    }
    
    public final void setConsumedT_poly_fats_g(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedNickel() {
        return null;
    }
    
    public final void setConsumedNickel(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedGlucose() {
        return null;
    }
    
    public final void setConsumedGlucose(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedChromium() {
        return null;
    }
    
    public final void setConsumedChromium(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedAntimony() {
        return null;
    }
    
    public final void setConsumedAntimony(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedCalcium() {
        return null;
    }
    
    public final void setConsumedCalcium(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedSulphur() {
        return null;
    }
    
    public final void setConsumedSulphur(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedNitrogen() {
        return null;
    }
    
    public final void setConsumedNitrogen(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedFructose() {
        return null;
    }
    
    public final void setConsumedFructose(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedLead() {
        return null;
    }
    
    public final void setConsumedLead(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedSat_fats() {
        return null;
    }
    
    public final void setConsumedSat_fats(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedMono_fats_g() {
        return null;
    }
    
    public final void setConsumedMono_fats_g(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedAsh() {
        return null;
    }
    
    public final void setConsumedAsh(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedAluminium() {
        return null;
    }
    
    public final void setConsumedAluminium(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedT_poly_fats() {
        return null;
    }
    
    public final void setConsumedT_poly_fats(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedIron() {
        return null;
    }
    
    public final void setConsumedIron(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedStarch() {
        return null;
    }
    
    public final void setConsumedStarch(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedRiboflavin_b2() {
        return null;
    }
    
    public final void setConsumedRiboflavin_b2(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedCholesterol() {
        return null;
    }
    
    public final void setConsumedCholesterol(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedVitaminD() {
        return null;
    }
    
    public final void setConsumedVitaminD(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getConsumedVitaminA() {
        return null;
    }
    
    public final void setConsumedVitaminA(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    public Product(int id, int foodProductId, float eatenGrams, float consumedCalories, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCryptoxanthin, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedTotalfolates, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedErgocalciferol_d2, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedNiacin_b3, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCobalamin_b12, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedEnergy_without_dietary_fibre, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCarbs, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedFluoride, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedPantothenic_acid_b5, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedThiamin_b1, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedFolicacid, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedRetinol, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedAlpha_carotene, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedPyridoxine_b6, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedProtein, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedFat, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedTin, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedChloride, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedOmega_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedZinc, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedO_poly_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedEnergy, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMolybdenum, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedPhosphorus, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedProvitamin_a, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedAlcohol, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedTotal_dietary_fiber, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSat_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedVitamin_c, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedVitamin_e, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMagnesium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedGalactose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMoisture, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedFolatenatural, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSucrose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedArsenic, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedOmega, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSodium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedBeta_carotene, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCadmium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedVitamin_a_retinol_equivalents, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSugar, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedO_poly_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCholecalciferol_d3, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedPotassium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMercury, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedDietary_folate_equivalents, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCobalt, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedLactose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedManganese, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedBiotin_b7, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMaltose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMaltotriose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMono_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSelenium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCopper, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedIodine, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedT_poly_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedNickel, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedGlucose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedChromium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedAntimony, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCalcium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSulphur, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedNitrogen, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedFructose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedLead, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSat_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMono_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedAsh, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedAluminium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedT_poly_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedIron, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedStarch, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedRiboflavin_b2, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCholesterol, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedVitaminD, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedVitaminA) {
        super();
    }
    
    public Product() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final float component3() {
        return 0.0F;
    }
    
    public final float component4() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component8() {
        return null;
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component17() {
        return null;
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component41() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component78() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component79() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component80() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component81() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component82() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float component83() {
        return null;
    }
    
    /**
     * all fields are counted with respect to consumed grams.
     * class used for saved foodproduct with grams consumed
     */
    @org.jetbrains.annotations.NotNull()
    public final com.feedapp.app.data.models.Product copy(int id, int foodProductId, float eatenGrams, float consumedCalories, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCryptoxanthin, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedTotalfolates, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedErgocalciferol_d2, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedNiacin_b3, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCobalamin_b12, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedEnergy_without_dietary_fibre, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCarbs, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedFluoride, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedPantothenic_acid_b5, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedThiamin_b1, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedFolicacid, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedRetinol, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedAlpha_carotene, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedPyridoxine_b6, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedProtein, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedFat, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedTin, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedChloride, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedOmega_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedZinc, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedO_poly_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedEnergy, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMolybdenum, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedPhosphorus, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedProvitamin_a, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedAlcohol, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedTotal_dietary_fiber, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSat_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedVitamin_c, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedVitamin_e, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMagnesium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedGalactose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMoisture, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedFolatenatural, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSucrose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedArsenic, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedOmega, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSodium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedBeta_carotene, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCadmium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedVitamin_a_retinol_equivalents, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSugar, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedO_poly_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCholecalciferol_d3, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedPotassium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMercury, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedDietary_folate_equivalents, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCobalt, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedLactose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedManganese, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedBiotin_b7, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMaltose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMaltotriose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMono_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSelenium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCopper, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedIodine, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedT_poly_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedNickel, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedGlucose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedChromium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedAntimony, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCalcium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSulphur, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedNitrogen, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedFructose, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedLead, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedSat_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedMono_fats_g, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedAsh, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedAluminium, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedT_poly_fats, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedIron, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedStarch, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedRiboflavin_b2, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedCholesterol, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedVitaminD, @org.jetbrains.annotations.Nullable()
    java.lang.Float consumedVitaminA) {
        return null;
    }
    
    /**
     * all fields are counted with respect to consumed grams.
     * class used for saved foodproduct with grams consumed
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * all fields are counted with respect to consumed grams.
     * class used for saved foodproduct with grams consumed
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}