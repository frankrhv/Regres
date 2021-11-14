package com.regres.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de la lista de usarios
 * 
 * @author Frank
 *
 */
public class Data {

	private List<User> data;
	
	public List<User> getData() {
		if (data == null) {
			data = new ArrayList<User>();
		}
		
		return data;
	}
}
