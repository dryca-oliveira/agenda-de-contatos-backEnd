package br.com.adriana.agenda.dto;

import org.springframework.stereotype.Component;

import br.com.adriana.agenda.model.Contact;

@Component
public class ContactConverter {

	public Contact dtoToEntity(ContactDTO dto) {

		Contact entity = new Contact();
		
		entity.setName(dto.getName());
		entity.setTelephoneNumber(dto.getTelephoneNumber());
		entity.setEmail(dto.getEmail());

		return entity;
	}

}
