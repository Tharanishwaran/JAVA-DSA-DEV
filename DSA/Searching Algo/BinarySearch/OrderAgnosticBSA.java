package BinarySearch;

public class OrderAgnosticBSA {


public static void main(String[] args) {
    
 int [] arr = {12,14,16,17,19,20,21,26,28,30,34};
 int [] arr1 = {99,77,66,9,02,23,23};

 int target = 23;

 int ans = orderAgnosticBSA(arr1, target);

 System.out.println(ans);

}

static int orderAgnosticBSA(int[] arr,int target){


    int start = 0;
  
    int end = arr.length -1;


    // find whether the array is sorted in asending or descending

    boolean isAscending = arr[start] < arr[end];
   
 
    while (start <= end) {
   
     //  find the middle element
 
     // int middle = (start + end ) / 2;  //might be possible that (start + end) exceeds the range of int in java
     
     int mid = start + (end - start) / 2;
 
     if (arr[mid] == target) {

        return mid;
        
     }

     if(isAscending){

     if(target < arr[mid]){
         
         end = mid -1;
 
     }
     
     
     else  {
 
         start = mid + 1;
         
      }
    }   
 else{
    
    if (target > arr[mid]) {
        
        end = mid + 1;

    }

    else {


         start = mid + 1;

    }
}
     
}
   
     return -1;
 

 
 

}


    
}
