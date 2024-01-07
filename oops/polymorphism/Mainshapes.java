package polymorphism;

public class Mainshapes {
    
public static void main(String[] args) {
    

  
 Shapes shape = new Shapes();

 Circle circle = new Circle();

 Square square = new Square();

 Triangle triangle = new Triangle();

 shape.area();

 circle.area();

 square.area();


   shape.Tri();

   triangle.Tri();

  Shapes shapes1 = new Triangle();

  shapes1.Tri();


//   shapes1.pyr();

//   shapes1.area();

//   shape.pyr();
//   triangle.pyr();

}

}
