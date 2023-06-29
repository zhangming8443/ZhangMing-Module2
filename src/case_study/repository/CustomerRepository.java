package case_study.repository;

import case_study.model.Customer;
import case_study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String PATH_CUSTOMER = "src/case_study/data/customer.csv";
    private List<Customer> customerList = new ArrayList<>();

    @Override
    public List<Customer> display() {
        List<String> stringList = ReadAndWriteFile.readToFile(PATH_CUSTOMER);
        customerList.clear();
        String[] property;
        for (String str : stringList) {
            property = str.split(",");
            customerList.add(new Customer(property[0], property[1], property[2], property[3], property[4], property[5], property[6], property[7]));
        }
        return customerList;
    }

    @Override
    public void addNew(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.toFileCSV());
        ReadAndWriteFile.writeToFile(PATH_CUSTOMER, stringList, true);
    }

    @Override
    public void edit(String customerCode, Customer customer) {
        List<String> stringList = new ArrayList<>();
        customerList = display();
        for (Customer c : customerList) {
            if (c.getCustomerCode().equals(customerCode)) {
                c = customer;
            }
            stringList.add(c.toFileCSV());
        }
        ReadAndWriteFile.writeToFile(PATH_CUSTOMER, stringList, false);
    }

    @Override
    public Customer getByCustomerCode(String customerCode) {
        customerList = display();
        for (Customer customer : customerList) {
            if (customer.getCustomerCode().equals(customerCode)) {
                return customer;
            }
        }
        return null;
    }
}
