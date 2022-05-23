package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("welcome to GlobalLogic");
		System.out.println("welcome to GlobalLogic");
		System.out.println("welcome to GlobalLogic");
		Stream.of("Ram","Rakesh","Tapan","Sovan","Amit","Riya")
				.filter(s->s.startsWith("R"))
				.map(s->s.substring(2))
				.distinct()
				.sorted()
				.collect(Collectors.toList());

	}

}
