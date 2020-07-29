package hw3;

public class Main {

    public static void main(String[] args) {


        /* 1 задача*/
        String line = "Java";
        line = ReverseString.reverse(line);
        System.out.println(line);


        /* 2 задача*/
        MyDeque<Integer> deque = new MyDeque<>();

        deque.insertRight(1);
        deque.insertRight(2);
        deque.insertRight(3);
        deque.insertRight(4);
        deque.insertLeft(5);
        deque.insertLeft(6);
        deque.insertLeft(7);
        deque.insertLeft(8);

        System.out.println(deque.removeRight());
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());




    }


}
