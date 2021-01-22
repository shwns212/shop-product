package com.jun.shop.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.jun.shop.domain.Product;

import reactor.core.publisher.Mono;

@Component
public class ProductHandler {

	public Mono<ServerResponse> product(ServerRequest requeset){
		return ServerResponse.ok()
				.body(Mono.just(new Product(1L,"ci/cd test",10000)), Product.class);
	}
}
