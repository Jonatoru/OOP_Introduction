import transport.Bus;
import transport.Car;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println("");

        Car lada = new Car ("Lada","Granta", 2015, "Россия", "желтый", 200, 1.7, "Механическая", "Седан", "В197АЛ196", 5,true, new Car.Key(true, true));
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 250,3.0, "Автоматическая", "Седан", "Р123КУ197", 5,true, new Car.Key(true, true));
        Car bmw = new Car("BMW","Z8", 2021, "Германия", "черный", 300, 3.0, "Механическая", "Родстер", "М555ММ55", 2,true, new Car.Key(true, true));
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "касный", 250, 2.4, "Автоматическая", "Внедорожник", "А333ХЛ33", 5, true, new Car.Key(true, true));
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 200, 1.6, "Седан", "Седан", "П444НЗ22", 5,true, new Car.Key(true, true));

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println("");

        Car test = new Car("","",0, "","",0,0,"","","", 0,false, new Car.Key(true, true));

        System.out.println(test);
        System.out.println("");

        System.out.println("Проверяю смену шин");
        lada.changeTiresToSeasonal(12);
        System.out.println(lada);
        System.out.println("");

        System.out.println("Задача 2");
        System.out.println("");

        Bus ikarus = new Bus("Ikarus", "250", 1967 , "Россия", "красный", 120);
        Bus mun = new Bus("Mun","Lion Star L", 2003, "Германия", "зелёный", 150);
        Bus busHyundai = new Bus("Hyundai", "Universe Luxury", 2006, "Южная Корея", "желтый", 142);

        System.out.println(ikarus);
        System.out.println(mun);
        System.out.println(busHyundai);
    }
}