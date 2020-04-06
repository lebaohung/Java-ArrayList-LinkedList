package linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFisrt(11);
        myLinkedList.addFisrt(12);
        myLinkedList.addFisrt(13);

        myLinkedList.add(3, 15);
        myLinkedList.printList();
    }
}
