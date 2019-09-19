package com.login.java;

import androidx.annotation.Nullable;

class LoginHasil {
    @Nullable
    private LoggedInUserView success;
    @Nullable
    private Integer error;

    LoginHasil(@Nullable Integer error) {
        this.error = error;
    }

    LoginHasil(@Nullable LoggedInUserView success) {
        this.success = success;
    }

    @Nullable
    LoggedInUserView getSuccess() {
        return success;
    }

    @Nullable
    Integer getError() {
        return error;
    }
}
