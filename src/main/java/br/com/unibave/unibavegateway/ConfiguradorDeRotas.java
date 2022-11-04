package br.com.unibave.unibavegateway;

import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_REQUEST_URL_ATTR;
import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.addOriginalRequestUrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

//@Configuration
public class ConfiguradorDeRotas {
	
	/*@Value("${url-unibave-pos-api}")
	private String urlPosApi;

	private Mono<Void> gerarRedirecionamentoPara(ServerWebExchange exchange, GatewayFilterChain chain,
			String resourcePath) {

		ServerHttpRequest req = exchange.getRequest();

		addOriginalRequestUrl(exchange, req.getURI());

		ServerHttpRequest request = req.mutate().path(resourcePath).build();

		exchange.getAttributes().put(GATEWAY_REQUEST_URL_ATTR, request.getURI());

		return chain.filter(exchange.mutate().request(request).build());

	}

	@Bean
	public RouteLocator proxyRoutes(RouteLocatorBuilder builder) {
		return builder.routes().route("pos_api_route",
				r -> r.path("/api/pos/**").filters(f -> f.filter((exchange, chain) -> {
					// Recupera o caminho completo do microserviço a ser acessado e remove o prefixo
					String resourcePath = exchange.getRequest().getURI().getRawPath().replaceAll("/api/pos", "");
					return gerarRedirecionamentoPara(exchange, chain, resourcePath);
				})).uri(urlPosApi)).build();
	}*/

}
