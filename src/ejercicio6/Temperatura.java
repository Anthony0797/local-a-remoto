package ejercicio6;

public class Temperatura implements Comparable<Temperatura>{

	private int numDia;
	private String nombreDia;
	private int tempMedia;
	
	public Temperatura(int numDia, String nombreDia, int tempMedia) {
		super();
		this.numDia = numDia;
		this.nombreDia = nombreDia;
		this.tempMedia = tempMedia;
	}

	public int getNumDia() {
		return numDia;
	}

	public void setNumDia(int numDia) {
		this.numDia = numDia;
	}

	public String getNombreDia() {
		return nombreDia;
	}

	public void setNombreDia(String nombreDia) {
		this.nombreDia = nombreDia;
	}

	public int getTempMedia() {
		return tempMedia;
	}

	public void setTempMedia(int tempMedia) {
		this.tempMedia = tempMedia;
	}

	@Override
	public String toString() {
		return "Temperatura [numDia=" + numDia + ", nombreDia=" + nombreDia + ", tempMedia=" + tempMedia + "]";
	}
	
	@Override
	public int compareTo(Temperatura aux) {
		return this.numDia-aux.numDia;
	}
	

}