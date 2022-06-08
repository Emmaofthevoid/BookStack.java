package UE1_TodoLinkedList;

public class Node {
    // *** Membervariablen ***
    private String toDoText; //text = wert
    private Node next;  // referenz zum nachfolger

    public String getToDoText() {
        return toDoText;
    }

    public void setToDoText(String toDoText) {
        this.toDoText = toDoText;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
