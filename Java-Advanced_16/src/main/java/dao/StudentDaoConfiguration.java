package dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentDaoConfiguration {

    @Bean (name = "student")
    CRUD studentDao() {
        return new StudentDaoImpl();
    }
}
