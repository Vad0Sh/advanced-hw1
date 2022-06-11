package homework6.task3;

import homework6.task2.TestAnnotation;

import java.beans.Transient;
import java.lang.annotation.*;

@MyAnn
@TestAnnotation
public class Animal {
    @Transient
    @Deprecated
    public void myMethod(@Deprecated int i){

    }
}
@Deprecated
class Cat extends Animal{

    @Override
    @MyAnnotation
    public void myMethod(int i) {
        super.myMethod(i);
    }
}
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnn {

}
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
@interface MyAnnotation {

}