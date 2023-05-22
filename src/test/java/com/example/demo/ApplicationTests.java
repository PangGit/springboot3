package com.example.demo;

import com.example.demo.service.JbxxHxxService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Resource
    private JbxxHxxService jbxxHxxService;

    @Test
    void contextLoads() {
        System.out.println("------------Hxx : count = " + jbxxHxxService.count());
    }

}
