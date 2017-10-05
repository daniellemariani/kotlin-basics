package com.dmariani.kotlin.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author danielle.mariani
 */
public class StringUtils {

    private StringUtils() {
    }

    public static final String WHITESPACE = " ";

    /**
     * Convert a date into a String
     *
     * @param date
     * @param format
     * @return String date
     */
    public static String timestamp(Date date, String format) {

        if (date == null) {
            date = new Date();
        }

        if (format == null) {
            format = "E MMM dd, yyyy hh:mm:ss a";
        }

        return new SimpleDateFormat(format).format(date);
    }


    /**
     * Get the middle length
     * @param text
     * @return int middle length
     */
    public static int getMiddleLength(String text) {
        return text == null ? 0 : text.length()/2;
    }

}
