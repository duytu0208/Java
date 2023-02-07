package com.example;

import com.example.beans.Car;
import com.example.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lap04_Filtering {

    @Test
    void filter() throws Exception {
        List<Car> cars = MockData.getCars();

//        List<Car> carList = cars.stream()
//                                .filter(c -> c.getPrice() < 20_000.00)
//                                .filter(car -> car.getColor().equals("Orange"))
//                                .collect(Collectors.toList());

        Predicate<Car> carPredicate = car -> car.getPrice() < 20_000.00;  // TODO
        Predicate<Car> orange = car -> car.getColor().equals("Orange");

        List<Car> carList = cars.stream()
                .filter(carPredicate)           // Ket qua phai la true false
                .filter(orange)
                .collect(Collectors.toList());

        carList.forEach(System.out::println);
    }

    @Test
    public void dropWhile() throws Exception {
        System.out.println("using filter");
        Stream.of(2, 4, 9, 6, 8, 11, 12)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println("using dropWhile");
        // Khi gap element k thoa man thi no se lay ele do den het
        Stream.of(2, 4, 9, 6, 8, 11, 12)
                .dropWhile(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
    }

    @Test
    public void takeWhile() throws Exception {
        // using filter
        System.out.println("using filter");
        Stream.of(2, 4, 9, 6, 8, 11, 12).filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();
        System.out.println("using take while");
        // TODO: Lay cac phan tu thoa man, khi gap ele k thoa man thi out
        Stream.of(2, 4, 9, 6, 8, 11, 12).takeWhile(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
    }

    @Test
    public void findFirst() throws Exception {
        //TODO:  Dung khi quan tam den thu tu
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = Arrays.stream(numbers).filter(n -> n == 50)
                .findFirst()
                .orElse(-1);
        System.out.println(result);

    }

    @Test
    public void findAny() throws Exception {
        //TODO:  Dung khi khong quan tam thu tu sap xep
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10};
        int result = Arrays.stream(numbers).filter(n -> n == 9)
                .findAny()
                .orElse(-1);
        System.out.println(result);
    }

    @Test
    public void allMatch() throws Exception {
        //TODO:  Tat ca phai deu thoa man
        int[] even = {2, 4, 6, 8, 10};
        boolean allMatch = Arrays.stream(even)
                .allMatch(n -> n % 2 == 0);
        System.out.println(allMatch);
    }

    @Test
    public void anyMatch() throws Exception {
        //TODO:  Co bat ki then nao thoa man thif return true
        int[] evenAndOneOdd = {2, 4, 6, 8, 10, 11};
        boolean anyMatch = Arrays.stream(evenAndOneOdd)
                .anyMatch(n -> !(n % 2 == 0));
        System.out.println(anyMatch);
    }

}
