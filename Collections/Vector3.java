import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		Vector v1= new Vector();
		
		v1.addElement(24);
		v1.addElement(56);
		v1.addElement(78);
		v1.add(76);
		System.out.println(v1);
		v1.removeElement(new Integer(24));
		System.out.println(v1);
		v1.removeElementAt(1);
		System.out.println(v1);
		v1.add(67);
		v1.add(45);
		Object[] o1= new Object[v1.size()];
		v1.copyInto(o1);//converting vector into array
		
		for(int i=0;i<o1.length;i++)
		{
			System.out.println(o1[i]);
		}
		v1.removeAllElements();
		System.out.println(v1);
		
     Vector v2= new Vector();
		
		v2.addElement(34);
		v2.addElement(56);
		System.out.println("-------------------------------------");
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.trimToSize();
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.ensureCapacity(6);
		v2.setSize(8);
		System.out.println(v2.size());
		System.out.println(v2.capacity());//if size is more than capacity then capacity doubles
		System.out.println(v2);
	}
	

}
