package guru.qa.homework;

import java.util.Map;
import java.util.Set;

public class Teacher {

    private String name;
    private String gender;
    private int age;
    private Map<String, Set<String>> items;

    public Teacher(String name, String gender, int age, Map<String, Set<String>> items) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.items = items;
    }

    public boolean teachItem(String field, String item) {
        for (Map.Entry<String, Set<String>> entry : items.entrySet()) {
            if (entry.getKey().equals(field)) {
                for (String teachPerson : entry.getValue()) {
                    if (teachPerson.equals(item)) return true;
                }
            }
        }
        return false;
    }
}
