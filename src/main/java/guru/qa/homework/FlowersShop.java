package guru.qa.homework;

import java.util.Arrays;
import java.util.LinkedList;

public class FlowersShop {

    LinkedList<String> flowers = new LinkedList<>();

    void addFlowers(String name) {
        flowers.add(name);
    }

    void addFlowersArr(String[] name) {
        flowers.addAll(Arrays.asList(name));
    }

    void printAllFlowers() {
        System.out.println("Список всех цветов:");
        for (String text : flowers) {
            System.out.println(text);
        }
    }

}
