package case_study.service;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.repository.CustomerRepository;
import case_study.repository.ICustomerRepository;
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
        String customerCode;
        do {
            System.out.println("Enter the customer code: ");
            customerCode = scanner.nextLine();
        } while (!Regex.regexCustomerCode(customerCode));

        String name;
        do {
            System.out.println("Enter the customer name: ");
            name = scanner.nextLine();
        } while (!Regex.regexName(name));

        String date;
        do {
            System.out.println("Enter the customer date: ");
            date = scanner.nextLine();
        } while (!Regex.regexDate(date));

        String identityCard;
        do {
            System.out.println("Enter the customer identity card: ");
            identityCard = scanner.nextLine();
        } while (!Regex.regexIdentityCard(identityCard));

        String phoneNumber;
        do {
            System.out.println("Enter the customer phone number: ");
            phoneNumber = scanner.nextLine();
        } while (!Regex.regexPhoneNumber(phoneNumber));

        String email;
        do {
            System.out.println("Enter the customer email: ");
            email = scanner.nextLine();
        } while (!Regex.regexEmail(email));

        String guestType;
        do {
            System.out.println("Enter the guest type: ");
            guestType = scanner.nextLine();
        } while (!Regex.regexGuestType(guestType));

        String address;
        do {
            System.out.println("Enter the customer address: ");
            address = scanner.nextLine();
        } while (!Regex.regexAddress(address));

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
            String name;
            do {
                System.out.println("Enter the customer name to edit: ");
                name = scanner.nextLine();
            } while (!Regex.regexName(name));

            String date;
            do {
                System.out.println("Enter the customer date to edit: ");
                date = scanner.nextLine();
            } while (!Regex.regexDate(date));

            String identityCard;
            do {
                System.out.println("Enter the customer identity card to edit: ");
                identityCard = scanner.nextLine();
            } while (!Regex.regexIdentityCard(identityCard));

            String phoneNumber;
            do {
                System.out.println("Enter the customer phone number to edit: ");
                phoneNumber = scanner.nextLine();
            } while (!Regex.regexPhoneNumber(phoneNumber));

            String email;
            do {
                System.out.println("Enter the customer email to edit: ");
                email = scanner.nextLine();
            } while (!Regex.regexEmail(email));

            String guestType;
            do {
                System.out.println("Enter the guest type to edit: ");
                guestType = scanner.nextLine();
            } while (!Regex.regexGuestType(guestType));

            String address;
            do {
                System.out.println("Enter the customer address to edit: ");
                address = scanner.nextLine();
            } while (!Regex.regexAddress(address));

            Customer customerEdit = new Customer(customerCode, name, date, identityCard, phoneNumber, email, guestType, address);
            customerRepository.edit(customerCode, customerEdit);
            System.out.println("COMPLETE EDIT EMPLOYEE CODE " + customerCode);
        }
    }
}
