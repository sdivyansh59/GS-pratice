package leetcode;





class Power {
public:
    
    double myPow(double x, long n) {
        // base case
        if(n<0){
            x=1/x;
            n=abs(n);
          return   myPow(x,n);
        }
          if(x==1){
              return x;
          }
          if(n==0){
              return 1;
          }
        double ans;
        if((n&1)==1){
           ans=myPow(x,n/2);
           ans=ans*x*ans; 
        }
        else{
            ans=myPow(x,n/2);
            ans=ans*ans;
        }
        
        return (ans);
    }
};