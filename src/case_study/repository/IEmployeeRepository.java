package case_study.repository;

import case_study.model.Customer;
import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository extends IGeneralRepository<Employee> {

    @Override
    default List<Employee> display() {
        return null;
    }

    @Override
    default void addNew(Employee employee) {

    }

    default void edit(String employeeCode, Employee employee) {

    }

    Employee getByEmployeeCode(String employeeCode);
}
