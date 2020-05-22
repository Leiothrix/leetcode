package com.paprika.leetcode.easy;

import com.paprika.leetcode.structure.ListNode;

/**
 * @author adam
 * @date 2020/5/22
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * Input: head = [4,5,1,9], node = 5
 * Output: [4,1,9]
 * Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
 */
public class DeleteNode {
    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}