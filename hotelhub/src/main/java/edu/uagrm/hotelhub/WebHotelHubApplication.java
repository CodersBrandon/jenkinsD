package edu.uagrm.hotelhub;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebHotelHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebHotelHubApplication.class, args);
	}


	@Bean
	public GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder()
			.group("digitalthinking-spis")
			.packagesToScan("edu.uagrm.hotelhub")
			.pathsToMatch("/**")
			.build();
	}
}
