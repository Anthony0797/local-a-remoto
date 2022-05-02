package ejercicio1;

public interface Lista {
	public void putInicio(Object o);
	public void putFinal(Object o);
	public Object popPrincipio();
	public Object popFinal();
	public Object getAt(int posicion);
	public int count();
}
