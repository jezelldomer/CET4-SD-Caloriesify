package com.front_end.app.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"PASSWORD_PATTERN", "", "isEmail", "", "isJSONObject", "isPassword", "app_debug"})
public final class StringsKt {
    
    /**
     * Minimum 8 characters, at least one uppercase letter, one lowercase letter, one number and one special character
     */
    private static final java.lang.String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[`~#@$!%^*?&()+-_=<>,./\';:{}|])[A-Za-z\\d`~#@$!%^*?&()+-_=<>,./\';:{}|]{8,}$";
    
    /**
     * the string extension method to identify the value is type of email pattern or not
     * @return boolean value if string value not match with the email pattern it returns false
     */
    public static final boolean isEmail(@org.jetbrains.annotations.NotNull
    java.lang.String $this$isEmail) {
        return false;
    }
    
    /**
     * the string extension method to identify the value is type of password pattern or not
     * @return boolean value if string value not match with the password pattern it returns false
     */
    public static final boolean isPassword(@org.jetbrains.annotations.NotNull
    java.lang.String $this$isPassword) {
        return false;
    }
    
    /**
     * the string extension method to identify the jsonObject from the json string
     * @return boolean value if string value is not match with the jsonObject it returns false
     */
    public static final boolean isJSONObject(@org.jetbrains.annotations.NotNull
    java.lang.String $this$isJSONObject) {
        return false;
    }
}