package ejercicio11;

import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo>{
	
	private String matricula;
	private String marca;
	private String modelo;
	private int km;
	private int caballos;
	
	Vehiculo(String matricula, String marca, String modelo, int km, int caballos){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
		this.caballos = caballos;
	}
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", km=" + km + ", caballos=" + caballos + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(caballos, km, marca, matricula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return caballos == other.caballos && km == other.km && Objects.equals(marca, other.marca)
				&& Objects.equals(matricula, other.matricula);
	}
	
//	@Override
//	// Compara por matrícula.
//	public int compareTo(Vehiculo aux) {
//		return matricula.compareTo(aux.matricula);
//	}
	
//	@Override
//	// Compara por km
//	public int compareTo(Vehiculo aux) {
//		return km - aux.km;
//	}
	
	@Override
	// Apartado ampliación
	public int compareTo(Vehiculo aux) {
		if (km < aux.km)
			return -1;
		else if (km > aux.km)
			return 1;
		else {
			return caballos - aux.caballos;
		}
	}
	
	

}
