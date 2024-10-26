package com.aurion.model;


import java.util.regex.Pattern;

import com.aurion.exceptions.EmailValidationException;
import com.aurion.exceptions.MobileValidationException;

public class Validator {
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    private static final String MOBILE_REGEX = "^\\d{10}$";
    private static final Pattern MOBILE_PATTERN = Pattern.compile(MOBILE_REGEX);

    public static void validateEmail(String email) {
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new EmailValidationException();
        }
    }

    public static void validateMobile(String mobile) {
        if (!MOBILE_PATTERN.matcher(mobile).matches()) {
            throw new MobileValidationException();
        }
    }
}
