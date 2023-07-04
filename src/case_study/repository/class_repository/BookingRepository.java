package case_study.repository.class_repository;

import case_study.model.booking.Booking;
import case_study.repository.interface_repository.IBookingRepository;

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
