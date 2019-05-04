package it.cast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Filter生命周期
 */
//@WebFilter("/*")
public class FilterDemo3 implements Filter {
    //服务器正常关闭时执行
    public void destroy()
    {
        System.out.println("destroy");
    }
    //过滤资源被多次访问时执行该方法，执行多次
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("FilterDemo3....");
        chain.doFilter(req, resp);
    }

    //服务器启动时生成Filter对象，并且调用init()方法,执行一次
    public void init(FilterConfig config) throws ServletException {
        System.out.println("init");
    }

}
