import enums.BodyType;
import enums.Capacity;
import enums.LoadCapacity;
import mechanics.ServiceStation;
import transport.*;
import drivers.CategoryB;
import drivers.CategoryC;
import drivers.CategoryD;
import mechanics.Mechanics;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    private static void infoPrinting (Transport transport){
        System.out.println("Водитель " + transport.getDriver().getFullNameOfTheDriver() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде.");
    }
    public static void main(String[] args) {
       /* System.out.println("Задача 1");
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
        System.out.println(busHyundai);*/

        System.out.println("Задача 1");
        System.out.println("");

        CategoryB one = new CategoryB("Иванов И И",true, 5);
        CategoryB two = new CategoryB("Петров П П", true, 10);
        CategoryB three = new CategoryB("Бараовский В Л", true, 15 );
        CategoryB four = new CategoryB("Викторов В В", true, 20);

        CategoryC five = new CategoryC("Леонтьев А А", true, 13);
        CategoryC six = new CategoryC("Биз А В", true, 17);
        CategoryC seven = new CategoryC("Семёнов Н Н", true, 23);
        CategoryC eight = new CategoryC("Вольф К Л", true, 30);

        CategoryD nine = new CategoryD("Долгих С У", true, 9);
        CategoryD ten = new CategoryD("Десятов П Р", true, 27);
        CategoryD eleven = new CategoryD("Опушкин Д А", true, 36);
        CategoryD twelve = new CategoryD("Сучков Л Л", true, 19);

        Mechanics tod = new Mechanics("Тод Тод", "Газпром");
        Mechanics bob = new Mechanics("Боб Боб", "Гайки и железки");
        Mechanics empty = new Mechanics("", "");

        List<Transport> racingСar = new ArrayList();
        Transport lada = new Car ("Lada","Granta",  1.7, one, BodyType.SEDAN,List.of(tod));
        Transport audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, two, BodyType.SEDAN,List.of(tod));
        Transport bmw = new Car("BMW","Z8", 3.0, three, BodyType.COUPE, List.of(bob));
        Transport kia = new Car("Kia", "Sportage 4-го поколения", 2.4, four, BodyType.CROSSOVER, List.of(empty));

        Transport ikarus = new Bus("Ikarus", "250", 10.0, nine, Capacity.ESPECIALLY_SMALL, List.of(bob));
        Transport mun = new Bus("Mun","Lion Star L", 11.9, ten, Capacity.SMALL, List.of(bob));
        Transport busHyundai = new Bus("Hyundai", "Universe Luxury", 12.3, eleven, Capacity.BIG, List.of(tod));
        Transport busKia = new Bus("KIA", "Granbird", 11.2, twelve, Capacity.EXTRA_LARGE, List.of(empty));

        Transport kamAZ = new Trucks("KamAZ", "4326/2017", 13, five, LoadCapacity.N3, List.of(bob));
        Transport mercedesBenz = new Trucks("Mercedes Benz", "Actros 4-го поколения", 12, six, LoadCapacity.N2, List.of(tod));
        Transport volvo = new Trucks("Volvo", "FH", 12.8, seven, LoadCapacity.N1, List.of(empty));
        Transport daf = new Trucks("DAF", "XF", 12.9, eight, LoadCapacity.N3, List.of(tod));

        racingСar.add(lada);
        racingСar.add(audi);
        racingСar.add(bmw);
        racingСar.add(kia);
        racingСar.add(ikarus);
        racingСar.add(mun);
        racingСar.add(busHyundai);
        racingСar.add(busKia);
        racingСar.add(kamAZ);
        racingСar.add(mercedesBenz);
        racingСar.add(volvo);
        racingСar.add(daf);

        System.out.println(racingСar.get(0));
        System.out.println(racingСar.get(7));
        System.out.println(racingСar.get(9));

        bob.fixTheCar(ikarus);
        bob.carryOutMaintenance(lada);

        System.out.println("");
        System.out.println("Задача 2");
        System.out.println("");

        Queue<Transport> transportsToSTO = new ArrayDeque<>();

        ServiceStation sto = new ServiceStation(transportsToSTO);

        for (Transport transport: racingСar) {
            sto.addTransport(transport);
        }

        for (int i = 0; i <= transportsToSTO.size(); i++){
            sto.carryOutVehicleInspection(transportsToSTO);
        }
        /*System.out.println("Легковые автомодили:");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println("");
        System.out.println("Автобусы:");
        System.out.println(ikarus);
        System.out.println(mun);
        System.out.println(busHyundai);
        System.out.println(busKia);
        System.out.println("");
        System.out.println("Грузовые автомобили:");
        System.out.println(kamAZ);
        System.out.println(mercedesBenz);
        System.out.println(volvo);
        System.out.println(daf);

        System.out.println("");
        System.out.println("Проводим диагностику");
        lada.passDiagnostics();
        kamAZ.passDiagnostics();
        ikarus.passDiagnostics();*/

    }
}
