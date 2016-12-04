package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;


@SpringBootApplication
public class PropertyreaderApplication2 implements CommandLineRunner  {


	public static void main(String[] args) {
		SpringApplication.run(PropertyreaderApplication2.class, args);
	}

	@Autowired
	private InitProps initprops;

	@Autowired
	private InitPropsLoad initpropsload;

	@Value("${spring.data1}")
	private String zookeeperHost;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Test Message22 :::::" + zookeeperHost );

		System.out.println("Test Message22 :::::--------" + initprops.SpringData2);

		System.out.println("SpringData22 3???--------" + initprops.SpringData3);

		System.out.println("SpringData22 4???--------" + initpropsload.data4);
		System.out.println("SpringData22 5???--------" + initpropsload.data5);
	}
}
