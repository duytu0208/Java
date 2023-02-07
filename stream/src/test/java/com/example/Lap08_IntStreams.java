package com.example;


import com.example.beans.Person;
import com.example.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

public class Lap08_IntStreams {

    @Test
    public void range() throws Exception {
        System.out.println("with fori");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("with int stream exclusive");
        IntStream.range(0, 10).forEach(System.out::println);

        System.out.println("with int stream inclusive");
        IntStream.rangeClosed(0, 10).forEach(System.out::println);
    }

    // Loop through people using IntStream
    @Test
    public void rangeIteratingLists() throws Exception {
        List<Person> people = MockData.getPeople();
        IntStream.range(0, people.size())
                .forEach(index -> {
                    System.out.println(people.get(index));
                });
    }

    @Test
    public void intStreamIterate()  {
        IntStream.iterate(0, value -> value + 2)
                .limit(11) //TODO: Gioi han 11 phan tu
                .forEach(System.out::println);
    }
}
