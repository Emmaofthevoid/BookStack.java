package UE4_BookingQueue;

public class Booking {
    // *** Membervariablen ***
    private String bookingText;
    private double amount;


    // *** Konstruktor ***

    public Booking(String bookingText, double amount) {
        this.bookingText = bookingText;
        this.amount = amount;

    }

    // *** Getter-Methoden ***

    public String getBookingText() {
        // TODO: Implementierung vervollständingen
        return bookingText;
    }

    public double getAmount() {
        // Implementierung offen
        return amount;
    }
}
