import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] arg) {
		int[] data = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		// Expected output : 7, 1, 6, 2, 5, 3, 4

		myWay(data);
		// bubbleSort(data);
	}

	/*
	 * Sorting the above using bubble sort method, basically swapping 2 indexes with
	 * each other according to a set of conditions since its an alternate sorting
	 * here are the thought process 1. all even indexes 0,2,4,6 and ODD indexes
	 * 1,3,5 can be swapped if the below conditions are met if the current index is
	 * at an EVEN number then we check the last index to check if its larger than
	 * the current index if so then swap but if the current index is ODD then it
	 * will swap if the last number is lesser than the current index value
	 * 
	 */
	private static void bubbleSort(int[] arr) {
		// 1, 2, 3, 4, 5, 6, 7
		// 7, 1, 6, 2, 5, 3, 4
		boolean run = false; // for the do while loop to run
		boolean mod = true; // checks if the modification has been done
		int aLen = 0;

		do {

			if (mod == false) {
				run = false; // if not modified then stop the do while loop
			} else {
				run = true; // else run the do- while loop
			}
			for (int a = 0; a <= arr.length - 2; a++) {
				// for loop to iterate through the elements in array

				mod = false; // modification is set to false
				aLen = arr.length - 1; // init the last index of the array

				if (a % 2 > 0) {
					// if the index is odd
					if (arr[a] > arr[aLen]) {
						int temp = arr[aLen];

						arr[aLen] = arr[a];
						arr[a] = temp;
						mod = true;
					}

				} else {
					// if index is even
					if (arr[a] < arr[aLen]) {
						int temp = arr[aLen];

						arr[aLen] = arr[a];
						arr[a] = temp;
						mod = true;
					}

				}
			}

		} while (run);
		printArr(arr);// Printing the array to the console
	}

	/*
	 * My Way of solving the above exercise : i would simply prefer to make a new
	 * empty array with the same size of the user input array and loop through the
	 * existing array and take the first and last element and insert it to the new
	 * array last element and first element until there is only 1 element left
	 * [1,2,3] -> new array[3,1]
	 * 
	 */
	static void myWay(int[] arr) {

		int aLen = arr.length - 1; // storing the array length
		int[] resultArr = new int[aLen + 1]; // new array to store results
		int cont = 0; // counter

		for (int a = 0; a <= aLen / 2; a++) {
			// loops through the half of the user input array
			if (arr[aLen - a] != arr[a]) {
				// just to avoid clash of the last 1 element ie 4
				resultArr[cont] = arr[aLen - a];
				resultArr[cont + 1] = arr[a];
			} else {
				// in case only 1 element is found then thats added to the result array
				resultArr[cont] = arr[aLen - a];
			}

			cont += 2; // counter bounces 1 count
		}

		printArr(resultArr); // printing the array
	}
	// END OF myWay Solution

	// method to print the given array
	static void printArr(int[] arr) {

		System.out.println(Arrays.toString(arr));
	}

}
