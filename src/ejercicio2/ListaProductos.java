package ejercicio2;

import java.util.ArrayList;

public class ListaProductos {
	
	private ArrayList<Producto> productos;
	
	ListaProductos() {
		
		productos = new ArrayList<Producto>();
	}
	public void add(Object o) {
		productos.add((Producto) o);
	}
	public double precioTotal() {
		double precioTotal=0;
		for(int i=0; i<productos.size(); i++) {
			precioTotal +=productos.get(i).getPrecio()*productos.get(i).getCantidad();
		}
		return precioTotal;
	
	}
	@Override
	public String toString() {
		String resultado = "";
		resultado += "***************Cantidad*****Precio*******Total\n";
		
		for(Producto aux: productos) {
			resultado += aux.getNombre()+"\t\t"+aux.getCantidad()+"\t\t"+aux.getPrecio()+"\t"+aux.getCantidad()*aux.getPrecio()+"\n";
		}
		resultado += "\nPrecio final:\t\t\t\t"+precioTotal();
		
		
		return resultado;
	}
	
	
	

}
