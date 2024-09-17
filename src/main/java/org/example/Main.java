package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberToWords(28));
    }
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        char[] digits = String.valueOf(number).toCharArray();
        String reserved = "" ;
        for (int i = digits.length - 1; i>=0; i--) {
            reserved += digits[i];
        }
        return reserved.equalsIgnoreCase(String.valueOf(number));


    }

    public static boolean isPerfectNumber(int number) {
        if(number<0)
            return false;
        int total = 0;
        for (int i=1; i<number;i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        return number == total;
    }

    public  static String numberToWords(int number) {
        if(number<0)
            return  "Invalid Value";

        char[] digits = String.valueOf(number).toCharArray();
        StringBuilder numToText = new StringBuilder();
        for (char digit : digits) {
            switch (digit) {
                case '0':
                    numToText.append("Zero ");
                    break;
                case '1':
                    numToText.append("One ");
                    break;
                case '2':
                    numToText.append("Two ");
                    break;
                case '3':
                    numToText.append("Three ");
                    break;
                case '4':
                    numToText.append("Four ");
                    break;
                case '5':
                    numToText.append("Five ");
                    break;
                case '6':
                    numToText.append("Six ");
                    break;
                case '7':
                    numToText.append("Seven ");
                    break;
                case '8':
                    numToText.append("Eight ");
                    break;
                case '9':
                    numToText.append("Nine ");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + digit);
            }

        }
        return numToText.toString().trim();

    }
}
