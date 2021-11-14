package com.regres.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Carga los parámetros de configuración del application.properties
 * 
 * @author Frank
 *
 */
@Configuration
@ConfigurationProperties
public class GlobalProperties {

	@Value("${url}")
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
