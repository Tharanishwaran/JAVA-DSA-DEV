public class MaxinArray {


 public static void main(String[] args) {

    int [] arr = {1,2,30,4,5,6,7,8} ;

    System.out.println(max(arr));

}

static int max(int [] arr){

  int maxvalue = arr[0];

 for(int i=1;i<8;i++){

     if (arr[i] > maxvalue) {
        
        maxvalue = arr[i];
     } }

    return maxvalue;


}}
