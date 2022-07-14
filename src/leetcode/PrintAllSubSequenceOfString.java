package leetcode;

import java.util.Scanner;

public class PrintAllSubSequenceOfString {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		String smallAns = "";
		printAllSubSequence(smallAns,str );
	}
	
	public static void printAllSubSequence( String smallAns,String str ){
		if( str.length() ==0 ) {
			System.out.println(smallAns);
			return ;
		}
		// leave
		printAllSubSequence(smallAns, str.substring(1));
		
		// take it 
		printAllSubSequence(smallAns+str.charAt(0), str.substring(1));
	}

}
