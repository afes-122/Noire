package at.afes.noire.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping
    public boolean doLogin() {
        System.out.printf("%s", "Received Request");
        return true;
    }

    @DeleteMapping
    public boolean doLogout() {

        return true;
    }

    @GetMapping
    public boolean checkSession() {
        System.out.printf("%s", "Received Request");
        return true;
    }
}