package annocation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE, ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotaion {
    String getValue() default "this is myAnntaion";

}
