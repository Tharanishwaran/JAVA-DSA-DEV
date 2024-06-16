public class SumOfDigits {

    public static void main(String[] args) {
 
        

 int x = sumofdigits(0);
 
 System.out.println(x);

}


static int sumofdigits(int n){

  int sumofdigit = 0;

  while (n != 0) {


    int rev = n % 10;

    

    sumofdigit = sumofdigit + rev;
   
     n = n / 10;

    
  } 
    

  return sumofdigit;


    }
    
}
