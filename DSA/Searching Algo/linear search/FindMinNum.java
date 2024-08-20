package linearsearch;

public class FindMinNum {


    public static void main(String[] args) {
        
    int [] arr = {220,54,66,77,32,49};

     int ans = arr[2]; 

    // System.out.println(ans > arr[0]);


 System.out.println(searchminnum(arr));


    }


    // assume aar.length !=0
    // return the min value in the arr
    static int searchminnum(int [] arr){

         int ans = arr[0];

         for(int i = 1; i < arr.length;i++){

               if(arr[i] < ans ){

                 ans = arr[i];
               }
                            

         }

         return ans;

    }
    
}
