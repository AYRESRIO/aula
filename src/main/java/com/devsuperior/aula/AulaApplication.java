package com.devsuperior.aula;
import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class AulaApplication implements CommandLineRunner {

	private OrderService orderService;

	public AulaApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {

		SpringApplication.run(AulaApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309,95.90,0.00);
		System.out.println("Pedido Código = " + order.getCode());
		System.out.printf("Valor Total = R$ %.2f",orderService.total(order));
	}
}
