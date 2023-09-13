package com.powering.spring.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class SecurityConfig {

	    @Bean
	    public CorsFilter corsFilter() {
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        CorsConfiguration config = new CorsConfiguration();
	        
	        // Specifica gli origini consentiti (domini) dalle quali verranno accettate le chiamate CORS.
	        config.addAllowedOrigin("*"); // Puoi specificare gli origini consentiti in modo più restrittivo.

	        // Specifica i metodi HTTP consentiti (GET, POST, PUT, DELETE, ecc.).
	        config.addAllowedMethod("*"); // Puoi specificare i metodi consentiti in modo più restrittivo.

	        // Specifica gli header consentiti nelle richieste.
	        config.addAllowedHeader("*"); // Puoi specificare gli header consentiti in modo più restrittivo.

	        source.registerCorsConfiguration("/**", config);

	        return new CorsFilter(source);
	    }
	}



