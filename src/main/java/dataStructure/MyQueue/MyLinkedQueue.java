package dataStructure.MyQueue;

public class MyLinkedQueue<T> implements MyQueue<T> {
    private int size;
    Node head = new Node(null);

    @Override
    public void offer(T data) {
        Node node = new Node(data);
        Node cur = this.head.next;
        int i = 0;
        while (i++ < this.size) {
            cur = cur.next;
        }
        cur.next = node;
        size++;
    }

    @Override
    public T poll() {
        Node cur = head.next.next;
        head.next = cur;
        return this.head.next.data;
    }

    @Override
    public T peek() {
        return head.next.data;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        this.head.next = null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
