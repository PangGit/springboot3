package com.example.demo.util;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 线程池工具类
 *
 * @author Pang
 * @since 2022/7/1 9:15
 */
public class ThreadPoolUtil {

    /**
     * cpu 核心数
     */
    private static final int cpu = Runtime.getRuntime().availableProcessors();

    /**
     * 计算型 线程
     */
    private static final ThreadFactory calculateTreadFactory = new ThreadFactoryBuilder().setNameFormat("calculatePool-pool-%d").build();
    public static final ThreadPoolExecutor calculatePool = new ThreadPoolExecutor(cpu, cpu + 5,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(1024), calculateTreadFactory, new ThreadPoolExecutor.CallerRunsPolicy());

    /**
     * 读写型 线程
     */
    private static final ThreadFactory readWriteThreadFactory = new ThreadFactoryBuilder().setNameFormat("readWritePool-pool-%d").build();
    public static final ThreadPoolExecutor readWritePool = new ThreadPoolExecutor(cpu * 2, cpu * 2 + 10,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(1024), readWriteThreadFactory, new ThreadPoolExecutor.CallerRunsPolicy());

    /**
     * 读写型 线程（队列最大 Integer.MAX_VALUE）
     */
    public static final ThreadPoolExecutor readWriteMaxPool = new ThreadPoolExecutor(cpu * 2, cpu * 2 + 10,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(), readWriteThreadFactory, new ThreadPoolExecutor.CallerRunsPolicy());

}
