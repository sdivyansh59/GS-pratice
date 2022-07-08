package leetcode;

public class NQueen {

}


/**
 * @param {number} n
 * @return {string[][]}
 */

const isPlaced=(v,posX,posY)=>{
    let n=v.length;
    //vertical
    for(let i=0,j=posY;i<n;i++){
        if(v[i][j]!=='.') return false;
    }
    
    // x-y
    for(let i=posX,j=posY;i>=0 && j>=0; i--, j--){
        if(v[i][j]!='.') return false;
    }
     for(let i=posX,j=posY;i<n && j<n; i++, j++){
        if(v[i][j]!='.') return false;
     }
    
     
    //y-x
     for(let i=posX,j=posY;i<n && j>=0; i++, j--){
        if(v[i][j]!='.') return false;
     }
    for(let i=posX,j=posY;i>=0 && j<n; i--, j++){
        if(v[i][j]!='.') return false;
    }
 return true;
}


const nQueen=(i,n,position,v)=>{
    if(i>=n){
        position.push(v);
        return ;
    }
    
    for(let j=0;j<n;j++){
       if(isPlaced(v,i,j)){
           let v2=[...v];
           let s="";
           for(let k=0;k<n;k++){
               if( k===j){
                   s+='Q';
               }else{
                   s+= v2[i][k];
               }
           }
           
           v2[i]=s;
           nQueen(i+1,n,position,v2);
           
           
       } 
    }
}

var solveNQueens = function(n) {
    const position=[];
    let v=[];
    //initialise
    let s="";
     for(let i=0;i<n;i++){
        s+='.';
    }
    for(let i=0;i<n;i++){
        v.push(s);
    }
    
    let i=0;
    nQueen(i,n,position,v);
    return position;
    
};