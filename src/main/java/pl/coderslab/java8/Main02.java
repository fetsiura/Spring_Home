package pl.coderslab.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main02 {

    public static void main(String[] args) {



        List<String> list = Arrays.asList("tree", "bird", "park", "snow", "computer", "bi jeszcze jakiś inny napis, który na końcu ma a");
        Predicate<String> fil = o -> o.length()>4 && o.contains("b") && o.endsWith("a");


        List<Object> objects = filterList(list, fil);
        System.out.println(objects);

    }

    public static List <Object> filterList(List<String> list, Predicate<String> filter){

    return list.stream()
                .filter(filter)
                .collect(Collectors.toList());
    }
}
