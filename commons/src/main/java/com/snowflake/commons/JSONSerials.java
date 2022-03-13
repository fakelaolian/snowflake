package com.snowflake.commons;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * JSON序列化工具
 *
 * @author lts
 * Create time 2022/3/10
 */
public final class JSONSerials {

    /**
     * 对象转JSON字符串
     */
    public static String asString(Object object) {
        return JSON.toJSONString(object);
    }

    /**
     * JSON字符串转Java对象
     */
    public static <T> T asObject(String jstring, Class<T> _class) {
        if (StringUtils.isEmpty(jstring))
            return null;
        return JSONObject.parseObject(jstring).toJavaObject(_class);
    }

}
