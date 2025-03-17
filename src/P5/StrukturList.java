package P5;

public class StrukturList {
    private Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(double data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    public void addMid(double data, int position) {
        if (position <= 1 || isEmpty()) {
            addHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node curNode = HEAD;
        int i = 1;

        while (curNode.getNext() != null && i < position - 1) {
            curNode = curNode.getNext();
            i++;
        }

        newNode.setNext(curNode.getNext());
        curNode.setNext(newNode);
    }

    public void addTail(double data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode;
            return;
        }

        Node curNode = HEAD;
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
        }

        curNode.setNext(newNode);
    }

    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List Kosong!");
            return;
        }

        HEAD = HEAD.getNext(); // Tidak perlu dispose, biarkan garbage collector bekerja
    }

    public void removeTail() {
        if (isEmpty()) {
            System.out.println("List Kosong!");
            return;
        }

        if (HEAD.getNext() == null) { // Jika hanya ada satu elemen
            HEAD = null;
            return;
        }

        Node lastNode = HEAD;
        Node preNode = null;

        while (lastNode.getNext() != null) {
            preNode = lastNode;
            lastNode = lastNode.getNext();
        }

        if (preNode != null) {
            preNode.setNext(null);
        }
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong!");
            return;
        }

        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
}
