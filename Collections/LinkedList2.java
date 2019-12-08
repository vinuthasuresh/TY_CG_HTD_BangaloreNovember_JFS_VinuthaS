import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList l1= new LinkedList();
		
		l1.add(45);
		l1.add(56);
		l1.add(67);
		l1.add(34);
		System.out.println("............add first and add last....................");
		
		l1.addFirst(2);
		System.out.println(l1);
		System.out.println();
		l1.addLast(9);
		System.out.println(l1);
		System.out.println();
		
		System.out.println("...........get first and getLast.....................");
		
	    System.out.println(l1.getFirst());
	    
	    l1.getLast();
	    System.out.println(l1.getLast());
	    
	    System.out.println("...........remove().....................");
	    l1.remove();
	    System.out.println(l1);
	    System.out.println("..........remove first and remove last......................");
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		
        LinkedList l2= new LinkedList();
		
		l2.add(19);
		l2.add(23);
		l2.add(34);
		l2.add(45);
		l2.add(19);
		  System.out.println("...........removeFirstOccurace() and lastOccurance.....................");
		  System.out.println(l2);
		  l2.removeFirstOccurrence(19);
		  System.out.println(l2);
		  l2.removeLastOccurrence(19);
		  System.out.println(l2);
		  
		
		
		
		
	}

}
