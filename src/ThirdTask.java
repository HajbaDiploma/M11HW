import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThirdTask {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("50, 7, 2", "0, 18");
        String res = list.stream()
                .map(s -> s.split(", "))
                .flatMap(Stream::of)
                .map(s -> Integer.valueOf(s))
                .sorted()
                .collect(Collectors.toList())
                .toString()
                .replace("[", "\"")
                .replace("]", "\"");


        System.out.println(res);


    }
}
