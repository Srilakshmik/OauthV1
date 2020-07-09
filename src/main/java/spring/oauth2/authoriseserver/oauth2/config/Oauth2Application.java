package spring.oauth2.authoriseserver.oauth2.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;



@SpringBootApplication
@RestController
@ComponentScan({"spring.oauth2.authoriseserver.oauth2.*"})
@EnableResourceServer
public class Oauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2Application.class, args);
    }

    //This method will be used to check if the user has a valid token to access the resource
    @RequestMapping("/oauth2/validateUser")
    public Principal user(Principal user) {
      System.out.println(user);
        return user;
    }

}
