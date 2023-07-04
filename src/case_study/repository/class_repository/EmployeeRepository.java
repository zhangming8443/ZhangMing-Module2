package case_study.repository.class_repository;

import case_study.model.person.Employee;
import case_study.repository.interface_repository.IEmployeeRepository;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    private final String PATH_EMPLOYEE = "src/case_study/data/employee.csv";
    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public List<Employee> display() {
        List<String> stringList = ReadAndWriteFile.readToFile(PATH_EMPLOYEE);
        employeeList.clear();
        String[] property;
        for (String str : stringList) {
            property = str.split(",");
            employeeList.add(new Employee(property[0], property[1], property[2], property[3], property[4], property[5], property[6], property[7], Integer.parseInt(property[8])));
        }
        return employeeList;
    }

    @Override
    public void addNew(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.toFileCSV());
        ReadAndWriteFile.writeToFile(PATH_EMPLOYEE, stringList, true);
    }

    @Override
    public void edit(String employeeCode, Employee employee) {
        List<String> stringList = new ArrayList<>();
        employeeList = display();
        for (Employee e : employeeList) {
            if (e.getEmployeeCode().equals(employeeCode)) {
                e = employee;
            }
            stringList.add(e.toFileCSV());
        }
        ReadAndWriteFile.writeToFile(PATH_EMPLOYEE, stringList, false);
    }

    @Override
    public Employee getByEmployeeCode(String employeeCode) {
        employeeList = display();
        for (Employee employee : employeeList) {
            if (employee.getEmployeeCode().equals(employeeCode)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public int checkEmployeeCodeExist(String employeeCode) {
        List<Employee> employees = display();
        for (Employee employee : employees) {
            if (employee.getEmployeeCode().equals(employeeCode)) {
                return 1;
            }
        }
        return -1;
    }
}
