package domain;

public class Lancha extends Barco {
	private static final String TIPO = "Lancha";
	private static final Double TARIFA = 50.0;

	public String getTipo() {
		return TIPO;
	}

	public double getTarifa() {
		return TARIFA;
	}

	public Lancha(String matricula, Double eslora, Integer anioFabricacion) {
		super(matricula, eslora, anioFabricacion,TIPO, TARIFA);

	}
}
