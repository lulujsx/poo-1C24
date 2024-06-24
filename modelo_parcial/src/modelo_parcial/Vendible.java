package parciales.parcial_practica_junio_2024_TT;

public interface Vendible {
	void vender(int cantidad) throws StockInsuficienteException;
}
