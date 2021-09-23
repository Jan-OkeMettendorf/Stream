package de.neuefische.stream.schulung;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Aufgabe1 {

    public static void main(String[] args) throws IOException {

        Files.lines(Path.of("students.csv"))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("1. ------------");
        System.out.println();

        Files.lines(Path.of("students.csv"))
                .skip(1)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("2. ------------");
        System.out.println();

        Files.lines(Path.of("students.csv"))
                .skip(1)
                .filter(item-> !item.isEmpty())
                .distinct()
                .forEach(System.out::println);

        System.out.println();
        System.out.println("4. ------------");
        System.out.println();

        Files.lines(Path.of("students.csv"))
                .skip(1)
                .filter(line-> !line.isEmpty())
                .distinct()
                .forEach(System.out::println);

        System.out.println();
        System.out.println("3. ------------");
        System.out.println();

        Files.lines(Path.of("students.csv"))
                .skip(1)
                .filter(line-> !line.isEmpty())
                .distinct()
                .map(input-> input.split(","))
                .map(input-> new Student(input[1], input[2], input[3]))
                .forEach(System.out::println);




//        final int[] zahlen = new int[]{9, 1, 0, 2, 7, 3, 6, 4, 5};
//
//        Arrays.stream(zahlen)
//                .sorted();
//
//        Arrays.stream(zahlen)
//                .sorted()
//                .forEach(System.out::println);
//
//        System.out.println(Arrays.stream(zahlen)
//                .sum());
//
//        System.out.println(IntStream.of(zahlen).reduce(1,(x,y)->x*y));








    }
}
