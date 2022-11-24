package guru.qa.example;

public class Ticket {

    public static void main(String[] args) {
        User human_1 = new User("Юлия", "женский", 39);
        human_1.getGift();
        User human_2 = new User("Саша", "мужской", 40);
        human_2.getGift();
        User human_3 = new User("Дмитрий", "мужской", 7);
        human_3.getGift();
        User human_4 = new User("Яна", "женский", 13);
        human_4.getGift();
    }
}
