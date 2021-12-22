import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("1", "2", "3");
        List<Integer> newArr = MapTask.mapping(arr);
        System.out.println(newArr);

        List<String> arr_2 = Arrays.asList("abc", "def", "ghj");
        List<String> newArr_2 = FlattingTask.flattingString(arr_2);
        System.out.println(newArr_2);
    }
}
