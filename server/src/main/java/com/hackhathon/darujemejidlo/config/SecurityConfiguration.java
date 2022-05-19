package com.hackhathon.darujemejidlo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
//                .antMatchers("/api/log/**").hasAnyAuthority(GroupName.ADMINISTRATOR.toString(), GroupName.REPAIRMAN.toString(), GroupName.CUSTOMER.toString())
//                .antMatchers("/api/report/**").hasAnyAuthority(GroupName.ADMINISTRATOR.toString(), GroupName.REPAIRMAN.toString(), GroupName.CUSTOMER.toString())
//                .antMatchers("/api/user/**").hasAnyAuthority(GroupName.ADMINISTRATOR.toString(), GroupName.REPAIRMAN.toString(), GroupName.CUSTOMER.toString())
//                .antMatchers("/api/vehicle/**").hasAnyAuthority(GroupName.ADMINISTRATOR.toString(), GroupName.REPAIRMAN.toString(), GroupName.CUSTOMER.toString())
//                .antMatchers("/api/repair/**").hasAnyAuthority(GroupName.ADMINISTRATOR.toString(), GroupName.REPAIRMAN.toString(), GroupName.CUSTOMER.toString())
//                .antMatchers("/api/shop/**").hasAnyAuthority(GroupName.ADMINISTRATOR.toString(), GroupName.REPAIRMAN.toString(), GroupName.CUSTOMER.toString())
//                .antMatchers("/api/user/logged").permitAll()
                .anyRequest()
                .permitAll();



        http.csrf().disable();
        http.cors();

//        http.formLogin()
//            .permitAll()
//            .successHandler(authOkHandler)
//            .failureHandler(authFailHandler);
//
//        http.exceptionHandling()
//                .authenticationEntryPoint(authUnauthorizedEntryPoint);

        http.logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                //.logoutSuccessHandler(authLogoutSuccessHandler)
                .permitAll();
    }

//    @Autowired
//    public void configureAuth(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .usersByUsernameQuery("SELECT L_EMAIL, L_PASSWORD, 1 as enabled FROM login WHERE L_EMAIL=?")
//                .authoritiesByUsernameQuery("select r.ur_u_id, g.ug_name " +
//                                            "from usr_roles r " +
//                                            "inner join usr_group g " +
//                                            "on r.ur_g_id = g.ug_id " +
//                                            "where r.ur_u_id = (select u.u_id from users u JOIN login l ON u.u_l_id = l.l_id where l.l_email =?)");
//
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
