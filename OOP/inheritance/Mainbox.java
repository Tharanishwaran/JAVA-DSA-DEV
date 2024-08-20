package inheritance;

public class Mainbox {



    public static void main(String[] args) {
        

    Box box = new Box();


    Box box1 = new Box(1,4,5);

//    System.out.println(box.l + " " + box.w + box.h);

   BoxWeight boxWeight = new BoxWeight();

 System.out.println(boxWeight.h + " " + boxWeight.weight);

BoxWeight boxWeight2 = new BoxWeight(1,2,3,5);

 System.out.println(boxWeight2.h + " " + boxWeight2.w + " " + boxWeight2.d+ " " +boxWeight2.weight );   
   


   Box box3 = new BoxWeight(2,3,4,6);


//    box3 is a refernce type of Box class and its refrencing to the object of type Boxweight

// so we can only access super class objects not sub class objects

//    System.out.println(box.w); this works

// System.out.println(box3.weight); but this not work 
   
//   BoxWeight box4 = new Box(2,3,4); //error because child class try to intialise parent class

 
//   there are many variables in both super class and sub class

//  you are given access to variables that are in the refrence  type (eg) Boxweight

// hence you should have access to weight variables

// this also means, that the ones you are  trying to access should be initialised

// but here, when the obj itself is of the type of parent class,how  will you call the constructor of child class to intialise above in the code of line no 35 


  Boxprice boxp1 = new Boxprice(1,3,4,5,6);


}
    
}
