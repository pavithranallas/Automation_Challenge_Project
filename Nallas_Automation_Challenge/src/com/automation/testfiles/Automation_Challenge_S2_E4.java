package com.automation.testfiles;

import java.util.Scanner;

public class Automation_Challenge_S2_E4 {

	public static void main(String[] args) {
		int n = 3;
		Scanner sc;
		char[][] board = new char[n][n];
		
		for(int i = 0; i < n; i++) 
		{
			for(int j = 0; j < n; j++) 
			{
				System.out.printf("Enter the Value for board "+i +" " +j);
				sc= new Scanner(System.in);
			
				board[i][j] = sc.next().charAt(0);
			}
			}
		System.out.println("Entered matrix: ");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++) 
			{
				System.out.print(" "+board[i][j]);
				System.out.print(" ");
			}
			    System.out.println();
			}
		
		//System.out.println("Start of the matrix");
		
		for(int i = 0; i < 2; i++)
		{
			//System.out.println("value of i:" +i);
			
			for(int j = 0; j < 2; j++) 
			{
				//System.out.println("value of j:" +j);
				if (i > 0  )
				{
					break; 
				}
			//	System.out.println("Entering the if loop");
			//	if (board[i][j] == "X")
			//		{
			//	System.out.println("value of board[0][0]:" +board[0][0]);
			//	System.out.println("value of board[0][1]:" +board[0][1]);
			//	System.out.println("value of board[0][2]:" +board[0][2]);
			
				if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' )
					{
						System.out.println("X is the winner");
						break;
					}
					else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
					{
						System.out.println("X is the winner");
						break;
					}
					else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
					{
						System.out.println("X is the winner");
						break;
					}	
					else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
					{
						System.out.println("X is the winner");
						break;
					}
					else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
					{
						System.out.println("X is the winner");
						break;
					}
					else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
					{
						System.out.println("X is the winner");
						break;
					}
					else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
					{
						System.out.println("X is the winner");
						break;
					}
					else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')
					{
						System.out.println("X is the winner");
						break;
					}
						
				//	}
				//else if (board[i][j] == "O")
				//{
					if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
					{
						System.out.println("O is the winner");
						break;
					}
					else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
					{
						System.out.println("O is the winner");
						break;
					}
					else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
					{
						System.out.println("O is the winner");
						break;
					}	
					else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
					{
						System.out.println("O is the winner");
						break;
					}
					else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
					{
						System.out.println("O is the winner");
						break;
					}
					else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
					{
						System.out.println("O is the winner");
						break;
					}
					else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
					{
						System.out.println("O is the winner");
						break;
					}
					else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')
					{
						System.out.println("O is the winner");
						break;
					}
					else
					{
						System.out.println("No winner");
					}
			//	}
				
			}
		}

	}

}
