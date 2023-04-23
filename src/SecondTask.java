import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondTask {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anna", "Cindi", "Boris", "Lucas", "Zora");
        List<String> sortedList = list.stream()
                .sorted(Collections.reverseOrder())
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(sortedList);

    }
}
