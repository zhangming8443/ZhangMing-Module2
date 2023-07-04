package case_study.repository.interface_repository;

import case_study.model.booking.Booking;

import java.util.List;

public interface IBookingRepository extends IGeneralRepository<Booking> {
    @Override
    default void addNew(Booking booking) {

    }
    @Override
    default List display() {
        return null;
    }
}
