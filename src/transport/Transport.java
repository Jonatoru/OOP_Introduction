package transport;

import static Checks.ValidationUtilities.validateString;

public class Transport {

    private final String brand;
    private final String model;
    private final int yearOfIssue;
    private final String countryOfOrigin;
    private String bodyColor;
    private int maxMovementSpeed;

    /** Парамметры
     * @param brand - Марка,
     * @param model - Модель,
     * @param yearOfIssue - Год выпуска,
     * @param countryOfOrigin - Страна производства,
     * @param bodyColor - Цвет кузова,
     * @param maxMovementSpeed - Максимальная скорость передвижения.
     */

    public Transport(String brand, String model, int yearOfIssue, String countryOfOrigin, String bodyColor, int maxMovementSpeed) {
        this.brand = (validateString(brand,"default"));
        this.model = (validateString(model,"default"));
        this.yearOfIssue = yearOfIssue;
        this.countryOfOrigin = countryOfOrigin;
        this.bodyColor = (validateString(bodyColor, "default"));
        this.maxMovementSpeed = maxMovementSpeed <= 0 ? 1 : maxMovementSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setMaxMovementSpeed(int maxMovementSpeed) {
        this.maxMovementSpeed = maxMovementSpeed;
    }

    @Override
    public String toString() {
        return getBrand()+" "+ getModel()+ ", год выпуска: "+ getYearOfIssue()+ ", страна производства: "+ getCountryOfOrigin()+ ", цвет: "+ getBodyColor()+ ", максимальная скорость: "+ getMaxMovementSpeed();
    }
}
