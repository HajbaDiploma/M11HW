import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomGenerator {

    public static void main(String[] args) {

        FourthTask randomAlg = new FourthTask();

        Stream<Integer> intStream = Stream.iterate(11, (seed) -> randomAlg.c(seed).next());

        Set<Integer> collect = intStream.limit(5)
                .peek(System.out::println)
                .collect(Collectors.toSet());




    }
}
