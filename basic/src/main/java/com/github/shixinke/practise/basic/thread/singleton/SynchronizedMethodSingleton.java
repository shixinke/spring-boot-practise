package com.github.shixinke.practise.basic.thread.singleton;

import java.time.LocalDateTime;

public class SynchronizedMethodSingleton {

    private static SynchronizedMethodSingleton INSTANCE;

    private SynchronizedMethodSingleton() {
        System.out.println("初始化:"+ LocalDateTime.now());
    }

    public static SynchronizedMethodSingleton getInstance() {
        synchronized (SynchronizedMethodSingleton.class) {
            if (INSTANCE == null) {
                INSTANCE = new SynchronizedMethodSingleton();
            }
            System.out.println(INSTANCE);
        }
        return INSTANCE;
    }
}
