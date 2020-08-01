package hw4;

import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedQueue<Integer> lq = new LinkedQueue<>();

        lq.insert(1);
        lq.insert(2);
        lq.insert(3);
        lq.insert(4);
        lq.insert(5);
        System.out.println(lq);

        lq.remove();
        lq.remove();
        lq.insert(6);
        lq.insert(7);
        System.out.println(lq);


        MyLinkedList<Integer> mll = new MyLinkedList<>();

        mll.insertLast(1);
        mll.insertLast(2);
        mll.insertLast(3);
        mll.insertLast(4);
        mll.insertLast(5);
        mll.insertLast(6);
        System.out.println(mll);

        ListIterator<Integer> li = mll.listIterator();

        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.next());

        System.out.println(li.nextIndex());
        li.remove();
        System.out.println(mll);






    }
}
