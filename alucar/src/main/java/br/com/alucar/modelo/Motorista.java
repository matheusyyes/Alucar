package br.com.alucar.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Motorista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@NotEmpty
	private String nome;
	@DecimalMin(value = "18")
	private Integer idade;
	@DateTimeFormat(iso = ISO.DATE)
	@NotNull(message = "data obrigátória")
	private Calendar dataNascimento;
	@NotEmpty
	private String sexo;
	@CPF(message = "Cpf Invalido")
	private String cpf;
	@NotEmpty
	private String rg;
	@NotEmpty
	private String telefone;
	@NotEmpty
	private String email;
	@NotEmpty
	private String status;
	@NotEmpty
	private String nunCnh;
	@NotEmpty
	private String categoriaCnh;
	@NotNull(message = "data obrigátória")
	@DateTimeFormat(iso = ISO.DATE)
	private Calendar dataCnh;
	@NotNull(message = "data obrigátória")
	@DateTimeFormat(iso = ISO.DATE)
	private Calendar venCnh;
	
	public Motorista(){
		
	}

	

	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Integer getIdade() {
		return idade;
	}



	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	
	public Calendar getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	
	public String getCpf() {
		return cpf;
	}


	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getNunCnh() {
		return nunCnh;
	}



	public void setNunCnh(String nunCnh) {
		this.nunCnh = nunCnh;
	}



	public String getCategoriaCnh() {
		return categoriaCnh;
	}



	public void setCategoriaCnh(String categoriaCnh) {
		this.categoriaCnh = categoriaCnh;
	}



	public Calendar getDataCnh() {
		return dataCnh;
	}



	public void setDataCnh(Calendar dataCnh) {
		this.dataCnh = dataCnh;
	}



	public Calendar getVenCnh() {
		return venCnh;
	}



	public void setVenCnh(Calendar venCnh) {
		this.venCnh = venCnh;
	}



	@Override
	public String toString() {
		return "Motorista [Id=" + Id + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", sexo=" + sexo + ", cpf=" + cpf + ", rg=" + rg + ", telefone=" + telefone + ", email=" + email
				+ ", status=" + status + ", nunCnh=" + nunCnh + ", categoriaCnh=" + categoriaCnh + ", dataCnh="
				+ dataCnh + ", venCnh=" + venCnh + "]";
	}



	
	
	
	
}
