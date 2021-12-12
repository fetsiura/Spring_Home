package pl.coderslab.advanced.abstractclass;


import java.util.Collections;
import java.util.List;

public class Main02 {

    public static void main(String[] args) {

        List<Person> people = new java.util.ArrayList<>(List.of(
                new Person("jaro", "majer"),
                new Person("julia", "kruczkowska"),
                new Person("sergo", "krasnyj")
        ));
        Collections.sort(people);

        people.forEach(System.out::println);
    }


}
