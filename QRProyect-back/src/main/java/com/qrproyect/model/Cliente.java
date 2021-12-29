package com.qrproyect.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author quintero <juanxyz95@gmail.com>
 *
 */
@Entity
@Table(name = "qrp_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//Pais del cliente
	private String pais;
	
	//Departamento del cliente
	private String departamento;
	
	//Ciudad del cliente
	private String ciudad;
	
	//Nombre de la mascota
	private String nombreMascota;
	
	//Fecha de nacimiento de la mascota
	@Temporal(TemporalType.TIME)
	private Date fechaNacimiento;
	
	//Especie de la mascota
	private String especie;
	
	//Raza de la mascota
	private String raza;
	
	//Sexo de la mascota
	private String sexo;
	
	//Color de la mascota
	private String color;
	
	//Peso de la mascota
	private Double peso;
	
	//Si tiene chip o no
	private Boolean isChip;
	
	//Numero de identificacion del cliente
	private String numeroIdentificacion;
	
	//Si esta esterilizado
	private Boolean isEsterelizado;
	
	//Enfermedades de la mascota
	@Column(length = 500)
	private String enfermedades;
	
	//Alergias de la mascota
	@Column(length = 500)
	private String alergias;
	
	//Cirugias de la mascota
	@Column(length = 500)
	private String cirugias;
	
	//Vacunas de la mascota
	@Column(length = 500)
	private String vacunas;
	
	//Medicamentos de la mascota
	@Column(length = 500)
	private String medicamentos;
	
	//Informacion adiccional de la mascota
	@Column(length = 500)
	private String informacionAdiccional;
	
	//Nombre del conctato 1
	private String nombre1;
	
	//Telefono del conctato 1
	private String telefono1;
	
	//Direccion del conctato 1
	private String direccion1;
	
	//Nombre del conctato 2
	private String nombre2;
		
	//Telefono del conctato 2
	private String telefono2;
		
	//Direccion del conctato 2
	private String direccion2;
	
	//Nombre del conctato 3
	private String nombre3;
		
	//Telefono del conctato 3
	private String telefono3;
		
	//Direccion del conctato 3
	private String direccion3;
	
	//Correo del cliente
	private String correo;
	
	//Metodos get's y set's
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDerpatamento(String derpatamento) {
		this.departamento = derpatamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Boolean getIsChip() {
		return isChip;
	}

	public void setIsChip(Boolean isChip) {
		this.isChip = isChip;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public Boolean getIsEsterelizado() {
		return isEsterelizado;
	}

	public void setIsEsterelizado(Boolean isEsterelizado) {
		this.isEsterelizado = isEsterelizado;
	}

	public String getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(String enfermedades) {
		this.enfermedades = enfermedades;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getCirugias() {
		return cirugias;
	}

	public void setCirugias(String cirugias) {
		this.cirugias = cirugias;
	}

	public String getVacunas() {
		return vacunas;
	}

	public void setVacunas(String vacunas) {
		this.vacunas = vacunas;
	}

	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	public String getInformacionAdiccional() {
		return informacionAdiccional;
	}

	public void setInformacionAdiccional(String informacionAdiccional) {
		this.informacionAdiccional = informacionAdiccional;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getTelefono1() {
		return telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	public String getDireccion1() {
		return direccion1;
	}

	public void setDireccion1(String direccion1) {
		this.direccion1 = direccion1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}

	public String getDireccion2() {
		return direccion2;
	}

	public void setDireccion2(String direccion2) {
		this.direccion2 = direccion2;
	}

	public String getNombre3() {
		return nombre3;
	}

	public void setNombre3(String nombre3) {
		this.nombre3 = nombre3;
	}

	public String getTelefono3() {
		return telefono3;
	}

	public void setTelefono3(String telefono3) {
		this.telefono3 = telefono3;
	}

	public String getDireccion3() {
		return direccion3;
	}

	public void setDireccion3(String direccion3) {
		this.direccion3 = direccion3;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
