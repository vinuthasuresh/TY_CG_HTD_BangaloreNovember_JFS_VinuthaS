import java.util.LinkedList;

public class LinkedList3 

{
	public static void main(String[] args) {
		
	
	LinkedList l1= new LinkedList();
	
	l1.add(45);
	l1.add(56);
	l1.add(67);
	l1.add(34);
	System.out.println("...........peek ,peekfirst and peekfirst");
	System.out.println(l1.peek());
	System.out.println(l1.peekFirst());
	System.out.println(l1.peekLast());
	System.out.println(l1);
	
	System.out.println("..........poll,pollfirst and polllast");//removes an elements 
	System.out.println(l1.poll());
	System.out.println(l1.pollFirst());
	System.out.println(l1.pollLast());
	System.out.println(l1);
	System.out.println(".........offer,offerFirst,offerLast");//adding an elements 
	l1.offer(89);
	System.out.println(l1);
	l1.offerFirst(34);
	System.out.println(l1);
	l1.offerLast(60);
	System.out.println(l1);
	
	
	}
	

}
