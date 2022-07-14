package leetcode;

public class ExtactUniqueCharacter {

}


import java.util.*;

public class Solution {

	public static String uniqueChar(String str){
		Set<Character> setOfChar = new HashSet<Character>();
        String ansStr = "";
        
        for ( int i= 0 ;i< str.length(); i++){
            if(!setOfChar.contains(str.charAt(i))){
                ansStr += str.charAt(i);
                setOfChar.add(str.charAt(i));
            }
        }
		return ansStr;
	}
}