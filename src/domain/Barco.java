package domain;

public abstract class Barco {

	private String matricula;
	private Double eslora;
	private Integer anioFabricacion;
	private String tipo;
	private Double tarifa;

	public String getMatricula() {
		return matricula;
	}

	public Barco(String matricula, double eslora, int anioFabricacion, String tipo, double tarifa) {
		super();
		this.matricula = matricula;
		this.eslora = eslora;
		this.anioFabricacion = anioFabricacion;
		this.tipo = tipo;
		this.tarifa = tarifa;
	}

	public double getEslora() {
		return eslora;
	}

	public void setEslora(double eslora) {
		this.eslora = eslora;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion
				+ ", tipo=" + tipo + ", tarifa=" + tarifa + "]";
	}



}
