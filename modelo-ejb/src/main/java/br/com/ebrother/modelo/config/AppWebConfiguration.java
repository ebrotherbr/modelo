package br.com.ebrother.modelo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@ComponentScan(basePackages = { "br.com.ebrother.modelo.controller", "br.com.ebrother.modelo.data.impl",
		"br.com.ebrother.modelo.service" })
public class AppWebConfiguration extends WebMvcConfigurerAdapter {

}
