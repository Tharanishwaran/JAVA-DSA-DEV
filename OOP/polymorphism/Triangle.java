package polymorphism;

public class Triangle  extends Shapes{
    
   //this will run when the object of circle is created
    //hence it is overriding the parent method
    @Override //this is called annotation it is used to check the method is overriding or not
    void area(){

        System.out.println("area is 0.5 * h * b");
    }

     static void Tri(){
      
       System.out.println("berumuda traingle in triangle");


    }

    // @Override
    static void pyr(){

        System.out.println("pyramids are in Triangles");
      
       }

}
