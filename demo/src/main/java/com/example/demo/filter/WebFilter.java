package com.example.demo.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import java.io.IOException;

@Order(1)
@javax.servlet.annotation.WebFilter(filterName = "WebFilter", urlPatterns = "/*")
public class WebFilter implements Filter {

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter do");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("init filter");
    }

}
