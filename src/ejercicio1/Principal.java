package ejercicio1;

public class Principal {
	public static void main(String[] args) {
		Objeto o1 = new Objeto(1,"Paco");
		Objeto o2 = new Objeto(1,"Pedro");
		Objeto o3 = new Objeto(1,"Iago");
		Objeto o4 = new Objeto(1,"Juan");
		
		ListaArray lista = new ListaArray();
		lista.putFinal(o1);
		lista.putInicio(o2);
		lista.putInicio(o3);
		lista.putFinal(o4);
		
		System.out.println(lista);
	}
}
