package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo02 implements Filter {

    /**
     * 在服务器关闭后，Filter对象呗销毁，如果服务器是正常关闭，则会执行destory方法
     */
    public void destroy() {
    }

    /**
     * 每一次请求被拦截资源时，会执行一次，可以执行多次
     *
     * @param req
     * @param resp
     * @param chain
     * @throws ServletException
     * @throws IOException
     */
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterDemo02执行了....");
        chain.doFilter(req, resp);

        System.out.println("filterDemo02回来了...");
    }

    /**
     * 在服务启动后，会创建Filter对象，然后调用init方法
     *
     * @param config
     * @throws ServletException
     */
    public void init(FilterConfig config) throws ServletException {

    }

}
