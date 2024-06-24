class Bike {
    String name = "Honda";
    int no = 1234;

    Bike() {
        System.out.println("Bike is created");
        System.out.println(name + no);
    }

    public static void main(String[] args) {
        Bike b = new Bike();

    }

}