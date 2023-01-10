package com.automation.testfiles;

public class Automation_Challenge07 {

	public static void main(String[] args) {

		 String originalstring = "aaaccc";
		 String substring = "cc";
		 Boolean f1loop = null;
		 Boolean f2loop = null;

		 for (int i=0; i < (originalstring.length()-1); i++)
			{
				String concat = (String) originalstring.subSequence(i+1, (originalstring.length()));
				
				if(substring.equalsIgnoreCase(concat))
				{
					//System.out.println("Substring: "+substring);
					System.out.println(substring +"Can be formed from"+originalstring );
					f1loop = true;
					break ;
				}
				
			}
		 
		// System.out.println("string length: "+originalstring.length());
		 for (int i=originalstring.length(); i > 1; i--)
			{
			 
				String concat1 = (String) originalstring.subSequence(0, i-1);
				
				if(substring.equalsIgnoreCase(concat1))
				{
				//	System.out.println("Substring: "+substring);
					System.out.println(substring +"Can be formed from"+originalstring );
					f2loop = true;
					break ;
				}
				
			}
		 if (f1loop != true && f2loop != true )
		 {
			 System.out.println("Substring cannot be formed in the given string");
		 }
	}

}
