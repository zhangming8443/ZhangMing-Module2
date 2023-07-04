package case_study.service.interface_service;

public interface IEmployeeService extends IGeneralService {
    @Override
    default void display() {

    }

    @Override
    default void add() {

    }

    void editEmployee();


}
