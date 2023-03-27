package com.automation.testfiles;

import java.util.Scanner;

public class Automation_Challenge_S2_E3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{  
			int i,j,k;
			Scanner sc = new Scanner(System.in);  
			System.out.println("Enter the number of rows you want to print: ");  
			int rows = sc.nextInt();   
			if(rows%2==0 || rows <3)
			{
				System.out.println("Diamond pattern cannot by printed"); 
			}
			else 
			{
			rows = rows/2+1;
			System.out.println("No.of rows: " +rows); 
			for (i=1; i<= rows ; i++)   
			{  
			for (j = rows; j > i ; j--)   
			{  
			System.out.print(" ");  
			}  
			System.out.print("*");  
			for (k = 1; k < 2*(i -1) ;k++)   
			{   
			System.out.print(" ");   
			}  
			if( i==1)   
			{   
			System.out.println("");  
			}  
			else  
			{  
			System.out.println("*");   
			}  
			}   
			for (i=rows-1; i>= 1 ; i--)  
			{  
			for (j = rows; j > i ; j--)   
			{  
			System.out.print(" ");  
			}  
			System.out.print("*");  
			for (k = 1; k < 2*(i -1) ;k++)   
			{  
			System.out.print(" ");  
			}  
			if(i==1)  
			System.out.println("");  
			else  
			System.out.println("*");  
			}  
			}  
		}

	}

}
