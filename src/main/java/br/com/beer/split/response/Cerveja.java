package br.com.beer.split.response;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cerveja implements Serializable{
	
	private static final long serialVersionUID = -6693288606225757509L;
	
	public Long id;
	public String marca;
	private Double teorAlcoolico;

}
