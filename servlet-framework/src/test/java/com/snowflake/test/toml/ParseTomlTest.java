package com.snowflake.test.toml;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.dataformat.toml.TomlMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * 解析toml配置文件测试
 *
 * @author lts
 * Create time 2022/3/10
 */
public class ParseTomlTest {

    public static class Server {
        private String name;
        private Integer port;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }
    }

    @Test
    public void parseToml() throws IOException {
        var tomlMapper = new TomlMapper();
        var server = tomlMapper.readValue(new File("application.toml"), Map.class);
        System.out.println(JSON.toJSONString(server));
    }

}
