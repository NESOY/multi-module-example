package com.nesoy.controller;

import com.nesoy.IAMCOMMON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api/web")
    public void test() {
        IAMCOMMON iamcommon = new IAMCOMMON();
        iamcommon.common();
    }
}
