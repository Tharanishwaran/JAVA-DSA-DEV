public class ReverseString {

    public static void main(String[] args) {
        
        


        palindromechecker("hiih");
        
    }

 static void palindromechecker(String str){


   String revstr ="";

   for (int i = str.length()-1; i >= 0; i--) {

       revstr = revstr + str.charAt(i);

   }

   if (revstr.equals(str)) {

    System.out.println("its is a palindrome");

    
   }

   else{

   System.out.println("its not an palindrome");

   }



}
  




}
