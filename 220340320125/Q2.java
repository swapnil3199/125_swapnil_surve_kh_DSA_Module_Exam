import java.util.*;
class ReverseLL{
			Node head;
		static class Node
		{
			int data;
			Node next;
			
			Node(int d)
			{
				data=d;
				next=null;
			
			}
		
		}
		
		
		 void insertLL(int n)
		 {
		    Node new_node= new Node(n);
			
			Scanner sc=new  Scanner(System.in);
			if(head==null)
			{
				head=new_node;
			    return;
			}
			new_node.next=null;
			Node temp= head;
			while(temp.next!=null)
			{
			
				temp=temp.next;
				temp.next=new_node;
				return;
			
			}
		 }
		 
		void printReverse(Node a){
			
			if(head == null)
			{
				return;
			}
			while(head.next != null){
			printReverse(head.next);
			System.out.println(head.data+" ");
			return ;}
		}
		 
		 
		 
		  void Display()
		{
			Node m=head;
			while( m.next != null)
			{
				System.out.println(m.data+"  ");
				m=m.next;
				
				
			}
			return;
			
		}
		
		
		
		
		public static void main (String []args){
		
			ReverseLL ll=new ReverseLL();
			ll.head=new Node(5);
			Node second= new Node(10);
			ll.insertLL(1);
			ll.head= second;
			ll.printReverse(ll.head);
			ll.Display();
		}



}