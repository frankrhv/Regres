package com.regres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.regres.config.GlobalProperties;
import com.regres.model.Data;

/**
 * Capa de servicio que invoca a un REST API externo
 * 
 * @author Frank
 *
 */
@Service
public class RegresServiceImpl implements RegresService {
	
	@Autowired
	private GlobalProperties properties;
	
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;//Configura y crea un RestTemplate

	@Override
	public Data getUsers() {
		
		ResponseEntity<Data> response = restTemplateBuilder.build().getForEntity(properties.getUrl(), Data.class);
		response.getBody().getData().forEach(user -> {
			System.out.println(user);
		});
		return response.getBody();
	}

}
