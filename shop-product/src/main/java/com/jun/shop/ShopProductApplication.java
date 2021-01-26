package com.jun.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jun.shop.kafka.KafkaRunner;

@SpringBootApplication
//@EnableR2dbcRepositories
public class ShopProductApplication {

	public static void main(String[] args) {
		new Thread(() ->  {
			new KafkaRunner().run();
		}).start();
		SpringApplication.run(ShopProductApplication.class, args);
	}

}
