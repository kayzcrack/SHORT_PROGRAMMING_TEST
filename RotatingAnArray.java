// RotatingAnArray.java
// Program to to rotate an array by N position

import java.util.Arrays;

class RotatingAnArray{
	
		public static void main(String[] args){
			// create an array with the integers to rotate
			int[] originalArray = {1,2,3,4,5,6,7,0};
			System.out.println("Original Array is: " + Arrays.toString(originalArray));
			int positionToRotate = 3;
			
			//check if array is not null 
			if(originalArray == null){
				throw new IllegalArgumentException("The the array can not be null");
			}
			
			// check if positionToRotate is less than zero
			if(positionToRotate < 0){
				throw new IllegalArgumentException("The order must be non-negative");
			}
			
			// check if array contain at least one element
			if(originalArray.length < 1){
				throw new IllegalArgumentException("The the array must contain at least one element");
			}
			
			// loop through the array for positionToRotate number of times
			for(int i = 0; i < positionToRotate; i++){
				
				// go through the array an shift each element one step back
				// starting from the highest position
				for(int j = originalArray.length-1; j > 0; j--){
					int tempVar = originalArray[j];
					originalArray[j] = originalArray[j-1];
					originalArray[j-1] = tempVar;
					//System.out.println(tempVar);
				}
			}
			System.out.printf("Array after rotating by %d position is: %s\n ", positionToRotate, Arrays.toString(originalArray));
		}
}