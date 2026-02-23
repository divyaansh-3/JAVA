class SeatNotAvailableException extends Exception {
    public SeatNotAvailableException(String message) {
        super(message);
    }
}

class Movie {
    String movieName;
    int availableSeats;

    Movie(String movieName, int availableSeats) {
        this.movieName = movieName;
        this.availableSeats = availableSeats;
    }

    void bookTicket(int seats) throws SeatNotAvailableException {
        if (seats <= 0) {
            System.out.println("Invalid number of seats.");
            return;
        }

        if (seats > availableSeats) {
            throw new SeatNotAvailableException(
                "Only " + availableSeats + " seats available for " + movieName
            );
        }

        availableSeats -= seats;
        System.out.println(seats + " seat(s) booked successfully for " + movieName);
        System.out.println("Remaining seats: " + availableSeats);
    }
}

public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("Avengers", 5);

        try {
            m1.bookTicket(2);
            m1.bookTicket(3);
            m1.bookTicket(1);
        }
        catch (SeatNotAvailableException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}
