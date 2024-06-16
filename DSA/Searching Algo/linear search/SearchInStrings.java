package linearsearch;

import java.util.Arrays;

public class SearchInStrings {
   
    
public static void main(String[] args) {
    
    String field = "quantum";

  char target =  'a';

   boolean ans =  search(field, target);


   boolean ans2 =  search(field, target);

   System.out.println(ans);
   System.out.println(ans2);
   


}

static boolean search(String str,char target){


    if(str.length() == 0){

     return false;


    }
   
    for (int index = 0; index < str.length(); index++) {
        

        if(target == str.charAt(index)){



             return true;


        }


}
    
    return false;


}


static boolean search2(String str,char target){

   
     if(str.length() == 0){

        return false;

     }


     for (char ch : str.toCharArray()) {

        if (ch==target) {
            
            return true;
        }
        
     }


     return false;

}





}
