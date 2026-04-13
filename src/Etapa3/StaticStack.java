package Etapa3;

public class StaticStack<E> implements Stack<E> {

    private Object[] elements;
    private int top;

    public StaticStack(int maxSize) {
        elements = new Object[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == elements.length - 1;
    }

    public int numElements() {
        return top + 1;
    }

    public void push(E element) throws OverflowException {
        if (isFull()) {
            throw new OverflowException();
        }
        elements[++top] = element;
    }

    public E pop() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        }
        return (E) elements[top--];
    }

    public E top() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        }
        return (E) elements[top];
    }
}