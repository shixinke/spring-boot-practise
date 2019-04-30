package com.github.shixinke.practise.basic.thread.singleton;

import com.github.shixinke.practise.basic.annotation.ThreadSafe;

import java.time.LocalDateTime;

@ThreadSafe
public class EnumSingleton {
    private static EnumSingleton INSTANCE;

    public EnumSingleton() {
        System.out.println("初始化:"+ LocalDateTime.now());
    }

    public static EnumSingleton getInstance() {
        return Instance.INSTANCE.getSingleton();
    }

    enum Instance {
        INSTANCE;

        private EnumSingleton singleton;
        Instance() {
            this.singleton = new EnumSingleton();
        }

        public EnumSingleton getSingleton() {
            return singleton;
        }
    }
}
