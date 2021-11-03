import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayImp implements List<Integer> {
	private static int ARRAY_DEFAULT_SIZE = 5;
	int[] array;
	private int numberOfElementsInArray;

	ArrayImp() {
		this(ARRAY_DEFAULT_SIZE);
	}

	ArrayImp(int initialSize) {
		array = new int[initialSize];
		numberOfElementsInArray = 0;
	}

	@Override
	public boolean add(Integer e) {
		doubleArraySizeIfNeededForAddingElement();
		array[numberOfElementsInArray] = e;
		numberOfElementsInArray++;
		return true;
	}

	// this doubles the Array Size
	private void doubleArraySize() {
		// Create A new Array
		int[] newArray = new int[ARRAY_DEFAULT_SIZE * 2];
		// move Array elements to double size new array
		for (int index = 0; index < array.length; index++) {
			newArray[index] = array[index];
		}
		array = newArray;
	}

	private void doubleArraySizeIfNeededForAddingElement() {
		// TODO Auto-generated method stub
		if (numberOfElementsInArray == array.length) {
			doubleArraySize();
		}
	}

	// TO Find the length of the Array
	public int arrayLength() {
		return array.length;
	}

	@Override
	public void add(int index, Integer element) {
		doubleArraySizeIfNeededForAddingElement();
		if (index > numberOfElementsInArray) {
			throw new ArrayIndexOutOfBoundsException("Index :" + index + " ,Size :" + numberOfElementsInArray);
		} else if (numberOfElementsInArray == array.length) {
			doubleArraySize();
		}
		array[index] = element;
	}

	private void moveArrayElementsRightByOneIndex(int index, int element) {
		// TODO Auto-generated method stub
		if (index > numberOfElementsInArray) {
			throw new ArrayIndexOutOfBoundsException("Index :" + index + " ,Size :" + numberOfElementsInArray);
		} else if (numberOfElementsInArray == array.length) {
			doubleArraySize();
		}
		for (int moveIndex = array.length - 1; moveIndex >= index; moveIndex--) {
			array[moveIndex + 1] = array[moveIndex];
		}
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		for (int index = 0; index < numberOfElementsInArray; index++) {
			array[index] = 0;
		}
		numberOfElementsInArray = 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer get(int index) {
		if (index < numberOfElementsInArray) {
			return array[index];
		}
		return null;
	}

	@Override
	public int indexOf(Object o) {
		for (int index = 0; index < numberOfElementsInArray; index++) {
			if (o.equals(array[index])) {
				return index;
			}
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		if (numberOfElementsInArray == 0) {
			return true;
		}
		return false;
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		for (int index = numberOfElementsInArray; index >= 0; index--) {
			if (o.equals(array[index])) {
				return index;
			}
		}
		return -1;
	}

	@Override
	public ListIterator<Integer> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Integer> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer set(int index, Integer element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Integer> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
