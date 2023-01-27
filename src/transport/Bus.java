package transport;

public class Bus extends Transport{
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
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
}