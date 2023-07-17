package domain;

public class Catamaran extends Barco {
	private static final String TIPO = "Catamaran";
	private static final Double TARIFA = 150.0;

	public String getTipo() {
		return TIPO;
	}

	public  double getTarifa() {
		return TARIFA;
	}

	public Catamaran(String matricula, Double eslora, Integer anioFabricacion) {
		super(matricula, eslora, anioFabricacion,TIPO, TARIFA);

	}
}
