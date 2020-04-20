class MyDequeueMain{
    public static void main(String[] args) {
        DoubleEndedQueueUsingArray obj = new DoubleEndedQueueUsingArray(5);
        obj.enqueueFront(10);
        obj.display();
        System.out.println("Front = "+obj.front);
        obj.dequeueFront();
        System.out.println("Front = "+obj.front);
        obj.display();
        obj.enqueueFront(20);
        obj.display();
        System.out.println("Front = "+obj.front);
        obj.enqueueFront(30);
        obj.enqueueRear(40);
        obj.enqueueRear(50);
        obj.display();
        obj.dequeueFront();
        obj.dequeueFront();
        obj.display();
        obj.enqueueRear(60);
        obj.enqueueRear(70);
        obj.display();
        System.out.println("Front = "+obj.front);
        obj.enqueueFront(80);
        System.out.println("Front = "+obj.front);
        obj.enqueueFront(90);
        System.out.println("Front = "+obj.front);
        obj.display();
        obj.dequeueFront();
        obj.display();
        obj.dequeueRear();
        obj.display();
        obj.dequeueRear();
        obj.display();
    }
}
