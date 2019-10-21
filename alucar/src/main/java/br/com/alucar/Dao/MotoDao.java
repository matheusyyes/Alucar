package br.com.alucar.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.alucar.modelo.Motorista;

@Transactional
@Repository
public class MotoDao {

	@PersistenceContext
	private EntityManager manager; 
	
	public void gravar(Motorista motorista) {
		
		manager.persist(motorista);
		
	}
	
}
