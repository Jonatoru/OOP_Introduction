package transport;
import drivers.CategoryD;
import enums.Capacity;
import exceptions.TransportTypeException;
import mechanics.Mechanics;

import java.util.List;

public class Bus <T extends CategoryD> extends Transport implements Competing{
    /*
     * Парамметры
     *
     * @param brand            - Марка,
     * @param model            - Модель,
     * @param yearOfIssue      - Год выпуска,
     * @param countryOfOrigin  - Страна производства,
     * @param bodyColor        - Цвет кузова,
     * @param maxMovementSpeed - Максимальная скорость передвижения.
     */
    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume, CategoryD categoryD, Capacity capacity, List<Mechanics> mechanicsList) {
        super(brand, model, engineVolume, categoryD, mechanicsList);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга среди автобусов");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость среди автобусов");
    }

    public String toString() {
        return  getBrand() +" "+ getModel() +", объём двигателя: " + getEngineVolume() +". "+ getCapacity().toString() +". "+ getMechanicsList().toString();
    }

    @Override
    public void printType() {
        if (getCapacity() == null){
            System.out.println("Данных по транспортному средству не достаточно");
        } else {

            System.out.println(getCapacity());
        }
    }

    @Override
    public void passDiagnostics() throws TransportTypeException{
        throw  new TransportTypeException("Автобусы проходить диагностику не должны");
    }

    @Override
    public String repair() {
        return "Ремонтирум автобус";
    }
}