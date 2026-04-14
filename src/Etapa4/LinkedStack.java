package Etapa4;

public class LinkedStack<E> implements Stack<E> {

    private Node<E> top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return false;
    }

    public int numElements() {
        return size;
    }

    public void push(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public E pop() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        }
        E element = top.getElement();
        top = top.getNext();
        size--;
        return element;
    }

    public E top() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        }
        return top.getElement();
    }
}