package hw3;

public class ReverseString {

    private static MyStack<String> stack;
    private static StringBuilder sb = new StringBuilder();

    public static String reverse(String line) {

        String[] arr = line.split("");
        stack = new MyStack<>(arr.length);

        for (int i = 0; i <arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i <arr.length ; i++) {
            sb.append(stack.pop());
        }

        return sb.toString();

    }
}
