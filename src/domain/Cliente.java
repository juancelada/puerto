package domain;

import java.util.Objects;

public class Cliente {

	// Atributos
	String nombre;
	String Apellido;
	Integer Dni;

	// Getter and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public Integer getDni() {
		return Dni;
	}

	public void setDni(Integer dni) {
		Dni = dni;
	}

	// Constructor
	public Cliente(String nombre, String apellido, Integer dni) {
		super();
		this.nombre = nombre;
		Apellido = apellido;
		Dni = dni;
	}

	// To String
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", Apellido=" + Apellido + ", Dni=" + Dni + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Apellido, Dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(Dni, other.Dni);
	}
}
