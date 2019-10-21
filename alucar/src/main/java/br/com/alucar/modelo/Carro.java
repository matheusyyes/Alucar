package br.com.alucar.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String placa;
	@OneToOne
	private Fabricante fabricante;
	private String cor;
	private Calendar anoModelo;
	private Calendar anoFab;
	private String chassi;
	private String renavam;
	private String tipoConbusvivel;
	private Double kmInicial;
	@OneToOne
	private Motorista motorista;
	private String status;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Calendar getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(Calendar anoModelo) {
		this.anoModelo = anoModelo;
	}
	public Calendar getAnoFab() {
		return anoFab;
	}
	public void setAnoFab(Calendar anoFab) {
		this.anoFab = anoFab;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getRenavam() {
		return renavam;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public String getTipoConbusvivel() {
		return tipoConbusvivel;
	}
	public void setTipoConbusvivel(String tipoConbusvivel) {
		this.tipoConbusvivel = tipoConbusvivel;
	}
	public Double getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(Double kmInicial) {
		this.kmInicial = kmInicial;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	
	
}
