package leetcode;

import java.util.ArrayList;
import java.util.List;

// in this Ques we have to return all Subsequence of String
public class PrintAllSubSequenceOfString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		
		List<String> list= printAllSubSequenceOfString(str);
		System.out.println(list);
	}
	
	public static List<String> printAllSubSequenceOfString (String str){
		if( str.length() ==0 ) {
			List<String> list = new ArrayList<String>();
			list.add("");
			return list;
		}
		List<String> oldlist  = printAllSubSequenceOfString(str.substring(1));
		int oldSize = oldlist.size();
		for ( int i= 0; i < oldSize; i++) {
			oldlist.add(str.charAt(0)+oldlist.get(i));
		}
		return oldlist;
	}

}
