package com.bankapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Component
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecConfig {
    //Authentication provider, DaoAuthentationProvide

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        return daoAuthenticationProvider;
    }


    //security filter chain
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
//
//        return httpSecurity.csrf(AbstractHttpConfigurer::disable)
//                .cors(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests(
//                        auth->auth.requestMatchers("/admin/**").hasAnyRole("ADMIN")
//                                .requestMatchers("/mgr/**").hasAnyRole("ADMIN","MGR")
//                                .requestMatchers("/clerk/**").hasAnyRole("ADMIN","MGR","CLERK")
//                                .requestMatchers("/home/**").permitAll()
//                                .anyRequest().authenticated()
//                )
//                .httpBasic(Customizer.withDefaults())
//                .sessionManagement((session)->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .build();
//    }




    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
       return httpSecurity.csrf(AbstractHttpConfigurer::disable)
                .cors(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((auth)->auth.anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults())
               .sessionManagement((session)->session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }





    //password encoder
    //i want to use plan text pass
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
//@Bean
//public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder){
//    UserDetails userDetails= User.withUsername("raj")
//            .password(passwordEncoder.encode("raj123"))
//            .roles("ADMIN","MGR","CLERK").build();
//    UserDetails userDetails2= User.withUsername("ekta")
//            .password(passwordEncoder.encode("ekta123"))
//            .roles("MGR","CLERK").build();
//
//    UserDetails userDetails3= User.withUsername("gun")
//            .password(passwordEncoder.encode("gun123"))
//            .roles("CLERK").build();
//
//    return new InMemoryUserDetailsManager(userDetails,userDetails2,userDetails3);
//}