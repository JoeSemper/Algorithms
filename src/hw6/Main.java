package hw6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int numOfBalanced = 0;
        int numOfUnbalanced = 0;

        Random random = new Random();
        MyTreeMap[] mtmArr = new MyTreeMap[20];

        for (int i = 0; i <20 ; i++) {
            mtmArr[i] = new MyTreeMap();
            while (mtmArr[i].depth() != 6){
                mtmArr[i].put(random.nextInt(200)-100, 1);
            }
            if (mtmArr[i].isBalanced()) {
                numOfBalanced++;
            }else {
                numOfUnbalanced++;
            }

        }


        System.out.println("Сбалансировано - " + ((float)numOfBalanced/20)*100 + "%");
        System.out.println("Не сбалансировано - " + ((float)numOfUnbalanced/20)*100 + "%");

    }
}
