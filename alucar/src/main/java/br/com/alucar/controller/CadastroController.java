package br.com.alucar.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.alucar.Dao.UsuarioDao;
import br.com.alucar.modelo.Usuario;
import br.com.alucar.validate.UsuarioValidator;
@Controller
public class CadastroController {

	@Autowired
	UsuarioDao dao = new UsuarioDao();
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new UsuarioValidator());
	}
	
	@RequestMapping("/cadastroUsuario")
	public ModelAndView cadUsu() {
		return new ModelAndView("cadastroUser");
	}
	
	
	@RequestMapping("/gravar")
	public ModelAndView gravar(@Valid Usuario usuario, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
		 return cadUsu(); 
		
		}
		
		dao.gravar(usuario);
		return null ;
	}
	
	@RequestMapping("/listaUsuario")
	public ModelAndView listar() {
		
		ModelAndView model = new ModelAndView("/updateUser");
		List<Usuario> usuarios  = dao.lista();
		model.addObject("usuarios",usuarios);
		return model; 
		
	}
	
	@RequestMapping("/alterarUser")
	public ModelAndView alterar(int id) {
		ModelAndView modelAndView = new ModelAndView("/alterUser");
		Usuario usuario = dao.findById(id);
		modelAndView.addObject("usuario",usuario);
		return modelAndView;
	}
	
	@RequestMapping("/updateById")
	public ModelAndView updateById( Usuario usuario) {
		
		dao.updateById(usuario);
		
		return new ModelAndView ("redirect:listaUsuario");
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(int id) {
		
		dao.delete(id);
		
		return listar();
	}
	
	
	
}
