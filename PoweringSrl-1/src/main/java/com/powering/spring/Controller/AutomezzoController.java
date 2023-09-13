package com.powering.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.powering.spring.Service.AutomezzoService;
import com.powering.spring.To.AutomezzoTo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/automezzo")
public class AutomezzoController {
	@Autowired 
	private AutomezzoService automezzoService;
	
	@PostMapping("/")
	public ResponseEntity<Object> createAutomezzo(@RequestBody AutomezzoTo automezzoTo){
		return new ResponseEntity<>(automezzoService.createAutomezzo(automezzoTo),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> getAutomezzoById(@PathVariable Long id){
		return new ResponseEntity<>(automezzoService.getAutomezzoById(id),HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<Object> getAllAutomezzi(){
		return new ResponseEntity<>(automezzoService.getAllAutomezzi(),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteAutomezzo(@PathVariable Long id){
		return new ResponseEntity<>(automezzoService.deleteAutomezzo(id),HttpStatus.OK);
	}
	
}
