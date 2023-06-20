package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.domain.JbxxHxx;
import com.example.demo.service.JbxxHxxService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Resource
    private JbxxHxxService jbxxHxxService;

    @GetMapping("/test/1")
    public Page<JbxxHxx> getHxx() {
        return jbxxHxxService.page(new Page<>(1, 10));
    }
}
