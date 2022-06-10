package UE3_BookStack;

public class Node {
    // *** Membervariablen ***
    private final String bookTitle;
    private Node nextNode;


    // TODO

    // *** Konstruktor ***

    public Node(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
// *** Getter- und Setter-Methoden ***

    public String getBookTitle() {

        return bookTitle;
    }
}
