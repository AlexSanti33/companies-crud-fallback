package com.portafolio.microservicios.companies_crud_fallback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CompaniesCrudFallbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompaniesCrudFallbackApplication.class, args);
	}

}
