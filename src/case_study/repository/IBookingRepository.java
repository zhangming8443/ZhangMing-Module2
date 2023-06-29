package case_study.repository;

import case_study.model.Booking;
import case_study.model.Contract;

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
