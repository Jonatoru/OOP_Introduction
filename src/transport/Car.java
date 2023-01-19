package transport;

import static Checks.ValidationUtilities.validateString;
import static Checks.ValidationUtilities.validateBoolean;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    private Key key;

    /** Создаю конструктор для автомобилей
     *
     * @param brand - марка
     * @param model - модель
     * @param engineVolume - объём двигателя
     * @param color - цвет
     * @param year - год
     * @param country - страна проиводитель
     * @param transmission - Коробка передач
     * @param bodyType - Тип кузова
     * @param registrationNumber - Регистрационный номер
     * @param numberOfSeats - Количество мест
     * @param summerTires - признак Летняя или Зимняя резина
     */
    public Car (String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean summerTires, Key key){
        this.brand = (validateString(brand,"default"));
        this.model = (validateString(model,"default"));
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.color = color == null || color.isBlank() ? "белый" : color;
        this.year = year <= 0 ? 2000 : year;
        this.country = (validateString(country,"default"));
        this.transmission = (validateString(transmission,"default"));
        this.bodyType = bodyType == null || bodyType.isBlank() ? "default" : bodyType;
        this.registrationNumber = (validateString(registrationNumber,"A000AA000"));
        this.numberOfSeats = numberOfSeats <= 0 ? 1 : numberOfSeats;
        this.summerTires = validateBoolean(summerTires);
        this.key = key;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return  this.model;
    }

    public double getEngineVolume(){
        return this.engineVolume;
    }

    public String getColor(){
        return this.color;
    }

    public int getYear(){
        return this.year;
    }

    public String getCountry(){
        return  this.country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public void setSummerTires(boolean summerTires) {
        this.summerTires = validateBoolean(summerTires);
    }
    public void changeTiresToSeasonal (int currentMonth) {
        if (currentMonth == 1 || currentMonth == 2 || currentMonth == 12){
            setSummerTires(false);
        } else setSummerTires(true);
    }
    /** Переписал toString под ноав данные
     *
     * @return было brand+" "+ model+ ", год выпуска: "+ year+ ", страна производства: "+ country+ ", цвет: "+ color+ ", объём двигателя: "+ engineVolume+ ".";
     */
    public String toString(){
        return getBrand()+" "+ getModel()+ ", год выпуска: "+ getYear()+ ", страна производства: "+ getCountry()+ ", цвет: "+ getColor()+ ", объём двигателя: "+ getEngineVolume()+ ", коробка передач: "+ getTransmission()+ " , тип кузова: " + getBodyType()+ " , регистрационный номер: "+ getRegistrationNumber()+ " , количество мест: "+ getNumberOfSeats()+ " , признак Летняя резина: "+ isSummerTires()+ key.toString();
    }
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;
        /** Создаю конструктор для ключей
         * @param remoteEngineStart - Удаленный запуск двигателя
         * @param keylessAccess - Бесключевой доступ
         */
        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = validateBoolean(remoteEngineStart);
            this.keylessAccess = validateBoolean(keylessAccess);
        }
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }
        @Override
        public String toString() {
            return " , удаленный запуск двигателя: "+ isRemoteEngineStart() +" , бесключевой доступ: "+ isKeylessAccess() +".";
        }
    }
}