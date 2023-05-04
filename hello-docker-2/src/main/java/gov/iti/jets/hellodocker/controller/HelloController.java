package gov.iti.jets.hellodocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public Map<String, String> sayHello()
    {
        Map<String, String> map = new HashMap<>();
        map.put("msg", System.getenv("msg"));
        map.put("port", System.getenv("myPort"));

        return map;
    }
}
