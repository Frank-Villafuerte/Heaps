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
	public void comparar(int indice) {
		System.out.println(datos.get((indice/2)-1)+"-"+datos.get(indice-1)+" "+datos.get(indice-1).compareTo(datos.get((indice/2)-1)));//mostrar los elementos comparados
		System.out.println(indice+"i");
		if(indice>1&&datos.get(indice-1).compareTo(datos.get((indice/2)-1))==1) {
			
			E aux=datos.get((indice-1));
			datos.set(indice-1, datos.get((indice/2)-1));
			datos.set((indice/2)-1,aux);
			
			comparar(indice/2);
		}
	}

	public void eliminar() throws ExceptionIsEmpty{
		if(isEmpty()) {
			throw new ExceptionIsEmpty("El arbol está vacio");
		}
		datos.remove(0);
		
	}
	public boolean isEmpty() {
		return datos.size()==0;
	}
	public ArrayList<E> getDatos() {
		return datos;
	}
}
