public class StackGeneric<C> {
   public C[] data;
    public int top = 0;

    public StackGeneric(int n) {
        data = (C[]) new Object[n];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == data.length;
    }

    public void push(C value) {
        if ( !isFull() ) {
            data[top] = value;
            top = top + 1;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public C pop() {
        if ( !isEmpty() ) {
            top = top - 1;
            C r = data[top];
            return r;
        } else {
            return null;
        }
    }
    public C peek() {
        if ( !isEmpty() ) {
            return data[top - 1];
        } else {
            return null;
        }
    }
}
