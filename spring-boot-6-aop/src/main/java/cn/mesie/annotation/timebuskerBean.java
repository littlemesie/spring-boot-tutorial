package cn.mesie.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by 2019-03-24 17:33
 *
 * @author: mesie
 */
@Target({ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface timebuskerBean {
    public abstract String value() default "";
}
