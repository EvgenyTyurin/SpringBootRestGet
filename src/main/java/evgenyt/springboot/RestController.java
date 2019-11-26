package evgenyt.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * REST controller serving /rest GET request
 * @author EUTyrin
 *
 */

@org.springframework.web.bind.annotation.RestController
@RequestMapping(path="/rest", produces="application/json")
@CrossOrigin(origins="*")
public class RestController {
		
	// Serving /rest/tacos request
	@GetMapping("/tacos")
	public Iterable<Taco> getTacos() {
		List<Taco> tacos = new ArrayList<Taco>();
		tacos.add(new Taco("Shaverma"));
		return tacos; // [{"name":"Shaverma"}]
	}
	
	// Serving /rest/<taconame> request
	@GetMapping("/{name}")
	public Taco tacoById(@PathVariable("name") String name) {
		// it can be search for taco by name here 
		return new Taco(name); // [{"name":<taconame>}]
	}
		
}
	