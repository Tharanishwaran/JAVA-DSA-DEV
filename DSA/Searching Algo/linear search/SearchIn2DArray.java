package linearsearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        

  int[][] arr = {

     {28,5,11},
     {44,76,8},
     {12,65,3,23},
     {18,12} 

       };

       int target = 23;

       int[] ans = search2darr(arr, target);

    System.out.println(Arrays.toString(ans));

        int [] ans2 = search2darr(arr, target);

       System.out.println(search2dfind_max(arr));


    }
 
    


    static int [] search2darr(int [] [] arr,int target){



          for(int row=0;row < arr.length;row++){

                
            for(int col = 0;col < arr[row].length;col++){


                        if (arr[row][col] == target) {
                            
 
                              return new int[]{row,col};

                        }

            }


          }

          return new int[]{-1,-1};

    }



    static int search2dfind_max(int [] [] arr){

        int max = Integer.MIN_VALUE;
   
        for(int [] ints : arr){

              
          for(int element : ints){

                     
               if (element > max) {
                
                max = element;

           }


    }

}

return max;

       
}


 

  }

