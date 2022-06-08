package UE1_TodoLinkedList;

public class TodoLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;


    // *** Get-Methoden (Set-Methoden nicht notwendig) ***

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }


    // *** Operationen ***

    public void appendTodoText(String todoText) {
        // neuen Node schaffen
        Node newNode = new Node();
        newNode.setToDoText(todoText);

        //Fall 1 = Liste leer
        if (first == null) {
            first = newNode;
            last = newNode;
        }

        //Fall 2 = Ein Element in der Liste (oder mehrere, the code doesnt change)
        else {
            //to make the connection with the current last to the new Node
            last.setNext(newNode);
            //to actually set the new node as the last node of the list
            last = newNode;
        }


    }

    public void deleteLastTodoText() {
        // Fall 1 = Liste ist leer
        if (first == null) {
            return; // keine aktion notwendig
        }

        //Fall 2 = Liste besteht aus ein element

        else if (first == last) {
            first = null;
            last = null;
        }

        //Fall 3 = "Normal" (mehrere Knoten
        else {
            Node prevNode = first;

            while ( prevNode.getNext() != last) {
                prevNode = prevNode.getNext();

            }
            prevNode.setNext(null);
            last = prevNode;
        }

    }

    public String getTodoTextAtIndex(int index) {
        // TODO: Implementierung vervollständigen
        return null;
    }
}
