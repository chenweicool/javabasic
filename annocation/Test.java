package annocation;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + --a);

        String s = "Data structures with";
        System.out.println(s.length());
        System.out.println(s.indexOf("it"));
        int c = new Test().f(1);
        int d = new Test().f(c);
        System.out.println("d="+ d);
    }
    public int f(int x){
      return (x >0)? x*f(x-1):2;
    }

}
