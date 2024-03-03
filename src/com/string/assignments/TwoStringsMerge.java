package com.string.assignments;

public class TwoStringsMerge
{
	    public static void main(String[] args) {
	        // Two string arrays to be merged
	        String[] array1 = {"Hello", "World"};
	        String[] array2 = {"Java", "Programming"};

	        // Calculate the length of the merged array
	        int length1 = array1.length;
	        int length2 = array2.length;
	        int mergedLength = length1 + length2;

	        // Create a new array to store the merged elements
	        String[] mergedArray = new String[mergedLength];

	        // Copy elements from the first array to the merged array
	        for (int i = 0; i < length1; i++) {
	            mergedArray[i] = array1[i];
	        }

	        // Copy elements from the second array to the merged array
	        for (int i = 0; i < length2; i++) {
	            mergedArray[length1 + i] = array2[i];
	        }

	        // Print the merged array
	        System.out.println("Merged Array:");
	        for (int i = 0; i < mergedArray.length; i++) {
	            System.out.println(mergedArray[i]);
	        }
	    }
	

}
