/*
*
**
***
****
***
**
*
**/

package simple;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {

		
		
		System.out.print("enter number of rows");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();

		for(int i=0;i<rows-1;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=rows-1;i>=0;i--) {
			for(int j=0;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}

}
