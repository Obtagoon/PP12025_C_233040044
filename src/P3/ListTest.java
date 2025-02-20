package P3;

public class ListTest {
	    public static void main(String[] args) {
	        StrukturList list = new StrukturList();

	        System.out.println("Apakah list kosong? " + list.isEmpty()); 
	        // Harusnya false karena HEAD null

	        list.addTail(10);
	        list.addTail(20);
	        list.addTail(30);

	        list.display(); // Output: 10 -> 20 -> 30 -> null
	    }
	}

