package be.heh.petclinic.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import be.heh.petclinic.component.vet.VetComponent;
import be.heh.petclinic.domain.Vet;

import java.util.List;

@RestController

public class VetRestController {

	@Autowired
	private VetComponent vetComponentImpl;
	//private VetComponentImpl vetComponentImpl = new VetComponentImpl();
    
	//@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@RequestMapping("api/v1/vets")
	public List<Vet> getVets(){
	
		/*if(vets.isEmpty()){
			//return new ResponseEntity<Collection<Vet>>(HttpStatus.NOT_FOUND);
		}*/
		
		return this.vetComponentImpl.getVets();
	}
	@RequestMapping("api/v1/vet")
	public Vet getVet(@RequestParam(value="name")String name){
		return this.vetComponentImpl.getVet(name);
	}
}