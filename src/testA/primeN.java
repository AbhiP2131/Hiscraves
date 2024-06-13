package testA;

public class primeN {
	public static void main (String[] args) {
int i = 0;
int num;
	 for (i = 1; i <= 100; i++)         
     { 		  	  
        int counter=0; 	  
        for(num =i; num>=1; num--)
  	  {
           if(i%num==0)
  	     {
   		    //counter = counter + 1;
        	   System.out.println(num);
  	     }

  	  }
}}}