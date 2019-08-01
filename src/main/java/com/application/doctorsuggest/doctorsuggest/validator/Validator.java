package com.application.doctorsuggest.doctorsuggest.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public boolean mailvalidator(String email){
        if(email.length()==0){
            return false;
        }
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    return email.matches(regex);
    }

    public boolean phoneNumberValidator(String phoneNumber){
        if(phoneNumber.length()==0){
            return false;
        }
        Pattern kontrol=Pattern.compile("5[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
        Matcher matcher = kontrol.matcher(phoneNumber);
        return matcher.matches();
    }

}
