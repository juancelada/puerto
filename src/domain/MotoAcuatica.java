package domain;

public class MotoAcuatica extends Barco {

	private static final String TIPO = "Moto Acuatica";
	private static final Double TARIFA = 25.0;

	public String getTipo() {
		return TIPO;
	}

	public double getTarifa() {
		return TARIFA;
	}

	public MotoAcuatica(String matricula, Double eslora, Integer anioFabricacion) {
		super(matricula, eslora, anioFabricacion,TIPO, TARIFA);

	}
}
