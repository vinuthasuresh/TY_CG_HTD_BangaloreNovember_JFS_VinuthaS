import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String[] args) {
		LinkedList l1= new LinkedList();
		
		l1.add(10);
		l1.add(12);
		l1.add(80);
		l1.add(56);
		System.out.println("........push and pop............");
	    l1.push(68);// adds element in 0th index
		System.out.println(l1);
		l1.pop();//removes element in 0th index
		System.out.println(l1);
		
		System.out.println(".......element.........");
	    System.out.println(l1.element());	
     	System.out.println(l1);
		}
}
