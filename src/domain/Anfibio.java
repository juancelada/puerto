package domain;

public class Anfibio extends Barco implements TipoAnfibio {
	private static final String TIPO = "Anfibio";
	private static final Double TARIFA = 175.0;
	private Integer cantidadRuedas;
	private Integer velocidad;
	
	
	
	public Anfibio(String matricula, double eslora, int anioFabricacion,
			Integer cantidadRuedas, Integer velocidad) {
		super(matricula, eslora, anioFabricacion, TIPO, TARIFA);
		this.cantidadRuedas = cantidadRuedas;
		this.velocidad = velocidad;
	}

	
	public Integer getCantidadRuedas() {
		return cantidadRuedas;
	}

	public void setCantidadRuedas(Integer cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}


	@Override
	public Integer cantidadRuedas() {
		return this.cantidadRuedas();
	}

	@Override
	public Integer velocidad() {
		return this.velocidad();
	}

	

}
