package P4;

public class Node {
    private double data;
    public Node next;

    // Inisialisasi Node
    public Node(double data) {
        this.data = data;
        this.next = null;
    }

    // Setter dan Getter untuk data
    public void setData(double data) {
        this.data = data;
    }

    public double getData() {
        return data;
    }

    // Setter dan Getter untuk next
    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
