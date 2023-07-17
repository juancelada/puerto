package domain;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
	private static List<Amarre> amarres;
	private List<alquiler> alquileres;

	public Puerto(int cantidadAmarres) {
		Puerto.amarres = new ArrayList<>(cantidadAmarres);
		this.setAlquileres(new ArrayList<>());
		for (int i = 0; i < cantidadAmarres; i++) {
			amarres.add(new Amarre(i, i, true, null));
		}
	}

	public int getTotalAmarres() {
		return amarres.size();
	}

	public int getAmarresOcupados() {
		int contador = 0;
		for (Amarre amarre : amarres) {
			if (!amarre.isLibre()) {
				contador++;
			}
		}
		return contador;
	}

	public int getCantidadAmarresLibres() {
		return amarres.size() - getAmarresOcupados();
	}

	public List<Amarre> getAmarres() {
		return amarres;
	}

	public void addAmarre(Amarre amarre) {
		amarres.add(amarre);

	}

	public void addAlquiler(alquiler alquiler) {
		alquileres.add(alquiler);

	}

	public static Amarre buscarAmarreLibre() {
		for (Amarre amarre : amarres) {
			if (amarre.isLibre()) {
				return amarre;
			}
		}
		return null;
	}

	public List<alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(List<alquiler> alquileres) {
		this.alquileres = alquileres;
	}

	public int getCantidadAlquileres() {
		return amarres.size();
	}

	public int getCantidadAlquileresEnCurso() {
		int contador = 0;
		for (alquiler alquiler : alquileres) {

			if (alquiler.getEstado()) {
				contador++;
			}
		}
		return contador;
	}

	public int getCantidadAlquileresFinalizados() {
		return amarres.size() - getCantidadAlquileresEnCurso();
	}

	public void mostrarAmarres() {
		System.out.println("Amarres");
		for (Amarre amarre : amarres) {
			System.out.println("\n" + "N° Amarre: " + amarre.getnAmarre() + "\n" + "Posicion: " + amarre.getPosicion()
					+ "\n" + "Estado: " + amarre.isLibre());
		}
	}

	public void mostrarAlquileresEnCurso() {
		System.out.println("Alquileres en Curso");
		for (alquiler alquileres : alquileres) {
			if (alquileres.getEstado() == true) {
				if (alquileres.getBarco() instanceof Anfibio) {
					Anfibio anfibio = (Anfibio) alquileres.getBarco();
					System.out.println("\n" + "Amarre: " + alquileres.getAmarre().getPosicion() + "\n" + "Tipo Barco: "
							+ anfibio.getTipo() + "\n" + "Eslora: " + anfibio.getEslora() + "\n" + "Fabricacion: "
							+ anfibio.getAnioFabricacion() + "\n" + "Matricula: " + anfibio.getMatricula() + "\n"
							+ "Anfibio: SI" + "\n" + "Cantidad de Ruedas: " + anfibio.getCantidadRuedas() + "\n"
							+ "Velocidad en Tierra: " + anfibio.getVelocidad() + "\n");
				} else {
					System.out.println("\n" + "Amarre: " + alquileres.getAmarre().getPosicion() + "\n" + "Tipo Barco: "
							+ alquileres.getBarco().getTipo() + "\n" + "Eslora: " + alquileres.getBarco().getEslora()
							+ "\n" + "Fabricacion: " + alquileres.getBarco().getAnioFabricacion() + "\n" + "Matricula: "
							+ alquileres.getBarco().getMatricula() + "\n" + "Anfibio: NO" + "\n");
				}
			}
		}
	}
}