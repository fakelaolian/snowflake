package com.snowflake.framework.jetty

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.server.handler.AbstractHandler

/**
 * @author lts
 * ----------------------------
 * Create time 2022/3/7
 */
class JettyServer {

    private Server server

    JettyServer(int port, AbstractHandler abstractHandler) {
        server = new Server(port)
        server.handler = abstractHandler
    }

    /**
     * 启动Jetty服务
     */
    void start() {
        server.start()
        server.dumpStdErr()
        server.join()
    }

}
