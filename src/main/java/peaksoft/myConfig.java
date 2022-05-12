package peaksoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")

public class myConfig {

    @Bean
    public Animal horse(){
        return new Horse();
    }

    @Bean
    public Person person(){
        return new Person(horse());
    }

}
