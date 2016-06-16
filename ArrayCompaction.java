// ArrayCompaction.java
// program to sort and remove duplicate from a given array

import java.util.Scanner; // import scanner class
import java.util.Arrays;

class ArrayCompaction{
	
	public static void main(String[] args){
		
		// create an object of the Scanner class
		Scanner input = new Scanner(System.in);
		
		// ask user to enter the total number of integers
		System.out.println("How many numbers do you want to enter?");
		int number = input.nextInt(); // read input from command line
		int array [] = new int[number]; // create an array having length equal the total number of elements from user
		
		// request for input from the users for number of times equal the total number of integers
		for(int k = 0; k < number; k++){
			System.out.println("number" + k + ":");
			array[k] = input.nextInt();
		}
		
	
		System.out.println("The original array is: "+ Arrays.toString(array));
		Arrays.sort(array); // sort the array
		System.out.println("The sorted array is: "+ Arrays.toString(array));
		
		
		int compactedArray = array[0]; // declare a variable to hold the compacted Array and assign the first element in the array to it.
 		boolean found = false; // variable to check if element is contained in the array
		
		System.out.print("The compacted array is: ");
		System.out.print("[");
		
		// loop through the array 
		for(int i = 0; i < array.length; i++){
			
			// check if the current element is already in the compactedArray
			// if its there set found to true and skip to the next element
			// if its not found print the element in the console
			
			if(compactedArray == array[i] && !found){
				found = true;
			}else if(compactedArray != array[i]){
				System.out.print(compactedArray + ",");
				compactedArray = array[i];
				found = false;
			}
		}
	    System.out.print(compactedArray + "]");
	}
}