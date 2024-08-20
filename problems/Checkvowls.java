package problems;

import java.util.Scanner;

public class Checkvowls {

    

public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("enter the words");
    
    String s;

    s = scan.nextLine();

    System.out.println(s);
    
  for(int i=0;i < s.length();i++){
     
    while (s.charAt(i) == 'a') {
        System.out.println("the string contains vowl of a");
        break;
    }
     
    while (s.charAt(i) == 'e') {
        System.out.println("the string contains vowl of e");
        break;
    }

    while (s.charAt(i) == 'i') {
        System.out.println("the string contains vowl of i");
        break;
    }
    
     while (s.charAt(i) == 'o') {
        System.out.println("the string contains vowl of o");
        break;
    }
    
        while (s.charAt(i) == 'u') {
        System.out.println("the string contains vowl of u");
        break;
    } 

  }


}


}