package com.rimonmostafiz.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Rimon Mostafiz
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }


    /* The @Configuration classes returned from getServletConfigClasses() will
    define beans for DispatcherServlet ’s application context.*/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }


    /* The @Configuration class’s returned getRootConfigClasses() will be used
    to configure the application context created by ContextLoaderListener .*/
    @Override
    protected String[] getServletMappings() {
        return new String[] {new String("/")};
    }
}
