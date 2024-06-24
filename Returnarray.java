public class Returnarray {
    static int[] get(){//creating method
        return new int[]{10,20,30,40,50};
    }
    public static void main(String[] args) {
        int arr[] = get();//calling method
        for(int i=0;i<arr.length;i++)//printing the value
        System.out.println(arr[i]);
    }
}
