package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SoldierFilterMap {

    public static void main(String[] args) {

        List<Soldier> soldiers = new ArrayList<>();
        soldiers.add(new Soldier(1, "john"));
        soldiers.add(new Soldier(1, "johnny"));
        soldiers.add(new Soldier(3, "bo"));
        soldiers.add(new Soldier(4, "hans"));
        soldiers.add(new Soldier(5, "ole"));
        soldiers.add(new Soldier(3, "jens"));

        Predicate<Soldier> isHighRanked = soldier -> soldier.getRank()>3;

        //filter()
        //toList ellers bliver obj en Stream<t>
        //det skal være rank og name i sout
        var obj = soldiers.stream().filter(isHighRanked).toList();
        obj.forEach(System.out::println);

        //collection
        Function<Soldier, String> getnames = soldier -> soldier.getName();
        List<String> names = soldiers.stream().map(getnames).toList();
        names.forEach(System.out::println);

    }
}
