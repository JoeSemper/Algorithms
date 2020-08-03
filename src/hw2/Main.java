package hw2;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Random random = new Random();

        MyArrayList<Integer> listForSelectionSort = new MyArrayList<>();
        MyArrayList<Integer> listForInsertionSort = new MyArrayList<>();
        MyArrayList<Integer> listForBubbleSort = new MyArrayList<>();

        for (int i = 0; i <100000; i++) {
            int a= random.nextInt(10000);
            listForSelectionSort.add(a);
            listForInsertionSort.add(a);
            listForBubbleSort.add(a);
        }

        long time = System.currentTimeMillis();
        listForSelectionSort.selectionSort();
        System.out.println("Время выполнения сортировки выбором: " + (System.currentTimeMillis()-time));

        time = System.currentTimeMillis();
        listForInsertionSort.insertionSort();
        System.out.println("Время выполнения сортировки вставкой: " + (System.currentTimeMillis()-time));

        time = System.currentTimeMillis();
        listForBubbleSort.bubbleSort();
        System.out.println("Время выполнения сортировки пузырьком: " + (System.currentTimeMillis()-time));

    }

}
