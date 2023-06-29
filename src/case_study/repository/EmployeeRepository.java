package case_study.repository;

import case_study.model.Employee;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    private static final String PATH_EMPLOYEE = "src/case_study/data/employee.csv";
    private static List<Employee> employeeList = new ArrayList<>();

    @Override
    public List<Employee> display() {
        List<String> stringList = new ArrayList<>();
        stringList = ReadAndWriteFile.readToFile(PATH_EMPLOYEE);
        employeeList.clear();
        String[] info;
        for (String str : stringList) {
            info = str.split(",");
            employeeList.add(new Employee(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], Integer.parseInt(info[8])));
        }
        return employeeList;
    }

    @Override
    public void addNew(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.toInfoCSV());
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
            stringList.add(e.toInfoCSV());
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
}
