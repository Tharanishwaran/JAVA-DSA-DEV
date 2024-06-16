// this is a demo to show initialisation of static variables

public class StaticInsi {
    

 static int a = 7;
 static int b;


 //the static block only runs one time when the first object is created known as when the class is loaded  
   static{

    
    System.out.println("hi i am static");

    b = a * 2;

   }

   public static void main(String[] args) {
    

    StaticInsi object_1 = new StaticInsi();

    System.out.println(StaticInsi.a + " " + StaticInsi.b);

StaticInsi.b += 5;

    StaticInsi object_2 = new StaticInsi();

    System.out.println(StaticInsi.a + " " + StaticInsi.b);

 StaticInsi object_3 = new StaticInsi();

    System.out.println(StaticInsi.a + " " + StaticInsi.b);

  


   }

}
