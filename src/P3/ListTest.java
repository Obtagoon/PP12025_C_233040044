package P3;

public class ListTest {
	    public static void main(String[] args) {
	        StrukturList list = new StrukturList();

	        System.out.println("Apakah list kosong? " + list.isEmpty()); 
	        // Harusnya false karena HEAD null //

	        list.addTail(3);
	        list.addTail(4);
	        list.addTail(5);

	        list.display(); // Output: 3 -> 4 -> 5 -> null
	    }
	}

