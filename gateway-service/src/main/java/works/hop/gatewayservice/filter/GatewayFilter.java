package works.hop.gatewayservice.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class GatewayFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.printf("Pre-processing gateway request - %s\n", exchange.getRequest().getId());
        return chain.filter(exchange).then(Mono.fromRunnable(() -> {
            System.out.printf("Post-processing gateway response - %s\n", exchange.getRequest().getId());
        }));
    }
}
