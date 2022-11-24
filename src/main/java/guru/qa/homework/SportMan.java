package guru.qa.homework;

import java.util.HashSet;
import java.util.Set;

public class SportMan {

    Set<String> scores = new HashSet<>();

    void addScores(String score) {
        scores.add(score);
    }

    void deletePass() {
        for (String score : scores) {
            if(score.contains("болезнь")) {
                this.scores.remove(score);
            }
        }
    }

    public void printAllScores() {
        var array = scores.toArray();
        for (var i = 0; i < scores.size(); i++) {
            System.out.println(array[i]);
        }
    }
}
