package polymorphism;

public class Square extends Shapes {
    
    //this will run when the object of circle is created
    //hence it is overriding the parent method
    @Override //this is called annotation it is used to check the method is overriding or not
    void area(){

        System.out.println("area is square of sides ");
    }


}
