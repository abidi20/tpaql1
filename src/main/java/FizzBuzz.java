public class FizzBuzz {
    public static String fizzBuzz(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive"); //  CORRIGÉ : était <= 1
        }
        if (n % 15 == 0) return "FizzBuzz";
        if (n % 3 == 0) return "Fizz";
        if (n % 5 == 0) return "Buzz";
        return String.valueOf(n);
    }
}
