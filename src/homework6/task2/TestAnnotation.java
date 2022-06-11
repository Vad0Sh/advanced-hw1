package homework6.task2;

import java.lang.annotation.Documented;

@Documented
public @interface TestAnnotation {
    int numberOfField = 0;
    String nameOfField = null;
}
