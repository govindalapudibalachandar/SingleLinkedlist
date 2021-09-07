package com.bridgelabz;

public class LinkedList {
	
	Node head;       // first node itself is head
	
	// Add Method
    public void Add(int data)
    {
        Node node = new Node(data);
        node.data = data;
        node.next=null;
        
        if (head==null)  // if it first object is head it should be null
        {
        	head = node;
        }
        else {
            Node  n = head ;   // n is a temparory node to check if it is a null
        	while (n.next != null) {
        	  n = n.next;
        	}
        	n.next = node;
        	}
    }
       // display method 
       public void  Display() {
    	  Node node = head;
    	  while (node.next!= null)
    	  {
    		  System.out.println(node.data);
    		  
    		 // after printing ever node we must shift to another node
    		  node = node.next; }
    	  System.out.println(node.data);
        
      }
  }
   
    
   
    




