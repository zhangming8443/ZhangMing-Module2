package case_study.repository.interface_repository;

import case_study.model.person.Customer;

import java.util.List;

public interface ICustomerRepository extends IGeneralRepository<Customer> {
    @Override
    default List display() {
        return null;
    }

    @Override
    default void addNew(Customer customer) {

    }

    default void edit(String customerCode, Customer customer) {
    }

    Customer getByCustomerCode(String customerCode);

    int checkCustomerCodeExist(String customerCode);

}
