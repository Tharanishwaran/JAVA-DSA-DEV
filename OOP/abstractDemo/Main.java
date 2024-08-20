package abstractDemo;

public class Main {
    

    public static void main(String[] args) {
        
  Son son = new Son(26);

   son.career();

   Daughter daughter = new Daughter(27);

   daughter.career();

    // Parent parent1  = new Son(22);

    // parent1.career();


  //  Parent parent1  = new Parent(22); // we can not create object for abstract class




    Parent.hello(); //but we can access static methods by parent class

   

    }
}
