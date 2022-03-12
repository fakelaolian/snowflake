package com.snowflake.framework.server;

import com.snowflake.framework.annotation.Install;
import com.snowflake.framework.context.SnowflakeApplicationContext;
import com.snowflake.framework.servlet.JettyServlet;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jetty.server.Server;

/**
 * @author lts
 * Create time 2022/3/8
 */
@Slf4j
public class JettyServer {

    // Jetty服务
    private final Server server;

    private SnowflakeApplicationContext _context;

    @Install
    private JettyServlet servletHandler;

    public JettyServer(SnowflakeApplicationContext context, ServerConfig serverConfig) {
        _context = context;
        _context.addBean(this);

        // 初始化Jetty服务
        server = new Server(serverConfig.getPort());
        server.setHandler(servletHandler);
    }

    /**
     * 启动Jetty服务
     */
    public void startServer() {
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            log.error("服务启动失败", e);
            e.printStackTrace();
        }
    }

}
