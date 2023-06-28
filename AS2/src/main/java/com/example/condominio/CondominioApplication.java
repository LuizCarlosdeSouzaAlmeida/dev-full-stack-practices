package com.example.condominio;

import com.example.condominio.ui.LoginView;
import com.vaadin.flow.spring.security.VaadinWebSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;


@SpringBootApplication
public class CondominioApplication extends VaadinWebSecurity {

	public static void main(String[] args) {
		SpringApplication.run(CondominioApplication.class, args);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		super.configure(http);
		setLoginView(http, LoginView.class);
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		super.configure(web);
	}

	@Bean
	public UserDetailsManager userDetailsService() {
		UserDetails user =
				User.withUsername("user")
						.password("{noop}user")
						.roles("USER")
						.build();
		UserDetails admin =
				User.withUsername("admin")
						.password("{noop}admin")
						.roles("ADMIN")
						.build();
		return new InMemoryUserDetailsManager(user, admin);
	}
}
