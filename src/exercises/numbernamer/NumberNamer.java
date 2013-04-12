package exercises.numbernamer;

import java.util.Scanner;

/**
 * Reads in sentences, and expands
 * any numbers (if surrounded by whitespace) into English words.
 *
 * @author David Matuszek
 * @author KLM
 */
public class NumberNamer {

    /**
     * Asks the user to enter sentences, then scans each sentence
     * entered looking for numbers. Any number in the range 0 to 9999
     * is expanded into English words. However, to simplify the
     * problem, only numbers surrounded by whitespace, or the beginning
     * or end of the line,are expanded; this is because the Scanner
     * method hasNextInt() will return true only for such numbers.
     * <br /><br />Special cases:
     * <ul><li>For any number larger than 9999, only the last four digits
     * will be considered.</li>
     * <li>Negative numbers are translated as "???".</li>
     * <li>Numbers larger than Integer.MAX_VALUE are left as is.</li>
     * </ul>
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        new NumberNamer().run();
    }

    /**
     * Reads input, up to the five-character sequence "*end*",
     * converts numbers in the range 0 to 9999 to English words,
     * and prints the converted input.
     */
    void run() {
        System.out.println("Enter sentences:");
        Scanner scanner = new Scanner(System.in);
        String token = "";
        int count = 0;

        while (!token.equals("*end*")) {
            if (++count > 20) break;
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                token = nameOf(number);
            } else if (scanner.hasNextLine()) {
                token = scanner.next();
            }
            if (token.equals("\n")) System.out.println(" EOL ");
            System.out.print(token + " ");
        }
    }

    /**
     * Converts the given integer, if in the range 0 to 9999, to
     * English words. The method works properly only for numbers
     * in this range.
     *
     * @param number A number in the range 0 to 9999, inclusive.
     * @return English words representing the number.
     */
    String nameOf(int number) {
        int ones, tens, hundreds, thousands;
        String result = "";
        boolean started = false;
        int lastTwoDigits = number % 100;

        ones = number % 10;
        number = number / 10;
        tens = number % 10;
        number = number / 10;
        hundreds = number % 10;
        number = number / 10;
        thousands = number % 10;

        // handle the thousands digit, if present
        if (thousands > 0) {
            result = nameOfDigit(thousands) + " thousand";
            started = true;
        }
        // handle the hundreds digit, if present
        if (hundreds > 0) {
            if (started) {
                result = result + " ";
            }
            result = result + nameOfDigit(hundreds) + " hundred";
            started = true;
        }
        // handle the last two digits, if between 10 and 19, and return
        if (lastTwoDigits > 9 && lastTwoDigits < 20) {
            if (started) {
                result = result + " ";
            }
            return result + nameOfTeens(lastTwoDigits);
        }
        assert lastTwoDigits <= 9 || lastTwoDigits >= 20; // not a teen
        // handle the tens digit, if present
        if (tens > 0) {
            if (started) {
                result = result + " ";
            }
            result = result + nameOfTensDigit(tens);
            started = true;
        }
        // handle the ones digit, if present
        if (ones > 0 || !started) {
            if (started) {
                result = result + " ";
            }
            result = result + nameOfDigit(ones);
        }
        return result;
    }

    /**
     * Returns the name of the given number, which must be
     * in the range 0 to 9, inclusive.
     *
     * @param digit The digit to be named.
     * @return The name of the digit.
     */
    String nameOfDigit(int digit) {
        switch (digit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return "???";
    }

    /**
     * Returns the English word for the given number, which
     * must be in the range 10 to 19, inclusive.
     *
     * @param number A number between 10 and 19, inclusive.
     * @return The English word that represents the given number.
     */
    String nameOfTeens(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
        }
        return "???";
    }

    /**
     * Returns the English word for the given digit when in
     * the tens position.
     *
     * @param digit The tens digit to be named.
     * @return the English word for (10 * the digit).
     */
    String nameOfTensDigit(int digit) {
        switch (digit) {
            case 0:
                return "";
            case 1:
                return "ten";
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
        }
        return "???";
    }

}