package com.learnSpringFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "salman";
	}

	@Bean
	public int age() {
		return 22;
	}

	@Bean(name = "salman")
	public Person person() {
		return new Person(name(), age(), address());
	}

	@Bean
	@Primary
	public Address address() {
		return new Address("kamshet", "pune");
	}

	@Bean
	public Address address2() {
		return new Address("kamshet", "pune");
	}

	@Bean
	public Person personParameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
}
