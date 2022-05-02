package ejercicio2;

import java.util.Scanner;

public class MainEj2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ListaProductos lista = new ListaProductos();
		
		
		System.out.println("Inserte un producto - 8 elementos MAX. (FIN para terminar)");
		String cadena = entrada.next();
		int contador = 0;
		while(!cadena.equals("FIN") && contador<8) {
			contador++;
			System.out.println("Inserte precio: ");
			double precio = entrada.nextDouble();
			entrada.nextLine();
			System.out.println("Inserte cantidad: ");
			int cantidad = entrada.nextInt();
			entrada.nextLine();
			Producto p = new Producto(cadena, cantidad, precio);
			lista.add(p);
			
			System.out.println("Inserte un producto (FIN para terminar)");
			cadena = entrada.next();
		}
		
		System.out.println(lista);
	}
// Segundo commit en la rama  main
}
