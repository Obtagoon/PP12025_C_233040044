package P3;

 class StrukturList {
    private Node HEAD;

   

    // Fungsi isEmpty() yang sesuai dengan instruksi: mengembalikan true jika HEAD tidak null
    public boolean isEmpty() {
        return HEAD != null; // Jika HEAD ada (list tidak kosong), return true
    }

    // Fungsi untuk menambahkan elemen di akhir list (addTail)
    public void addTail(int data) {
        Node posNode = null, curNode = null;
        Node newNode = new Node(data);

        if (!isEmpty()) { // Perubahan dari isEmpty() agar sesuai dengan kondisi
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext ( newNode);
        }
    }

    // Fungsi untuk menampilkan isi list
    public void display() {
        if (!isEmpty()) { // Perubahan di sini agar sesuai dengan definisi baru
            System.out.println("List kosong");
            return;
        }
        Node temp = HEAD;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }
    public void addHead (int data) {
    	Node newNode = new Node (data);
    	if (isEmpty()) {
    		HEAD = newNode ;
    	}
    	else {
    		newNode.setNext(HEAD);
    		HEAD = newNode; 
    	}
    }
} 
 
