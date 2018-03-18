package application.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableAutoConfiguration
public class MVCconfig extends WebMvcConfigurerAdapter
{
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
    {
        configurer.enable();
    }

    public void addViewControllers(ViewControllerRegistry reg)
    {
        //login
        reg.addViewController("/").setViewName("/login");
        reg.addViewController("/login").setViewName("/login");

        //register
        reg.addViewController("/register").setViewName("/register");

        //home
        reg.addViewController("/index").setViewName("/index");

        //admin
        reg.addViewController("/addPackage").setViewName("/addPackage");
        reg.addViewController("/deletePackage").setViewName("/deletePackage");
        reg.addViewController("/registerPackage").setViewName("/registerPackage");
        reg.addViewController("/updateStatus").setViewName("/updateStatus");

        //user
        reg.addViewController("/viewPackage").setViewName("/viewPackage");
        reg.addViewController("/searchPackage").setViewName("/searchPackage");
        reg.addViewController("/checkPackage").setViewName("/checkPackage");

        //error
        reg.addViewController("/error").setViewName("/error");
        reg.addViewController("/denied").setViewName("/denied");
    }
}