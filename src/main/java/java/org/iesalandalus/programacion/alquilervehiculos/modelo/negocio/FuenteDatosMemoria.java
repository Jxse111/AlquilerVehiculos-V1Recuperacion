package java.org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

public class FuenteDatosMemoria {
 public IClientes CrearClientes() {
	 return new Clientes();
 }
 public IVehiculos CrearVehiculos() {
	 return  new Vehiculos();
 }
 public IAlquileres CrearAlquileres() {
	 return new Alquileres();
 }
}
