package annocation;

@MyAnnotaion(getValue = "annotation on class")
public class Demo {

    @MyAnnotaion(getValue = "annotation on filed")
    public String name;

    @MyAnnotaion(getValue = "annotation on method")
    public void hello(){}

    @MyAnnotaion
    public void defaultMethod(){}
}
