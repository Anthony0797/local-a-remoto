package ejercicio11;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEj11 {
	public static void main(String[] args) {
		TreeSet<Object> coches = new TreeSet<Object>();
		Vehiculo v1 = new Vehiculo("8372BLS", "Lamborghini", "A1", 10000, 450);
		Vehiculo v2 = new Vehiculo("2795PKL", "Maserati","A1", 10000, 400);
		Vehiculo v3 = new Vehiculo("2845JSA", "Ferrari", "A1", 50000, 550);
		Vehiculo v4 = new Vehiculo("8942ASD", "McLaren", "A1", 10000, 600);
		coches.add(v1);
		coches.add(v2);
		coches.add(v3);
		coches.add(v4);
		System.out.println(coches);
	}

}
