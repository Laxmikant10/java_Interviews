package src.jisasoftech;

//Input - whatIsYourName
//output - WHAT_IS_YOUR_NAME

public class WordToSnakeCase {

    public static void main(String[] args) {
        String str = "whatIsYourName";

        String toSnakeCase = camelToSnakeCase(str);
        System.out.println("toSnakeCase = " + toSnakeCase);
    }

    private static String camelToSnakeCase(String str) {

        char[] charArray = str.toCharArray();
        String newStr = charArray[0] + "";
        for (int i = 1; i < str.length(); i++) {
            if (Character.isUpperCase(charArray[i])) {
                newStr = newStr + "_" + charArray[i];
            } else {
                newStr = newStr + charArray[i];
            }
        }
        return newStr.toUpperCase();

    }
}
