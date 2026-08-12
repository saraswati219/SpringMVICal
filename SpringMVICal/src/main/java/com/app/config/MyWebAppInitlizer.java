package com.app.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class MyWebAppInitlizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("Project Start");
		
		//1 create the container
		AnnotationConfigWebApplicationContext ap = new AnnotationConfigWebApplicationContext();
		
		//2 Register Config class
		ap.register(SpringConfig.class);
		
		//3.Create Dispatcher Servlet
		DispatcherServlet ds = new DispatcherServlet(ap);
		
		//4.Register Dispatcher Servlet
		
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("ds", ds);
		
		//Map URL
		dispatcher.addMapping("/");
		
	}

}
