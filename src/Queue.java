public class Queue extends Stack {

    @Override
    public void push(Object object) {
        list.insertLast(object);
    }
}
