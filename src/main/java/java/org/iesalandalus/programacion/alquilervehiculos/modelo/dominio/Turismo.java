package java.org.iesalandalus.programacion.alquilervehiculos.modelo.dominio;

import java.util.Objects;

public class Turismo {
	private static final String ER_MARCA = "(Seat|Land Rover|KIA|Rolls-Royce|SsangYong)";
	private static final String ER_MATRICULA = "[0-9]{4}[BCDFGHJKLMNÑPQRSTVWXYZ]{3}";
	private Vehiculo data = new Vehiculo();

	public Turismo(String marca, String modelo, int cilindrada, String matricula) throws IllegalArgumentException {
		setMarca(marca);
		setModelo(modelo);
		setCilindrada(cilindrada);
		setMatricula(matricula);
	}

	public Turismo(Turismo turismo) {
		if (turismo == null) {
			throw new NullPointerException("ERROR: No es posible copiar un turismo nulo.");
		}
		{
			this.data.marca = turismo.data.marca;
			this.data.modelo = turismo.data.modelo;
			this.data.cilindrada = turismo.data.cilindrada;
			this.data.matricula = turismo.data.matricula;
		}
	}

	public String getMarca() {
		return data.marca;
	}

	public void setMarca(String marca) throws IllegalArgumentException {
		if (marca.matches(ER_MARCA)) {
			throw new NullPointerException("ERROR: la marca no puede ser nula.");
		}
	}

	public String getModelo() {
		return data.modelo;
	}

	public void setModelo(String modelo) throws IllegalArgumentException {
		if (modelo != null && !modelo.isBlank()) {
			this.data.modelo = modelo;
		}
	}

	public int getCilindrada() {
		return data.cilindrada;
	}

	public void setCilindrada(int cilindrada) throws IllegalArgumentException {
		if (cilindrada >= 0 && cilindrada <= 5000) {
			this.data.cilindrada = cilindrada;
		}
		{
			throw new IllegalArgumentException("Cilindrada no es correcta");
		}
	}

	public String getMatricula() {
		return data.matricula;
	}

	public void setMatricula(String matricula) throws IllegalArgumentException {
		if (matricula.matches(ER_MATRICULA)) {
			this.data.matricula = matricula;
		}
		throw new IllegalArgumentException("Matrícula no tiene un formato válido");
	}

	public static Turismo getTurismoConMatricula(String matricula) {
		return new Turismo("Seat", "León", 90, matricula);
	}

	public int getPrecioDiario() {
		return 0;

	}

	@Override
	public int hashCode() {
		return Objects.hash(data.cilindrada, data.marca, data.matricula, data.modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Turismo))
			return false;
		Turismo other = (Turismo) obj;
		return data.cilindrada == other.data.cilindrada && Objects.equals(data.marca, other.data.marca)
				&& Objects.equals(data.matricula, other.data.matricula) && Objects.equals(data.modelo, other.data.modelo);
	}

	@Override
	public String toString() {
		return "Turismo [marca=" + data.marca + ", modelo=" + data.modelo + ", cilindrada=" + data.cilindrada + ", matricula="
				+ data.matricula + "]";
	}

}
