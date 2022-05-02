package ejercicio10;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		//Ejercicio 10 colores
		TreeSet<String>lista=new TreeSet<String>();
		TreeSet<String>lista2=new TreeSet<String>();

		// Añadir elementos a lista
		lista.add("Red");
		lista.add("Green");
		lista.add("Orange");
		lista.add("White");
		lista.add("Black");
		
		// Mostrar contenido lista utilizando iterador
		imprimir(lista);

		// Creo otro TreeSet (lista2)
		lista2.add("Pink");
		lista2.add("Blue");
		lista2.add("Yellow");

		// Añade al primer TreeSet los elementos del segundo TreeSet llamando únicamente a un método de la API
		lista.addAll(lista2);

		// Compruebo que la lista completa sigue ordenada
		imprimir(lista);
		
		// Muestra en orden inverso los elementos del primer TreeSet.
		imprimirDescendente(lista);

		// Mostrar primero y último
		System.out.println(lista.first());
		System.out.println(lista.last());

		System.out.println("");
		
		// Crear TreeSet y añadir 10 números
		TreeSet<Integer>numeros=new TreeSet<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(12);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		numeros.add(11);

		System.out.println("Numeros menores que 7");
		System.out.println(numeros.headSet(7));	// metodo para numeros menores que 7
		System.out.println("");
		System.out.println("Numeros mayores que 7");
		System.out.println(numeros.tailSet(7)); // metodo para mayores de 7

		System.out.println();
		System.out.println("Primer numero mayor o igual que el que pasas por paramentro");
		System.out.println(numeros.ceiling(11));
		System.out.println("Primer numero menor o igual que el que pasas por parametro");
		System.out.println(numeros.floor(5));
		System.out.println();
		

		System.out.println("");
		System.out.println("Borrar primer y ultimo elemento");
		numeros.pollFirst();
		numeros.pollLast();
		System.out.println(numeros);

		System.out.println("");

		System.out.println("Borra el elemento que le marcamos");
		numeros.remove(3);
		System.out.println(numeros);
	}


	static void imprimir(TreeSet<String> lista) {
		String aux;
		Iterator<String>iterador=lista.iterator();
		System.out.print("[");
		while(iterador.hasNext()) {
			aux=iterador.next();
			System.out.print(aux + " ");
		}
		System.out.println("]");
	}

	static void imprimirDescendente(TreeSet<String> lista) {
		String aux;
		Iterator<String>iterador=lista.descendingIterator();
		System.out.print("[");
		while(iterador.hasNext()) {
			aux=iterador.next();
			System.out.print(aux + " ");
		}
		System.out.println("]");
	}

}
