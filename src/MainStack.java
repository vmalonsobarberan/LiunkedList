public class MainStack {
    public static void main(String[] args) throws ObjectNotFoundException {
        try {
            Stack stack = new Stack();
            stack.push("One");
            stack.push("Two");
            stack.push("Three");
            stack.push("Four");
            stack.print();
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            stack.print( );
        } catch (EmptylistException e) {
            System.err.println("The stack was empty");
        }
    }
}
