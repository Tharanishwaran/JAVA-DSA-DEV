package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {

 public static void main(String[] args) {
    
 

 
        
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<5;i++ ){

    
            arr.add(i * 2);

             
        }


    
        // arr.forEach((item) -> System.out.println(item * 2) );



        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);


     Operation sum = (a, b) -> a + b;
     Operation sub = (a, b) -> a - b;   
     Operation prod = (a, b) -> a * b;     
     
    LambdaFunctions cal = new LambdaFunctions();

    System.out.println(cal.operate(3, 5, prod));



    }

private int operate(int a,int b,Operation ope){

    return ope.operation(a,b);

}


    }

interface Operation {

    int operation(int a,int b);
    
}

    



