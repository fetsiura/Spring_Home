package pl.coderslab.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main06 {

    public static void main(String[] args) {
        String fileName = "earnings.txt";


        try (Stream<String> strings = Files.lines(Paths.get(fileName))) {

            List<String> workers = strings.collect(Collectors.toList());

//            Map<String, Double> check = check(workers);
//            System.out.println(check);

            check(workers).entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
                    .limit(3)
            .forEach(System.out::println);



        } catch (IOException e ){
            e.printStackTrace();
        }


    }

    public static Map<String,Double> check (List<String> workers){
        Map<String,Double> wor = new HashMap<>();

        workers.stream()
                .filter(o -> !o.contains("Kowalsk"))
                .filter( o -> o.contains("0"))
                .forEach( w -> {
                    String[] f = w.split(";");
                    String[] f2 = f[0].split(",");
                                wor.put(w,Double.parseDouble(f2[2].substring(0,f2[2].length()-2)));

                });

//        wor.forEach((s,v)-> System.out.println(v));
        return wor;
    }
}
