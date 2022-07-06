class Solution {
public:
    int reverse(int x) {
    int a=0;
        if(x>=0) a=1; 
        else a=-1;
        
            
        
        
      long  int x2=0;
        while(x!=0){
            int m=x%10;
            if(m<0) m=m*-1;
            
            x2=x2*10+m;
            x/=10;
        }
        
        if(a==-1) x2=x2*-1;
        
        if(x2 < INT_MAX  && x2 >= INT_MIN) return x2;
        
        return 0;
    }
};