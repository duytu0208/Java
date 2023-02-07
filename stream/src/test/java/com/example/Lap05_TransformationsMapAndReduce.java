package com.example;

import com.example.beans.Car;
import com.example.beans.Person;
import com.example.beans.PersonDTO;
import com.example.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lap05_TransformationsMapAndReduce {

    @Test
    void yourFirstTransformationWithMap() throws Exception {
        Function<Person, PersonDTO> personPersonDTOFunction = person ->     // TODO
                new PersonDTO(person.getId(),
                        person.getFirstName(),
                        person.getAge());

        // TODO: Map cho phep chuyen tu loai du lieu nay sang loai du lieu khac
        List<Person> people = MockData.getPeople();

        List<PersonDTO> personDTOS = people.stream()
                .filter(person -> person.getAge() > 20)
//                .map(person -> {                    // Truyen vao 1 function
//                    return PersonDTO.map(person);
//                })
                .map(personPersonDTOFunction)
                .collect(Collectors.toList());

        personDTOS.forEach(System.out::println);
    }

    @Test
    void mapToDoubleAndFindAverageCarPrice() throws IOException {
        List<Car> cars = MockData.getCars();
        double avg = cars.stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(0);
        System.out.println(avg);
    }

    @Test
    public void reduce() {
        int[] integers = {1, 2, 3};
        int sum = Arrays.stream(integers).reduce(0, Integer::sum);
        int sub = Arrays.stream(integers).reduce(0, (a, b) -> a - b);
        System.out.println(sum);
        System.out.println(sub);
    }

}
