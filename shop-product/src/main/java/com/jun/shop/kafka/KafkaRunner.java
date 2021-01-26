package com.jun.shop.kafka;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

public class KafkaRunner {

//	public static void main(String[] args) {
//		new KafkaRunner().run();
//	}
	
	public void run() {
		Properties properties = new Properties();
		properties.put("bootstrap.servers","192.168.219.103:30092");
		properties.put("group.id","test");
		properties.put("auto.offset.reset","latest");
		properties.put("key.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
		properties.put("value.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
//		properties.put("key.deserializer",StringDeserializer.class.getName());
//		properties.put("value.deserializer",StringDeserializer.class.getName());
		
		
		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);
		consumer.subscribe(Collections.singletonList("test01"));
		while(true) {
			ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
			for(ConsumerRecord<String, String> record : records) {
				System.out.println(record);
			}
		}
	}
}
