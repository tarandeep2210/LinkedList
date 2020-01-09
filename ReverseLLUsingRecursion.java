package LinkedList;



class Node{
	int data;
	Node next;
	public Node(int data){
		this.data = data;
		next = null;
	}
};

public class ReverseLLUsingRecursion {
	
	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		head = new Node(0);
		head.next= new Node(1);
		head.next.next= new Node(2);
		head.next.next.next= new Node(3);
		head.next.next.next.next= new Node(4);
		head.next.next.next.next.next= new Node(5);
		
	
		reverse(head);
		printLL(head);
	}
	
	private static void printLL(Node head){
		
		if(head==null){
			return;
		}
		
		System.out.println(head.data);
		printLL(head.next);
		
	}
	
	private static void printReversedLL(Node head){
		
		if(head==null) return;
	
		printReversedLL(head.next);
		System.out.println(head.data);
		
	}
	
	
	private static void reverse(Node p){
		if(p.next==null) {
			head=p;
			return;
		}
		
		reverse(p.next);
		p.next.next=p;
		p.next=null;
	}
	
	

}
