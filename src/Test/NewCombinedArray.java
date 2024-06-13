package Test;

public class NewCombinedArray {
	public static void main(String args[]) {
	int[] array1 = {1,2,4,5,7,8,9};
	int[] array2 = {10,1,1,13,1,15,16,17};
	int CombineArray3 =  array1.length +array2.length;
	 int[] combinedArray = new int[CombineArray3];
	for (int i=0;i<=array1.length;i++) {
		combinedArray[i]=array1[i];	
	
	}
	for (int i=0 ; i<=array2.length;i++) {
		combinedArray[array1.length+i]=array2[2];
	}
	System.out.println(combinedArray);
	
	}
	
	
	
		
	}


