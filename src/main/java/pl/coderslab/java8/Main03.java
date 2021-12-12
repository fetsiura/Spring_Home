package pl.coderslab.java8;

import java.util.function.Function;

public class Main03 {

    public static void main(String[] args) {

        Function<String, String> filter = s -> s.toLowerCase().substring(2,s.length()-2);

        String st = "CODERSLAB";


        System.out.println(filter.apply(st));

    }
}
