package br.com.guusto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = GuustoJavaApplication.class)
public class GuustoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuustoJavaApplication.class, args);
	}
}
