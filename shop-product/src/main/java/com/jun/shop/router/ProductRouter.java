package com.jun.shop.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.jun.shop.handler.ProductHandler;

@Configuration
public class ProductRouter {

	@Bean
	public RouterFunction<ServerResponse> route(ProductHandler handler){
		return RouterFunctions.route()
				.route(RequestPredicates.GET("/product"), handler::product)
				.build();
	}
}
