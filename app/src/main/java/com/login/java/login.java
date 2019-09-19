package com.login.java;

import androidx.annotation.Nullable;


class LoginKeadaan {

    private Integer usernameError;
    private Integer passwordError;
    private boolean isDataValid;

    LoginKeadaan(@Nullable Integer usernameError, @Nullable Integer passwordError) {
        this.usernameError = usernameError;
        this.passwordError = passwordError;
        this.isDataValid = false;
    }

    LoginKeadaan(boolean isDataValid) {
        this.usernameError = null;
        this.passwordError = null;
        this.isDataValid = isDataValid;
    }


    Integer getUsernameError() {
        return usernameError;
    }


    Integer getPasswordError() {
        return passwordError;
    }

    boolean isDataValid() {
        return isDataValid;
    }
}
