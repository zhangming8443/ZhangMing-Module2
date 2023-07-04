package case_study.repository;

import case_study.model.Customer;

import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    @Override
    public List display() {
        return ICustomerRepository.super.display();
    }

    @Override
    public void addNew(Customer customer) {
        ICustomerRepository.super.addNew(customer);
    }

    @Override
    public void edit(Customer customer) {
        ICustomerRepository.super.edit(customer);
    }
}
