package Test;

public class EVENODD {
	public static void main (String[] args) {
		{		
		       int i =0;
		       int num =0;
		       
		       String  prime_numbers = "";

		       for (i = 1; i <= 100; i++)         
		       { 		  	  
		          int counter=0; 	  
		          for(num =i; num>=1; num--)
		    	  {
		             if(i%num==0)
		    	     {
		     		    counter = counter + 1;
		    	     }
		    	  }
		    	  if (counter ==2)
		    	  {
		    	     prime_numbers = prime_numbers + i + " ";
		    	  }	
		       }	
		       System.out.println("Prime Numbers between 1 and 100 :");
		       System.out.println(prime_numbers);
		    }
		}
	}
