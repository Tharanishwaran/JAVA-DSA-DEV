package linearsearch;

public class SearchInRange {
    
public static void main(String[] args) {
    

   int[] arr = {1,4,6,-7,8,9,0};

   int target = 6;


   System.out.println(linearsearchfun(arr, target, 1, 4));

  




}

static int linearsearchfun(int[] arr,int target,int start,int end) {

    if (arr.length== 0 ){
      
      return -1;
  
    }
  
  //   run a for loop
  for(int index = start;index <= end; index++){
  
      //  check for element att every index if it is = target
  
      int element = arr[index];
      
      if(element == target) {
  
          return index;
      }
  
   
  
  }
  
  
  //  this line will execute if none of the return 
  
  // hence the target not found
  
  return -1;
  
  }
  

}
