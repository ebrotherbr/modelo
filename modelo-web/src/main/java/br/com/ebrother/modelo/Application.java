package br.com.ebrother.modelo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.DispatcherServlet;

import br.com.ebrother.poc.messages.impl.MessageByLocaleServiceImpl;

@SpringBootApplication
@Import(value = { JPAConfiguration.class, WebConfig.class, MessageByLocaleServiceImpl.class })
public class Application extends SpringBootServletInitializer {

	public static void main(final String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public DispatcherServlet dispatcherServlet() {
		return new DispatcherServlet();
	}

	@Bean
	public ServletRegistrationBean dispatchServletRegistration() {
		final ServletRegistrationBean registration = new ServletRegistrationBean(this.dispatcherServlet(), "/rest/*");
		registration.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);
		return registration;
	}

}
