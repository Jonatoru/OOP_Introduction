package enums;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купе"),
    STATION_WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private String name;

    BodyType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Тип кузова: "+ getName() + ".";
    }
}
