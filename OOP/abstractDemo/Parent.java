package abstractDemo;

public abstract class Parent {
// we can'nt final the abstract class because it stop the inheritance 

  int age;
     
 double pocket_money; 

  public Parent(int age){

  this.age = age;

  }


  public Parent(double pocket_money){
    
    this.pocket_money = pocket_money;;

  }


  static void hello(){

    System.out.println(
      "hello every one "
    );

  }

  


  abstract void career();

  abstract void lifestyle();

    
}
