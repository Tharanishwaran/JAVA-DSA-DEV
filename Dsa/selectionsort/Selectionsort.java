import java.util.Arrays;

class Selectionsort {
    
    public static void main(String[] args){
  
        int[] arr1 = {1, 20, 3};
        int[] arr2 = {4, 5, 6};

        int[] mergedArr = mergearr(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArr));

        int[] sortm = {5,3,70,1,6,2}; 

     
    }

    static int[] mergearr(int[] array1, int[] array2){
        int[] mergedArr = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            mergedArr[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            mergedArr[i + array1.length] = array2[i];
        }


        Arrays.sort(mergedArr);

        return mergedArr;
    }
  
}

