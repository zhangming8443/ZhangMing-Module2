package case_study.repository;

import case_study.model.Booking;

import java.util.List;

public class BookingRepository implements IBookingRepository {
    @Override
    public void addNew(Booking booking) {
        IBookingRepository.super.addNew(booking);
    }

    @Override
    public List display() {
        return IBookingRepository.super.display();
    }
}
