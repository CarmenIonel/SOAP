package application.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class LoginConfig extends WebSecurityConfigurerAdapter
{

    @Autowired
    private UserService userData;

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception
    {
        //httpSecurity.csrf().disable();
        //  httpSecurity.cors().disable();
        httpSecurity.authorizeRequests().antMatchers("/","/register","/resources/**").permitAll()
                .antMatchers("/addPackage", "/deletePackage", "/updateStatus", "/registerPackage").hasRole("ADMIN")
                .antMatchers("/checkPackage","/searchPackage","/viewPackage").hasRole("USER")
                .antMatchers("/login").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().defaultSuccessUrl("/index")
                .loginPage("/login").usernameParameter("user").passwordParameter("pass").permitAll()
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login").permitAll()
                .and().exceptionHandling().accessDeniedPage("/denied");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws  Exception
    {
        auth.userDetailsService(this.userData);
    }

}