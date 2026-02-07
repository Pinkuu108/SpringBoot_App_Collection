package in.pinku.config;

import in.pinku.rest.Banking_RestCOntroller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class BankingConfiguraction {

	private final Banking_RestCOntroller banking_RestCOntroller;

	BankingConfiguraction(Banking_RestCOntroller banking_RestCOntroller) {
		this.banking_RestCOntroller = banking_RestCOntroller;
	}

	@Bean
	public SecurityFilterChain SecurityFilter(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(
				(request) -> request.requestMatchers("/loginpage", "/contact").permitAll().anyRequest().authenticated())
				.formLogin();
		return http.build();
	}
}
