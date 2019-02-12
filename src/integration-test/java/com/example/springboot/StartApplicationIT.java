package com.example.springboot;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Profile;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class StartApplicationIT {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	@DisplayName("Integration test which will get the actual response for ask 'Hi'")
	public void talkHiTest() {
		String message = this.restTemplate.getForObject("/talking/talk?word=Hi", String.class);
		assertEquals("Hello", message);
	}

	@Test
	@DisplayName("Integration test which will get the actual response for ask 'By'")
	public void talkByTest() {
		String message = this.restTemplate.getForObject("/talking/talk?word=By", String.class);
		assertEquals("Goodbye", message);
	}

}
