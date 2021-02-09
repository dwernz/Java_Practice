/*  Exercise 72040
    Write a program that uses String method regionMatches to compare 
    two strings input by the user. The program should prompt the user 
    to enter two strings, the starting index in the first string, 
    the starting index in the second string, and the number of 
    characters to be compared. The program should print whether or 
    not the strings are equal. (Ignore the case of the characters 
    during comparison.)
*/

import java.util.Scanner;

public class StringCompare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int stringIndex1, stringIndex2, numOfCharacters;
		String string1, string2, stringTemp;
		
		System.out.print("Enter first string:");
		string1 = input.nextLine();
		System.out.print("Enter second string:");
		string2 = input.nextLine();
		System.out.print("Enter starting index for first string:");
		stringIndex1 = input.nextInt();
		System.out.print("Enter starting index for second string:");
		stringIndex2 = input.nextInt();
		System.out.print("Enter number of characters to be compared:");
		numOfCharacters = input.nextInt();
		
		System.out.println(string1.regionMatches(true, stringIndex1, string2, stringIndex2, numOfCharacters));
		
		
		input.close();
	}
}