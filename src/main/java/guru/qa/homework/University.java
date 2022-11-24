package guru.qa.homework;

import java.util.HashMap;
import java.util.Map;

public class University {

    Map<String, Integer> subjects = new HashMap<>();

    public void addSubject(String subject, int count){
        subjects.put(subject, count);
    }
    public void findSubject(Integer count){
        System.out.println("Поиск списка предметов по количеству студентов: " + count);
        for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
            if(entry.getValue().equals(count)){
                String subjectString = entry.getKey();
                String countString = count.toString();
                System.out.println(subjectString + ": " + countString);
            }
        }
    }

    void printAllSubject() {
        for (var item : subjects.entrySet()) {
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }

}


