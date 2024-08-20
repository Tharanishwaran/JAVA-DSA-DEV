public class Mainhuman {
    

    public static void main(String[] args) {
       
    //     Human akash = new Human(21, "ak", 10000);
    //    Human akeeth = new Human(21, "ak", 10000);
 
 
  
    //  System.out.println(akash.population);
    //       System.out.println(akeeth.population); //the expected result is 2 but the output is 1 1 beacuse we need to declare population as static
    //   System.out.println(Human.population);//we access static var by using class name because its convention but also we can access by refernce variable

 
        //    Mainhuman obj = new Mainhuman(); //this link with line num 29 greeting method
        //    obj.greeting(); 

}

static void fun(){

  // greeting(); //it belongs to instances so we cant access non staic method in staic method

//    System.out.println("hi");

      Mainhuman object = new Mainhuman();
     
      object.greeting(); 

    }
   
void greeting(){  //it belongs to instances

 System.out.println("hello war");

//  fun(); //but we can access static method in non static method

}

}
