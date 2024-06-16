import java.util.*;


public class ReverseTheArray {


public static void main(String[] args) {
    
       int [] arr = {1,2,3,4,5,6};


       reverse(arr);
       
}

static void reverse(int[] arr){


     int start = 0;
     int end = arr.length-1;

     while(start < end){
        
        swap(arr,start,end);

        start++;

        end--;

       } 
       
      System.out.println(Arrays.toString(arr));

    }
        
     



}
     
   




















    

