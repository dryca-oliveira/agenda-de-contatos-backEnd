package br.com.adriana.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adriana.agenda.dto.ContactDTO;
import br.com.adriana.agenda.model.Contact;
import br.com.adriana.agenda.service.AgendaService;

@RestController
@RequestMapping("/v1/agenda")
public class AgendaController {
	
	@Autowired
	AgendaService agendaService;
	
	@PostMapping
	public Contact createContact(@RequestBody ContactDTO dto) {			
		return agendaService.save(dto);
		 
	}
	
	@GetMapping
	public List<Contact> listContact() {			
		return agendaService.findAll();
		 
	}	
	
	
	@GetMapping("/{id}")
	public Contact listContact(@PathVariable long id) {			
		return agendaService.findById(id);
		 
	}
	
	@CrossOrigin
	@PatchMapping
	public Contact editContact(@RequestBody ContactDTO dto) {			
		return agendaService.updateById(dto);
	}
	
	@CrossOrigin
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable long id) {			
		agendaService.delete(id);
		 
	}
	
	
	
	
	
//	@GetMapping
//	public String creatParamentContact(@RequestParam String nome) {
//		return "bem vindo, " + nome;
//	}
//
//	@GetMapping("/header")
//	public String creatParament2Contact(@RequestHeader String nome) {
//		return "bem vindo, " + nome;
//	}
//	@GetMapping("/body")
//	public String creatParament3Contact(@RequestBody String nome) {
//		return "bem vindo, " + nome;
//	}
}
