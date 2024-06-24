package parcial;

import java.util.*;

public  class Tour {
	
	private int codigo;
	private String nombre;
	private int precio;
	private int fecha;
	private Boolean disponibilidad;
	
	public Tour(int codigo, String nombre, int precio, int fecha, Boolean disponibilidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fecha = fecha;
		this.disponibilidad = disponibilidad;
	}
	
	public Tour(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;

	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public Boolean getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	@Override
	public String toString() {
		return "Tour [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fecha=" + fecha
				+ ", disponibilidad=" + disponibilidad + "]";
	}
	
	public ArrayList<Tour> buscarTourPorNombre(Stack<Tour> catalogo, String nombre) {
		ArrayList<Tour> resultados = new ArrayList<Tour>();
		for(Tour tour : catalogo) {
			if(tour.getNombre().equals(nombre)) {
				resultados.add(tour);
			}
		}
		return resultados;
	}
}
