package leetcode;

public class RemoveDuplicates {

}



 class solution 
{
	public static int[] removeDuplicates(int arr[])
	{
		
        Set<Integer> st = new  HashSet<Integer> ();
         
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0 ;i < arr.length; i++){
            if(st.contains( (Integer)arr[i])){
                
            }else{
               
                list.add(arr[i]);
                st.add(arr[i]);
            }
        }
        
      
        //int []ans = list.stream().mapToInt(Integer::inValue).toArray();
        int [] ans = new int[list.size()];
        for( int i=0 ; i< list.size(); i++){
            ans[i] = list.get(i);
        }
		return ans;
	}
}
