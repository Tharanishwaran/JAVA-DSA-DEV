public class ME{

public static void main(String[] args) {
    
   int [] arr = {1,3,4,6,7,6,7,7,8,8};

   int ans = majorityElement(arr);
 
   System.out.println(ans);

}


public static int majorityElement(int[] nums) {
    int count = 0;
    Integer maxInteger = null;

    for (int num : nums) {
        if (count == 0) {
            maxInteger = num;
        }
        count += (num == maxInteger) ? 1 : -1;
    }

    return maxInteger;
}


}


