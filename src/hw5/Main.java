package hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        System.out.println(Exponentiation.RecExp(2, 2));


        BackpackProblem backpackProblem = new BackpackProblem(15);

        BackpackProblem.Item item1 = new BackpackProblem.Item("Book", 4, 10);
        BackpackProblem.Item item2 = new BackpackProblem.Item("Phone", 2, 60);
        BackpackProblem.Item item3 = new BackpackProblem.Item("Guitar", 10, 50);
        BackpackProblem.Item item4 = new BackpackProblem.Item("Power bank", 3, 10);
        BackpackProblem.Item item5 = new BackpackProblem.Item("Brick", 10, 1);
        BackpackProblem.Item item6 = new BackpackProblem.Item("Ring", 1, 70);
        BackpackProblem.Item item7 = new BackpackProblem.Item("Watch", 1, 40);


        BackpackProblem.Item[] arr = new BackpackProblem.Item[]{item1, item2, item3, item4, item5, item6, item7};


        List<BackpackProblem.Item> set = new ArrayList<>(Arrays.asList(arr));

        List<BackpackProblem.Item> bestSet = backpackProblem.findBestSet(set);

        System.out.println(bestSet);


    }
}
