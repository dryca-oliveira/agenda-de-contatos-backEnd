package br.com.adriana.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adriana.agenda.model.Contact;

public interface AgendaRepository extends JpaRepository<Contact, Long>{

}
