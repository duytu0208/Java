package com.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lap03_WorkingWithStreams {


    @Test
    void streams() {
        // Tao Stream C1
        List<String> names = List.of("TuND", "HoaiD", "ABC");
        Stream<String> stream = names.stream();

        //Tao Stream C2
        Stream<String> namesStream = Stream.of("TuND", "HoaiD", "ABC");

        // Cau truc stream
        long count = stream
                .limit(2).map(null).sorted(null).dropWhile(null) // Toan tu trung gian => Tao ra cac stream
                .count(); // Toan tu dau cuoi => Tap hop cac ket qua cua stream lai

        String[] nameArray = {};
        Arrays.stream(nameArray).count(); // nameArray.stream khong duoc
    }
}
