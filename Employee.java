public class Employee {
    //instance variable
    String name = "lucky";
    int no = 10;
    //static variable
    static String company = " messho";
    //static block
   static{
    System.out.println("static-block");
   }
   {
   //instance block
   System.out.println("instance block");
   name = "sowji";
   no = 12;
   }
   Employee(){
    System.out.println("no arguments constructor ");
}
   Employee(String n,int o){
    System.out.println("constructor (string int");
    name = n;
    no = o;
   } 

   }


 