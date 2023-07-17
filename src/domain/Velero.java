package domain;

public class Velero extends Barco {
	private static final String TIPO = "Velero";
	private static final Double TARIFA = 100.0;

	public Velero(String matricula, Double eslora, Integer anioFabricacion) {
		super(matricula, eslora, anioFabricacion,TIPO, TARIFA);

	}

	public String getTipo() {
		return TIPO;
	}

	public double getTarifa() {
		return TARIFA;
	}

}
