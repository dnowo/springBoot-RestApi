package pl.danielnowo.RestAPI.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.danielnowo.RestAPI.service.HelloService;

@RestController

public class HelloWorld {
    private HelloService service;

    public HelloWorld(HelloService service) {
        this.service = service;
    }
    /* 1st way. Attribute.
        @Autowired
        private HelloService service;
    */

    /* 2nd way. Setter.
    @Autowired
    public void setService(HelloService service) {
        this.service = service;
    }
    */

    /* 3rd way. Constructor - Best.
    @Autowired   //Not needed since Spring 4.3!
    public HelloWorld(HelloService service) {
        this.service = service;
    }
    */

    @GetMapping("/x")
    public String sayBye(){
        return "<em>Bye!</em>";
    }

    @GetMapping("/")
    public String sayHi(){
        return service.helloFromService();
    }
}

