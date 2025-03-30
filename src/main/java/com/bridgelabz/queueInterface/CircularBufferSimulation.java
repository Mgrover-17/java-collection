package com.bridgelabz.queueInterface;

public class CircularBufferSimulation {
    private int[] buffer;
    private int head, tail, size, capacity;

    public CircularBufferSimulation(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void enqueue(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % capacity;
        if (size < capacity) {
            size++;
        } else {
            head = (head + 1) % capacity;
        }
    }

    public int[] getBuffer() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = buffer[(head + i) % capacity];
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBufferSimulation buffer = new CircularBufferSimulation(3);
        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.enqueue(4);

        int[] result = buffer.getBuffer();
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
