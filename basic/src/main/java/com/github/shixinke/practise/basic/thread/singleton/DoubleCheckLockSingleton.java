package com.github.shixinke.practise.basic.thread.singleton;

import com.github.shixinke.practise.basic.annotation.ThreadSafe;

import java.time.LocalDateTime;

@ThreadSafe
public class DoubleCheckLockSingleton {

    private static volatile DoubleCheckLockSingleton INSTANCE;

    private DoubleCheckLockSingleton() {
        System.out.println("初始化:"+ LocalDateTime.now());
    }

    public synchronized static DoubleCheckLockSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockSingleton();
                }
            }
        }
        System.out.println(INSTANCE);
        return INSTANCE;
    }
}
