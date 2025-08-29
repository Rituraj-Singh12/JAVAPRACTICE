public class StringReverse {

    public static void main(String args[]) {

        String response = reverseString("HELLO WORLD");
        System.out.println(response);
    }

    public static String reverseString(String inputString) {
        //input --> "HELLO"
        String result = "";
        if (inputString != null && !inputString.isEmpty()) {
            int strLength = inputString.length();

            char[] charString = new char[strLength];

            for (int index = 0; index < strLength; index++) {
                charString[index] = inputString.charAt(strLength - index - 1);
            }

            result = new String(charString);
        } else {

            System.out.println("Empty Input String");
        }

        return result;

    }


}