package guru.qa.example;

public class User {
    String name;
    String gender;
    int age;

    public User(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    void getGift() {
        if (age < 18) {
            System.out.println("Вы купили детский билет для пассажира: " + name + "!");
        } else {
            if (gender == "женский") {
                System.out.println("Вы купили взрослый билет для женщин на пассажира: " + name + "!");
            } else {
                System.out.println("Вы купили взрослый билет для мужчин на пассажира: " + name + "!");
            }
        }
        System.out.println("Возраст (г): " + age);
    }
}
