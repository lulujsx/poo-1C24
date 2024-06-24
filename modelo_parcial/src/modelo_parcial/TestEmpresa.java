package parciales.parcial_practica_junio_2024_TT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class TestEmpresa {
	public static void main(String[] args) {
		LinkedList<Producto> inventario = new LinkedList<>();
		ArrayList<Cliente> clientes = new ArrayList<>();

		try {
			// Agregar productos al inventario
			inventario.add(new ProductoCongelado("C001", "Helado", 5.0, 100, -18.0));
			inventario.add(new ProductoFresco("F001", "Manzana", 1.0, 200, "2024-06-01"));
			inventario.add(new ProductoCongelado("C002", "Pizza Congelada", 10.0, 50, -20.0));
			inventario.add(new ProductoFresco("F002", "Lechuga", 0.5, 150, "2024-06-02"));

			// Agregar clientes
			clientes.add(new Cliente("1", "Juan Perez"));
			clientes.add(new Cliente("2", "Maria Lopez"));
			// Cliente con ID negativo
			//clientes.add(new Cliente("-1", "Maria Lopez"));

			// Simular ventas
			clientes.get(0).comprarProducto(inventario.get(0), 10); // Juan Perez compra 10 helados
			clientes.get(0).comprarProducto(inventario.get(1), 20); // Juan Perez compra 20 manzanas
			clientes.get(1).comprarProducto(inventario.get(2), 5); // Maria Lopez compra 5 pizzas congeladas
			clientes.get(1).comprarProducto(inventario.get(3), 10); // Maria Lopez compra 10 lechugas

			// Mostrar inventario completo
			System.out.println("Inventario completo:");
			for (Producto p : inventario) {
				System.out.println(p);
			}

			// Mostrar inventario completo ordenado por precio
			Collections.sort(inventario);
			System.out.println("\nInventario completo ordenado por precio:");
			for (Producto p : inventario) {
				System.out.println(p);
			}

			// Mostrar promedio de compras hechas por los clientes
			System.out.println("\nPromedio de compras por cliente:");
			for (Cliente c : clientes) {
				System.out.println(c.getNombre() + ": " + c.calcularPromedioPreciosComprados());
			}

			// Búsqueda de productos por nombre
			try {
				Producto productoBuscado = Producto.buscarProductoPorNombre(inventario, "Pizza Congelada");
				System.out.println("\nProducto encontrado: " + productoBuscado);
			} catch (ProductoNoEncontradoException e) {
				System.out.println(e.getMessage());
			}

		} catch (IdClienteInvalidoException | StockInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}
}
