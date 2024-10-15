package com.the_component.rest_api;

import com.the_component.rest_api.entity.Product;
import com.the_component.rest_api.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class RestApiApplication implements CommandLineRunner {
	private final ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product1 = Product.builder()
				.name("Glass")
				.description("A glass")
				.price(15.4)
				.build();
		Product product2 = Product.builder()
				.name("Computer")
				.description("A computer")
				.price(293.5)
				.build();
		productRepository.saveAll(List.of(product1, product2));
	}
}
