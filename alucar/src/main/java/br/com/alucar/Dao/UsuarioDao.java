package br.com.alucar.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.alucar.modelo.Usuario;

@Transactional
@Repository
public class UsuarioDao {
	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Usuario usuario) {
		
		manager.persist(usuario);
		
	}
	
}
