package parciales.parcial_practica_junio_2024_TT;

import java.util.LinkedList;

//Clase base Producto
public abstract class Producto implements Comparable<Producto> {
	protected String codigo;
	protected String nombre;
	protected double precio;
	protected int cantidadStock;

	public Producto(String codigo, String nombre, double precio, int cantidadStock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadStock = cantidadStock;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void reducirStock(int cantidad) throws StockInsuficienteException {
		if (cantidad > this.cantidadStock) {
			throw new StockInsuficienteException("Stock insuficiente para el producto " + this.nombre);
		}
		this.cantidadStock -= cantidad;
	}

	public static Producto buscarProductoPorNombre(LinkedList<Producto> inventario, String nombre)
			throws ProductoNoEncontradoException {
		for (Producto p : inventario) {
			if (p.getNombre().equalsIgnoreCase(nombre)) {
				return p;
			}
		}
		throw new ProductoNoEncontradoException("Producto con nombre " + nombre + " no encontrado.");
	}

	@Override
	public int compareTo(Producto otro) {
		return Double.compare(this.precio, otro.precio);
	}

	@Override
	public String toString() {
		return "Código: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + cantidadStock;
	}
}
