package com.github.shixinke.practise.basic.thread.singleton;

import com.github.shixinke.practise.basic.annotation.ThreadSafe;

import java.time.LocalDateTime;

/**
 * 将整个方法通过synchronized关键词加锁
 * @author shixinke
 */
@ThreadSafe
public class SynchronizedSingleton {

    private static SynchronizedSingleton INSTANCE;

    private SynchronizedSingleton() {
        System.out.println("初始化:"+ LocalDateTime.now());
    }

    public synchronized static SynchronizedSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SynchronizedSingleton();
        }
        System.out.println(INSTANCE);
        return INSTANCE;
    }
}
