public class Static {
    static int a = 10;
    static int b = 20;
    static{
        System.out.println("static block");
        System.out.println(a);
        System.out.println(b);
        
    }
    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(a);
        System.out.println(b);
    }
}

