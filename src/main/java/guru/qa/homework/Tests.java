package guru.qa.homework;

public class Tests {

    public static void main(String[] args) {

        StampCollector stampCollector = new StampCollector();
        System.out.println("Магазин марок.");
        stampCollector.addNewStamp("Марка 1");
        stampCollector.addNewStamp("Марка 2");
        stampCollector.addNewStamp("Марка 3");
        stampCollector.addNewStamp("Марка 3");
        stampCollector.addNewStamp("Марка 4");
        stampCollector.addNewStamp("Марка 5");
        stampCollector.addNewStamp("Марка 6");
        stampCollector.printAllStamps();
        stampCollector.searchStampCollector("Марка 1");
        stampCollector.getQuantityOfStamp("Марка 3");
        stampCollector.deleteStamp("Марка 1");
        stampCollector.printAllStamps();
        System.out.println();

        SportMan sportMan = new SportMan();
        System.out.println("Спортсмены.");
        System.out.println("Список достижений до болезни:");
        sportMan.addScores("Рекорд 01");
        sportMan.addScores("Рекорд 02");
        sportMan.addScores("Рекорд 03");
        sportMan.addScores("Рекорд 04");
        sportMan.addScores("Рекорд 06 болезнь");
        sportMan.printAllScores();
        System.out.println("Список достижений после болезни:");
        sportMan.deletePass();
        sportMan.printAllScores();
        System.out.println();

        University university = new University();
        System.out.println("Университет.");
        System.out.println("Список предметов и количество студентов в университете:");
        university.addSubject("Сhemistry", 5);
        university.addSubject("Maths", 10);
        university.addSubject("Physics", 15);
        university.addSubject("Geometry", 20);
        university.addSubject("Geography", 25);
        university.addSubject("Literature", 30);
        university.addSubject("Russian", 15);
        university.addSubject("English", 15);
        university.printAllSubject();
        university.findSubject(15);
        System.out.println();

        FlowersShop flowersShop = new FlowersShop();
        System.out.println("Магазин цветов.");
        String[] flowersArr = {"Мак", "Тюльпан", "Роза", "Гладиолус", "Гвоздика"};
        flowersShop.addFlowers("Ромашка");
        flowersShop.addFlowers("Незабудка");
        flowersShop.addFlowers("Пион");
        flowersShop.addFlowersArr(flowersArr);
        flowersShop.printAllFlowers();
    }
}
