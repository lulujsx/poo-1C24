package parciales.parcial_practica_junio_2024_TT;

public class ProductoCongelado extends Producto implements Vendible {
	private double temperaturaRecomendada;

	public ProductoCongelado(String codigo, String nombre, double precio, int cantidadStock,
			double temperaturaRecomendada) {
		super(codigo, nombre, precio, cantidadStock);
		this.temperaturaRecomendada = temperaturaRecomendada;
	}

	@Override
	public void vender(int cantidad) throws StockInsuficienteException {
		reducirStock(cantidad);
	}

	@Override
	public String toString() {
		return super.toString() + ", Temperatura Recomendada: " + temperaturaRecomendada;
	}
}
