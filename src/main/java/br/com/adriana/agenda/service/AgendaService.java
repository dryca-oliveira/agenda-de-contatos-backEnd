package br.com.adriana.agenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.adriana.agenda.dto.ContactConverter;
import br.com.adriana.agenda.dto.ContactDTO;
import br.com.adriana.agenda.model.Contact;
import br.com.adriana.agenda.repository.AgendaRepository;

@Service
public class AgendaService {
	
	@Autowired //new
	AgendaRepository agendaRepostory;
	
	@Autowired
	ContactConverter converter;
	
	public Contact save(ContactDTO dto ) {
		return agendaRepostory.save(converter.dtoToEntity(dto));
		 
	}
	
	public List<Contact> findAll() {
		return agendaRepostory.findAll();
		 
	}
	
	public Contact  findById(long id) {
		return agendaRepostory.findById(id).get();
		 
	}
	
	public Contact updateById(ContactDTO dto ) {		
		var entity = converter.dtoToEntity(dto);
		entity.setId(dto.getId());		
		return agendaRepostory.saveAndFlush(entity);
	
	}	
	
	public void delete(long id) {
		agendaRepostory.deleteById(id);
	}

}
