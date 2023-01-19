public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1, 2");
        System.out.println("");

        Car lada = new Car ("Lada","Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW","Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "касный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println("");

        System.out.println("Задача 3");
        System.out.println("");

        Car test = new Car("","",0, "",0,"");

        System.out.println(test);
    }
}