package com.akb;

public class RegistrationUtil {

    boolean validationUserInput(String username, String pass, String confirmPass){

        if (username.isEmpty() || pass.isEmpty() || confirmPass.isEmpty()){
            return false;
        }

        if (!pass.equals(confirmPass)){
            return false;
        } else {
            return true;
        }
    }
}
