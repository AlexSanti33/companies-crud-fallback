package com.portafolio.microservicios.companies_crud_fallback;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebSite implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Long id;
	
	private String name;
	
	private Category category;
	
	private String description;
	

}
