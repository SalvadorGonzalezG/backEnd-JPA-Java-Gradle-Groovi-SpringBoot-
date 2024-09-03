package com.ropa.renueva.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Usuarios")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Todo lo que genera es autoincrementable
	/*@Column(name = "idUsuario")
	private Long idUsuario;*/
	@Column(name = "nombre_usuario", length= 60, unique = false )
	private String Nombre_Usuario;
	@Column(name = "correo", length= 60, unique = false )
	private String Correo;
	@Column(name = "telefono", length= 60, unique = false )
	private String Telefono;
	@Column(name = "contraseña", length= 60, unique=false )
	private String Contraseña;
	@Column(name = "direccion", length= 60, unique=false )
	private String Direccion;
	/*@Column(name = "metodo_De_Pago", length= 60, unique=false )
	private String Metodo_De_Pago;
	@Column(name = "Tipo_De_Usuario", length= 60, unique=false )
	private String Tipo_De_Usuario;*/
	
	// Constructor vacio para JPA
	public User() {
		
	}
	
	
	public User(Long idUsuario, String nombre_Usuario, String correo, String telefono, String contraseña,
			String direccion) {
		/*this.idUsuario = idUsuario;*/
		this.Nombre_Usuario = nombre_Usuario;
		this.Correo = correo;
		this.Telefono = telefono;
		this.Contraseña = contraseña;
		this.Direccion = direccion;
	}

	// Getters y Setters
	/*public Long getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}*/


	public String getNombre_Usuario() {
		return Nombre_Usuario;
	}


	public void setNombre_Usuario(String nombre_Usuario) {
		Nombre_Usuario = nombre_Usuario;
	}


	public String getCorreo() {
		return Correo;
	}


	public void setCorreo(String correo) {
		Correo = correo;
	}


	public String getTelefono() {
		return Telefono;
	}


	public void setTelefono(String telefono) {
		Telefono = telefono;
	}


	public String getContraseña() {
		return Contraseña;
	}


	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}


	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	@Override
	public String toString() {
		return "User [idUsuario=" /*+ idUsuario + ", Nombre_Usuario=" */+ Nombre_Usuario + ", Correo=" + Correo
				+ ", Telefono=" + Telefono + ", Contraseña=" + Contraseña + ", Direccion=" + Direccion + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(Contraseña, Correo, Direccion, Nombre_Usuario, Telefono);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(Contraseña, other.Contraseña) && Objects.equals(Correo, other.Correo)
				&& Objects.equals(Direccion, other.Direccion) && Objects.equals(Nombre_Usuario, other.Nombre_Usuario)
				&& Objects.equals(Telefono, other.Telefono);
	}

	
	
	
	
	
	
}

