public class LinkedList {
    private Element first;
    private Element last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public void insertFirst(Object object) {
        Element element = new Element(object);
        element.setNext(first);
        if (isEmpty()) {
            last = element;
        }
        first = element;
    }

    public void insertLast(Object object) {
        Element element = new Element(object);

        if (isEmpty()) {
            first = element;
            last = element;
        } else {
            last.setNext(element);
            last = element;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void print() {
        Element e = first;
        while (e != null) {
            System.out.println(e.getObject());
            e = e.getNext();
        }
    }

    public void removeObject(Object object) throws
            ObjectNotFoundException, EmptylistException {
        if (isEmpty()) {
            throw new EmptylistException("The list is empty");
        }
        Element e = first;
        Element prev = first;
        while(e != null && !e.getObject().equals(object)) {
            prev = e;
            e = e.getNext();
        }
        if (e == null) {
            throw new ObjectNotFoundException(object + " not found");
        }
        // I have to delete

        // List with only on node
        if (first == last) {
            first = null;
            last = null;
            return;
        }

        // bypass
        prev.setNext(e.getNext());

        // It was the first node
        if (first == e) {
            first = e.getNext();
        }

        // It was the last node
        if (last == e) {
            last = prev;
        }
    }

    public Object getFirstObject() throws EmptylistException {
        if (isEmpty()) {
            throw new EmptylistException("The list is empty");
        }
        return first.getObject();
    }

    public Object getLastObject() throws EmptylistException {
        if (isEmpty()) {
            throw new EmptylistException("The list is empty");
        }
        return last.getObject();
    }

    public int getNumElements() {
        int count = 0;
        Element e = first;
        while (e != null) {
            count++;
            e = e.getNext();
        }
        return count;
    }

    public Object getObjectAtPosition(int i)
            throws EmptylistException,
            InvalidIndexException {
        if (i < 0) {
            throw new InvalidIndexException(i + " not a valid index");
        }
        int count = 0;
        Element e = first;
        while (e != null) {
            if (i == count) {
                return e.getObject();
            }
            e = e.getNext();
            count++;
        }
        throw new InvalidIndexException(i +
                " not a valid index. Max index = " + (count - 1));
    }
}
