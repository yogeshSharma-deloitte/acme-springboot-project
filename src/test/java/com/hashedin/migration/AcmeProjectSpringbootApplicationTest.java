package com.hashedin.migration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class AcmeProjectSpringbootApplicationTest {

	@Test
	public void contextLoads() {
		AcmeProjectSpringbootApplication.main(new String[] {});
		assertTrue(true);
	}

}