package com.example.restservicecors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingIntegrationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	
	@Test
	public void corsWithAnnotation() throws Exception{
		final String baseUrl = "http://localhost:9000/greeting/";
        URI uri = new URI(baseUrl);
		
		RequestEntity request = RequestEntity.get(uri).header(HttpHeaders.ORIGIN,"http://localhost:9000").build();
		
		ResponseEntity<Greeting> entity = this.restTemplate.exchange(request, Greeting.class);
		
		assertEquals(HttpStatus.OK, entity.getStatusCode());			
		//assertEquals("http://localhost:9000", entity.getHeaders().getAccessControlAllowOrigin());
		Greeting greeting = entity.getBody();
		assertEquals("Hello, World!", greeting.getContent());
	}
	
	@Test
	public void corsWithJavaconfig() throws Exception{
		final String baseUrl = "http://localhost:9000/greeting-javaconfig/";
		
		URI uri = new URI(baseUrl);
		
		RequestEntity request = RequestEntity.get(uri).header(HttpHeaders.ORIGIN,"http://localhost:9000").build();
		
		ResponseEntity<Greeting> entity = this.restTemplate.exchange(request, Greeting.class);
		
		assertEquals(HttpStatus.OK, entity.getStatusCode());			
		Greeting greeting = entity.getBody();
		assertEquals("Hello, World!", greeting.getContent());
		//assertEquals("http://localhost:9000", entity.getHeaders().getAccessControlAllowOrigin());
	}
}


