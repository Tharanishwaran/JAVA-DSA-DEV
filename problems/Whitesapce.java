package problems;

public class Whitesapce {

public static void main(String[] args) {
    


    removeWhiteSpaces("appa    ");




}




    static String removeWhiteSpaces(String input) {
      
        StringBuilder output = new StringBuilder();
        
        char[] charArray = input.toCharArray();
        
        for (char c : charArray) {
      
            if (!Character.isWhitespace(c))
      
            output.append(c);
        }
        
        return output.toString();
    }

    
}
