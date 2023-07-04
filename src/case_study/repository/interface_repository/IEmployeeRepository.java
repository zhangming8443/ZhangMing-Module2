package case_study.repository.interface_repository;

import case_study.model.person.Employee;

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

    int checkEmployeeCodeExist(String employeeCode);
}
