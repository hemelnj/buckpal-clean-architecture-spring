package br.com.mvj.shared.stereotypes;

//import org.springframework.core.annotation.AliasFor;
//import org.springframework.stereotype.Component;

import javax.inject.Named;
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Component
@Named
public @interface WebAdapter {

//    @AliasFor(annotation = Component.class)
    String value() default "";

}

