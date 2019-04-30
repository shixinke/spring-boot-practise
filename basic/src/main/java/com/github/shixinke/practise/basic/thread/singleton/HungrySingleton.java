package com.github.shixinke.practise.basic.thread.singleton;

import com.github.shixinke.practise.basic.annotation.ThreadSafe;

import java.time.LocalDateTime;

/**
 * 饿汉式
 * @author shixinke
 */
@ThreadSafe
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
        System.out.println("初始化:"+ LocalDateTime.now());
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}


