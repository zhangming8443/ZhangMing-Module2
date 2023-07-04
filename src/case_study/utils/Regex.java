package case_study.utils;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    private static final String NAME_REGEX = "^([A-Z][a-z]+\\s){0,5}[A-Z][a-z]*$";
    //use trim set space
    private static final String DATE_REGEX = "^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$";
    private static final String EMPLOYEE_CODE_REGEX = "^NV-\\d{4}$";
    private static final String CUSTOMER_CODE_REGEX = "^KH-\\d{4}$";
    private static final String IDENTITY_CARD_REGEX = "^(\\d{9}|\\d{12})$";
    private static final String PHONE_NUMBER_REGEX = "^0\\d{9}$";
    private static final String EMAIL_REGEX = "^[a-z]\\w{2,}@[a-z]{3,10}\\.[a-z]{2,5}$";
    private static final String FACILITY_VILLA_REGEX = "^SV(VL)-\\d{4}$";
    private static final String FACILITY_HOUSE_REGEX = "^SV(HO)-\\d{4}$";
    private static final String FACILITY_ROOM_REGEX = "^SV(RO)-\\d{4}$";

    public static boolean regexName(String name) {
        return name.matches(NAME_REGEX);
    }

    public static String checkName() {
        String name = null;
        do {
            try {
                System.out.println("Enter the employee name: ");
                name = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter the correct format !");
            }
        } while (!Regex.regexName(name));
        return name;
    }

    public static boolean regexEmployeeCode(String employeeCode) {
        return employeeCode.matches(EMPLOYEE_CODE_REGEX);
    }

    public static String checkEmployeeCode() {
        String employeeCode = null;
        do {
            try {
                System.out.println("Enter the employee code: ");
                employeeCode = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter the correct format !");
            }
        } while (!Regex.regexEmployeeCode(employeeCode));
        return employeeCode;
    }

    public static boolean regexDate(String date) {
        return date.matches(DATE_REGEX);
    }

    public static String checkDate() {
        String date = null;
        do {
            try {
                System.out.println("Enter the employee date: ");
                date = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter the correct format !");
            }
        } while (!Regex.regexDate(date));
        return date;
    }

    public static boolean regexCustomerCode(String customerCode) {
        return customerCode.matches(CUSTOMER_CODE_REGEX);
    }

    public static String checkCustomerCode() {
        String customerCode = null;
        do {
            try {
                System.out.println("Enter the customer code: ");
                customerCode = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter the correct format !");
            }
        } while (!Regex.regexCustomerCode(customerCode));
        return customerCode;
    }

    public static boolean regexIdentityCard(String identityCard) {
        return identityCard.matches(IDENTITY_CARD_REGEX);
    }

    public static String checkIdentityCard() {
        String identityCard = null;
        do {
            try {
                System.out.println("Enter the employee identity card: ");
                identityCard = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter the correct format !");
            }
        } while (!Regex.regexIdentityCard(identityCard));
        return identityCard;
    }

    public static boolean regexPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(PHONE_NUMBER_REGEX);
    }

    public static String checkPhoneNumber() {
        String phoneNumber = null;
        do {
            try {
                System.out.println("Enter the employee phone number: ");
                phoneNumber = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter the correct format !");
            }
        } while (!Regex.regexPhoneNumber(phoneNumber));
        return phoneNumber;
    }

    public static boolean regexEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }

    public static String checkEmail() {
        String email = null;
        do {
            try {
                System.out.println("Enter the employee email: ");
                email = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter the correct format !");
            }
        } while (!Regex.regexEmail(email));
        return email;
    }

    public static String choiceDegree() {
        String degree = null;
        boolean flag = true;
        do {
            System.out.println("Choice employee degree: "
                    + "\n1. Intermediate"
                    + "\n2. College"
                    + "\n3. University"
                    + "\n4. Postgraduate");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    return degree = "Intermediate";
                case "2":
                    return degree = "College";
                case "3":
                    return degree = "University";
                case "4":
                    return degree = "Postgraduate";
            }
        } while (flag);
        return degree;
    }

    public static String choiceDuty() {
        String duty = null;
        boolean flag = true;
        do {
            System.out.println("Choice employee duty: "
                    + "\n1. Reception"
                    + "\n2. Expert"
                    + "\n3. Serve"
                    + "\n4. Supervise"
                    + "\n5. Manager"
                    + "\n6. Director");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    return duty = "Reception";
                case "2":
                    return duty = "Expert";
                case "3":
                    return duty = "Serve";
                case "4":
                    return duty = "Supervise";
                case "5":
                    return duty = "Manager";
                case "6":
                    return duty = "Director";
            }
        } while (flag);
        return duty;
    }

    public static int checkSalary() {
        int salary = -1;
        do {
            try {
                System.out.println("Enter the employee salary: ");
                salary = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter the number. Please !");
            }

        } while (salary < 0);
        return salary;
    }

    public static String choiceGuestType() {
        String guestType = null;
        boolean flag = true;
        do {
            System.out.println("Choice guest type: "
                    + "\n1. Diamond"
                    + "\n2. Platinum"
                    + "\n3. Gold"
                    + "\n4. Silver"
                    + "\n5. Member");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    return guestType = "Diamond";
                case "2":
                    return guestType = "Platinum";
                case "3":
                    return guestType = "Gold";
                case "4":
                    return guestType = "PostgrSilveraduate";
                case "5":
                    return guestType = "Member";
            }
        } while (flag);
        return guestType;

    }

    public static boolean regexVillaFacility(String villa) {
        return villa.matches(FACILITY_VILLA_REGEX);
    }

    public static String checkVillaFacility() {
        String serviceCode = null;
        do {
            try {
                System.out.println("Enter the service code: ");
                serviceCode = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter the correct format !");
            }
        } while (!Regex.regexVillaFacility(serviceCode));
        return serviceCode;
    }

    public static boolean regexHouseFacility(String house) {
        return house.matches(FACILITY_HOUSE_REGEX);
    }

    public static String checkHouseFacility() {
        String serviceCode = null;
        do {
            try {
                System.out.println("Enter the service code: ");
                serviceCode = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter the correct format !");
            }

        } while (!Regex.regexHouseFacility(serviceCode));
        return serviceCode;
    }

    public static boolean regexRoomFacility(String room) {
        return room.matches(FACILITY_ROOM_REGEX);
    }

    public static String checkRoomFacility() {
        String serviceCode = null;
        do {
            try {
                System.out.println("Enter the service code: ");
                serviceCode = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter the correct format !");
            }
        } while (!Regex.regexRoomFacility(serviceCode));
        return serviceCode;
    }

    public static String choiceServiceFree() {
        String serviceFree = null;
        boolean flag = true;
        do {
            System.out.println("Choice service free: "
                    + "\n1. Breakfast"
                    + "\n2. Swimming pool"
                    + "\n3. Private bathroom"
                    + "\n4. Dinner");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    return serviceFree = "Breakfast";
                case "2":
                    return serviceFree = "Swimming pool";
                case "3":
                    return serviceFree = "Private bathroom";
                case "4":
                    return serviceFree = "Dinner";
            }
        } while (flag);
        return serviceFree;
    }

    public static String choiceRentalType() {
        String rentalType = null;
        boolean flag = true;
        do {
            System.out.println("Choice rental type: "
                    + "\n1. Hours"
                    + "\n2. Day"
                    + "\n3. Month"
                    + "\n4. Year");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Enter the hours to rental (1-5 hours)");
                    rentalType = scanner.nextLine() + "  Hours";
                    return rentalType;
                case "2":
                    System.out.println("Enter the day to rental (1-29 days)");
                    rentalType = scanner.nextLine() + "  Days";
                    return rentalType;

                case "3":
                    System.out.println("Enter the month to rental");
                    rentalType = scanner.nextLine() + "  Months";
                    return rentalType;
                case "4":
                    System.out.println("Enter the year to rental");
                    rentalType = scanner.nextLine() + "  Years";
                    return rentalType;
            }
        } while (flag);
        return rentalType;

    }

    public static double checkArea() {
        int area = -1;
        do {
            try {
                System.out.println("Enter the area: ");
                area = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter the number. Please !");
            }
        } while (area < 30);
        return area;
    }

    public static int checkRentalCost() {
        int rentalCost = -1;
        do {
            try {
                System.out.println("Enter the rental cost: ");
                rentalCost = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter the number. Please !");
            }
        } while (rentalCost < 0);
        return rentalCost;
    }

    public static int checkMaximumPeople() {
        int max = -1;
        do {
            try {
                System.out.println("Enter the maximum of people: ");
                max = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter the number. Please !");
            }
        } while (!(max > 0 && max < 20));
        return max;
    }
}
