package com.educate.util.annotation;

import com.educate.enums.ApiAuthorityType;

import java.lang.annotation.*;

/**
 * Created by sun on 2017/3/10.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Authority {
    ApiAuthorityType[] authorityTypes();
}
