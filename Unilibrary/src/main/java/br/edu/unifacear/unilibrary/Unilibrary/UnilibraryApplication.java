package br.edu.unifacear.unilibrary.Unilibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class UnilibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnilibraryApplication.class, args);
	}

}
