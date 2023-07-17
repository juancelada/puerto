package domain;

public class alquiler {

	private Amarre amarre;
	private Barco barco;
	private Cliente cliente;
	private Integer diaInicial;
	private Integer diaFinal;
	private Boolean estado;

	public Amarre getAmarre() {
		return amarre;
	}

	public void setAmarre(Amarre amarre) {
		this.amarre = amarre;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getDiaInicial() {
		return diaInicial;
	}

	public void setDiaInicial(Integer diaInicial) {
		this.diaInicial = diaInicial;
	}

	public Integer getDiaFinal() {
		return diaFinal;
	}

	public void setDiaFinal(Integer diaFinal) {
		this.diaFinal = diaFinal;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public alquiler(Amarre amarre, Barco barco, Cliente cliente, Integer diaInicial, Integer diaFinal, Boolean estado) {
		super();
		this.amarre = amarre;
		this.barco = barco;
		this.cliente = cliente;
		this.diaInicial = diaInicial;
		this.diaFinal = diaFinal;
		this.estado = estado;
	}

	public void iniciarAlquiler() {
		amarre.ocuparAmarre();
		setEstado(true);
	}

	public void finalizarAlquiler(Integer diaFinal) {
		amarre.liberarAmarre();
		setDiaFinal(diaFinal);
		setEstado(false);
	}
	public void mostrarAlquiler(Integer diaFinal) {
		System.out.println("Alquiler del amarre " + amarre.getnAmarre() + " finalizado \n"
				+ "El cliente " + getCliente().getNombre() + " " + getCliente().getApellido() + " debe pagar: $" + calcularPrecio());
	}
	

	@Override
	public String toString() {
		return "alquiler [amarre=" + amarre + ", barco=" + barco + ", cliente=" + cliente + ", diaInicial=" + diaInicial
				+ ", diaFinal=" + diaFinal + ", estado=" + estado + "]";
	}

	public Double calcularPrecio() {
		Double precio = 0.0;
		if (diaFinal != 0) {
			precio = (double) ((diaInicial - diaFinal) * this.barco.getTarifa());
		}

		return precio;

	}
}
