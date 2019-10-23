package br.com.alucar.validate;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.alucar.modelo.Motorista;

public class MotoValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Motorista.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		
		
//		
//		ValidationUtils.rejectIfEmpty(errors,"nome" , "fild.required");
//		ValidationUtils.rejectIfEmpty(errors,"email" , "fild.required");
//		ValidationUtils.rejectIfEmpty(errors, "telefone", "fild.required");
//		ValidationUtils.rejectIfEmpty(errors, "rg", "fild.required");
//		ValidationUtils.rejectIfEmpty(errors, "cpf", "fild.required");
//		ValidationUtils.rejectIfEmpty(errors,"dataNascimento" , "fild.required");
//		ValidationUtils.rejectIfEmpty(errors,"cpf" , "fild.required");
//		ValidationUtils.rejectIfEmpty(errors,"rg" , "fild.required");
//		ValidationUtils.rejectIfEmpty(errors,"nunCnh" , "fild.required");
//		ValidationUtils.rejectIfEmpty(errors,"categoriaCnh" , "fild.required");
//		ValidationUtils.rejectIfEmpty(errors,"dataCnh" , "fild.required");
//		ValidationUtils.rejectIfEmpty(errors,"venCnh" , "fild.required");
//		ValidationUtils.rejectIfEmpty(errors,"idade", "fild.required");
//		Motorista moto = (Motorista) target;
//		
//		System.out.println(moto);
		
		
			
		
		
		/*
		 * if(moto.getIdade() < 18) { errors.rejectValue("idade", "fild.required"); }
		 */
		
	}

	
	
}
