package Test;

public class WhileLoop {
	public static void main(String args[]) {
		printNumbers();
        printEvenNumbers();
    }

    public static void printNumbers() {
        int i = 1;
        while (i <= 20) {
            System.out.print(i + "\t");
            i++;
        }
        System.out.println(); // Move to the next line after printing numbers from 1 to 20
    }

    public static void printEvenNumbers() {
        int i = 2; // Start with 2, since it's the first even number
        while (i <= 20) {
            System.out.print(i + "\t");
            i = +2; // Increment by 2 to get the next even number
        }
        System.out.println(); // Move to the next line after printing even numbers from 2 to 20
    }
}