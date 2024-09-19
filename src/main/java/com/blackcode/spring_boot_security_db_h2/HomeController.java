package com.blackcode.spring_boot_security_db_h2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hello")
    public String getHello(){
        return "Hello World";
    }

    @GetMapping("/user")
    public String getUser(){
        return "Halaman User";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "Halaman Admin";
    }
}
