package pl.coderslab.java8;

import java.util.List;

public class test {


    public static void main(String[] args) {

        List<String> list = List.of("Pietrzak, Janina, 9322.00 zł; zlecenie ",
                "Nowak, Jan, 9321.00 zł; zlecenie ","Nowak, Janina, 9322.00 zł; zlecenie ",
                "Pierzak, Jan, 9321.00 zł; zlecenie");

        String str = "Pierzak, Jan, 9321.00 zł; zlecenie";
        String str2 = "9321.00 zł";

        String substring = str2.substring(0, str2.length() - 2);
        System.out.println(substring);
    }
}
