package pl.szymonstankowski.todolist;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {


//    @Bean
//    public MessageSource messageSource(){
//        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
//        messageSource.setBasename("classpath:validationMessages");
//        messageSource.setDefaultEncoding("UTF-8");
//        return messageSource;
//    }
//    @Bean
//    public LocalValidatorFactoryBean validator(){
//        LocalValidatorFactoryBean lvfb = new LocalValidatorFactoryBean();
//        lvfb.setValidationMessageSource(messageSource());
//        return lvfb;
//    }
}
