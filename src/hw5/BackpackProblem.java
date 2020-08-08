package hw5;

import java.util.ArrayList;
import java.util.List;

public class BackpackProblem {


    private List<Item> bestSet;
    private final int MAX_WEIGHT;
    private int bestPrise;

    public BackpackProblem(int maxWeight) {
        this.MAX_WEIGHT = maxWeight;
    }


    static class Item{
        private String name;
        private int weight;
        private int prise;

        public Item(String name, int weight, int prise) {
            this.name = name;
            this.weight = weight;
            this.prise = prise;
        }

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        public int getPrise() {
            return prise;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    // вычисляет вес набора
    private int calcWeight(List<Item> list){
        int weight = 0;
        for (Item x: list) {
            weight+=x.getWeight();
        }
        return weight;
    }

    // вычисляет стоимость набора
    private int calcPrise(List<Item> list){
        int prise = 0;
        for (Item x: list) {
            prise+=x.getPrise();
        }
        return prise;
    }

    // проверяет является ли набор лучшим
    private void checkSet (List<Item> list) {

        if (bestSet == null) {
            if (calcWeight(list) <= MAX_WEIGHT) {
                bestSet = list;
                bestPrise = calcWeight(list);
            }
        } else if (calcWeight(list) <= MAX_WEIGHT && calcPrise(list) > bestPrise){

            bestSet = list;
            bestPrise = calcPrise(list);

        }
    }


    // основной метод, переберающий наборы
    public List<Item> findBestSet(List<Item> list) {

        if(!list.isEmpty()) {
            checkSet(list);
        }

        for (int i = 0; i < list.size(); i++) {

            List<Item> newSet = new ArrayList<>(list);

            newSet.remove(i);

            findBestSet(newSet);
        }

        return bestSet;
    }


}
