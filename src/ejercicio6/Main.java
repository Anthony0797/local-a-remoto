package ejercicio6;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Temperatura> lista = new ArrayList<Temperatura>();
		// Genero los días 
		for (int i = 1; i <= 3; i++) {
			Temperatura d = new Temperatura(i, Generator.generateName(), Generator.generateCelsius());
			lista.add(d);
		}
		System.out.println(lista);
		System.out.println("La temperatura media es: "+calculaTempMedia(lista));
		System.out.println("La temperatura más alta es: "+Collections.max(lista));
		Collections.sort(lista);
		System.out.println(lista);
	}
	
	public static double calculaTempMedia(ArrayList<Temperatura> lista) {
		double suma = 0;
		int contador = 0;
		
		for(Temperatura d : lista) {
			suma += d.getTempMedia();
			contador++;
		}
		
		return suma/contador;
	}

}