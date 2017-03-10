package com.redhat.ipaas.support;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EchoRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchoRestServiceApplication.class, args);
	}

}
