package dataStructure.MyQueue;

public interface MyQueue <T>{
    void offer(T data);
    T poll();
    T peek();
    int size();
    void clear();
    boolean isEmpty();
}
