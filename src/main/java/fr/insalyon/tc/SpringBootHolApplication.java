package fr.insalyon.tc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootHolApplication {

	/*@Bean
	public HealthIndicator authServiceHealthIndicator() {
		return new HealthIndicator() {
			@Override
			public Health health() {
				int errorCode = check(); // perform some specific health check
				if (errorCode != 0) {
					return Health.down().withDetail("Error Code", errorCode).build();
				}
				return Health.up().build();
			}


		};
	}*/

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHolApplication.class, args);
	}
}
