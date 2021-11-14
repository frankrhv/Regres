package com.regres;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

/**
 * 
 * 
 * 
 * @author Frank
 *
 */
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:test.properties")
public class RegresControllerInternalErrorTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getUsers() throws Exception {
		this.mockMvc.perform(post("/api/users")).andDo(print()).andExpect(status().is5xxServerError());
	}
}
