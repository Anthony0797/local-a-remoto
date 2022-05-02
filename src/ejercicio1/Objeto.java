package ejercicio1;

public class Objeto {
	private int dato1;
	private String dato2;
	
	public Objeto(int dato1, String dato2) {
		super();
		this.dato1 = dato1;
		this.dato2 = dato2;
	}

	@Override
	public String toString() {
		return "Objeto [dato1=" + dato1 + ", dato2=" + dato2 + "]";
	}
	
}
