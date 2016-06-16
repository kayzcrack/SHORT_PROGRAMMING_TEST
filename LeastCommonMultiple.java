// LeastCommonMultiple.java
// program to return the LCM of given set of integers

import java.util.Scanner;
import java.util.Arrays;

class LeastCommonMultiple{
	
	
    public static int getLeastCommonMultiple(int ... intergerset){
        int leastCommonMultiple; // variable to hold the LeastCommonMultiple
		int max; // variable to hold the maximum int in the list
		boolean found; // variable used to check if any of the integer in the list is the maximum number
		
        max = intergerset[0]; // initialize the max variable, and assume the first element in the list is the maximum value
		
		// Test if the above assumption is correct, if its not we assign the new maximum value to the variable max
        for(int i=0; i<intergerset.length; i++){
            if(intergerset[i]>max) max=intergerset[i];
        }
		
		/*
		/if the highest number in the set is not the lowest common multiple
		/ the instead of increasing by one we increase it in multiple of the
		/ highest number and reduce the number of checks.
		*/
        for(int i=max; ; i+=max){
			
            found=true; // set the value of the boolean variable found to true at this point
			
			// go through each element in the integer set.
            for(int j=0; j<intergerset.length;j++){
				
				// check for an interger which is divisible by all the integers
                if(i%intergerset[j]!=0){
                    found=false;
                    break;
                }
            }
            if(found){
                leastCommonMultiple=i;
                break;
            }
        }
        return leastCommonMultiple;
    }
	
	// create the main method and call getLeastCommonMultiple
	// passing an array of integers as its input
    public static void main(String[] args){
		
		// create an object of the Scanner class
		Scanner input = new Scanner(System.in);
		
		// ask user to enter the total number of integers
		System.out.println("How many numbers do you want to enter?");
		int number = input.nextInt(); // read input from command line
		int numbers[] = new int[number]; // create an array having length equal the total number of elements from user
		
		// request for input from the users for number of times equal the total number of integers
		for(int k = 0; k < number; k++){
			System.out.println("number" + k + ":");
			numbers[k] = input.nextInt();
		}
		// print result on the console
        System.out.printf("The Lowest common multiple of %s is %d\n ",Arrays.toString(numbers),getLeastCommonMultiple(numbers));
    }
}