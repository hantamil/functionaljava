package org.example;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class NumberStream {

    //chatgpt why
    /*Funktionel programmering er en programmeringsparadigme, hvor man bygger programmer ved at bruge funktioner
    som de grundlæggende byggesten. Det fokuserer på immutabilitet (data kan ikke ændres) og "rene" funktioner,
    som altid giver samme output for samme input uden sideeffekter.
    Man bruger det, fordi det gør koden lettere at teste, fejlfinde og vedligeholde, især i komplekse systemer,
    ved at reducere utilsigtede ændringer i data og gøre programflowet mere forudsigeligt.

    Selvom det er kompakt, så bliver det mere læsbart, da der ikke er en masse metoder, som vi normalvis ville
    have skrevet
*/

    public static void main(String[] args) {


        Supplier<Double> mr = () -> Math.random();
        Stream<Double> randomNumbers = Stream.generate(mr);

        //stream of random numbers infinite sout
        // randomNumbers.forEach(System.out::println);

        Function<Double, Long> dblround = d -> Math.round(d*100);
        Predicate<Long> longEqual = rannum -> rannum % 2==0;

        //denne skal konverteres ud for sout af nums12sum, da stream bliver lukket på linje 31
        /*List<Long> nums12 = randomNumbers.map(dblround)
        .filter(longEqual)
        .limit(12)
        .toList();
        nums12.forEach(System.out::println);*/

        var nums12sum = randomNumbers.map(dblround)
                .filter(longEqual)
                .limit(12)
                .mapToDouble(d->d).sum();
        System.out.println(nums12sum);

    }

}
