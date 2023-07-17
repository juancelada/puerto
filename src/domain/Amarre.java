package domain;

import java.util.Objects;

public class Amarre {
	private int nAmarre;
	private int posicion;
	private boolean libre;
	private Barco barcos;
	
	public Barco getBarcos() {
		return barcos;
	}

	public void setBarcos(Barco barcos) {
		this.barcos = barcos;
	}

	public int getnAmarre() {
		return nAmarre;
	}

	public void setnAmarre(int nAmarre) {
		this.nAmarre = nAmarre;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	
	public Amarre(int nAmarre, int posicion, boolean libre, Barco barcos) {
		super();
		this.nAmarre = nAmarre;
		this.posicion = posicion;
		this.libre = libre;
		this.barcos = barcos;
	}


	@Override
	public String toString() {
		return "Amarre [nAmarre=" + nAmarre + ", posicion=" + posicion + ", libre=" + libre + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(libre, nAmarre, posicion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Amarre other = (Amarre) obj;
		return nAmarre == other.nAmarre;
	}

	public void ocuparAmarre() {
		if (libre == true) {
			setLibre(false);
		} else {
			System.out.println("El amarre ya está ocupado");
		}
	}

	public void liberarAmarre() {
		if (libre == false) {
			libre = true;
		} else {
			System.out.println("El amarre ya está libre");
		}
	}
	public void agregarBarco(Barco barco) {
		Amarre amarreLibre = Puerto.buscarAmarreLibre();
		if (amarreLibre != null) {
			amarreLibre.setBarcos(barco);
		} else {
			System.out.println("No hay amarres disponibles para el barco " + barco.getMatricula());
		}
	}

	
}
