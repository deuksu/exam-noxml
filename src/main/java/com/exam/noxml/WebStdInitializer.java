package com.exam.noxml;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.h2.server.web.WebServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import com.exam.noxml.config.AppConfig;
import com.exam.noxml.config.WebConfig;

public class WebStdInitializer implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    
    //parent
    AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
    rootContext.register(AppConfig.class);

    //listener
    servletContext.addListener(new ContextLoaderListener(rootContext));
    
    //add dispatcher servlet
    AnnotationConfigWebApplicationContext dispatcherServletContext = new AnnotationConfigWebApplicationContext();
    dispatcherServletContext.register(WebConfig.class);
    
    DispatcherServlet servlet = new DispatcherServlet(dispatcherServletContext);
    ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", servlet);
    dispatcher.setLoadOnStartup(1);
    dispatcher.addMapping("/");
    
    //add filter
    FilterRegistration.Dynamic filter =  servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
    filter.setInitParameter("encoding", "utf-8");
    filter.addMappingForServletNames(null, false, "dispatcher");
    
    //add h2 console
    WebServlet h2ConsoleServlet = new WebServlet();
    ServletRegistration.Dynamic h2Servlet = servletContext.addServlet("h2Servlet", h2ConsoleServlet);
    h2Servlet.setLoadOnStartup(2);
    h2Servlet.addMapping("/admin/h2/*");
  }

}
