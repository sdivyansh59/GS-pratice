package leetcode;

public class LinkedListCycle2 {

}

/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {ListNode}
 */

var detectCycle = function(head) {
    let m=new Map();
    let temp=head;
    while(temp!==null){
        if(  m.has(temp)) return temp;
        m.set(temp,true) ;
        temp=temp.next;
    }
    return null;
};
