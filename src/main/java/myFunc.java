import java.util.function.Function;

public class myFunc{
        public static String Fizz(Integer n) {
            if (n%15 == 0) {
                return "FizzBuzz";
            } else if (n % 5 == 0) {
                return  "Fizz";
            } else if (n % 3 == 0) {
                return "Buzz";
            } else {
                return n.toString();
            }
        }
}
