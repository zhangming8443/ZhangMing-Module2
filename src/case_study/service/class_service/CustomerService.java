package case_study.service.class_service;

import case_study.model.person.Customer;
import case_study.repository.class_repository.CustomerRepository;
import case_study.repository.interface_repository.ICustomerRepository;
import case_study.service.interface_service.ICustomerService;
import case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private final Scanner scanner = new Scanner(System.in);
    private final ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void display() {
        List<Customer> customerList = customerRepository.display();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        int index;
        String customerCode;
        do {
            customerCode = Regex.checkCustomerCode();
            index = customerRepository.checkCustomerCodeExist(customerCode);
            if (index == 1) {
                System.out.println("Customer code is exist !");
            }
        }
        while (index == 1);
        String name = Regex.checkName();
        String date = Regex.checkDate();
        String identityCard = Regex.checkIdentityCard();
        String phoneNumber = Regex.checkPhoneNumber();
        String email = Regex.checkEmail();
        String guestType = Regex.choiceGuestType();
        System.out.println("Enter the customer address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(customerCode, name, date, identityCard, phoneNumber, email, guestType, address);
        customerRepository.addNew(customer);
        System.out.println("COMPLETE ADD NEW CUSTOMER !");
    }

    @Override
    public void editCustomer() {
        System.out.println("Enter the customer code to edit customer: ");
        String customerCode = scanner.nextLine();
        Customer customer = customerRepository.getByCustomerCode(customerCode);
        if (customer == null) {
            System.out.println("NOT FOUND CUSTOMER CODE !");
        } else {
            String name = Regex.checkName();
            String date = Regex.checkDate();
            String identityCard = Regex.checkIdentityCard();
            String phoneNumber = Regex.checkPhoneNumber();
            String email = Regex.checkEmail();
            String guestType = Regex.choiceGuestType();
            System.out.println("Enter the customer address: ");
            String address = scanner.nextLine();
            Customer customerEdit = new Customer(customerCode, name, date, identityCard, phoneNumber, email, guestType, address);
            customerRepository.edit(customerCode, customerEdit);
            System.out.println("COMPLETE EDIT EMPLOYEE CODE " + customerCode);
        }
    }
}
