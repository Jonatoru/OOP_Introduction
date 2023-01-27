package transport;

import static Checks.ValidationUtilities.validateString;
import static Checks.ValidationUtilities.validateBoolean;

public class Car extends Transport {
    /*private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;
    private Key key;*/

    /*
     * Создаю конструктор для автомобилей
     *
     * @param engineVolume - объём двигателя
     * @param transmission - Коробка передач
     * @param bodyType - Тип кузова
     * @param registrationNumber - Регистрационный номер
     * @param numberOfSeats - Количество мест
     * @param summerTires - признак Летняя или Зимняя резина
     */
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
        /*this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.transmission = (validateString(transmission,"default"));
        this.bodyType = bodyType == null || bodyType.isBlank() ? "default" : bodyType;
        this.registrationNumber = (validateString(registrationNumber,"A000AA000"));
        this.numberOfSeats = numberOfSeats <= 0 ? 1 : numberOfSeats;
        this.summerTires = validateBoolean(summerTires);
        this.key = key;*/
    }
}
   /* public double getEngineVolume(){
        return this.engineVolume;
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
    }*/
/*   * Переписал toString под ноав данные
 *
 * @return было brand+" "+ model+ ", год выпуска: "+ year+ ", страна производства: "+ country+ ", цвет: "+ color+ ", объём двигателя: "+ engineVolume+ ".";
 */   /* public String toString(){
        return super.toString() +", объём двигателя: "+ getEngineVolume()+ ", коробка передач: "+ getTransmission()+ " , тип кузова: " + getBodyType()+ " , регистрационный номер: "+ getRegistrationNumber()+ " , количество мест: "+ getNumberOfSeats()+ " , признак Летняя резина: "+ isSummerTires()+ key.toString();
    }
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;
        /** Создаю конструктор для ключей
         * @param remoteEngineStart - Удаленный запуск двигателя
         * @param keylessAccess - Бесключевой доступ
         */
     /*   public Key(boolean remoteEngineStart, boolean keylessAccess) {
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
}*/