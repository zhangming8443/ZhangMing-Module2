package case_study.utils;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.regex.Pattern;

public class Regex {
    private static final String NAME_REGEX = "^([A-Z][a-z]+\\s){1,5}[A-Z][a-z]*$";
    private static final String DATE_REGEX = "^(0?[1-9]|1[0-2])[\\/](0?[1-9]|[12]\\d|3[01])[\\/](19|20)\\d{2}$";
    private static final String CODE_REGEX = "^NV-\\d{4}$";
    private static final String IDENTITY_CARD_REGEX = "^\\d{9,12}$";


    public static boolean regexName(String name) {
        return name.matches(NAME_REGEX);
    }
    public static boolean regexDate(String date){
        return date.matches(DATE_REGEX);
    }
    public static boolean
}
