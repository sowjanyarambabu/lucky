public class AdditionOFarrayexample {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,};
        int[] array2 = {5,6,7,9};
        int[] sumarray=new int[array1.length];
        for(int i =0;i<array1.length;i++){
            sumarray[i]= array1[i]+array2[i];
        }
        for(int sum:sumarray){
            System.err.print(sum+ " ");
        }
    } 
}
