package parciales.parcial_practica_junio_2024_TT;

import java.util.ArrayList;

public class Cliente {
	private String id;
	private String nombre;
	private ArrayList<Producto> productosComprados;

	public Cliente(String id, String nombre) throws IdClienteInvalidoException {
		if (Integer.parseInt(id) <= 0) {
			throw new IdClienteInvalidoException("El ID del cliente debe ser un número positivo.");
		}
		this.id = id;
		this.nombre = nombre;
		this.productosComprados = new ArrayList<>();
	}

	public void comprarProducto(Producto producto, int cantidad) throws StockInsuficienteException {
		this.productosComprados.add(producto);
	}

	public ArrayList<Producto> getProductosComprados() {
		return productosComprados;
	}

	public double calcularPromedioPreciosComprados() {
		double suma = 0;
		for (Producto p : productosComprados) {
			suma += p.getPrecio();
		}
		return productosComprados.size() > 0 ? suma / productosComprados.size() : 0;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Nombre: " + nombre + ", Productos Comprados: " + productosComprados;
	}
}
