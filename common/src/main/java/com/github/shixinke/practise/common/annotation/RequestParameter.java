package com.github.shixinke.practise.common.annotation;

import java.lang.annotation.*;

/**
 * @author shixinke
 * @version 1.0
 * @Description 请求参数注解
 * @Date 19-2-22 下午2:46
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface RequestParameter {
    NameStyle source() default NameStyle.CAMEL;
    RequestContentType type() default RequestContentType.AUTO;
    String key() default "";
}
