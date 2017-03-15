package com.james;

import com.james.entity.Customer;
import com.james.repos.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MicroservicesExample2HateosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesExample2HateosApplication.class, args);
	}

	@Bean
	CommandLineRunner init(CustomerRepository repo) {
		return (evt) -> {
			repo.save(new Customer("Adam", "adam@eample.com"));
			repo.save(new Customer("John", "john@eample.com"));
			repo.save(new Customer("Smith", "smith@eample.com"));
			repo.save(new Customer("Edgar", "edgar@eample.com"));
			repo.save(new Customer("Huw", "huw@eample.com"));
			repo.save(new Customer("William", "will@eample.com"));
			repo.save(new Customer("Neil", "neil@eample.com"));
		};
	}
}
