package ejercicio12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Principal {
	public static void main(String[] args) {
		//Declaraci�n primer Mapeo
		Map <Integer,String> mapa = new HashMap <Integer,String>();
		//A�adir colores al Mapeo
		mapa.put(1, "RED");
		mapa.put(2, "GREEN");
		mapa.put(3, "BLACK");
		mapa.put(4, "WHITE");
		mapa.put(5, "BLUE");
		
		//Realizar interaci�n para imprimir el mapeo cada uno en una l�nea
		Iterator it = mapa.keySet().iterator();
		while(it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave: "+key+ "-->Valor:"+mapa.get(key));
		}
		//Mostrar la cantidad de colores en el Mapeo
		System.out.println("La cantidad de colores almacenados en el Mapeo es:"+mapa.size());
		//Declaraci�n del segundo Mapeo
		Map <Integer,String> mapa2 = new HashMap <Integer,String>();
		//A�adir colores al segundo Mapeo
		mapa2.put(6, "PINK");
		mapa2.put(7, "ORANGE");
		mapa2.put(8, "PURPLE");
		//A�adir todos los colores del segundo Mapeo al primer Mapeo
		mapa.putAll(mapa2);
		System.out.println("Mapa modificado:"+mapa);
		//Remover todos los valores del segundo Mapeo
		mapa2.clear();
		/*Mostrar ahora el segundo Mapeo,despu�s de borrar todo lo que contiene.
		 * Ahora se mostrar� la lista vac�a*/
		System.out.println("La lista mapa2 esta vac�a:"+mapa2);
		//Creaci�n de un tercer mapeo
		Map <String,Integer> mapa3 = new HashMap <String,Integer>();
		//Insertar colores al tercer mapeo
		for(Integer clave : mapa.keySet()) {
			String valor = mapa.get(clave);
			mapa3.put(valor, clave);
		}
		//Ver si contiene las claves pasadas por par�metro en el tercer Mapeo
		System.out.println("�Contiene la clave GREEN en el mapa3?"+mapa3.containsKey("GREEN")+",Se encuentra en la posici�n:"+mapa3.get("GREEN"));
		System.out.println("�Contiene la clave BROWN en el MAPEO3?"+mapa3.containsKey("BROWN")+",Se encuentra en la posici�n:"+mapa3.get("BROWN"));
		//Ver si contiene los valores pasados por par�metro en el primer Mapeo
		System.out.println("�Contiene el valor GREEN en el Mapeo1?"+mapa.containsValue("GREEN"));
		System.out.println("�Contiene el valor BROWN en el Mapeo1?"+mapa.containsValue("BROWN"));

	}
}