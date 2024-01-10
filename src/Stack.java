public class Stack {
    LinkedList list;

    public Stack() {
        list = new LinkedList();
    }

    public void push(Object object) {
        list.insertFirst(object);
    }

    public Object pop() throws EmptylistException, ObjectNotFoundException {
        Object obj = list.getFirstObject();
        list.removeObject(obj);
        return obj;
    }

    public void print() {
        list.print();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void empty() {
        list = new LinkedList();
    }
}
