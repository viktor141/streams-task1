import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    static Stream<Integer> stream = Main.intList.stream();


    public static void start(){
        List<Integer> newIntList = stream
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder()).toList();

        System.out.println(newIntList);
    }
}
