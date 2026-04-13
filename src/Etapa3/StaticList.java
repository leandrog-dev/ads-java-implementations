package Etapa3;

public class StaticList<E> implements List<E> {

    private Object[] elements;
    private int size;

    public StaticList(int maxSize) {
        elements = new Object[maxSize];
        size = 0;
    }

    public int numElements() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public void insert(E element, int pos) {
        if (isFull()) return;

        for (int i = size; i > pos; i--) {
            elements[i] = elements[i - 1];
        }

        elements[pos] = element;
        size++;
    }

    public E remove(int pos) {
        if (isEmpty()) return null;

        E removed = (E) elements[pos];

        for (int i = pos; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        size--;
        return removed;
    }

    public E get(int pos) {
        return (E) elements[pos];
    }

    public int search(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    // ===== ETAPA 3 =====

    public int contaElementos(E el) {
        return contaElementosRecursivo(el, 0);
    }

    private int contaElementosRecursivo(E el, int index) {
        if (index >= size) return 0;

        int count = elements[index].equals(el) ? 1 : 0;

        return count + contaElementosRecursivo(el, index + 1);
    }
}