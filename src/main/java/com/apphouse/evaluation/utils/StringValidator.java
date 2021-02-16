package com.apphouse.evaluation.utils;

import org.springframework.util.StringUtils;

public class StringValidator {


    public static boolean isEmptyOrNull(String s) {
        return s == null || StringUtils.isEmpty(s);
    }
}
