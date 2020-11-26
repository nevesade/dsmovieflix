package com.devnevesade.MovieFlix.config;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;



@Configuration
@EnableResourceServer

public class ResourceServerConfig extends ResourceServerConfigurerAdapter{
	
	
	/*
	@Autowired
	private Environment env ;
	
	*/
	
	
	@Autowired
	private JwtTokenStore tokenStore;
	
	private static final String[] PUBLIC = {"/oauth/token", "/h2-console/**"};
	
	private static final String[] VISITOR_OR_MEMBER_OR_ADMIN = {"/movies/**", "/genres/**" };
	
	private static final String[] MEMBER_OR_ADMIN = { "/reviews/**"};
	
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources.tokenStore(tokenStore);
	}

	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		
		/*
		
		//H2
		if (Arrays.asList(env.getActiveProfiles()).contains("test")){
			http.headers().frameOptions().disable();
			
		}
		
		*/
		
	
		http.authorizeRequests()
		.antMatchers(PUBLIC).permitAll()
		.antMatchers(HttpMethod.GET, VISITOR_OR_MEMBER_OR_ADMIN ).permitAll()
		.antMatchers(VISITOR_OR_MEMBER_OR_ADMIN).hasAnyRole("VISITOR","MEMBER", "ADMIN")
		.antMatchers(MEMBER_OR_ADMIN).hasAnyRole("MEMBER","ADMIN")
		.anyRequest().authenticated();
		
		
		//http.cors().configurationSource(corsConfigurationSource());
		
	}
	
	
	
	/*
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration corsConfig = new CorsConfiguration();
		corsConfig.setAllowedOrigins(Arrays.asList("*"));
		corsConfig.setAllowedMethods(Arrays.asList("POST", "GET", "PUT", "DELETE", "PATCH"));
		corsConfig.setAllowCredentials(true);
		corsConfig.setAllowedHeaders(Arrays.asList("Authorization", "Content-Type"));

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", corsConfig);
		return source;
	}

	@Bean
	public FilterRegistrationBean<CorsFilter> corsFilter() {
		FilterRegistrationBean<CorsFilter> bean 
			= new FilterRegistrationBean<>(new CorsFilter(corsConfigurationSource()));
		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return bean;
	}
*/
	
	
}
