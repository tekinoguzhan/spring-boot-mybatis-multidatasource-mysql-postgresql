package com.otekin.dev.demo.config.mysql;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MySQLConnMapper {
    String value() default "";
}
