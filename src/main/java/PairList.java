import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PairList {

    public static void main(String[] args) {

    List<String> stringList = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));

        Map<String,String> pairList = stringList.stream().collect(Collectors.toMap( x -> x, String::toUpperCase));

        System.out.println(pairList);


}



}
