package br.com.alucar.validate;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.alucar.modelo.Usuario;

public class UsuarioValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Usuario.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		
		Usuario usuario = (Usuario) target;
		
		ValidationUtils.rejectIfEmpty(errors,"nome" , "fild.required");
		ValidationUtils.rejectIfEmpty(errors,"email" , "fild.required");
		ValidationUtils.rejectIfEmpty(errors, "tel", "fild.required");
		ValidationUtils.rejectIfEmpty(errors, "nasc", "fild.required");
		ValidationUtils.rejectIfEmpty(errors, "rg", "fild.required");
		ValidationUtils.rejectIfEmpty(errors, "cpf", "fild.required");
		ValidationUtils.rejectIfEmpty(errors, "nomeUsu", "fild.required");
		ValidationUtils.rejectIfEmpty(errors, "senha", "fild.required");
		
		if(usuario.isCPF() == false) {
			ValidationUtils.rejectIfEmpty(errors, "cpf", "fild.invalid");
		}
	}

	
	
}
