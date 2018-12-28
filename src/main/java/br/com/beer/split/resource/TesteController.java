package br.com.beer.split.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.beer.split.response.Cerveja;

@RestController
@RequestMapping("/alcoolicos")
public class TesteController {

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path="/cerveja/{id}")
	public List<Cerveja> buscarCervejas(@PathVariable("id") Long id) {

		Cerveja c1 = Cerveja.builder().id(1L).marca("Colorado").teorAlcoolico(Double.valueOf("5.7")).build();
		Cerveja c2 = Cerveja.builder().id(2L).marca("Serra Malte").teorAlcoolico(Double.valueOf("5.7")).build();
		Cerveja c3 = Cerveja.builder().id(3L).marca("Skol").teorAlcoolico(Double.valueOf("5.7")).build();
		
		List<Cerveja> cervejas = Arrays.asList(c1,c2,c3);
		
		return cervejas;
	}

}
