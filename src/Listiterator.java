import java.util.LinkedList;
import java.util.ListIterator;

public class Listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add(50);
		l1.add("ineuron");
		//System.out.println(l1);
		l1.addFirst("Hello");
		l1.add(3,99);
		l1.addLast("Bangalore");
		//System.out.println(l1);
		ListIterator litr1=l1.listIterator(l1.size());
		//while(litr1.hasNext()) {
		//	System.out.println(litr1.next());
		//}
		System.out.println("Reverse order:");
		while(litr1.hasPrevious()) {
			System.out.println(litr1.previous());
		}
	}

}
