package MergeTwoSortedLink;

public class LinkedList
{
	protected class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
		}
	}
	
	Node head;
	
	public void insert(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
			return;
		}
		
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=node;
		
	}
	
	
	public void sortOnInsert(int data)
	{
		Node node=new Node(data);
		if(head==null || head.data>data)
		{
			node.next=head;
			head=node;
		}
		else
		{
			Node current=head;
			while(current.next!=null && current.next.data<data)
			{
				current=current.next;
			}
			node.next=current.next;
			current.next=node;
		}
		
		
	}
	
	public void traverse()
	{
		if(head==null)
		{
			System.out.println("No elements in list ");
			return;
		}
		System.out.println("Elements are: ");
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	
	Node sortedMerge(Node headA, Node headB) {
	    
	    Node temp=new Node(0);
	    
	    Node tail=temp;
	    while(true)
	    {
	        if(headA==null)
	        {
	            tail.next=headB;
	            break;
	        }
	        if(headB==null)
	        {
	            tail.next=headA;
	            break;
	        }
	        
	        if(headA.data<headB.data)
	        {
	            tail.next=headA;
	            headA=headA.next;
	        }
	        else
	        {
	            tail.next=headB;
	            headB=headB.next;
	        }
	        tail=tail.next;
	   } 
	   return temp.next;
	    }
	
	
}
