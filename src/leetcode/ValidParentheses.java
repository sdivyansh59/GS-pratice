
class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character>  hm = new HashMap<Character, Character> ();
        hm.put('}','{');
        hm.put(']','[');
        hm.put(')','(');
        
        Stack<Character> st = new Stack<Character> ();
        
        //st.push(s.charAt(0));
        
        for( int i=0; i< s.length(); i++){
            Character x= s.charAt(i);
           // System.out.print(x);
            if(hm.containsKey(x)){
                // System.out.println("pop "+x);
                while(st.size()>0 && st.peek()!= hm.get(x)){
                  //  System.out.println(st.peek());
                    if( st.peek()== '{' ||st.peek()== '('|| st.peek()== '[' ){
                        return false;
                    }
                    st.pop();
                }
                if( st.size() == 0 ) return false;
                st.pop();
            }else{
               //  System.out.print("push "+x);
                st.add(x);
            }
        }
        
        if( st.size() > 0) return false;
        return true;
        
        
    }
}