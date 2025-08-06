package Java.Training.MeetingRoom.src;

import java.time.LocalDate;
import java.util.HashSet;

public class MeetingRoom {
    int id;
    String name;
    int createdBy;
    boolean active = true;
    HashSet<LocalDate> bookingDates = new HashSet<>();
    HashSet<Booking> bookings = new HashSet<>();

    MeetingRoom(int id, int adminId, String name) {
        this.id = id;
        this.createdBy = adminId;
        this.name = name;
    }

    String bookMeetingRoom(int employeeId, LocalDate bookingDate) {
        if (!active || bookingDates.contains(bookingDate)) {
            return "Booking failed for meeting room ID: " + this.id;
        } else {
            this.bookingDates.add(bookingDate);
            Booking newBooking = new Booking(bookingDate, employeeId);
            bookings.add(newBooking);
            return "Booking successful for meeting room ID: " + this.id;
        }
    }

    String activateMeetingRoom() {
        this.active = true;
        return "Activated meeting room ID: " + this.id;
    }

    String deactivateMeetingRoom() {
        this.active = false;
        return "Deactivated meeting room ID: " + this.id;
    }

    HashSet<Booking> displayBookings() {
        return bookings;
    }
}
