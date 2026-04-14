package Etapa4;

public class LinkedQueue<E> implements Queue<E> {

    private Node<E> front;
    private Node<E> back;
    private int size;

    public LinkedQueue() {
        front = null;
        back = null;
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

    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            front = newNode;
            back = newNode;
        } else {
            back.setNext(newNode);
            back = newNode;
        }
        size++;
    }

    public E dequeue() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        }
        E element = front.getElement();
        front = front.getNext();
        size--;
        if (isEmpty()) {
            back = null;
        }
        return element;
    }

    public E front() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        }
        return front.getElement();
    }

    public E back() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        }
        return back.getElement();
    }

    public E first() throws UnderflowException {
        if (isEmpty()) {
            throw new UnderflowException();
        }
        return front.getElement();
    }
}