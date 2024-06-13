package Test;

public class CombinedArraysA {
	 public static void main(String[] args) {
	        // Define two arrays
	        int[] array1 = {1, 2, 3};
	        int[] array2 = {4, 5, 6, 7};
	        
	        // Calculate the length of the combined array
	        int combinedLength = array1.length + array2.length;
	        System.out.println("Cobmined Length "+ combinedLength);
	        
	        // Create a new array to store the combined elements
	        int[] combinedArray = new int[combinedLength];
	        System.out.println("Combined Array"+combinedArray);
	        
	        // Copy elements of array1 into combinedArray
	        for (int i = 0; i < array1.length; i++) {
	            combinedArray[i] = array1[i];
	        }
	        System.out.println("***Combined Array ***"+combinedArray);
	        //123
	        for (int i=0 ; i<=2;i++ ) {
	        	System.out.print("First Array Added "+combinedArray[i]);
	        }
	        // Copy elements of array2 into combinedArray starting from the position after array1
	        for (int i = 0; i < array2.length; i++) {
	            combinedArray[array1.length + i] = array2[i];
	        }
	        
	        // Print the combined array
	        System.out.println("Combined Array:");
	        for (int num : combinedArray) {
	            System.out.print(num + " ");
	        }
	    }
	}

