public class Programforpalindrome {
    

public static void main(String[] args) {
    


  String sb = "abcddcba";

  System.out.println(ispalindrome(sb));




}


static boolean ispalindrome(String str){

  if (str == null || str.length() == 0) {

    return true;
    
  }


  str = str.toLowerCase();

  for (int i = 0; i < str.length(); i++) {
    
      char start = str.charAt(i);

      char end = str.charAt(str.length() - 1 -i);

      if (start==end) {
        return false;
        
      }

  }


    return true;
}



}
