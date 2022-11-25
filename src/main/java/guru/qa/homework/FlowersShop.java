package guru.qa.homework;

import java.util.Arrays;
import java.util.LinkedList;

public class FlowersShop {

    LinkedList<String> flowers = new LinkedList<>();

    void addFlowersArr(String[] name) {
        flowers.addAll(Arrays.asList(name));
    }

    public boolean hasFlower(String name) {
        System.out.println("Поиск цветка \"" + name + "\" в магазине.");
        for (String flower : flowers) {
            if (flower.equals(name)) return true;
            System.out.println("Цветок \"" + name + "\" есть в наличии.");
        }
        return false;
    }

    void printAllFlowers() {
        System.out.println("Список всех цветов:");
        for (String text : flowers) {
            System.out.println(text);
        }
    }
}
