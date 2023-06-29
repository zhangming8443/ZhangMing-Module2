package case_study.utils;

public class Regex {
    private static final String NAME_REGEX = "^([A-Z][a-z]+\\s){1,5}[A-Z][a-z]*$";
    private static final String DATE_REGEX = "^([0]?[1-9]|[1|2][0-9]|[3][0|1])[./-]([0]?[1-9]|[1][0-2])[./-]([0-9]{4}|[0-9]{2})$";
    private static final String EMPLOYEE_CODE_REGEX = "^NV-\\d{4}$";
    private static final String CUSTOMER_CODE_REGEX = "^KH-\\d{4}$";
    private static final String IDENTITY_CARD_REGEX = "^\\d{9,12}$";
    private static final String PHONE_NUMBER_REGEX = "^0\\d{9}$";
    private static final String EMAIL_REGEX = "^[a-z]\\w{5,}@[a-z]{3,5}\\.[a-z]{2,5}$";
    private static final String DEGREE_REGEX = "^(Trung\\sCap|Cao\\sDang|Dai\\sHoc|Sau\\sDai\\sHoc)$";
    private static final String DUTY_REGEX = "^(Le\\sTan|Phuc\\sVu|Chuyen\\sVien|Giam\\sSat|Quan\\sLy|Giam\\sDoc)$";
    private static final String ADDRESS_REGEX = "^\\d{1,4}\\s([A-Z][a-z]+\\s){1,5}[A-Z][a-z]*$";
    private static final String GUEST_TYPE_REGEX = "^(Diamond|Platinum|Gold|Silver|Member)$";

    public static boolean regexName(String name) {
        return name.matches(NAME_REGEX);
    }

    public static boolean regexDate(String date) {
        return date.matches(DATE_REGEX);
    }

    public static boolean regexEmployeeCode(String employeeCode) {
        return employeeCode.matches(EMPLOYEE_CODE_REGEX);
    }

    public static boolean regexCustomerCode(String customerCode) {
        return customerCode.matches(CUSTOMER_CODE_REGEX);
    }

    public static boolean regexIdentityCard(String identityCard) {
        return identityCard.matches(IDENTITY_CARD_REGEX);
    }

    public static boolean regexPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(PHONE_NUMBER_REGEX);
    }

    public static boolean regexEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }

    public static boolean regexDegree(String degree) {
        return degree.matches(DEGREE_REGEX);
    }

    public static boolean regexDuty(String duty) {
        return duty.matches(DUTY_REGEX);
    }

    public static boolean regexAddress(String address) {
        return address.matches(ADDRESS_REGEX);
    }

    public static boolean regexGuestType(String guestType) {
        return guestType.matches(GUEST_TYPE_REGEX);
    }
}
