package transport;
import drivers.CategoryC;

public class Trucks <T extends CategoryC> extends Transport implements Competing{
    public Trucks (String brand, String model, double engineVolume, CategoryC categoryC){
        super(brand, model, engineVolume, categoryC);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грозовика");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга среди грузовиков");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость среди грузовков");
    }
}