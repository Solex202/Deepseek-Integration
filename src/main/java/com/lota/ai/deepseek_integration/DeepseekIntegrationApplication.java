package com.lota.ai.deepseek_integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DeepseekIntegrationApplication {


//
//	public static List<Integer> func (List<Integer> args) {
//		List<Integer> list = new ArrayList<>();
//        for (Integer arg : args) {
//            if (arg % 2 == 0) {
//                list.add(0);
//            } else {
//                list.add(1);
//            }
//        }
//		return list;
//	}
//
//	public static int sum(int num1, int num2){
//		boolean isNegative = false;
//
//		if(num2 < 0){
//			num2 = -num2;
//			isNegative = true;
//		}
//		int sum = 0;
//		for (int i = 1; i <= num2 ; i++) {
//			sum += num1;
//		}
//		return isNegative ? -sum : sum;
//	}


	public static void main(String[] args) {
		SpringApplication.run(DeepseekIntegrationApplication.class, args);
	}

}
