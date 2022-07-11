package leetcode;

public class FindWhichIsNotDublicate {

}


 class solution 
{
	public static char firstNonRepeatingChar(String str)
	{
	
        Map<Character, Integer> hm = new HashMap<Character, Integer> ();
        char ansChar =' ';
        
        for( int i=0 ;i< str.length();i++){
            
            if( hm.containsKey(str.charAt(i))){
                int old= hm.get(str.charAt(i));
                hm.put(str.charAt(i), old+1);
            }else{
                hm.put(str.charAt(i),1);
            }
        }
        
     	for( int i=0 ;i< str.length();i++){
            if(hm.get(str.charAt(i)) == 1){
                ansChar = str.charAt(i);
                break;
            }
        }
        
        
        return ansChar;
	}
}
