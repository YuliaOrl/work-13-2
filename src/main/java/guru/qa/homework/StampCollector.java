package guru.qa.homework;

import java.util.ArrayList;
import java.util.List;

public class StampCollector {

    List<String> stamps = new ArrayList<>();

    void addNewStamp(String title) {
        stamps.add(title);
    }

    void deleteStamp(String title) {
        stamps.remove(title);
        System.out.println("Удаление марки с названием " + title);
    }

    void searchStampCollector(String title) {
        for (String stamp : stamps)
            if (stamp.contains(title)) {
                System.out.println("Марка с названием " + title + " есть в наличии ");
            };
    }

    void getQuantityOfStamp(String title) {
        int quantity  = 0;
        for (String stamp : stamps) {
            if(stamp.contains(title)) quantity++;
        }
        System.out.println("Марок с названием " + title + " в наличии " + quantity + " шт.");
    }

    void printAllStamps() {
        System.out.println("Список всех марок:");
        int i = 0;
        while (stamps.size() > i) {
            System.out.println(stamps.get(i));
            i++;
        }
    }
}