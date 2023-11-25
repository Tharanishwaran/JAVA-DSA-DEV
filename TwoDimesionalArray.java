import java.util.Scanner;
import java.util.Arrays;

public class TwoDimesionalArray {
    

public static void main(String[] args) {
    


    Scanner sc = new Scanner(System.in);



      int [] [] arr2d ={

                      {1,2,3},
                      
                      
                      {4,5,6}
       

                 };



       int[][] arr = new int[3][3];

  
       //input from user using nested for loop
            
        for(int row =0;row < arr.length;row++){

           for(int col = 0; col < arr[row].length;col++){
 
                     arr[row][col] = sc.nextInt();

            }

        }

          
         //output using nested for loop
          
          for(int row =0;row < arr.length;row++){
         
            for(int col = 0; col < arr[row].length;col++){
 
                     System.out.print(arr[row][col] + " ");

            }
                 System.out.println();     
        }



      //print output using for each loop
      for(int[] a : arr){

       System.out.println(Arrays.toString(a));

      }




}


}
