package enums;

public enum BodyType {
    sedan("Седан"),
    hatchback("Хетчбэк"),
    coupe("Купе"),
    stationWagon("Универсал"),
    SUV("Внедорожник"),
    crossover("Кроссовер"),
    pickup("Пикап"),
    van("Фургон"),
    minivan("Минивэн");

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
