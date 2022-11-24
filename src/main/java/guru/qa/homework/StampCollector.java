package guru.qa.homework;

import java.util.ArrayList;
import java.util.List;

public class StampCollector {
    private String name;
    private int age;
    private List<String> stamps = new ArrayList<>();

    public StampCollector(String name, int age, List<String> stamps) {
        this.name = name;
        this.age = age;
        this.stamps = stamps;
    }

    public void addNewStamp(String title) {
        this.stamps.add(title);
    }

    public void searchStampCollector(String title) {
        for (String stamp : stamps)
            if (stamp.contains(title)) {
                System.out.println("Марка в наличии");
            } else System.out.println("Марки нет в наличии");
    }

    public int getQuantityOfStamp(String title) {
        int quantity  = 0;
        for (String stamp : stamps) {
            if(stamp.equals(title)) quantity++;
        }
        return quantity;
    }
}
