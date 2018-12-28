package br.com.beer.rateando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.beer")
public class RateandoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RateandoApplication.class, args);//
	}

}

