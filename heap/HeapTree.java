package heap;

import java.util.ArrayList;

import myExceptions.ExceptionIsEmpty;
public class HeapTree<E extends Comparable<E>> implements Heap<E> {

	private ArrayList<E> datos=new ArrayList<E>();
	
	
	public HeapTree() {
		datos=new ArrayList<E>();
		
	}
	public void insert(E item) {
		
		datos.add(item);
		if(datos.size()>1) {
			comparar(datos.size());
		}
	}
	public void eliminar() throws ExceptionIsEmpty{
		if(isEmpty()) {
			throw new ExceptionIsEmpty("El arbol está vacio");
		}
		else {
			datos.set(0, datos.get(datos.size()-1));
			datos.remove(datos.size()-1);
			bajarDato(1);
		}
		
	}
	public void bajarDato(int indice) {	
		if(indice*2<datos.size()) {
			int mayorIndex=datos.get(indice*2-1).compareTo(datos.get(indice*2))==1? indice*2-1:indice*2;
			System.out.println(mayorIndex+" mayor");
			if(datos.get(indice-1).compareTo(datos.get(mayorIndex))==-1) {
				
				intercambiar(indice-1,mayorIndex);
				bajarDato(mayorIndex+1);
				
			}
		}
		
	}
	public void comparar(int indice) {
		//System.out.println(datos.get((indice/2)-1)+"-"+datos.get(indice-1)+" "+datos.get(indice-1).compareTo(datos.get((indice/2)-1)));//mostrar los elementos comparados
		
		if(indice>1&&datos.get(indice-1).compareTo(datos.get((indice/2)-1))==1) {
			
			intercambiar(indice-1,indice/2-1);
			comparar(indice/2);
		}
	}
	public void intercambiar(int indice1, int indice2) {
		E aux=datos.get((indice1));
		datos.set(indice1, datos.get(indice2));
		datos.set((indice2),aux);
	}
	
	public boolean isEmpty() {
		return datos.size()==0;
	}
	public ArrayList<E> getDatos() {
		return datos;
	}
}
