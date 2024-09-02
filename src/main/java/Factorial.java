public class Factorial {

    public int doFactorial(String str) {
        if (str.isEmpty()) {
            throw new NumberFormatException("It shouldn't be empty");
        }
        int result = 1;
        int number = Integer.parseInt(str);
        if (number < 0) {
            throw new NumberFormatException("Invalid number value");
        }
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
