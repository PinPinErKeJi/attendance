package com.xio.attendance.utils;

public class StringUtil {

    public static boolean isEmptyOrNull(Object obj) {
        return obj == null ? true : obj.toString().trim().isEmpty();
    }
    public static String toSafeString(Object obj) {
        return obj != null ? obj.toString() : "";
    }
    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs != null && (strLen = cs.length()) != 0) {
            for(int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }
    public static boolean isNotBlank(CharSequence cs) {
        return !isBlank(cs);
    }
}
