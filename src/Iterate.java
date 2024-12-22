import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
public class Iterate {

	public static void main(String[] args) {
		ArrayList a11=new ArrayList();
		a11.add("Hello");
		a11.add(20);
		a11.add(true);
		a11.add(10.9);
		Iterator itr1=a11.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		

	}

}
