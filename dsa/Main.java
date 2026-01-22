public class Main {
    public static void main(String[] args) {
        System.err.println("Hello world!");
        
        ResizableArray resizableArray = new ResizableArray();

        System.out.printf("Size: %d Capacity: %d \n", resizableArray.size(), resizableArray.capacity());

        resizableArray.add(1);

        System.out.printf("Size: %d Capacity: %d \n", resizableArray.size(), resizableArray.capacity());

        resizableArray.add(2);
        resizableArray.add(3);
        resizableArray.add(4);
        resizableArray.add(5);

        System.out.printf("Size: %d Capacity: %d \n", resizableArray.size(), resizableArray.capacity());

        resizableArray.add(6);

        System.out.printf("Size: %d Capacity: %d \n", resizableArray.size(), resizableArray.capacity());

        System.out.println(resizableArray.get(4));
        resizableArray.get(10);
    }
}
