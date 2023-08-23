package module_2.l_18;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Person {
    String name() default "";

    int live() default 1;

    int strength() default 1 ;

    int magic() default 0;

    int attack() default 0;

    int defense() default 0 ;
}
