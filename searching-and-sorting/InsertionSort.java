import java.util.Arrays;

public class InsertionSort{

   public static void main(String[] args){
   
     int[] arr = { 31, 3, 2, 23, 4, 7, 13, 99, 6 };
   
     for(int i = 1 ; i<arr.length ; i++){
             int key = arr[i];
              int j = i-1;
      while(j>=0 && arr[j]>key){
      arr[j+1] = arr[j];
      j--;
      }
      arr[j+1]=key;
     }
    System.out.println(Arrays.toString(arr));
    
   } 

}
