package initailizer;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import configure.RootConfig;
import configure.WebConfig;
/**
 * 零配置方案
 * @author john
 *
 */
public class RootWebContainerInitializer extends AbstractDispatcherServletInitializer{
	/**
	 * 子容器启动，无需指定DispatcheServlet
	 */
	@Override
	protected WebApplicationContext createServletApplicationContext() {
		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
		context.register(WebConfig.class);
		return context;
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	/**
	 * 父容器启动，采用Spring配置类完成容器配置
	 */
	@Override
	protected WebApplicationContext createRootApplicationContext() {
		AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
		context.register(RootConfig.class);
		return context;
	}

}
