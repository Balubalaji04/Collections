import java.util.Hashtable;

public class Hashtable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht=new Hashtable();
		ht.put(11,"Vamsi");
		ht.put(12,"Ganesh");
		ht.put(13, "Balaji");
		System.out.println(ht);
		for(Object obj:ht.entrySet()) {
			System.out.println(obj);
		}
	}

}
