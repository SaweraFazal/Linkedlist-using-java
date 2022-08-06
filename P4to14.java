package lab6;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.*;
public class P4to14 {
	public static void main(String[] args) {
		//create an empty linked list
		LinkedList<String> list=new LinkedList<String>();
		//use add method
		list.add("sawera");
		list.add("sooraj");
		list.add("nida");
		list.add("shaheer");
		System.out.println(list);
		//iterate
		for(String element:list) {
			System.out.println(element);
		}
		//set iterator at specified index
		Iterator i=list.listIterator(3);
		System.out.println("index iterator");
		//print list from third position
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//iterate a list in reverse order
		Iterator rev=list.descendingIterator();
		System.out.println("reverse order");
		while(rev.hasNext()) {
		System.out.println( rev.next());
	}
	//add a student after 1st member
		System.out.println("add a member after first member");
	list.add(1,"amin");
	System.out.println(list);
	//add at first and last 
	System.out.println("add members at 1st and last in the list");
	list.addFirst("fazal");
	list.addLast("zaman");
	System.out.println(list);
	//add in front of list
	System.out.println("specific element in front of linked list");
	list.offerFirst("family");
	System.out.println(list);
	//display elements and their positions
	for(int p=0;p<list.size();p++) {
		System.out.println("elements at index"+p+":"+list.get(p));
	}
	//remove index 5th element
	Object firstElement=list.remove(5);
	System.out.print("element removed "+firstElement);
	Object lastElement=list.removeLast();
	System.out.println("element removed "+lastElement);
	System.out.println(list);
	//swap two elements in link list
	System.out.println("new link list after swap: ");
	Collections.swap(list, 2, 01);
	System.out.println(list);
	//compairing two linked lists
	LinkedList<String>list2=new LinkedList<String>();
	list2.add("happy");
	list2.add("birthday");
	list2.add("sawera");
	LinkedList<String>list3=new LinkedList<String>();
	for(String s:list)
		list3.add(list2.contains(s)? "yup":"nops");
	System.out.println(list3);

	}
	}


