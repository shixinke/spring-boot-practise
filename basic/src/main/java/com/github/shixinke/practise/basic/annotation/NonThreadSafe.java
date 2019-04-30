package com.github.shixinke.practise.basic.annotation;

import java.lang.annotation.*;

/**
 * 非线程安全标记
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NonThreadSafe {
}