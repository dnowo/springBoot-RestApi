package pl.danielnowo.RestAPI.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String helloFromService(){
        return "Hello service world!";
    }
}
