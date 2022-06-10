package UE4_BookingQueue;

public class BookingQueue {
    // *** Membervariablen ***
    private Node front;
    private Node rear;

    // *** Getter- und Setter-Methoden ***

    public Node getFront() {

        return front;
    }


    // *** Operationen ***

    public void enqueue(Booking newBooking) {
        Node newNode = new Node(newBooking);

        //if queue is empty
        if (front == null) {
            front = newNode;
            rear = newNode;

        }
        //if queue is NOT empty
        else {
            rear.setNext(newNode);
            rear = newNode;
        }

    }

    public Booking dequeue() throws QueueEmptyException {
        //fall = leer
        if (front == null) {
            throw new QueueEmptyException();
        }

        //fall = queue besteht aus einem Knoten

        else if (front == rear) {
            Booking returnBooking = front.getBooking();
            front = null;
            rear = null;

            return returnBooking;
        }
        //fall = queue hat mehrere elemente
        else {
            Booking returnBooking = front.getBooking();
            front = front.getNext(); //zweiten Knoten wird zum ersten Knoten
            return returnBooking;

        }

    }

    public int getCount() {
       int counter = 0;
       Node currentNode = front;
       while (currentNode != null) {
           counter++;
           currentNode = currentNode.getNext();
       }
        return counter;
    }
}
