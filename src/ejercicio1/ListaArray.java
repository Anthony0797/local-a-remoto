package ejercicio1;

import java.util.ArrayList;

public class ListaArray implements Lista {
	
	private ArrayList<Objeto> listaObjeto; 
	
	ListaArray(){
		listaObjeto = new ArrayList<Objeto>();
	}
	
	public void putInicio(Object o){
		if(o instanceof Objeto) {
			Objeto aux = (Objeto)o;
			listaObjeto.add(0, aux);
		}
	}
	public void putFinal(Object o){
		if(o instanceof Objeto) {
			Objeto aux = (Objeto)o;
			listaObjeto.add(aux);
		}
	}
	public Object popPrincipio(){
		Objeto aux = listaObjeto.get(0);
		listaObjeto.remove(0);
		return aux;
	}
	public Object popFinal(){
		Objeto aux = listaObjeto.get(listaObjeto.size()-1);
		listaObjeto.remove(listaObjeto.size()-1);
		return aux;
	}
	public Object getAt(int posicion){
		Objeto aux = listaObjeto.get(posicion);
		listaObjeto.remove(posicion);
		return aux;
	}
	public int count(){
		return listaObjeto.size();
	}

	@Override
	public String toString() {
		return "ListaArray [listaObjeto=" + listaObjeto + "]";
	}
}
