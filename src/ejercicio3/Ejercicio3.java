package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		int aux ,aux2;
		List <Integer> numeros = new ArrayList <Integer>();
		rellenar(numeros);
		mostrar(numeros);
		intercambiar(numeros, 2, 4);
		mostrar(numeros);
	}
	
	public static void intercambiar(List <Integer> lista, int pos1, int pos2) {
		int aux = lista.get(pos1);
		lista.set(pos1, lista.get(pos2));
		lista.set(pos2, aux);
	}
	
	public static void mostrar(List <Integer> lista) {
		System.out.println(lista);
	}
	
	public static void rellenar(List <Integer> lista) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte un número (0 para finalizar)");
		int numero = sc.nextInt();
		while (numero!=0) {
			lista.add(numero);
			System.out.println("Inserte un número (0 para finalizar)");
			numero = sc.nextInt();
		}
		sc.close();
	}
}
