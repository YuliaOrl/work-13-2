package guru.qa.homework;

import java.util.HashSet;
import java.util.Set;

public class SportMan {
    private String name;
    private String gender;
    private int age;
    private Set<String> scores = new HashSet<>();

    public SportMan(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void addScores(String score) {
        scores.add(score);
    }

    public void deletePass() {
        for (String score : scores) {
            if(score.equals("pass")) {
                this.scores.remove(score);
            }
        }
    }
}
