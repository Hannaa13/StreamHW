
import java.util.*;

public class StreamAverage {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        System.out.println(integers.stream().mapToDouble(x -> x).average());



    }

}
