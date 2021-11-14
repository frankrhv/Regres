package com.regres.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regres.model.Data;
import com.regres.service.RegresService;

/**
 * Controlador principal del API
 * @author Frank
 *
 */
@RestController
@RequestMapping("/api")
public class RegresController {
	
	@Autowired
	private RegresService regresService;

	@PostMapping("/users")
	public ResponseEntity<?>  getUsers() {
		Data data = null;
		try {
			data = regresService.getUsers();
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			data = new Data();
			return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
