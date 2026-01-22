public class ResizableArray {

    private int capacity = 5;
    private int size = 0;
    private int[] elements;

    // When no size is given, then default to 5
    public ResizableArray() {
        this.elements = new int[this.capacity];
    }

    public int size() {
        return this.size;
    }

    public int capacity() {
        return this.capacity;
    }

    public void add(int element) {
        elements[size++] = element;
        increaseCapacity();
    }

    private void increaseCapacity() {
        if (size == capacity) {
            capacity = capacity + (capacity / 2);
            int[] newElements = new int[capacity];

            System.arraycopy(elements, 0, newElements, 0, size);

            this.elements = newElements;
        }
    }
}
