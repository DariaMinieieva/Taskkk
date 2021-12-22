import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzTask {
    public List<String> fizzBuzz(List<String> n) {
        return n.stream().map(Integer::parseInt).map(myFunc::Fizz).collect(Collectors.toList());
    }
}
