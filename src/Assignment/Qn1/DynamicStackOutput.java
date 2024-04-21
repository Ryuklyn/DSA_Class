package Assignment.Qn1;

public class Main {
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();

        System.out.println("Pushing elements onto the stack:");
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
            System.out.println("Pushed: " + i + ", Stack size: " + stack.size());
        }

        System.out.println("\nPopping elements from the stack:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop() + ", Stack size: " + stack.size());
        }
    }
}
