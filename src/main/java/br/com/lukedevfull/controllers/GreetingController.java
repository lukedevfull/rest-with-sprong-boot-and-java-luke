package br.com.lukedevfull.controllers;

import br.com.lukedevfull.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private static final AtomicLong idCounter = new AtomicLong();
    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam
                    (value = "name", defaultValue = "World") String name){
        return new Greeting(idCounter
                .incrementAndGet(),
                String.format(template, name));
    }
}
