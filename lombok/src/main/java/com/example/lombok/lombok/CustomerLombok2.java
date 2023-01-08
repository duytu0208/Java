package com.example.lombok.lombok;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data // Bao gôm Setter Getter Constructor ToString HashCode
public class CustomerLombok2 {

    private Integer id;
    private String name;
    private Integer age;

}
