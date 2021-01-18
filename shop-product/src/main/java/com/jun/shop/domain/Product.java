package com.jun.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {
	private Long id;
	private String name;
	private Integer price;
}
