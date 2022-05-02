package ejercicio8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio8 {
	public static void main(String[] args) {
		HashSet <String> colores = new HashSet <String>();
		colores.add("RED");
		colores.add("GREEN");
		colores.add("BLACK");
		colores.add("WHITE");
		colores.add("PINK");
		colores.add("YELLOW");
		
		// Mostrar con iterador
		System.out.println("La lista de colores es:");
		Iterator<String> iterator = colores.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Mostramos num. elementos
		System.out.println("Hay"+" "+colores.size()+" "+"colores");
		
		//Clonación de hasSet
		HashSet<String> cloned_colores = (HashSet) colores.clone();
		iterator = colores.iterator();
		//Mostrar clon
		System.out.println("La lista de colores clonada es:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Convertir de hasSet a array
		Object[] arrayColores = colores.toArray();
		//Mostrar array
		System.out.println("La lista en un array es:");
		for (int i = 0; i < arrayColores.length; i++) {
			System.out.println(arrayColores[i]);
		}
		//Convertir hacia TreeSet
		TreeSet<String> coloresTree = new TreeSet<>(colores);
		System.out.println("Lista convertida to Tree:"+coloresTree);
		//HashSet colores reducido
		HashSet <String> coloresReducido = new HashSet <String>();
		coloresReducido.add("PINK");
		coloresReducido.add("BLACK");
		coloresReducido.add("ORANGE");
		System.out.println("La lista de colores reducidos es:"+coloresReducido);
		//Comprueba si los hash son iguales
		System.out.println("¿Las listas son iguales? "+colores.equals(coloresReducido));
		//Los elementos que solo pertenecen a ambos has
		colores.retainAll(coloresReducido);
		System.out.println("Los colores repetidos son:"+colores);
	}
}