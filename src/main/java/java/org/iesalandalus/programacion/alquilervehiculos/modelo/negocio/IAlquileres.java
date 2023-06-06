package java.org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

import java.org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;
import java.time.LocalDate;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;

public interface IAlquileres {

	List<Alquiler> get();

	List<Alquiler> get(Cliente cliente);

	List<Alquiler> get(Turismo turismo);

	int getCantidad();

	void insertar(Alquiler alquiler) throws OperationNotSupportedException;

	void devolver(Cliente cliente, LocalDate fechaDevolucion) throws OperationNotSupportedException;

	Alquiler buscar(Alquiler alquiler);

	void borrar(Alquiler alquiler) throws OperationNotSupportedException;

	List<Alquiler> get(org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo turismo);

}