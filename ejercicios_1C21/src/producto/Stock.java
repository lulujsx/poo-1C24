package producto;
import java.util.*;

public class Stock {
	
	private List<Producto> lista_productos;
	
	public Stock(){
		lista_productos = new LinkedList<Producto>();
	}
	
	public void agregar(Producto prod) {
		lista_productos.add(prod);
	}
	
//	public int buscarPorCodigo(Integer cod) {
//		int posicion = 0;
//		for(Producto producto : lista_productos){
//			if(producto.getCodigo() == cod) {
//				return posicion;
//			}
//			posicion++;
//		}
//		return -1;
//	}
	
	//Punto A
	public void listar() {
		for(Producto producto : lista_productos) {
			System.out.println(producto);
		}
	}
	
	//Punto B
	public Producto posicion(int k) {
		return lista_productos.get(k);
	}
	
	//Punto C
	public void incrementar10(int k) {
		double nuevo_importe = lista_productos.get(k).getImporte() * 1.10;
		lista_productos.get(k).setImporte(nuevo_importe);
	}
	
	//Punto D
	public int getStock(int k) {
		return lista_productos.get(k).getStock();
	}
	
	//Punto E
	public List<Producto> productosConMenosDe(int n){
		List<Producto> listAux = new ArrayList<Producto>();
		for(Producto prod : lista_productos) {
			if(prod.getStock() < n) {
				listAux.add(prod);
			}
		}
		return listAux;
	}
	
	//Punto D
	public List<Producto> productosConMasDe(int n){
		List<Producto> listAux = new ArrayList<Producto>();
		for(Producto prod : lista_productos) {
			if(prod.getStock() >= n) {
				listAux.add(prod);
			}
		}
		return listAux;
	}
}
