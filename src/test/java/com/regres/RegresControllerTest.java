package com.regres;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
public class RegresControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getUsers() throws Exception {
		this.mockMvc.perform(post("/api/users")).andDo(print()).andExpect(status().isOk());
	}
	
	/**
	 * Esta prueba debe retornar un error 404 debido a que la url /api/Users es incorrecta
	 * @throws Exception
	 */
	@Test
	public void getUsersFail() throws Exception {
		this.mockMvc.perform(post("/api/Users")).andDo(print()).andExpect(status().isNotFound());
	}
}
