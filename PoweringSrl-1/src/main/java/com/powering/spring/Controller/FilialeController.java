package com.powering.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.powering.spring.Service.FilialeService;
import com.powering.spring.To.FilialeTo;

@RestController
@RequestMapping("/filiale")
public class FilialeController {
	@Autowired
	private FilialeService filialeService;
	
	@PostMapping("/")
	public ResponseEntity<Object> createFiliale(@RequestBody FilialeTo filialeTo){
		return new ResponseEntity<>(filialeService.createFiliale(filialeTo),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getFilialeById(@PathVariable Long id){
		return new ResponseEntity<>(filialeService.getFilialeById(id),HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<Object> getAllFiliali(){
		return new ResponseEntity<>(filialeService.getAllFiliali(),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteFiliale(@PathVariable Long id){
		return new ResponseEntity<>(filialeService.deleteFiliale(id),HttpStatus.OK);
	}
}
