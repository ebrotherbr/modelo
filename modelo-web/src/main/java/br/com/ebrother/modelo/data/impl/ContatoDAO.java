package br.com.ebrother.modelo.data.impl;

import org.springframework.stereotype.Repository;

import br.com.ebrother.modelo.model.Contato;
import br.com.ebrother.poc.persistence.DAOBase;

@Repository
public class ContatoDAO extends DAOBase<Contato, Long> {

}
