package case_study.service;

public interface IEmployeeService extends IGeneralService {
    @Override
    default void display() {

    }

    @Override
    default void add() {

    }
    void editEmployee();
}
