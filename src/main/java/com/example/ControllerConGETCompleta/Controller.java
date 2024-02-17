package com.example.ControllerConGETCompleta;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class Controller {
    @GetMapping("/ciao/{luogo}")
    public User ciao(@RequestParam String nome,
                     @PathVariable String luogo){
        User user = new User(nome,luogo);
        user.dichiaraSaluto();
        return user;
    }
    @PostMapping("/ciaov2")
    public User ciao2(@RequestBody User user){
        user.dichiaraSaluto();
        return user;
    }
}
