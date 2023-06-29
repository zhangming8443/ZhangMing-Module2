package case_study.repository;

import case_study.model.Customer;

import java.util.List;

public interface ICustomerRepository extends IGeneralRepository<Customer>{
    @Override
    default List display() {
        return null;
    }

    @Override
    default void addNew(Customer customer) {

    }

    default void edit(Customer customer) {

    }
}
