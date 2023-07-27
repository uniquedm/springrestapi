package com.demo.cryptography.controller;

import com.demo.cryptography.utils.CryptographicUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @PostMapping("/decrypt")
    public String decrypt(@RequestBody String input, @RequestHeader String key) {
        return CryptographicUtils.decrypt(input, key);
    }
}
