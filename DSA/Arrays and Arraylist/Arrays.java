import java.util.Scanner;

public class Arrays{


public static void main(String[] args) {
    

   Scanner sc = new Scanner(System.in);




   

    int [] books = new int[6];

  //or use 

     int [] books2 = {11,12,13,14};


   int[] books3; //declaration  of arrays,books3 getting defined in stack

   books3 = new int[8]; //initialization-actually here objects created in heap memory

 
 


   int[] arr = new int[5];

   arr[0] = 0;
   arr[1] = 10;
   arr[2] = 20;
   arr[3] = 30;
   arr[4]  = 40;


   System.out.println(arr[0] + arr[1]); // adding two array elements

   

    
   //using for loop to get elemnts form an user for  an array
   


   for(int i = 0; i < arr.length; i++){
           
          System.out.println("Enter integer for " + i + " index");
          arr[i] = sc.nextInt();  

   } 


 //using for loop to print elemnts in the array

 for(int i = 0; i < arr.length;i++){

       System.out.println(arr[i]);

 }

// also we can simply use for each loop to print element in the array

   for(int num : arr) { 

    System.out.println(num);

  }

    }
}
