package co.gov.coran.licencias.licenciaConfig;


import co.gov.coran.licencias.filter.SecurityFilterInterceptor;
//import com.praveen.jasypt.example.infrastructure.middleware.JwtAuthenticationEntryPoint;

import co.gov.coran.licencias.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

/*    @Autowired
    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;*/
    @Autowired
    private UserDetailsService jwtUserDetailsService;



    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // configure AuthenticationManager so that it knows from where to load
        // user for matching credentials
        // Use BCryptPasswordEncoder
        auth.userDetailsService(jwtUserDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    @Order(3)
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/v2/api-docs", "/configuration/ui", "/swagger-resources/**",
                "/configuration/security", "/swagger-ui.html", "/webjars/**",
                "/register/client/hello", "/error", "/csrf", "/", "/resource/login","/guardar_firma","/guardar_ObligacionIt","/asignacionesF", "/guardar_conclusion","/editar_coordenada","/guardar_problematica","/guardar_recomendacion","/consulta_obligacionesIt","/situacion_consulta","/guardar_situacion","/folder/","/problematica_consulta","/guardar_analisis","/analisis_consulta","/borrar_antecedente","/guardar_antecedente","/consulta_coordenadas","/guardar_general_ant","/colaboradores_consulta","/recomendacion_consulta","/conclusion_consulta","/consulta_todas_situacionE","/consulta_general","/consulta_todas_aspect");
    }
    @Autowired
    private JwtService jwtUtil;

    @Order(2)
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors().and().csrf().ignoringAntMatchers("/*").disable()
                .addFilterBefore(new SecurityFilterInterceptor( jwtUtil),
                        BasicAuthenticationFilter.class)
                .exceptionHandling().authenticationEntryPoint(null).and().sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);


    }
}
