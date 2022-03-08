package com.snowflake.framework.exception;

/**
 * @author lts
 * Create time 2022/3/8
 */
public class SnowflakeIllegalInstallClass extends Exception {

    public SnowflakeIllegalInstallClass() {
    }

    public SnowflakeIllegalInstallClass(String message) {
        super(message);
    }

    public SnowflakeIllegalInstallClass(String message, Throwable cause) {
        super(message, cause);
    }

    public SnowflakeIllegalInstallClass(Throwable cause) {
        super(cause);
    }

    public SnowflakeIllegalInstallClass(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
