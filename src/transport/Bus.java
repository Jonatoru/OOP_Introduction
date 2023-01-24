package transport;

public class Bus extends Transport{
    /**
     * Парамметры
     *
     * @param brand            - Марка,
     * @param model            - Модель,
     * @param yearOfIssue      - Год выпуска,
     * @param countryOfOrigin  - Страна производства,
     * @param bodyColor        - Цвет кузова,
     * @param maxMovementSpeed - Максимальная скорость передвижения.
     */
    public Bus(String brand, String model, int yearOfIssue, String countryOfOrigin, String bodyColor, int maxMovementSpeed) {
        super(brand, model, yearOfIssue, countryOfOrigin, bodyColor, maxMovementSpeed);
    }
}
