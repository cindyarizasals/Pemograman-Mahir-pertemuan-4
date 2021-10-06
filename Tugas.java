import java.util.Scanner;
public class Tugas4 {
    public static void main(String[] args) {

        StackGeneric<String> stack = new StackGeneric<>(25);
        String input = "f(x)=(2x+y)-(3+(2x-x)+20)";
        Scanner scan = new Scanner(input);

        scn.useDelimiter("");

        for (int a = 0; a < 25; a++) {
            String Cindy = scn.next();
            if (Cindy.equals("(")) {
                stack.push("(");
            } else if (Cindy.equals(")")){
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("valid");
        } else {
            System.out.println("tidak valid");
        }
    
    }
}
