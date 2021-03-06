package INKOMapp.config;
import INKOMapp.filter.JwtRequestFilter;
import INKOMapp.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    public CustomUserDetailsService customUserDetailsService;

    @Autowired
    private JwtRequestFilter jwtRequestFilter;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService);
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        //JWT token authentication
        http
                .csrf().disable()
                .authorizeRequests()

//                .antMatchers("/customers/**").hasRole("USER")
//
//                .antMatchers("/admin/**").hasRole("ADMIN")
//
//                .antMatchers("/users/**").hasRole("USER")
//
//                .antMatchers("/authenticated").authenticated()
//                .antMatchers("/authenticate").permitAll()
                .anyRequest().permitAll()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);

    }
}

//        "/"                       geen back-end nodig
//        "/profile"                opslaan van foto base 64
//        "/administration"         beveiliging nodig
//        "/before-count"           met org.role, opslaan van de telling
//        "/after-count"            met org.role, opslaan van de telling
//        "/coins"                  met org.role, opslaan van de telling
//        "/student-before-count"   data vanuit before-count terug sturen, sp.role
//        "/student-after-count"    data vanuit after-count terug sturen, sp.role
//        "/student-coins"          data vanuit coins terug sturen, sp.role
//        "/totals"                 alleen toegangelijk voor admin
//        "/register"               opslaan info
//        "/login"                  veriferen info, authenticate
//                                  overal authorisate



