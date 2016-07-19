package app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application implements ServletContextInitializer {

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void onStartup(final ServletContext arg0) throws ServletException {
		// TODO Auto-generated method stub

	}
}
