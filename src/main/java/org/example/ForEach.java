package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    static void forEachStr(List<String> listOfStrings, Consumer<String> consumer){
        for (String string: listOfStrings){
            consumer.accept(string);
        }
    }

    //sådan den inbyggede forEach ser ud
    //R i stedet for T v return
    static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T t:list){
            consumer.accept(t);
        }
    }



    public static void main(String[] args) {

        // er generic og skal være rigtige klasser
        //consumer kan overføre hvilken som helst type string, long, funktion osv.
        // - dette betyder man kun behøver én interface
        //man kan overfører så mange typer som man vil, skal være i klammerne

        // Consumer ser sådan her ud:
        // public interface consumer<T> {
        // void accept
        Consumer<String> toUpper = x -> System.out.println(x.toUpperCase());
        toUpper.accept("Hello");

        Consumer<Long> square = t -> System.out.println(t*t);
        //stort L efter 50, fordi det er en long
        square.accept(50L);

        List<String> listStr = Arrays.asList("hej", "med", "dig");
        forEachStr(listStr, toUpper);

        forEach(listStr, toUpper);

        listStr.forEach(toUpper);
    }
}
