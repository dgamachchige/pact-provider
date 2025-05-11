package com.dilan.provider.controller;

import com.dilan.provider.service.ProviderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProviderController {

    private final ProviderService providerService;

    @Autowired
    public ProviderController(ProviderService providerService) {
        this.providerService = providerService;
    }

    @GetMapping("/str1")
    public String getString1() {
        log.info("response str1-----");
        return providerService.getStr1();
    }

    @GetMapping("/str2")
    public String getString2() {
        log.info("response str2-----");
        return providerService.getStr2();
    }

}
