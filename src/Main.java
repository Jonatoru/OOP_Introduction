import transport.Car;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1, 2");
        System.out.println("");

        Car lada = new Car ("Lada","Granta", 1.7, "желтый", 2015, "Россия", "Механическая", "Седан", "В197АЛ196", 5, true, new Car.Key(true, true));
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия","Автоматическая", "Седан", "Р123КУ197", 5, true, new Car.Key(true, true));
        Car bmw = new Car("BMW","Z8", 3.0, "черный", 2021, "Германия", "Механическая", "Родстер", "М555ММ55", 2, true, new Car.Key(true, true));
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "касный", 2018, "Южная Корея", "Автоматическая", "Внедорожник", "А333ХЛ33", 5, true, new Car.Key(true, true));
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "Робот", "Седан", "П444НЗ22", 5, true, new Car.Key(true, true));

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println("");

        Car test = new Car("","",0, "",0,"","","","",0, false, new Car.Key(true, true));

        System.out.println(test);
        System.out.println("");

        System.out.println("Проверяю смену шин");
        lada.changeTiresToSeasonal(12);
        System.out.println(lada);
    }
}