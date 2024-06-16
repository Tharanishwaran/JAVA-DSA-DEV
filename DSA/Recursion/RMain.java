public class RMain {

    
    public static void main(String[] args) {
        

        funRev(5);
    }



    public static void funRev(int n){

    if (n == 0) {
        
        return;
    }
    
    System.out.println(n);

    funRev(n-1);
  
    System.out.println("hello" + n);


    }
}