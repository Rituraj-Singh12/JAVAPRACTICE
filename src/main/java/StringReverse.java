
import java.util.Scanner;

public class StringReverse {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        String response = reverseString("HELLO WORLD 123456789");
        System.out.println(response);
    }

    public static String reverseString(String inputString) {
        //input --> "HELLO"
        StringBuilder reverseString = new StringBuilder();
        if (inputString != null && !inputString.isEmpty()) {
            int strLength = inputString.length();

            char[] strArray = inputString.toCharArray();



            for (int index = 0; index < strArray.length; index++) {
                reverseString.append(strArray[strArray.length-1-index]);
            }


        } else {

            System.out.println("Empty Input String");
        }

        return reverseString.toString();

    }


}