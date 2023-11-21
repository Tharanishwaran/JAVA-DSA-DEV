public class Arrays {
	public static void main(String[] args)
	{
		// declares an Array of integers.
		int[] arr;

		// allocating memory for 5 integers.
		arr = new int[6];

		// initialize the first elements of the array
		arr[0] = 100;

		// initialize the second elements of the array
		arr[1] = 200;

		
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
                arr[5] = 600;

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
