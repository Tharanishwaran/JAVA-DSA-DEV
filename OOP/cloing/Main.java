package cloing;

// import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) throws CloneNotSupportedException{
        
   Human akash = new Human(21, "akash");

// Human h2 = new Human(h1); //clone the object we can also use clonable class for this

// \|/

Human twin = (Human)akash.clone();

  System.out.println(twin.age + " " + twin.name);
  
  System.out.println(Arrays.toString(twin.arr));

  System.out.println(twin.arr.length);

//   twin.arr[0] =100;
  
//   System.out.println(Arrays.toString(twin.arr));
//   System.out.println(Arrays.toString(akash.arr));

// Human h3 = new Human(23, "ak");




//    h3.print();
  



//   System.out.println();
    // h2.print();


    }
}
