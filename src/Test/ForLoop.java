package Test;


class NewOne {
    int Marray[] = {1, 2, 3, 4, 5, 6};

    void displayReverse() {
        for (int i = Marray.length - 1; i >= 0; i--) {
            System.out.print(Marray[i] + "\t");
        }
     //   System.out.println("\t"); // Move to the next line after printing all elements
    
    }
    class HelloWorld {
    
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7};
        
        // Calculate the length of the combined array
        int combinedLength = array1.length + array2.length;
        
        // Create a new array to store the combined elements
        int[] combinedArray = new int[combinedLength]
        
        // Copy elements of array1 into combinedArray
        for (int i = 0; i < array1.length; i++) {
            combinedArray[i] = array1[i];
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
    
        }
    


    
    




public class ForLoop {
	public static void main(String args[]) {
	int i;
	//for (i=1;i<=20 ;i++) {
		//System.out.println(i + "\t"); 
		//
	NewOne obj = new NewOne();
	obj.displayReverse();
	 obj.
		
	}
	}

	
