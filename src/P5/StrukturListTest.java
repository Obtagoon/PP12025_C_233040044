package P5;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Pengujian untuk Latihan 2
        list.addHead(2);
        list.addHead(9);
        list.addHead(7);
        System.out.println("Sebelum penghapusan elemen awal list:");
        list.displayElement(); // Output: 7 9 2
        list.removeHead();
        System.out.println("Setelah penghapusan elemen awal list:");
        list.displayElement(); // Output: 9 2
        
        System.out.println();
        
        list = new StrukturList(); // Reset list
        // Pengujian hapus elemen list di awal list sebanyak 3x
        list.addHead(2);
        list.addHead(9);
        list.addHead(7);
        System.out.println("Sebelum penghapusan 3x elemen awal list:");
        list.displayElement(); // Output: 7 9 2
        list.removeHead();
        list.removeHead();
        list.removeHead();
        System.out.println("Setelah penghapusan 3x elemen awal list:");
        list.displayElement(); // Output: 
        
        System.out.println();
        
        list = new StrukturList();
        // Pengujian Latihan 4
        list.addHead(1);
        list.addHead(5);
        list.addHead(3);
        list.addHead(6);
        list.addHead(2);
        System.out.println("Tampilan list saat ini:");
        list.displayElement();
        list.removeTail();
        System.out.println("Tampilan list saat ini:");
        list.displayElement();
        list.removeHead();
        System.out.println("Tampilan list saat ini:");
        list.displayElement();
        // Instruksi tambahan agar output list menjadi 6 3
        list.removeTail();
        System.out.println("Tampilan list saat ini:");
        list.displayElement();
    }
}
