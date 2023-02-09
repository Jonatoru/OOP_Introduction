package transport;
import drivers.Driver;
import exceptions.TransportTypeException;
import mechanics.Mechanics;

import java.util.ArrayList;
import java.util.List;

import static Checks.ValidationUtilities.validateString;

public abstract class Transport <T extends Driver>{
    private  String brand;
    private  String model;
    private double engineVolume;

    private T driver;

    private List <Mechanics> mechanicsList;
    /*private final int yearOfIssue;
    private final String countryOfOrigin;
    private String bodyColor;
    private int maxMovementSpeed;*/

    /** Парамметры
     * @param brand - Марка,
     * @param model - Модель,
    // * @param yearOfIssue - Год выпуска,
   //  * @param countryOfOrigin - Страна производства,
   //  * @param bodyColor - Цвет кузова,
   //  * @param maxMovementSpeed - Максимальная скорость передвижения.
     */

    public Transport(String brand, String model, double engineVolume, T driver, List <Mechanics> mechanicsList) {
        this.brand = (validateString(brand,"default"));
        this.model = (validateString(model,"default"));
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.driver = driver;
        this.mechanicsList = mechanicsList;
        /*this.yearOfIssue = yearOfIssue;
        this.countryOfOrigin = countryOfOrigin;
        this.bodyColor = (validateString(bodyColor, "default"));
        this.maxMovementSpeed = maxMovementSpeed <= 0 ? 1 : maxMovementSpeed;*/
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public void startMoving(){
        System.out.println("Поехал!");
    }

    public void finishTheMove(){
        System.out.println("Остановился!");
    }

    public List<Mechanics> getMechanicsList() {
        return mechanicsList;
    }

    public void setMechanicsList(List<Mechanics> mechanicsList) {
        this.mechanicsList = mechanicsList;
    }

    @Override
    public String toString() {
        return  getBrand() +" "+ getModel() +", объём двигателя: " + getEngineVolume();
    }

    public abstract void printType();

    public abstract void passDiagnostics() throws TransportTypeException;

    public boolean checkTransportNeedService(){
        try {
            passDiagnostics();
        }catch (TransportTypeException e) {
            return false;
        }
        return true;
    }

    public abstract String repair();
    /*public int getYearOfIssue() {
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
    }*/
}
