package linearsearch;

public class Linearsearch{

public static void main(String[] args){


 int [] numbers = {4,6,8,9,0};

 int target = 18;

 int ans = linearsearchfun(numbers, target);

 System.out.println(ans);


}

// search in the array: return the index if item found
// otherwise if item not found return -1

static int linearsearchfun(int[] arr,int target) {

  if (arr.length== 0 ){
    
    return -1;

  }

//   run a for loop
for(int i = 0;i < arr.length; i++){

    //  check for element att every index if it is = target

    int element = arr[i];
    
    if(element == target) {

        return i;
    }

 

}


//  this line will execute if none of the return 

// hence the target not found

return -1;

}






}












