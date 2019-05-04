package it.cast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Filter的执行过程
 */
//@WebFilter("/*")
public class FilterDemo2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("FilterDemo2......");
        chain.doFilter(req, resp);
        System.out.println("FilterDemo2回来啦......");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
