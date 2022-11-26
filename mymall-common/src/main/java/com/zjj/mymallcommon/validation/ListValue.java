package com.zjj.mymallcommon.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author zhangjiajun
 * @date 2022/11/26 19:28
 * @description {0,1}校验
 */
@Documented
@Constraint(validatedBy = {ListValueConstrainValidator.class})
 @Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ListValue {
    String message() default "{com.zjj.mymallcommon.validation.ListValue.message}";
    Class<?>[] groups() default{};
    //负载信息
    Class<? extends Payload>[] payload() default {};
    int[] vals()default {};
}
