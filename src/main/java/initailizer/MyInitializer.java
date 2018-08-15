package initailizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyInitializer 
//implements WebApplicationInitializer 
{

//	@Override
	public void onStartup(ServletContext container) throws ServletException {
		XmlWebApplicationContext context=new XmlWebApplicationContext();
		context.setConfigLocation("/WEB-INF/webmvc-config.xml");
		ServletRegistration.Dynamic registration=container.addServlet("webmvc", new DispatcherServlet(context));
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
		
		
		
		

	}

}
