//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution g = new Solution();
            head = g.deleteMid(head);
            printList(head); 
            t--;
        }
    } 
} 
   

// } Driver Code Ends


/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    
    int count(Node head)
    {
        int cnt = 0;
        Node temp = head;
        
        while(temp!=null)
        {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
    
    
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        if(head == null) return null;
        
        if(head.next == null) return null;
        Node temp = head;
        Node copyhead = head;
        
        int size = count(head);
        
        int mid = size / 2;
        // Delete the middle node
        while (mid-- > 1) {
            head = head.next;
        }
        // Delete the middle node
        head.next = head.next.next;

        return copyhead;
        
    }
    
}