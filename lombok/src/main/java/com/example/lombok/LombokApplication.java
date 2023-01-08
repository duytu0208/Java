package com.example.lombok;

import com.example.lombok.basic.CustomerBasic;
import com.example.lombok.basic.CustomerBasicService;
import com.example.lombok.lombok.CustomerLombok;
import com.example.lombok.lombok.CustomerLombok2;
import com.example.lombok.lombok.CustomerLombokService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class LombokApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(LombokApplication.class, args);
//	}
	public static void main(String[] args) {
		CustomerBasicService customerBasicService = new CustomerBasicService(new CustomerBasic());
		customerBasicService.getABC();

		CustomerLombokService customerLombokService = new CustomerLombokService(
				new CustomerLombok(), new CustomerLombok2());
		customerLombokService.getABC();
	}

}
