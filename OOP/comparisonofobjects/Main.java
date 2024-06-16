package comparisonofobjects;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {




    public static void main(String[] args) {
    
        
      Student ak = new Student(21,98);

     Student akash = new Student(26, 97);
      
     Student ironman = new Student(22,80);

     Student thor = new Student(23, 82); 

     Student batman = new Student(24,90);

     Student loki = new Student(28, 77);

     Student superman = new Student(28, 7);

    //  if (ak > akash) { //it shows error and java confused so implement the class combarable
        
    //     System.out.println("ak get more marks thans akash");
    //  }

   Student[] list = {ak,akash,ironman,thor,batman,loki,superman};

   System.out.println(Arrays.toString(list));


  Arrays.sort(list); //this operation needs Comparable<Student>

  System.out.println(Arrays.toString(list));






//   if (ak.compareTo(akash) > 0) {
    
// System.out.println("ak mark is greater");

//   }

//   else{

//    System.out.println("akash mark is greater");

//   }


    }
    
}
