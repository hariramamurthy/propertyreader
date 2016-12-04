package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class PropertyreaderApplication {


	public static void main(String[] args) {
		SpringApplication.run(PropertyreaderApplication.class, args);
	}


	@Component
	public static class EmbeddedKafkaRunner implements CommandLineRunner {

		@Autowired
		private InitProps initprops;

		@Value("${spring.data1}")
		private String zookeeperHost;

		@Override
		public void run(String... args) throws Exception {
			System.out.println("Test Message :::::" + zookeeperHost );

			System.out.println("Test Message :::::--------" + initprops.SpringData2);


			System.out.println("SpringData3???--------" + initprops.SpringData3);
		}

	}
}
