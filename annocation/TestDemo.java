package annocation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *读取注解的信息
 */
public class TestDemo {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        /**
         * 获取类上的注解
         */
        Class<Demo> demoClass = Demo.class;
        MyAnnotaion annotaion = demoClass.getAnnotation(MyAnnotaion.class);
        System.out.println(annotaion.getValue());

        /**
         * 读取成员变量上的注解
         */
        Field name = demoClass.getField("name");
        MyAnnotaion getOnFiled = name.getAnnotation(MyAnnotaion.class);
        System.out.println(getOnFiled.getValue());

        /**
         * 读取方法上的注解
         */
        Method hello = demoClass.getMethod("hello", null);
        MyAnnotaion onMethod = hello.getAnnotation(MyAnnotaion.class);
        System.out.println(onMethod.getValue());

        /**
         * 获取默认方法上的注解
         */
        Method defaultMethod = demoClass.getMethod("defaultMethod", null);
        MyAnnotaion onDefaultMethod = defaultMethod.getAnnotation(MyAnnotaion.class);
        System.out.println(onDefaultMethod.getValue());

    }
}
