package pl.coderslab.java8;

public class Main01 {

    public static void main(String[] args) {

        Check<Integer> checkBetween = s -> s>0 && s<101;


        System.out.println(checkBetween.test(-2));
        System.out.println(checkBetween.test(1));
        System.out.println(checkBetween.test(101));
    }
}
