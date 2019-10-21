package br.com.alucar.Dao;

import java.util.List;

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

	public List<Usuario> lista() {
		return manager.createQuery("SELECT u FROM Usuario u ", Usuario.class).getResultList();
	}

	public Usuario findById(int id) {

		return manager.find(Usuario.class, id);
	}

	public void updateById(Usuario usuario) {

	
		manager.merge(usuario);

	}

	public void delete(int id) {
		
		Usuario user = findById(id);
		manager.remove(user);
	}

}
