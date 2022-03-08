package com.snowflake.framework.exception;

/**
 * @author lts
 * Create time 2022/3/8
 */
public class IllegalInstallClassException extends Exception {

    public IllegalInstallClassException() {
    }

    public IllegalInstallClassException(String message) {
        super(message);
    }

    public IllegalInstallClassException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalInstallClassException(Throwable cause) {
        super(cause);
    }

    public IllegalInstallClassException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
