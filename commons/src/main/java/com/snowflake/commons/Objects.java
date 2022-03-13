package com.snowflake.commons;

/**
 * 对象工具类
 *
 * @author lts
 * Create time 2022/3/12
 */
public final class Objects {

    /**
     * 深拷贝一个对象
     */
    @SuppressWarnings("unchecked")
    public static <T> T copy(T object) {
        if (object == null)
            return null;

        return (T) JSONSerials.asObject(JSONSerials.asString(object), object.getClass());
    }

}
