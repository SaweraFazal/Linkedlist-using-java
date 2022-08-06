package lab6;
//linked list implementation
public class P3 {
	//creating a node
	Node head;
	static class Node{
		int value;
		Node next;
		Node(int d){
			value=d;
			next=null;
		}
	}
	public static void main(String[] args) {
P3 linkedlist=new P3();
//assign value valus
linkedlist.head=new Node(1);
Node second=new Node(2);
Node third=new Node(3);
//connect nodes
linkedlist.head.next=second;
second.next=third;
	
	//printing nodes value
	while(linkedlist.head!=null) {
		System.out.println(linkedlist.head.value+" ");
		linkedlist.head=linkedlist.head.next;
		
	}
	

}}
