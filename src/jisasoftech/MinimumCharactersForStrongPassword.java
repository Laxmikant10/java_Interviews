package src.jisasoftech;

public class MinimumCharactersForStrongPassword {
    static int passSize = 6;
    //static String pass = "Ed1";
    //static String pass = "#Edabit";
    //static String pass = "W1llth!spass?";
    static String pass = "aaaaa";


    public static void main(String[] args) {

        //foo(“Ed1”) ➞ 3
        int counter = 0;
        int minimumCharactersRequiredForStrongPassword = minimumCharactersRequiredForStrongPassword(pass, counter);
        System.out.println("minimumCharactersRequiredForStrongPassword = " + minimumCharactersRequiredForStrongPassword);
    }

    private static int minimumCharactersRequiredForStrongPassword(String password, int counter) {

        int missingLength = checkPassWordLength(password);

        //1st step to check the password length more than 6


        //2. It contains at least one digit.
        if (!checkAtLeast1Digit(password)) {
            counter++;
            //return checkAtLeast1Digit(password);
        }

        //3. It contains at least one lowercase English character.
        //4. It contains at least one uppercase English character.

        // if (checkAtLeast1UpperCase(password) && checkAtLeast1LowerCase(password) && checkAtLeast1SpecialChar(password)) {
        if (!checkAtLeast1UpperCase(password)) {
            counter++;
        }
        if (!checkAtLeast1LowerCase(password)) {
            counter++;
        }
        if (!checkAtLeast1SpecialChar(password)) {
            counter++;
        }

        if (password.length() <= passSize) {
            if((counter+password.length())<=passSize) {
                counter = missingLength;
            }
        }

        return counter;
    }

    private static int checkPassWordLength(String password) {
        int missingLength = 0;
        if (password.length() < passSize) {
            missingLength = passSize - password.length();
        }
        return missingLength;
    }

    private static boolean checkAtLeast1Digit(String password) {
        boolean atLeast1Digit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return atLeast1Digit;
    }

    private static boolean checkAtLeast1UpperCase(String password) {
        boolean atLeastUpperCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                atLeastUpperCase = true;
                break;
            }
        }
        return atLeastUpperCase;
    }

    private static boolean checkAtLeast1LowerCase(String password) {
        boolean atLeastLowerCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                atLeastLowerCase = true;
                break;
            }
        }
        return atLeastLowerCase;
    }

    private static boolean checkAtLeast1SpecialChar(String password) {
        String specialChar = "!@#$%^&*()-+";
        boolean atLeastLowerCase = false;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < specialChar.length(); j++) {
                if (password.charAt(i) == specialChar.charAt(j)) {
                    return true;
                }
            }
        }
        return atLeastLowerCase;
    }
}
