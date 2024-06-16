package ExceptionHandling;

public class ExceptionHandling {

     
public static void main(String[] args) {
    
   
    int a = 5;
    int b = 0;
    
    
    try{

    // int c = a/b;
    // divide(a, b);

    String name = "akash";
 if(name.equals("akash")){
    
  throw new OwnException("the name is akash");

 }

    }
    catch (OwnException o) {
 
      System.out.println(o.getMessage());
 
    }
      
    catch (ArithmeticException e){

     System.out.println(e.getMessage());

   // this is called as multiple exception  

    }catch (Exception e){

     System.out.println("normal exception");

    } 

    // we cant create multiple finally block
    finally{

     System.out.println("this will always execute");
   }



    //  divide(1, 0);


}



static int divide(int a,int b) throws ArithmeticException{

    if(b==0){

      throw new ArithmeticException("dont divide by zero"); //explicitly tell message
    }
    return a/b;
}

}










