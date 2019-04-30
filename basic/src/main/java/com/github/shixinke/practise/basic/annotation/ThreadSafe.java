package com.github.shixinke.practise.basic.annotation;

import java.lang.annotation.*;

/**
 * 线程安全标记
 * @author shixinke
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ThreadSafe {
}
