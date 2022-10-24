import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    private List<Integer> input;

    public StreamMain(List<Integer> input) {
        this.input = input;
    }

    public void main() {
        Stream<Integer> stream = input.stream();
        System.out.println("Решение через stream");
        input.stream().filter(x -> x > 0 && x % 2 == 0).sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
