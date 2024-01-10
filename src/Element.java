public class Element {
    private Object object;
    private Element next;

    public Element(Object newObject) {
        object = newObject;
        next = null;
    }

    public void setNext(Element nextElement) {
        next = nextElement;
    }

    public Element getNext() {
        return next;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void delete() {
        object = null;
        next = null;
    }
}
