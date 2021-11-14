package com.regres;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.web.client.HttpClientErrorException;

import com.regres.model.Data;
import com.regres.service.RegresService;

@SpringBootTest
@TestPropertySource(locations="classpath:test.properties")
public class RegresServiceTest {

	@Autowired RegresService regresService;
	
	@Test
	public void getUsersService() {
		
		/*
		 * Debido a que el test.properties contiene una ruta incompleta del rest api, nos va retornar una excepciom en el service
		 */
		Exception exception = assertThrows(HttpClientErrorException.class, () -> {
			Data data = regresService.getUsers();
			data.getData().forEach(user -> {
				System.out.println(data);
			});
		});
		System.out.println(exception.getMessage());
	}
}
