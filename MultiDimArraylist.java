import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArraylist {


public static void main(String[] args) {
    
 
  Scanner scan = new Scanner(System.in);


  ArrayList<ArrayList<Integer>> list = new ArrayList<>();

  //intilaizing

   for(int i=0;i < 3;i++){

     list.add(new ArrayList<>());


   }

  //  add elements by nested for loop

   for(int i = 0; i < 3 ; i++){

       for (int j = 0; j < 3; j++) {
        
        list.get(i).add(scan.nextInt());
          
       }


   }



   System.out.println(list);



}


































    
}
