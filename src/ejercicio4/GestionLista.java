package ejercicio4;

import java.util.*;

public class GestionLista {

	private ArrayList<Integer> array;

	public GestionLista() {
		array = new ArrayList<Integer>();
	}

	void rellenar() {
		Integer numero = leerNumero();
		// Leo números mientras sean mayores que cero y los añado a la lista
		while (numero > 0){
			array.add(numero);
			numero = leerNumero();
		}
	}
	// Pide un número al usuario y lo devuelve
	Integer leerNumero() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número (menor que 1 para terminar)");
		Integer numero = entrada.nextInt();
		return numero;
	}

	void sutituirCeros() {
		// Recorro toda la lista
		for (int i = 0; i < array.size()-1; ++i) {
			boolean borrar = false;
			// Almaceno el siguiente elemento
			Integer aux = array.get(i);
			// Recorro desde el siguiente hasta el final
			for (int j = i + 1; j < array.size(); ++j) {
				// Lo comparo con cada elemento siguiente y si es igual lo elimino
				if (aux == array.get(j)) {
					borrar = true;
					array.set(j, 0);
				}
			}
			// Esto permite borrar también el elemento que se busca (no 100% claro en el enunciado)
			if (borrar == true) {
				array.set(i, 0);
			}
		}
	}

	@Override
	public String toString() {
		return "ArrayLista [array=" + array + "]";
	}

}
