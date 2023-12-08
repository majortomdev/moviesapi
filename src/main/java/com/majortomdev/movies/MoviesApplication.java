package com.majortomdev.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration;

@SpringBootApplication
//@EntityScan(basePackages = "com.majortomdev.movies")
//@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
@EnableAutoConfiguration(exclude={MongoReactiveAutoConfiguration.class})
public class MoviesApplication {



	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

}
