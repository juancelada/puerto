package domain;

public class Yate extends Barco {
	private static final String TIPO = "Yate";
	private static final Double TARIFA = 200.0;

	public String getTipo() {
		return TIPO;
	}

	public double getTarifa() {
		return TARIFA;
	}

	public Yate(String matricula, Double eslora, Integer anioFabricacion) {
		super(matricula, eslora, anioFabricacion,TIPO, TARIFA);

	}

}
