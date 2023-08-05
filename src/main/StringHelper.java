package main;

/** A class that contains several methods for manipulating strings */
public class StringHelper {

    /**
     * Returns the number of vowels (letters a, e, i, o, u)
     * in a given string.
     * @param message
     * @return the number of vowels
     */
    public static int countVowels(String message) {
        int summer = 0;
        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i) == 'a' || message.charAt(i) == 'e'  || message.charAt(i) == 'i'  || message.charAt(i) == 'o'  || message.charAt(i) == 'u')
                    summer++;
        }        return summer;
    }

    /**
     * Returns the message encrypted using "Ceasar cipher"
     * with the given shift amount.
     *
     * If the shift is greater than 26 the method returns null.
     * If the message contains any characters that are not upper
     * or lower case letters the method returns null.
     *
     * Example: (abc, 2) -> cde
     * 'a' was shifted by two characters (became 'c'),
     * 'b' became 'd', 'c' became 'e'.
     * @param message
     * @param shift
     * @return
     * @author Prof. Rollins
     */
    public static StringBuilder encrypt(String message, int shift) {
        StringBuilder messageEnc  = new StringBuilder(message);
        for (int i = 0; i < message.length(); i++) {
            messageEnc.setCharAt(i, (char) ((int) message.charAt(i) + shift));
        }
        return messageEnc;
    }

    /** Main method: runs methods of class StringHelper */
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Original string: " + s);
        System.out.println("Number of vowels: " + StringHelper.countVowels(s));
        System.out.println("After encrypting: " + StringHelper.encrypt(s, 3));
    }

}
