package parciales.parcial_practica_junio_2024_TT;

public class ProductoFresco extends Producto implements Vendible {
	private String fechaProduccion;

	public ProductoFresco(String codigo, String nombre, double precio, int cantidadStock, String fechaProduccion) {
		super(codigo, nombre, precio, cantidadStock);
		this.fechaProduccion = fechaProduccion;
	}

	@Override
	public void vender(int cantidad) throws StockInsuficienteException {
		reducirStock(cantidad);
	}

	@Override
	public String toString() {
		return super.toString() + ", Fecha de Producción: " + fechaProduccion;
	}
}
