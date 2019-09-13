package br.com.alucar.controller;

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
public class CadastroUsuController {

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
	
}
