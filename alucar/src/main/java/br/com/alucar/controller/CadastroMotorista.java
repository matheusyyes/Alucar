package br.com.alucar.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.alucar.Dao.MotoDao;
import br.com.alucar.modelo.Motorista;
import br.com.alucar.validate.MotoValidator;

@Controller
public class CadastroMotorista {

	@Autowired
	MotoDao dao = new MotoDao();
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(new MotoValidator());
	}
	
	@RequestMapping("/cadastroMotorista")
	public ModelAndView cadMoto() {
		return new ModelAndView ("cadastroMoto");
	}
	
	@RequestMapping("/gravarMoto")
	public ModelAndView gravarMoto( @Valid Motorista moto, BindingResult result) {
		
		System.out.println(moto);
		
		if(result.hasErrors()) {
			return cadMoto() ;
		}
		
		dao.gravar(moto);
		

		
		return new ModelAndView("sucesso");
	}
	
}
