package dayseven;

import java.util.ArrayList;
import java.util.Random;

public class Test04ArrayList {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(1000) + 1;
            list.add(r);
        }

        ArrayList<Integer> arrayList = getArrayList(list);
        System.out.println(arrayList);
    }

    private static ArrayList<Integer> getArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> smallist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            if (num % 2 == 0) {
                smallist.add(num);
            }
        }
        return  smallist;

    }
}