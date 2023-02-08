package transport;
import drivers.CategoryC;
import enums.LoadCapacity;

public class Trucks <T extends CategoryC> extends Transport implements Competing{

    private LoadCapacity loadCapacity;
    public Trucks (String brand, String model, double engineVolume, CategoryC categoryC, LoadCapacity loadCapacity){
        super(brand, model, engineVolume, categoryC);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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

    public String toString() {
        return  getBrand() +" "+ getModel() +", объём двигателя: " + getEngineVolume() +". "+ getLoadCapacity().toString();
    }

    @Override
    public void printType() {
        if (getLoadCapacity() == null){
            System.out.println("Данных по транспортному средству не достаточно");
        } else {

            System.out.println(getLoadCapacity());
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Грузовой автомобиль " + getBrand() +" "+ getModel() +" проходит диагностику.");
    }
}