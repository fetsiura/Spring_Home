package pl.coderslab.java8;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main04 {

    public static void main(String[] args) {

    }


    static <T> List<T> search(Collection<T> collection, Predicate<T> predicate){
        return collection.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    static <T, S> List<S> changeCollection(Collection<T> collection, Function<T, S> function){
        return collection.stream()
                .map(v -> function.apply(v))
                .collect(Collectors.toList());
    }

    static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer){
        collection.stream()
                .forEach( o -> consumer.accept(o));
    }
}
