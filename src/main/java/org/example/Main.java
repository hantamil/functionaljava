package org.example;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(2024, 4, 18);
        Stream<LocalDate> tendates = IntStream.range(1,10).mapToObj(i->birthday.plusYears(1));

        //10*dato for 2025
        //tendates.forEach(System.out::println);




    }

}