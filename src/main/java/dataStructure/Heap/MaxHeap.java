package dataStructure.Heap;

import java.util.Arrays;
import java.util.Collections;

public class MaxHeap <T extends Comparable<T>> implements  MyHeap<T>{

    T[] data;
    int size;
    int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.data = (T[]) new Comparable[maxSize + 1];
        this.size = 0;
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return pos * 2;
    }

    private int rightChild(int pos) {
        return (pos * 2) + 1;
    }

    private boolean isLeaf(int pos) {
        return (pos > (size / 2) && pos <= size);
    }

    @Override
    public void insert(T val) {
        //leaf에 데이터를 삽입
        this.data[++this.size] = val;
        //데이터가 삽입된 위치
        int current = this.size;
        //부모 노드가 있고, 현재 노드가 부모노드보다 크다면, swap을 해준다
        while (this.data[parent(current)] != null && this.data[current].compareTo(this.data[parent(current)]) > 0) {
            Collections.swap(Arrays.asList(this.data), current, parent(current));
            current = parent(current);
        }
    }

    @Override
    public boolean contains(T val) {
        //data[0] = null
        for (int i = 1; i <= this.size; i++) {
            if (val.equals(this.data[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T pop() {
        //루트에 있는 데이터
        T top = this.data[1];
        //leaf에 있는 데이터를 루트로 옮김
        this.data[1] = this.data[this.size--];
        heapify(1);
        return top;
    }

    private void heapify(int idx) {
        //종료조건 - leaf라면 종료
        if (isLeaf(idx)) return;

        T current = this.data[idx];
        T left = this.data[leftChild(idx)];
        T right = this.data[rightChild(idx)];

        //현재 데이터 보다 왼쪽 자식이 크거나, 오른쪽 자식이 크다면 바꾸고 재귀 호출
        if (current.compareTo(left) < 0 || current.compareTo(right) < 0) {
            if (left.compareTo(right) < 0) {
                Collections.swap(Arrays.asList(this.data), idx, leftChild(idx));
                heapify(leftChild(idx));
            } else {
                Collections.swap(Arrays.asList(this.data), idx, rightChild(idx));
                heapify(rightChild(idx));
            }
        }
    }

    @Override
    public T peek() {
        if (this.size < 1) throw new RuntimeException();
        return data[1];
    }

    @Override
    public int size() {
        return this.size;
    }
}
