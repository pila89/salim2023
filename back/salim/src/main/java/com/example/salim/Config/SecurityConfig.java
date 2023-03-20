package com.example.salim.Config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private DataSource dataSource;

    private String usersQuery;
    private String rolesQuery;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
        ;
        return http.build();
    }
    //1)Authentication
    /*@Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.
                jdbcAuthentication()
                .usersByUsernameQuery(usersQuery)
                .authoritiesByUsernameQuery(rolesQuery)
                .dataSource(dataSource)
                .passwordEncoder(bCryptPasswordEncoder);
    }
    //2)Autorisation
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.
                authorizeRequests()
                .antMatchers("/").permitAll() // accès pour tous users
                .antMatchers("/login").permitAll() // accès pour tous users
                .antMatchers("/registration").permitAll() // accès pour tous users
                .antMatchers("/role/**").permitAll()
                .antMatchers("/accounts/**").permitAll()
                .antMatchers("/provider/**").permitAll()
                .antMatchers("/article/**").hasAnyAuthority("USER", "SUPERADMIN").anyRequest()
                .authenticated().and().csrf().disable().formLogin() // l'accès de fait via un formulaire
                .loginPage("/login").failureUrl("/login?error=true") // fixer la page login
                .defaultSuccessUrl("/home") // page d'accueil après login avec succès
                .usernameParameter("email") // paramètres d'authentifications login et password
                .passwordParameter("password")
                .and().logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout")) // route de deconnexion ici /logut
                .logoutSuccessUrl("/login").and().exceptionHandling() // une fois deconnecté redirection vers login
                .accessDeniedPage("/403");
    }*/

}