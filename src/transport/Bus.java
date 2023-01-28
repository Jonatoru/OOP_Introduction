package transport;
import drivers.CategoryD;

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
    public Bus(String brand, String model, double engineVolume, CategoryD categoryD) {
        super(brand, model, engineVolume, categoryD);
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
}