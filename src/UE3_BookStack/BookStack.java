package UE3_BookStack;

public class BookStack {
    // *** Membervariablen ***
    private Node top;


    // *** Getter- und Setter-Methoden ***

    public Node getTop() {
        // TODO: Implementierung
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }
// *** Operationen ***

    public void push(String bookTitle) {
        Node newNode = new Node(bookTitle);

        newNode.setNextNode(top);
        top = newNode;


    }

    public String pop() throws StackEmptyException {
        //fall 1 = stack ist leer
        if (top == null) {
            throw new StackEmptyException();

        } else {
            String returnString = top.getBookTitle(); //zwischenspeichern Wert
            top = top.getNextNode();
            return returnString;
        }

    }

    public int getCount() {
        // TODO: Implementierung
        return 0;
    }
}
