package com.aurion.model;

import com.aurion.exceptions.EmailValidationException;
import com.aurion.exceptions.MobileValidationException;

public class Validator {
    public static void validateMobile(String mobileNumber) throws MobileValidationException {
        if (!mobileNumber.matches("[0-9]{10}")) {
            throw new MobileValidationException("Invalid mobile number");
        }
    }

    public static void validateEmail(String emailAddress) throws EmailValidationException {
        if (!emailAddress.contains("@")) {
            throw new EmailValidationException("Invalid email address");
        }
    }
}
