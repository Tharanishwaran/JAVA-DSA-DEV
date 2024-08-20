package problems;

import java.util.ArrayList;
import java.util.List;

public class Oddnumberchecker {

    // check list integr is odd numbers

    public static void main(String [] args){

      List<Integer> num = new ArrayList<>();
 
        num.add(1);num.add(44);
         num.add(13);num.add(4);
          num.add(0);num.add(78);
        




        isodd(num);
     




    }

    

    public static void isodd(List<Integer>list){
        for(int i : list){

            if(i % 2== 0){
                
            System.out.println(i + " is even");

            }
        

        System.out.println(i + " is odd");
        }

    }


}
