package guru.qa.example;

import java.util.LinkedList;

public class FlowersShop {

    private String name;
    private LinkedList<String> flowers;

    public FlowersShop(String name, LinkedList<String> flowers) {
        this.name = name;
        this.flowers = flowers;
    }

    public boolean hasFlower(String name) {
        for (String flower : flowers) {
            if (flower.equals(name)) return true;
        }
        return false;
    }
}
