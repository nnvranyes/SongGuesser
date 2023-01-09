package com.example.demo.User;

import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(WebUserRepository repository){
        return args -> {
            WebUser nnvranyes = new WebUser(
                    "nnvranyes",
                    "nonothe1st"
            );
            WebUser mgoogy = new WebUser(
                    "mgoogy",
                    "MicahLikesMonsterCookies1242"
            );

            repository.saveAll(List.of(nnvranyes,mgoogy));
        };

    }
}
