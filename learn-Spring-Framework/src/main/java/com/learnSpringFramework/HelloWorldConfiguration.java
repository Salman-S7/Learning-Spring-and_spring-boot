package com.learnSpringFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
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
		return new Person("salman shaikh", 22);
	}

	@Bean
	public Address address() {
		return new Address("kamshet", "pune");
	}
}
