package tn.esprit.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableScheduling
@EnableSwagger2
@SpringBootApplication
@EnableAspectJAutoProxy
public class SheForSheAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SheForSheAppApplication.class, args);
	}

}
