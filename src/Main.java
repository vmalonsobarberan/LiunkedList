public class Main {
    public static void main(String[] args)
            throws ObjectNotFoundException, InvalidIndexException {
        LinkedList list = new LinkedList();
        list.insertLast("1111111");
        list.insertLast("2222222");
        list.insertLast("3333333");
        list.insertLast("4444444");
        list.print();
        System.out.println("-----------");
        System.out.println(list.getObjectAtPosition(2));
    }
}
