package br.com.ebrother.modelo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

import br.com.ebrother.poc.config.JPAConfiguration;
import br.com.ebrother.poc.config.WebConfiguration;
import br.com.ebrother.poc.messages.impl.MessageByLocaleServiceImpl;

@SpringBootApplication
@Import(value = { JPAConfiguration.class, WebConfiguration.class, MessageByLocaleServiceImpl.class })
public class Application extends SpringBootServletInitializer {

	public static void main(final String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
