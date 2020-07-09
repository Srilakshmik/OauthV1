package spring.oauth2.authoriseserver.oauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test( @RequestParam("name") String name) {
        return name;
    }
}
