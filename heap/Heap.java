package heap;

import myExceptions.ExceptionIsEmpty;

public interface Heap<T> {

	void insert(T item);
	void eliminar() throws ExceptionIsEmpty;

}
