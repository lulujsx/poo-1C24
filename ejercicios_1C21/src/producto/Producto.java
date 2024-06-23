package producto;

//Se tiene ordenada por codigo de producto, una lista donde cada producto tiene
//como atributos codigo, descripcion, importe y stock. Implementar metodos para:
//	A) Imprimir la lista completa.
//	B) Dado un entero K, imprimir el k-esimo elemento
//	C) Incrementar el importe de un producto al 10%
//	D) Devolver el stock del producto dado o 0 si no hay
//	E) Devolver una lista de productos con stock inferior a 50 unidades
//	F) Devolver una lista de productos con stock superior o igual a 50 unidades

public class Producto implements Comparable<Producto>{
	
	private Integer codigo;
	private String descripcion;
	private double importe;
	private int stock;
	
	Producto(Integer cod,String des,double imp,int stk){
		this.codigo = cod;
		this.descripcion = des;
		this.importe = imp;
		this.stock = stk;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Producto [Codigo: " + this.codigo + " Descripcion: " + this.descripcion +
				" Importe: " + "Stock disponible: " + this.stock + "]";
	}
	
	//Metodo sin implementar Comparable
//	public int compareTo(Producto obj) {
//		return Integer.compare(this.codigo,obj.codigo);
//	}
	
	public int compareTo(Producto obj) {
		return this.codigo.compareTo(obj.codigo);
	}

}
