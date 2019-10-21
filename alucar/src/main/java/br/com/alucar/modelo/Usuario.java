package br.com.alucar.modelo;

import java.util.Calendar;
import java.util.InputMismatchException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String email;
	private String tel;
	@DateTimeFormat(iso = ISO.DATE)
	private Calendar nasc;
	private String rg;
	@CPF
	private String cpf;
	private String nomeUsu;
	private String senha;
          
     
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public Calendar getNasc() {
		return nasc;
	}
	public void setNasc(Calendar nasc) {
		this.nasc = nasc;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNomeUsu() {
		return nomeUsu;
	}
	public void setNomeUsu(String nomeUsu) {
		this.nomeUsu = nomeUsu;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", tel=" + tel + ", nasc=" + nasc + ", rg="
				+ rg + ", cpf=" + cpf + ", nomeUsu=" + nomeUsu + ", senha=" + senha + "]";
	}
	
	
}
