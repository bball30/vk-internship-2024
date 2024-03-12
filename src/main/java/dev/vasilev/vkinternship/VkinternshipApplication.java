package dev.vasilev.vkinternship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class VkinternshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(VkinternshipApplication.class, args);
	}
}
