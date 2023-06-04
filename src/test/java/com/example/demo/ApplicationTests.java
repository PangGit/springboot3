package com.example.demo;

import com.example.demo.service.JbxxCzrkService;
import com.example.demo.service.JbxxHxxService;
import com.example.demo.util.ThreadPoolUtil;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@SpringBootTest
class ApplicationTests {

    @Resource
    private JbxxHxxService hxxService;

    @Resource
    private JbxxCzrkService czrkService;

    @Test
    void contextLoads() {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("t1");

        List<Future<Long>> futureList = new ArrayList<>();
        futureList.add(ThreadPoolUtil.calculatePool.submit(() -> hxxService.count()));
        futureList.add(ThreadPoolUtil.calculatePool.submit(() -> czrkService.count()));

        futureList.forEach(e -> {
            try {
                System.out.println(e.get());
            } catch (InterruptedException | ExecutionException ex) {
                throw new RuntimeException(ex);
            }
        });

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

}
