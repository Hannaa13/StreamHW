import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterList {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("Ann", "HellO", "cat", "DOG", "world", "love"));

        Predicate<String> predicateEquals = (s) ->   s.length() == 4;
        Predicate<String> predicateLowerCase = (s) -> s.toLowerCase(Locale.forLanguageTag(s)).equals(s);




       List<String> stringList1 = stringList.stream()
               .filter(predicateEquals.and(predicateLowerCase))
               .collect(Collectors.toList());

        System.out.println(stringList1);




    }

}
