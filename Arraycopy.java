public class Arraycopy {
    public static void main(String[] args) {
        int array1[] = new int[] {1,2,3,4,5};//initialize array
        int arraySize=array1.length;// create another array arr2 size of array1
        int array2[]= new int[arraySize];//5
        //copy all elements of one array into another
        for(int i=0;i<array1.length;i++){
         array2[i] =array1[i];
        }
        System.out.println("element of original array");
        for(int i =0;i<array1.length;i++ ){
            System.out.println(array1[i]);
        }
        System.out.println("elements of new array");
      for(int i =0;i<array2.length;i++){
        System.out.println(array2[i]);
      }
    }
}
