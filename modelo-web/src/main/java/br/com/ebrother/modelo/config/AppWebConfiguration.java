package br.com.ebrother.modelo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "br.com.ebrother.modelo.controller", "br.com.ebrother.modelo.data.impl",
		"br.com.ebrother.modelo.service" })
public class AppWebConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
