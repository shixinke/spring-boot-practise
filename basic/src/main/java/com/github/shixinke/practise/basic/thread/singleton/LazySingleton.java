package com.github.shixinke.practise.basic.thread.singleton;

import com.github.shixinke.practise.basic.annotation.NonThreadSafe;

import java.time.LocalDateTime;

/**
 * 懒汉式
 * @author shixinke
 */
@NonThreadSafe
public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton() {
        System.out.println("初始化:"+ LocalDateTime.now());
    }

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        System.out.println(INSTANCE);
        return INSTANCE;
    }
}
