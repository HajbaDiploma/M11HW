import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FirstTask {

    public static List<String> getSize2(List<String> list) {
        AtomicInteger a = new AtomicInteger(1);
        return list.stream()
                .filter(str -> {
                    boolean b = a.getAndIncrement() % 2 != 0;
                    return b;
                })
                .collect(Collectors.toList());

    }

}
