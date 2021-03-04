package id.web.ilham.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value={"id.web.ilham.ioc"})
public class AppConfig {

    @Bean
    public Fruit getFruit(){
        return new Apple();
    }

}
