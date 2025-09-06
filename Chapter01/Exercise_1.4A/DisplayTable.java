
/* 
 * Create A Table using the "printf" command 
 * 		
 * 	a 	a ^ 2		a ^3 
 * 	1	  1		  1 
 * 	2	  4 		  8 
 * 	3	  9		  27
 * 	4	  16		  64
 * We can also use while loop , range a from 1 to 4 , */


public class DisplayTable{


	public static void main (String[] args){

		System.out.printf("%-8s%-10s%-10s%-10s\n", "a", "a^2","a^3","a^4");
		System.out.printf("%-8s%-10s%-10s%-10s\n", "1", "1", "1", "1");
		System.out.printf("%-8s%-10s%-10s%-10s\n", "2", "4", "8", "16");
		System.out.printf("%-8s%-10s%-10s%-10s\n", "3", "9", "27", "81");
		System.out.printf("%-8s%-10s%-10s%-10s\n", "4", "16", "64", "128");

	}


}
