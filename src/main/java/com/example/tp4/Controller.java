package com.example.tp4;


import lombok.Data;
import netscape.javascript.JSObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Data
@RestController
public class Controller {

    @GetMapping("/")
    public Map<String, String> Geter(){
        HashMap<String,String> map = new HashMap<>();
        map.put("msg","hello, this is a GET request");
        return map;

    }
    @PostMapping( "/")
    public Map<String, String> Poster(){
        HashMap<String,String> map = new HashMap<>();
        map.put("msg","hello, this is a POST request");
        return map;
    }

}
