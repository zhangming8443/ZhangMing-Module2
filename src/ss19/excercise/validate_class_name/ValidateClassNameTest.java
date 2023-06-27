package ss19.excercise.validate_class_name;

public class ValidateClassNameTest {
    public static ValidateClassName validateClassName;
    public static final String[] validClassName = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        validateClassName = new ValidateClassName();
        for (String str : validClassName) {
            boolean isValid = validateClassName.validate(str);
            System.out.println("Class name is " + str + " is valid: " + isValid);
        }
        for (String str : invalidClassName) {
            boolean isValid = validateClassName.validate(str);
            System.out.println("Class name is " + str + " is valid: " + isValid);
        }
    }
}
