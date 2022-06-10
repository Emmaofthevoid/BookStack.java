package UE2_WagonLinkedList;

public class WagonLinkedList {
  private   Node first;
   private Node last;

    // *** Methoden ***

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    void insertWagonAtFirstPos(String wagonId) {

        Node newNode = new Node();
        newNode.setWagonId(wagonId);
        // fall: liste ist noch leer
        if(first==null){
            first = newNode;
            last = newNode;
        }

        // Fall : liste ist befüllt
        else {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }
//        Node newNode = new Node();
//        newNode.getWagonId() = wagonId;
//        newNode.getNext() = first;
//        first.getPrev() = newNode;
//       first = first.getPrev(); // oder newNode = first;


    }

    void removeWagonFromLastPos() {
        //fall 1 = liste ist leer
        if (first == null) {
            return;
        }
        //fall 2 = nur ein element
      else if (first == last) {
            first = null;
            last = null;
        }


        //fall 3 = mehrere elemente
        else {
            //ohne hilfsvariable
            last.getPrev().setNext(null);
            last = last.getPrev();
            //mit hilfsvariable
            Node helpNode = last.getPrev();
            helpNode.setNext(null);
            last = helpNode;
        }

//        Node helpNode = first;
//
//        while (helpNode.getNext() != null) {
//            helpNode = helpNode.getNext();
//        }
//        helpNode = helpNode.getPrev();
       // helpNode.getNext() = null;
    }

    void printList() {
        System.out.print("* List: ");

        if (this.getFirst() == null) {
            System.out.print("<empty>");
        } else {
            Node currentNode = this.getFirst();
            while (currentNode != null) {
                System.out.print(currentNode.getWagonId() + ", ");
                currentNode = currentNode.getNext();
            }
        }

        System.out.println();
    }
}
