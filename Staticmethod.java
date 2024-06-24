public class Staticmethod {
    static int a= 10;
    int b = 20;

    void simpleDisplay(){
     System.out.println(a);
     System.out.println(b);
    }
    //static method
    static void staticDisplay(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        Staticmethod obj = new Staticmethod();
        obj.simpleDisplay();
        staticDisplay();
    }
}
