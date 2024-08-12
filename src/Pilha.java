public class Pilha<T> {
    private int top = -1;
    private T[] data;

    public Pilha(int size) {
        data = (T[]) new Object[size];
    }

    public void push(T value) {
        if (isFull()) {
            System.out.println("A pilha está cheia.");
            return;
        }
        data[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return null;
        }
        return data[top--];
    }

    public void clear() {
        top = -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return null;
        }
        return data[top];
    }
}
