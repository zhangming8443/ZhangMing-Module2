package case_study.service;

public interface ICustomerService extends IGeneralService {
    @Override
    default void display() {

    }

    @Override
    default void add() {

    }
     void editCustomer();
}
