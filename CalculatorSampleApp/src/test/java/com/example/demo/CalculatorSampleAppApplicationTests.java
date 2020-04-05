package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EntityScan(basePackages = "com.example.demo.*") 
public class CalculatorSampleAppApplicationTests {

	@Test
	public void contextLoads() {
	}

}
