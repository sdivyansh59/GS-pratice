package leetcode;

public class LinkedListCycle {

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
 * @return {boolean}
 */

var hasCycle = function(head) {
    let m=new Map();
    let temp=head;
    while(temp!==null){
        if(m.has(temp)){
            return true;
        }
        m.set(temp,true);
        temp=temp.next;
    }
    return false;
};